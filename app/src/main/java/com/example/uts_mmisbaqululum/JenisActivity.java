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
        teams.add(new Karawitan("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.dictio.id%2Ft%2Fbagaimana-cara-memainkan-alat-musik-tradisional-demung%2F61932&psig=AOvVaw2FzrzLqgzMH73lKnpkvZU2&ust=1585365825607000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCMj5_InauegCFQAAAAAdAAAAABAH", "Demung"));
        teams.add(new Karawitan("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.romadecade.org%2Falat-musik-jawa-tengah%2F&psig=AOvVaw29eJ7UvW42ynXV453AUJKm&ust=1585366789669000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJjg29XduegCFQAAAAAdAAAAABAD", "Bonang"));

        JenisAdapter adapter = new JenisAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
