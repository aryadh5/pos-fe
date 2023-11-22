package com.example.tesfe.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tesfe.R;

public class LoginActivity extends AppCompatActivity {

    // Declare your UI elements
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button loginButton;
    private TextView forgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize your UI elements
        editTextEmail = findViewById(R.id.editTextText);
        editTextPassword = findViewById(R.id.editTextTextPassword2);
        loginButton = findViewById(R.id.loginbtn);
        forgotPassword = findViewById(R.id.textView7);

        // Set click listener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your login logic here
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Set click listener for the forgot password text
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the ForgotPasswordActivity
                Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}
