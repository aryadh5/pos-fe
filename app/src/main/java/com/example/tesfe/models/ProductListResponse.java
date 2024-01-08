package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ProductListResponse {
    @SerializedName("data")
    private List<ProductResponse> products;

    // Constructor
    public ProductListResponse(List<ProductResponse> products) {
        this.products = products;
    }

    // Getter and setter for the list of products
    public List<ProductResponse> getProducts() {
        return products;
    }

    public void setProducts(List<ProductResponse> products) {
        this.products = products;
    }
}
