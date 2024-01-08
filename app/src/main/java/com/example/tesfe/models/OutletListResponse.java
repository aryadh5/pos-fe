package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class OutletListResponse {
    @SerializedName("data")
    private List<Outlet> outlets;

    @SerializedName("errors")
    private Object errors; // Customize based on the actual response structure

    public OutletListResponse(List<Outlet> outlets, Object errors) {
        this.outlets = outlets;
        this.errors = errors;
    }

    public List<Outlet> getOutlets() {
        return outlets;
    }

    public Object getErrors() {
        return errors;
    }
}