package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;

public class SendOtpRequest {

    @SerializedName("email")
    private String email;

    public SendOtpRequest(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
