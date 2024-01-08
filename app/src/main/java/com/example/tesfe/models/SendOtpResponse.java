package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;

public class SendOtpResponse {

    @SerializedName("data")
    private OtpData data;

    public OtpData getData() {
        return data;
    }

    public static class OtpData {
        @SerializedName("otp")
        private int otp;

        @SerializedName("token_expired_at")
        private String tokenExpiredAt;

        public int getOtp() {
            return otp;
        }

        public String getTokenExpiredAt() {
            return tokenExpiredAt;
        }
    }
}

