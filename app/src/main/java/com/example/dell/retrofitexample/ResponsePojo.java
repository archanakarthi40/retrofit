package com.example.dell.retrofitexample;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponsePojo {

    @SerializedName("RestResponse")
    @Expose
    private RestResponse restResponse;

    public RestResponse getRestResponse() {
        return restResponse;
    }

    public void setRestResponse(RestResponse restResponse) {
        this.restResponse = restResponse;
    }

    class RestResponse {

        @SerializedName("messages")
        @Expose
        private List<String> messages = null;
        @SerializedName("result")
        @Expose
        private List<Result> result = null;

        public List<String> getMessages() {
            return messages;
        }

        public void setMessages(List<String> messages) {
            this.messages = messages;
        }

        public List<Result> getResult() {
            return result;
        }

        public void setResult(List<Result> result) {
            this.result = result;
        }

    }

    class Result {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("abbr")
        @Expose
        private String abbr;
        @SerializedName("area")
        @Expose
        private String area;
        @SerializedName("largest_city")
        @Expose
        private String largestCity;
        @SerializedName("capital")
        @Expose
        private String capital;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAbbr() {
            return abbr;
        }

        public void setAbbr(String abbr) {
            this.abbr = abbr;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getLargestCity() {
            return largestCity;
        }

        public void setLargestCity(String largestCity) {
            this.largestCity = largestCity;
        }

        public String getCapital() {
            return capital;
        }

        public void setCapital(String capital) {
            this.capital = capital;
        }

    }
}






