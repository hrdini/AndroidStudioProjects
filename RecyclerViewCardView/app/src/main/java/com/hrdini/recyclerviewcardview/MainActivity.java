package com.hrdini.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
    }

    public void load() {
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData() {
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa("Hardini", "Sidoarjo"));
        siswaList.add(new Siswa("Febri", "Malang"));
        siswaList.add(new Siswa("Jati", "Surabaya"));
        siswaList.add(new Siswa("Hrdini", "Sidoarjo"));
        siswaList.add(new Siswa("Hardin", "TulungAgung"));
        siswaList.add(new Siswa("Mimin", "Salatiga"));
        siswaList.add(new Siswa("Paijo", "Mataram"));
        siswaList.add(new Siswa("Sinta", "Makasar"));
        siswaList.add(new Siswa("Siska", "Lombok"));

        adapter = new SiswaAdapter(this, siswaList);
        recyclerView.setAdapter(adapter);
    }

    public void btnTambah(View view) {
        siswaList.add(new Siswa("Sambo", "Bojong Gede"));
    }
}