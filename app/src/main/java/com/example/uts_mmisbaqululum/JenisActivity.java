package com.example.uts_mmisbaqululum;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts_mmisbaqululum.adapters.JenisAdapter;
import com.example.uts_mmisbaqululum.models.Karawitan;

import java.util.ArrayList;
import java.util.List;

public class JenisActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<Karawitan> teams = new ArrayList<>();
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/4/4e/Btdemung.jpg", "Demung"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/4/42/Bonang_barung_and_panerus._STSI_Surakarta.jpg", "Bonang"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/4/4e/Btdemung.jpg", "Peking"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/4/42/Bonang_barung_and_panerus._STSI_Surakarta.jpg", "Gong"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/4/4e/Btdemung.jpg", "Kendang"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/4/42/Bonang_barung_and_panerus._STSI_Surakarta.jpg", "Rebab"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/4/4e/Btdemung.jpg", "Slentem"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/4/42/Bonang_barung_and_panerus._STSI_Surakarta.jpg", "Kenong"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/4/4e/Btdemung.jpg", "Saron"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/4/42/Bonang_barung_and_panerus._STSI_Surakarta.jpg", "Gambang"));

        JenisAdapter adapter = new JenisAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
