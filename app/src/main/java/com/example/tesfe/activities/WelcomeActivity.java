package com.example.tesfe.activities;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tesfe.R;

public class WelcomeActivity extends AppCompatActivity {

    private Button masukButton;
    private TextView daftartv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        masukButton = findViewById(R.id.masukbtn);
        daftartv= findViewById(R.id.textViewDaftar);

        masukButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to another activity
                Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        daftartv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        // Add any additional initialization or setup code here
    }

    // Example method for the back button click action
    public void onBackPressed(View view) {
        // Handle the back button click event here
        // Add your logic here
        onBackPressed(); // this will perform the default back action
    }
}
