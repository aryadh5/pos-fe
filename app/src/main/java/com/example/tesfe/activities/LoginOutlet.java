package com.example.tesfe.activities;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tesfe.R;

import java.util.ArrayList;
import java.util.List;

public class LoginOutlet extends AppCompatActivity {

    private Spinner cabangSpinner, karyawanSpinner;
    private TextView cabangTextView, karyawanTextView;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_outlet);

        // Initialize UI components
        cabangSpinner = findViewById(R.id.cabangSpinner);
        karyawanSpinner = findViewById(R.id.karyawanSpinner);
        cabangTextView = findViewById(R.id.textView5);
        karyawanTextView = findViewById(R.id.textView6);
        loginButton = findViewById(R.id.loginbtn);

        // Set up Cabang Spinner
        List<String> cabangList = new ArrayList<>();
        cabangList.add("Cabang 1");
        cabangList.add("Cabang 2");
        // Add more cabang options as needed

        ArrayAdapter<String> cabangAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, cabangList);
        cabangAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cabangSpinner.setAdapter(cabangAdapter);

        // Set up Karyawan Spinner
        List<String> karyawanList = new ArrayList<>();
        karyawanList.add("Karyawan 1");
        karyawanList.add("Karyawan 2");
        // Add more karyawan options as needed

        ArrayAdapter<String> karyawanAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, karyawanList);
        karyawanAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        karyawanSpinner.setAdapter(karyawanAdapter);

        // Set Spinner Item Selected Listener
        cabangSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedCabang = cabangList.get(position);
                Toast.makeText(LoginOutlet.this, "Selected Cabang: " + selectedCabang, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do nothing here
            }
        });

        karyawanSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedKaryawan = karyawanList.get(position);
                Toast.makeText(LoginOutlet.this, "Selected Karyawan: " + selectedKaryawan, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do nothing here
            }
        });

        // Set Login Button Click Listener
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your login logic here
                // For temporary, let's navigate to another activity
                Intent intent = new Intent(LoginOutlet.this, MainActivity.class);
                startActivity(intent);            }
        });
    }
}
