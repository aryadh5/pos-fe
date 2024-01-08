package com.example.tesfe.activities;// RegisterActivity.java

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
import com.example.tesfe.viewmodels.RegistrationViewModel;

public class RegisterActivity extends AppCompatActivity {

    private RegistrationViewModel registrationViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialize ViewModel
        registrationViewModel = new ViewModelProvider(this).get(RegistrationViewModel.class);

        // Reference UI elements
        EditText nameEditText = findViewById(R.id.editTextName);
        EditText emailEditText = findViewById(R.id.editTextEmail);
        EditText phoneEditText = findViewById(R.id.editTextPhone);
        EditText passwordEditText = findViewById(R.id.editTextPassword);
        Button registerButton = findViewById(R.id.registerButton);

        // Set up click listener for the register button
        registerButton.setOnClickListener(view -> {
            // Get user input
            String name = nameEditText.getText().toString().trim();
            String email = emailEditText.getText().toString().trim();
            String phone = phoneEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

            // Call the ViewModel to handle registration
            registrationViewModel.registerUser(name, email, phone, password).observe(this, new Observer<UserResponse>() {
                @Override
                public void onChanged(UserResponse userResponse) {
                    handleRegistrationResponse(userResponse);
                }
            });
        });
    }

    private void handleRegistrationResponse(UserResponse userResponse) {
        // Handle the registration response here
        if (userResponse != null) {
            // Registration successful
            showToast("Registration successful"); // Replace with your UI update logic
            navigateToNextScreen(); // Replace with your navigation logic
        } else {
            // Registration failed
            showToast("Registration failed"); // Replace with your UI update logic
            // Handle the failure, show an error message, etc.
        }
    }

    private void showToast(String message) {
        // Helper method to show a toast message
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void navigateToNextScreen() {
        // Helper method to navigate to the next screen (activity or fragment)
        // You can use Intent or other navigation mechanisms here
        Intent intent = new Intent(this, OtpActivity.class);
        startActivity(intent);
        finish(); // Optional: Finish the current activity if needed
    }
}
