package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;

public class EmployeeResponse {
    @SerializedName("data")
    private EmployeeData data;

    public EmployeeData getData() {
        return data;
    }

    public class EmployeeData {
        @SerializedName("id")
        private int id;

        @SerializedName("name")
        private String name;

        @SerializedName("phone")
        private String phone;

        @SerializedName("pin")
        private String pin;

        @SerializedName("email")
        private String email;

        @SerializedName("role")
        private String role;

        // Other fields as needed

        // Getters for fields

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public String getPin() {
            return pin;
        }

        public String getEmail() {
            return email;
        }

        public String getRole() {
            return role;
        }
    }
}
