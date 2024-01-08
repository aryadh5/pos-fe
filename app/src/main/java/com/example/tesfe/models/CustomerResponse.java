package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;

public class CustomerResponse {
    @SerializedName("data")
    private CustomerData data;

    public CustomerData getData() {
        return data;
    }

    public class CustomerData {
        @SerializedName("id")
        private int id;

        @SerializedName("name")
        private String name;

        @SerializedName("phone")
        private String phone;

        @SerializedName("email")
        private String email;

        @SerializedName("gender")
        private String gender;

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

        public String getEmail() {
            return email;
        }

        public String getGender() {
            return gender;
        }
    }
}
