const axios = require("axios");

const fetchTestRunSummary = (testRunId, serverPort) => {
  const url = `http://localhost:${serverPort}/run/${testRunId}/summary`;

  return axios.get(url);
};

module.exports = {
  fetchTestRunSummary
};
