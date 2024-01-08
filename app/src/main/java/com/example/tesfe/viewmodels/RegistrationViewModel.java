//package com.example.tesfe.viewmodels;
//// RegistrationViewModel.java
//
//import androidx.lifecycle.LiveData;
//import androidx.lifecycle.MutableLiveData;
//import androidx.lifecycle.ViewModel;
//import com.example.tesfe.models.UserResponse;
//import com.example.tesfe.network.ApiService;
//import com.example.tesfe.network.RetrofitClient;
//import com.example.tesfe.models.UserRegistrationRequest;
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//
//public class RegistrationViewModel extends ViewModel {
//
//    private ApiService apiService;
//    private MutableLiveData<UserResponse> registrationResponseLiveData;
//
//    public RegistrationViewModel() {
//        apiService = RetrofitClient.getRetrofitInstance().create(ApiService.class);
//        registrationResponseLiveData = new MutableLiveData<>();
//    }
//
//    public LiveData<UserResponse> registerUser(String name, String email, String phone, String password) {
//        UserRegistrationRequest registrationRequest = new UserRegistrationRequest(name, email, phone, password);
//
//        // Make the registration call
//        apiService.registerUser(registrationRequest).enqueue(new Callback<UserResponse>() {
//            @Override
//            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
//                if (response.isSuccessful()) {
//                    // Registration successful
//                    registrationResponseLiveData.setValue(response.body());
//                } else {
//                    // Registration failed
//                    registrationResponseLiveData.setValue(null);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<UserResponse> call, Throwable t) {
//                // Registration failed due to network or other issues
//                registrationResponseLiveData.setValue(null);
//            }
//        });
//
//        return registrationResponseLiveData;
//    }
//}
