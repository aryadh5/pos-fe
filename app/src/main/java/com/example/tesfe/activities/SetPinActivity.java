package com.example.tesfe.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tesfe.R;

public class SetPinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_pin);
    }

    public void onShowPinClicked(View view) {
        CheckBox showPinCheckbox = findViewById(R.id.showPinCheckbox);
        EditText digit1 = findViewById(R.id.digit1);
        EditText digit2 = findViewById(R.id.digit2);
        EditText digit3 = findViewById(R.id.digit3);
        EditText digit4 = findViewById(R.id.digit4);

        int inputType = InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD;

        if (showPinCheckbox.isChecked()) {
            inputType = InputType.TYPE_CLASS_NUMBER;
        }

        digit1.setInputType(inputType);
        digit2.setInputType(inputType);
        digit3.setInputType(inputType);
        digit4.setInputType(inputType);
    }

    public void onVerifyPinClicked(View view) {
        // Validate the PIN (You need to implement your validation logic here)
        if (validatePin()) {
            // PIN is valid, navigate to the next activity
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish(); // Optional: close the current activity if needed
        } else {
            // Handle invalid PIN (Show a message or perform any other action)
        }
    }

    // Example validation logic (replace it with your actual validation)
    private boolean validatePin() {
        EditText digit1 = findViewById(R.id.digit1);
        EditText digit2 = findViewById(R.id.digit2);
        EditText digit3 = findViewById(R.id.digit3);
        EditText digit4 = findViewById(R.id.digit4);

        String enteredPin = digit1.getText().toString() +
                digit2.getText().toString() +
                digit3.getText().toString() +
                digit4.getText().toString();

        // Replace this with your actual PIN validation logic
        String correctPin = "1234"; // Change this to your correct PIN
        return enteredPin.equals(correctPin);
    }
}
