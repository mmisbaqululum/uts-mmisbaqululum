package com.example.uts_mmisbaqululum;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts_mmisbaqululum.adapters.DaftarAdapter;

import java.util.ArrayList;
import java.util.List;

public class DaftarActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        RecyclerView karView = findViewById(R.id.rv_teams);

        List<String> kar = new ArrayList<>();
        kar.add("Demung");
        kar.add("Bonang");
        kar.add("Peking");
        kar.add("Gong Ageng");
        kar.add("Kendang");
        kar.add("Rebab");
        kar.add("Slenthem");
        kar.add("Kenong");
        kar.add("Saron");
        kar.add("Gambang");

        DaftarAdapter adapter = new DaftarAdapter(kar);
        karView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        karView.setLayoutManager(layoutManager);
    }
}
