package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;

public class ProductResponse {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("price")
    private double price;

    @SerializedName("is_for_sale")
    private boolean isForSale;

    @SerializedName("category")
    private CategoryResponse category;

    // Constructor
    public ProductResponse(int id, String name, String description, double price, boolean isForSale, CategoryResponse category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.isForSale = isForSale;
        this.category = category;
    }

    // Getters and setters for the product properties
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isForSale() {
        return isForSale;
    }

    public void setForSale(boolean forSale) {
        isForSale = forSale;
    }

    public CategoryResponse getCategory() {
        return category;
    }

    public void setCategory(CategoryResponse category) {
        this.category = category;
    }
}
