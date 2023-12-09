package com.example.tesfe.activities;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tesfe.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Find views
        Button registerButton = findViewById(R.id.registerButton);

        // Set Register Button Click Listener
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your registration logic here

                // For temporary, let's navigate to another activity
                Intent intent = new Intent(RegisterActivity.this, OtpActivity.class);
                startActivity(intent);
            }
        });
    }
}
