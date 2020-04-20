package My_Work.java_3_advance_java_Marcisz_Patryk.ex_4_API;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResultsResponse {
    @JsonProperty("Success")
    private boolean success;
    @JsonProperty("Results")
    private List<Results> results;

    public ResultsResponse(boolean success, List<Results> results) {
        this.success = success;
        this.results = results;

    }

    public ResultsResponse() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "ResultsResponse{" +
                "success=" + success +
                ", results=" + results +
                '}';
    }


}
