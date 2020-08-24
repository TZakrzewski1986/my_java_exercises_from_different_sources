package my_java_exercises_from_different_sources.java_3_advance_java_Marcisz_Patryk.ex_4_API;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Results {
    @JsonProperty("language_code")
    String languageCode;
    @JsonProperty("language_name")
    String languageName;
    @JsonProperty("probability")
    Double probability;
    @JsonProperty("percentage")
    Double percentage;
    @JsonProperty("reliable_result")
    boolean reliableResult;

    public Results() {

    }

    public Results(String languageCode, String languageName, Double probability, Double percentage, boolean reliableResult) {
        this.languageCode = languageCode;
        this.languageName = languageName;
        this.probability = probability;
        this.percentage = percentage;
        this.reliableResult = reliableResult;
    }

    @Override
    public String toString() {
        return "Results{" +
                "languageCode='" + languageCode + '\'' +
                ", languageName='" + languageName + '\'' +
                ", probability=" + probability +
                ", percentage=" + percentage +
                ", reliableResult=" + reliableResult +
                '}';
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public String getLanguageName() {
        return languageName;
    }

    public Double getProbability() {
        return probability;
    }

    public Double getPercentage() {
        return percentage;
    }

    public boolean isReliableResult() {
        return reliableResult;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public void setReliableResult(boolean reliableResult) {
        this.reliableResult = reliableResult;
    }
}
