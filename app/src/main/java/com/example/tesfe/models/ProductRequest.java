package com.example.tesfe.models;

import com.google.gson.annotations.SerializedName;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class ProductRequest {
    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    // If image is a file, you might want to use MultipartBody.Part
    private MultipartBody.Part image;

    @SerializedName("price")
    private double price;

    @SerializedName("is_for_sale")
    private boolean isForSale;

    @SerializedName("category_id")
    private int categoryId;

    // Constructor
    public ProductRequest(String name, String description, MultipartBody.Part image,
                          double price, boolean isForSale, int categoryId) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.isForSale = isForSale;
        this.categoryId = categoryId;
    }

    // Getters and setters for fields

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

    public MultipartBody.Part getImage() {
        return image;
    }

    public void setImage(MultipartBody.Part image) {
        this.image = image;
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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}