package com.example.tesfe.network.api;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RegisterInterface {
    String REGIURL = "https://intemperate-vol.000webhostapp.com";
    @FormUrlEncoded
    @POST("/api/users")
    Call<String> getUserRegi(
            @Field("name") String name,
            @Field("email") String email,
            @Field("phone") String phone,
            @Field("password") String password
    );
}
