package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;

public class UserLoginRequest {
    @SerializedName("email_or_phone")
    private String emailOrPhone;

    @SerializedName("password")
    private String password;

    public UserLoginRequest(String emailOrPhone, String password) {
        this.emailOrPhone = emailOrPhone;
        this.password = password;
    }

    // Getters and setters if needed

    public String getEmailOrPhone() {
        return emailOrPhone;
    }

    public void setEmailOrPhone(String emailOrPhone) {
        this.emailOrPhone = emailOrPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
