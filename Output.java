package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Output extends AppCompatActivity {

    EditText editTextHasilLuas, editTextHasilKeliling;
    TextView textViewPanjang, textViewLebar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.output);

        editTextHasilLuas = findViewById(R.id.HasilLuas);
        editTextHasilKeliling = findViewById(R.id.HasilKeliling);
        textViewPanjang = findViewById(R.id.Panjang);
        textViewLebar = findViewById(R.id.Lebar);

        Intent intent = getIntent();
        double Panjang = intent.getDoubleExtra("Panjang", 0);
        double Lebar = intent.getDoubleExtra("Lebar", 0);
        double luas = intent.getDoubleExtra("Luas", 0);
        double keliling = intent.getDoubleExtra("Keliling", 0);

        editTextHasilLuas.setText(String.valueOf(luas));
        editTextHasilKeliling.setText(String.valueOf(keliling));
        textViewPanjang.setText(String.valueOf("Panjang : " + Panjang));
        textViewLebar.setText(String.valueOf("Lebar : " + Lebar));
    }
}
