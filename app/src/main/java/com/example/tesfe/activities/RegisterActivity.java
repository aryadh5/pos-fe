package com.example.tesfe.activities;// RegisterActivity.java

import static java.security.AccessController.getContext;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.Observer;

import com.example.tesfe.R;
import com.example.tesfe.models.UserResponse;
import com.example.tesfe.network.RetrofitClient;
import com.example.tesfe.network.api.RegisterInterface;
//import com.example.tesfe.viewmodels.RegistrationViewModel;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText nameEditText = findViewById(R.id.editTextName);
        EditText emailEditText = findViewById(R.id.editTextEmail);
        EditText phoneEditText = findViewById(R.id.editTextPhone);
        EditText passwordEditText = findViewById(R.id.editTextPassword);
        Button registerButton = findViewById(R.id.registerButton);

        RegisterInterface registerInterface = RetrofitClient.getClient().create(RegisterInterface.class);

        registerButton.setOnClickListener(view -> {
            String name = nameEditText.getText().toString().trim();
            String email = emailEditText.getText().toString().trim();
            String phone = phoneEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

            Call<String> call = registerInterface.getUserRegi(name, email, phone, password);
            call.enqueue(new Callback<String>() {
                @Override
                public void onResponse(Call<String> call, Response<String> response) {
                    if (response.isSuccessful() && response.body() != null) {
                        handleRegistrationResponse(response.body());
                    } else {
                        try {
                            JSONObject jObjError = new JSONObject(response.errorBody().string());
//                            Toast.makeText(getContext(), , Toast.LENGTH_LONG).show();
                            Toast.makeText(RegisterActivity.this, jObjError.getJSONObject("errors").getString("email"), Toast.LENGTH_SHORT).show();

                        } catch (Exception e) {
                            Toast.makeText(RegisterActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                }

                @Override
                public void onFailure(Call<String> call, Throwable t) {
                    showToast("Registration failed: " + t.getMessage());
                    // Log the error or perform additional error handling
                }
            });

        });
    }

    private void handleRegistrationResponse(String userResponse) {
        showToast("Registration successful");
        navigateToNextScreen();
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void navigateToNextScreen() {
        Intent intent = new Intent(this, OtpActivity.class);
        startActivity(intent);
        finish(); // Optional: Finish the current activity if needed
    }
}

