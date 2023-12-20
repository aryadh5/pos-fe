package com.example.tesfe.utils;

import com.example.tesfe.models.User;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPIService {

    @GET("path/to/your/endpoint")
    Call<User> getYourData();

    // Add more methods for other endpoints as needed
}
