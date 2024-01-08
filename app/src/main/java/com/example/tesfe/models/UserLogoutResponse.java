package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;

public class UserLogoutResponse {
    @SerializedName("data")
    private boolean isLoggedOut;

    @SerializedName("errors")
    private Object errors; // You can customize this based on the actual response structure

    public UserLogoutResponse(boolean isLoggedOut, Object errors) {
        this.isLoggedOut = isLoggedOut;
        this.errors = errors;
    }

    public boolean isLoggedOut() {
        return isLoggedOut;
    }

    public Object getErrors() {
        return errors;
    }
}