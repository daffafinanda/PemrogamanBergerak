package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Input extends AppCompatActivity {

    EditText editTextPanjang, editTextLebar;
    Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input);

        editTextPanjang = findViewById(R.id.Panjang);
        editTextLebar = findViewById(R.id.Lebar);
        buttonHitung = findViewById(R.id.button);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung();
            }
        });
    }

    private void hitung() {
        try {
            double panjang = Double.parseDouble(editTextPanjang.getText().toString());
            double lebar = Double.parseDouble(editTextLebar.getText().toString());


            double luas = panjang * lebar;
            double keliling = 2 * (panjang + lebar);

            Intent intent = new Intent(Input.this, Output.class);
            intent.putExtra("Panjang", panjang);
            intent.putExtra("Lebar", lebar);
            intent.putExtra("Luas", luas);
            intent.putExtra("Keliling", keliling);
            startActivity(intent);
        } catch (NumberFormatException e) {
            Toast.makeText(Input.this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show();
        }
    }
}