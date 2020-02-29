const { exec } = require("child_process");
const { extractTestRunId } = require("../util/parse_output");
const { fetchTestRunSummary, fetchAttachment } = require("../util/projektor_client");
const { verifyOutput } = require("../verify/cli_output_verify");

describe("Publishing via CLI with token", () => {
  const serverPort = "8083";

  it("should publish to server when executed via CLI with token", async done => {
    exec(
      `env-cmd -f .token-env yarn projektor-publish --serverUrl=http://localhost:${serverPort} results/*.xml`,
      async (error, stdout, stderr) => {
        verifyOutput(error, stdout, stderr, serverPort);

        const testRunId = extractTestRunId(stdout);
        console.log("Test ID", testRunId);

        const testRunSummaryResponse = await fetchTestRunSummary(
          testRunId,
          serverPort
        );
        expect(testRunSummaryResponse.status).toEqual(200);

        expect(testRunSummaryResponse.data.id).toEqual(testRunId);
        expect(testRunSummaryResponse.data.total_test_count).toEqual(4);

        done();
      }
    );
  });

  it("should publish to server with attachments when executed via CLI with token", async done => {
    exec(
      `env-cmd -f .token-env yarn projektor-publish --serverUrl=http://localhost:${serverPort} --attachments="attachments/*" results/*.xml`,
      async (error, stdout, stderr) => {
        verifyOutput(error, stdout, stderr, serverPort);

        const testRunId = extractTestRunId(stdout);
        console.log("Test ID", testRunId);

        const testRunSummaryResponse = await fetchTestRunSummary(
          testRunId,
          serverPort
        );
        expect(testRunSummaryResponse.status).toEqual(200);
        expect(testRunSummaryResponse.data.id).toEqual(testRunId);

        const attachment1Response = await fetchAttachment(
          "attachment1.txt",
          testRunId,
          serverPort
        );
        expect(attachment1Response.status).toEqual(200);
        expect(attachment1Response.data).toEqual("Here is attachment 1");

        const attachment2Response = await fetchAttachment(
          "attachment2.txt",
          testRunId,
          serverPort
        );
        expect(attachment2Response.status).toEqual(200);
        expect(attachment2Response.data).toEqual("Here is attachment 2");

        done();
      }
    );
  });
});