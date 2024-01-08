//package com.example.tesfe.network.api;
//
//import java.util.List;
//
//import retrofit2.Call;
//import retrofit2.http.*;
//
//public interface CategoryApi {
//    @POST("/api/categories")
//    Call<Category> createCategory(@Body Category category);
//
//    @GET("/api/categories")
//    Call<List<Category>> getCategories();
//
//    @GET("/api/categories/{categoryId}")
//    Call<Category> getCategory(@Path("categoryId") int categoryId);
//
//    @PUT("/api/categories/{categoryId}")
//    Call<Category> updateCategory(@Path("categoryId") int categoryId, @Body Category category);
//
//    @DELETE("/api/categories/{categoryId}")
//    Call<Void> deleteCategory(@Path("categoryId") int categoryId);
//}
