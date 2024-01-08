package com.example.tesfe.models;
import com.google.gson.annotations.SerializedName;

public class VerifyOtpRequest {

    @SerializedName("email")
    private String email;

    @SerializedName("otp")
    private int otp;

    public VerifyOtpRequest(String email, int otp) {
        this.email = email;
        this.otp = otp;
    }

    public String getEmail() {
        return email;
    }

    public int getOtp() {
        return otp;
    }
}
