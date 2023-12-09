package com.example.tesfe.activities;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tesfe.R;

public class RegisterBusinessInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_business_info);

        // Find views
        EditText editTextNamaResto = findViewById(R.id.editTextNamaResto);
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        EditText editTextNoTelp = findViewById(R.id.editTextNoTelp);
        EditText editTextAlamat = findViewById(R.id.editTextAlamat);
        Button lanjutButton = findViewById(R.id.lanjutButton);

        // Set Lanjut Button Click Listener
        lanjutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve data from EditText fields
                String namaResto = editTextNamaResto.getText().toString();
                String email = editTextEmail.getText().toString();
                String noTelp = editTextNoTelp.getText().toString();
                String alamat = editTextAlamat.getText().toString();

                // Validate input fields (add your validation logic here)

                // If validation passes, proceed to the next activity
                if (isValidInput(namaResto, email, noTelp, alamat)) {
                    navigateToNextActivity();
                } else {
                    // Show an error message or handle validation failure
                }
            }
        });
    }

    // Example function to check if the entered input is valid
    private boolean isValidInput(String namaResto, String email, String noTelp, String alamat) {
        // Implement your input validation logic here
        // For example, check if fields are not empty
        return !namaResto.isEmpty() && !email.isEmpty() && !noTelp.isEmpty() && !alamat.isEmpty();
    }

    // Function to navigate to the next activity
    private void navigateToNextActivity() {
        Intent intent = new Intent(RegisterBusinessInfo.this, SetPinActivity.class); // Replace NextActivity with your actual activity class
        startActivity(intent);
    }
}
