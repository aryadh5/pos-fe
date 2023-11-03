package com.example.tesfe.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View; // Import the View class
import android.widget.CheckBox;
import android.widget.EditText;

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

}
