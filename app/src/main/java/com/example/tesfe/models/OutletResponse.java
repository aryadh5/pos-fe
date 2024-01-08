package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;

public class OutletResponse {
    @SerializedName("data")
    private Outlet outlet;

    @SerializedName("errors")
    private Object errors; // Customize based on the actual response structure

    public OutletResponse(Outlet outlet, Object errors) {
        this.outlet = outlet;
        this.errors = errors;
    }

    public Outlet getOutlet() {
        return outlet;
    }

    public Object getErrors() {
        return errors;
    }
}