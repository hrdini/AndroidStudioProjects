package com.hrdini.konversisuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText etNilai;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
    }

    public void load() {
        spinner = findViewById(R.id.spinner);
        etNilai = findViewById(R.id.etNilai);
        tvHasil = findViewById(R.id.tvHasil);
    }

    /*
    public void isiSpinner() {
        String[] isi = {"Celcius To Reamur" , "Celcius To Farenheit" , "Celcius To Kelvin"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,isi);
        spinner.setAdapter(adapter);
    }
     */

    public void btnKonversi(View view) {
        String pilihan = spinner.getSelectedItem().toString();

        if (etNilai.getText().toString().equals("")) {
            Toast.makeText(this, "Nilai tidak boleh kosong", Toast.LENGTH_SHORT).show();
        } else {
            if (pilihan.equals("Celcius To Reamur")) {
                cToR();
            }

            if (pilihan.equals("Celcius To Farenheit")) {
                cToF();
            }
        }
    }

    public void cToR() {
        double suhu = 100;
        double hasil = (4.0/5.0) * suhu;

        tvHasil.setText(hasil+"");
    }

    public void cToF() {
        double suhu = 100;
        double hasil = (9.0/5.0) * suhu + 32;

        tvHasil.setText(hasil+"");
    }

    /*
    public void cToK() {
        double suhu = 100;
        double hasil = (4.0/5.0) * suhu;

        tvHasil.setText(hasil+"");
    }

     */
}