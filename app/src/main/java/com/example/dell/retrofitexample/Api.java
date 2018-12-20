package com.example.dell.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "http://services.groupkt.com/state/get/IND/";

    @GET("all")
    Call<ResponsePojo> getHeroes();
}
