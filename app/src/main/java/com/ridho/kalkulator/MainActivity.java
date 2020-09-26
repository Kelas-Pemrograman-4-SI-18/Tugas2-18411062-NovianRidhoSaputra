package com.ridho.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNilaiA, edtNilaiB;

    Button btntambah, btnkurang, btnkali, btnbagi;
    TextView txthasil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNilaiA = (EditText) findViewById(R.id.edtNilaiA);
        edtNilaiB = (EditText) findViewById(R.id.edtNilaiB);
        txthasil = (TextView) findViewById(R.id.txthasil);
        btntambah = (Button) findViewById(R.id.btntambah);
        btnkurang = (Button) findViewById(R.id.btnkurang);
        btnkali = (Button) findViewById(R.id.btnkali);
        btnbagi = (Button) findViewById(R.id.btnbagi);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(edtNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());
                int hasil = nilaiA + nilaiB;
                txthasil.setText(String.valueOf(hasil));
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(edtNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());
                int hasil = nilaiA - nilaiB;
                txthasil.setText(String.valueOf(hasil));

            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(edtNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());
                int hasil = nilaiA * nilaiB;
                txthasil.setText(String.valueOf(hasil));
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(edtNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());
                int hasil = nilaiA / nilaiB;
                txthasil.setText(String.valueOf(hasil));
            }
        });

    }

}