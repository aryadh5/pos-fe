package com.example.tesfe.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.tesfe.R;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout kasir,laporan, riwayatTransaksi, kelolaToko, kelolaProduk, kelolaKaryawan, kelolaPelanggan, akun, pengaturan, keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        menu = findViewById(R.id.menu);
        kasir = findViewById(R.id.kasir);
        laporan = findViewById(R.id.laporan);
        riwayatTransaksi = findViewById(R.id.riwayatTransaksi);
        kelolaToko = findViewById(R.id.kelolaToko);
        kelolaProduk = findViewById(R.id.kelolaProduk);
        kelolaKaryawan = findViewById(R.id.kelolaKaryawan);
        kelolaPelanggan = findViewById(R.id.kelolaPelanggan);
        akun = findViewById(R.id.akun);
        pengaturan = findViewById(R.id.pengaturan);
        keluar = findViewById(R.id.keluar);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDrawer(drawerLayout);
            }
        });
        // Set click listeners for each item
        // Set click listeners for each item
        kasir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open Kasir Activity
                redirectActivity(MainActivity.this, CashierActivity.class);
            }
        });

        laporan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open Laporan Activity
//                redirectActivity(MainActivity.this, LaporanActivity.class);
            }
        });

        // Similar listeners for other items...

        // Example: Redirecting to SetPinActivity when Akun is clicked
        riwayatTransaksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open SetPinActivity (or any other activity you want)
                redirectActivity(MainActivity.this, TransactionHistoryActivity.class);
            }
        });
        kelolaToko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open SetPinActivity (or any other activity you want)
                redirectActivity(MainActivity.this, ManageOutletActivity.class);
            }
        });
        kelolaProduk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open SetPinActivity (or any other activity you want)
                redirectActivity(MainActivity.this, ManageProductActivity.class);
            }
        });
        kelolaPelanggan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open SetPinActivity (or any other activity you want)
                redirectActivity(MainActivity.this, ManageCustomerActivity.class);
            }
        });
        // Example: Handling logout (Keluar)
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement your logout logic here
                // For now, display a Toast message
                Toast.makeText(MainActivity.this, "Logout", Toast.LENGTH_SHORT).show();
            }
        });
        akun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open SetPinActivity (or any other activity you want)
                redirectActivity(MainActivity.this, AccountActivity.class);
            }
        });

        // Example: Handling logout (Keluar)
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement your logout logic here
                // For now, display a Toast message
                Toast.makeText(MainActivity.this, "Logout", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public static void openDrawer(DrawerLayout drawerLayout){
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public static void closeDrawer(DrawerLayout drawerLayout){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }
    public static void redirectActivity(Activity activity, Class secondActivity){
        Intent intent = new Intent(activity, secondActivity);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
        activity.finish();
    }
    @Override
    protected void onPause(){
        super.onPause();
        closeDrawer(drawerLayout);
    }
}