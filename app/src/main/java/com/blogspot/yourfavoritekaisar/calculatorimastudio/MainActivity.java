package com.blogspot.yourfavoritekaisar.calculatorimastudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO 1 Mendklarasikan variable
    Button btn_Tambah, btn_Kurang, btn_Bagi, btn_Kali;
    EditText edt_Input1, edt_Input2;
    TextView txt_Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 2 Memanggil view make ID
        btn_Tambah = findViewById(R.id.btn_Tambah);
        btn_Bagi = findViewById(R.id.btn_Bagi);
        btn_Kali = findViewById(R.id.btn_Kali);
        btn_Kurang = findViewById(R.id.btn_Kurang);

        edt_Input1 = findViewById(R.id.edt_Input1);
        edt_Input2 = findViewById(R.id.edt_Input2);

        txt_Hasil = findViewById(R.id.txt_Hasil);


        // TODO 3 Menggunakan onclik agar dapt diklick
        btn_Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                actionHitung("+");
            }
        });

        btn_Kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                actionHitung("-");
            }
        });

        btn_Bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              actionHitung("/");

            }
        });

        btn_Kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                actionHitung("*");

            }
        });

    }

    private void actionHitung(String operator){

        String angka1 = edt_Input1.getText().toString();
        String angka2 = edt_Input2.getText().toString();


        // Operator Logika
        if (angka1.isEmpty() || angka2.isEmpty()) {
            Toast.makeText(MainActivity.this, "Silahkan masukkan angka", Toast.LENGTH_SHORT).show();

        }
        else {
            int nilai1 = Integer.parseInt(angka1);
            int nilai2 = Integer.parseInt(angka2);
            int hasil = 0;

            switch (operator){
                case "+":
                    hasil = nilai1 + nilai2;
                    break;
                case "/":
                    hasil = nilai1 / nilai2;
                    break;
                case "-":
                    hasil = nilai1 - nilai2;
                    break;
                case "*":
                    hasil = nilai1 * nilai2;
                    break;
            }
            // Convert hasil ke String
            String strHasil = String.valueOf(hasil);

            // Membuat Hasil di dalam text view
            txt_Hasil.setText(strHasil);

            // Menampilkan toast
            Toast.makeText(MainActivity.this, strHasil, Toast.LENGTH_SHORT).show();

        }
    }
}


// Pelajaran Hari ini
/*
* constrain
* casting
* deklarasi widget
* ambil inputan user
* kondisional If Else & Switch case
* Toast
* Simple Func
* convert tipe data
* actionClick
*
* */