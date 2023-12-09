package com.example.tesfe.activities;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tesfe.R;

public class OtpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        // Find views
        EditText editTextOtp = findViewById(R.id.editTextOtp);
        Button verifyButton = findViewById(R.id.verifyButton);

        // Set Verify Button Click Listener
        verifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your verification logic here

                // For temporary, let's show a toast message
                String otp = editTextOtp.getText().toString();
                if (isValidOtp(otp)) {
                    // Otp is valid, navigate to the next activity
                    navigateToNextActivity();
                } else {
                    // Otp is not valid, show an error message
                    showToast("Invalid OTP. Please try again.");
                }
            }
        });
    }

    // Example function to check if the entered OTP is valid
    private boolean isValidOtp(String otp) {
        // Implement your OTP validation logic here
        // For example, you can check if the OTP matches a predefined value
        return otp.equals("123456"); // Replace "123456" with your actual valid OTP
    }

    // Helper function to show toast messages
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    // Function to navigate to the next activity
    private void navigateToNextActivity() {
        Intent intent = new Intent(OtpActivity.this, RegisterBusinessInfo.class); // Replace NextActivity with your actual activity class
        startActivity(intent);
        finish(); // Optional: Close the current activity if needed
    }
}
