package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;

public class CategoryRequest {
    @SerializedName("name")
    private String name;

    // Other fields as needed


    // Constructor
    public CategoryRequest(String name) {
        this.name = name;
        // Initialize other fields if needed
    }

    // Getters and setters for fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}