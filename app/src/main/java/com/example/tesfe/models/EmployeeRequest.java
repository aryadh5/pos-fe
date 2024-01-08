package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class EmployeeRequest {
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

    @SerializedName("outletIds")
    private List<Integer> outletIds;

    public EmployeeRequest(String name, String phone, String pin, String email, String role, List<Integer> outletIds) {
        this.name = name;
        this.phone = phone;
        this.pin = pin;
        this.email = email;
        this.role = role;
        this.outletIds = outletIds;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Integer> getOutletIds() {
        return outletIds;
    }

    public void setOutletIds(List<Integer> outletIds) {
        this.outletIds = outletIds;
    }
}