package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;

public class UserResponse {

    @SerializedName("data")
    private UserData data;

    // Add getters for the data


    public UserData getData() {
        return data;
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

        // Add getters for the user data

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
    }
}