package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;

public class EmployeeLoginRequest {
    @SerializedName("id")
    private int id;

    @SerializedName("pin")
    private String pin;

    public EmployeeLoginRequest(int id, String pin) {
        this.id = id;
        this.pin = pin;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}