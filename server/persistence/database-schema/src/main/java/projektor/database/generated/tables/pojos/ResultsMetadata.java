/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResultsMetadata implements Serializable {

    private static final long serialVersionUID = -189727776;

    private Long    id;
    private Long    testRunId;
    private Boolean ci;

    public ResultsMetadata() {}

    public ResultsMetadata(ResultsMetadata value) {
        this.id = value.id;
        this.testRunId = value.testRunId;
        this.ci = value.ci;
    }

    public ResultsMetadata(
        Long    id,
        Long    testRunId,
        Boolean ci
    ) {
        this.id = id;
        this.testRunId = testRunId;
        this.ci = ci;
    }

    public Long getId() {
        return this.id;
    }

    public ResultsMetadata setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getTestRunId() {
        return this.testRunId;
    }

    public ResultsMetadata setTestRunId(Long testRunId) {
        this.testRunId = testRunId;
        return this;
    }

    public Boolean getCi() {
        return this.ci;
    }

    public ResultsMetadata setCi(Boolean ci) {
        this.ci = ci;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ResultsMetadata other = (ResultsMetadata) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (testRunId == null) {
            if (other.testRunId != null)
                return false;
        }
        else if (!testRunId.equals(other.testRunId))
            return false;
        if (ci == null) {
            if (other.ci != null)
                return false;
        }
        else if (!ci.equals(other.ci))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.testRunId == null) ? 0 : this.testRunId.hashCode());
        result = prime * result + ((this.ci == null) ? 0 : this.ci.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ResultsMetadata (");

        sb.append(id);
        sb.append(", ").append(testRunId);
        sb.append(", ").append(ci);

        sb.append(")");
        return sb.toString();
    }
}