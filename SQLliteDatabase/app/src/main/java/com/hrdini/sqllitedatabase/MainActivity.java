package com.hrdini.sqllitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Database db;
    EditText etBarang, etStok, etHarga;
    TextView tvPilihan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
    }

    public void load() {
        db = new Database(this);
        db.buatTabel();

        etBarang = findViewById(R.id.etBarang);
        etStok = findViewById(R.id.etStok);
        etHarga = findViewById(R.id.etHarga);
        tvPilihan = findViewById(R.id.tvPilihan);
    }

    public void simpan(View v) {
        String barang = etBarang.getText().toString();
        String stok = etStok.getText().toString();
        String harga = etHarga.getText().toString();
        String pilihan = tvPilihan.getText().toString();

        if(barang.isEmpty() || stok.isEmpty() || harga.isEmpty() ) {
            pesan("Data kosong");
        }else{
            if (pilihan.equals("insert")) {
                String sql = "INSERT INTO tblbarang (barang,stok,harga) VALUES ('"+barang+"',"+stok+","+harga+")";
                db.runSQL(sql);
                pesan("Insert");
            }else {
                pesan("Update");
            }
        }

        etBarang.setText("");
        etStok.setText("");
        etHarga.setText("");
        tvPilihan.setText("insert");
    }

    public void pesan(String isi) {
        Toast.makeText(this, isi, Toast.LENGTH_SHORT).show();
    }
}