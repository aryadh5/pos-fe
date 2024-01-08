package com.example.tesfe.network;

import com.example.tesfe.models.ApiResponse;
import com.example.tesfe.models.SendOtpRequest;
import com.example.tesfe.models.UserLoginRequest;
import com.example.tesfe.models.UserLoginResponse;
import com.example.tesfe.models.UserLogoutResponse;
import com.example.tesfe.models.UserRegistrationRequest;
import com.example.tesfe.models.UserResponse;
import com.example.tesfe.models.UserUpdateRequest;
import com.example.tesfe.models.VerifyOtpRequest;

import retrofit2.Call;
import retrofit2.http.*;

public interface ApiService {

    @POST("/api/users")
    Call<UserResponse> registerUser(@Body UserRegistrationRequest request);

    @POST("/api/users/login")
    Call<UserLoginResponse> loginUser(@Body UserLoginRequest request);

    @POST("/api/users/send_otp")
    Call<ApiResponse> sendOtp(@Body SendOtpRequest request);

    @POST("/api/users/verify_otp")
    Call<ApiResponse> verifyOtp(@Body VerifyOtpRequest request);

    @GET("/api/users/current")
    Call<UserResponse> getCurrentUser();

    @PATCH("/api/users/current")
    Call<UserResponse> updateCurrentUser(@Body UserUpdateRequest request);

    @DELETE("/api/users/logout")
    Call<UserLogoutResponse> logoutUser();
}
