package com.example.tesfe.network.api;

import com.example.tesfe.models.UserRegistrationRequest;
import com.example.tesfe.models.UserResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserApi {
    @POST("/api/users")
    Call<UserResponse> registerUser(@Body UserRegistrationRequest request);
}
