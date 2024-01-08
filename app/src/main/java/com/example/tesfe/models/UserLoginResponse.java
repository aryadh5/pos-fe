package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;

public class UserLoginResponse {
    @SerializedName("data")
    private UserData userData;

    @SerializedName("errors")
    private ErrorData errors;

    public UserData getUserData() {
        return userData;
    }

    public ErrorData getErrors() {
        return errors;
    }

    public static class UserData {
        @SerializedName("id")
        private int id;

        @SerializedName("name")
        private String name;

        @SerializedName("email")
        private String email;

        @SerializedName("phone")
        private String phone;

        @SerializedName("token")
        private String token;

        // Getters for the user data fields

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }

        public String getToken() {
            return token;
        }
    }

    public static class ErrorData {
        // You can define error fields based on your backend response

    }
}
