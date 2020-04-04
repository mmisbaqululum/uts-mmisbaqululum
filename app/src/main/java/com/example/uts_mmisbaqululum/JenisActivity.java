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
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/4/4e/Btdemung.jpg", "Demung", "Demung adalah alat musik"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/4/42/Bonang_barung_and_panerus._STSI_Surakarta.jpg", "Bonang", "des"));
        teams.add(new Karawitan("https://i.ytimg.com/vi/hs0Hq_sFVAs/hqdefault.jpg", "Peking", "Des"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/7/7e/Traditional_indonesian_instruments04.jpg", "Gong", "des"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/8/88/Traditional_indonesian_drums.jpg", "Kendang", "des"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/3/37/Turkey.Konya027.jpg", "Rebab", "des"));
        teams.add(new Karawitan("https://www.dictio.id/uploads/db3342/original/3X/3/8/385ac38d94b23465352d4a736b0f994158954d48.jpg", "Slentem", "des"));
        teams.add(new Karawitan("https://ak9.picdn.net/shutterstock/videos/16956919/thumb/1.jpg", "Kenong", "des"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/3/32/Traditional_indonesian_instruments.jpg", "Saron", "des"));
        teams.add(new Karawitan("https://metrobali.com/wp-content/uploads/2014/06/gambang.jpg", "Gambang", "des"));

        JenisAdapter adapter = new JenisAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
