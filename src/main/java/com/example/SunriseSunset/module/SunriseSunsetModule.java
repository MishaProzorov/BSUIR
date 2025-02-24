package com.example.SunriseSunset.module;
import com.fasterxml.jackson.annotation.JsonProperty;
public class SunriseSunsetModule {
        private Results results;
        private String status;

        public Results getResults() {
            return results;
        }

        public void setResults(Results results) {
            this.results = results;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public static class Results {
            private String sunrise;
            private String sunset;

            @JsonProperty("sunrise")
            public String getSunrise() {
                return sunrise;
            }

            @JsonProperty("sunset")
            public String getSunset() {
                return sunset;
            }
        }
}
