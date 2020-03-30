package com.example.uts_mmisbaqululum;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uts_mmisbaqululum.adapters.GaleriAdapter;
import com.example.uts_mmisbaqululum.models.Karawitan;

import java.util.ArrayList;
import java.util.List;

public class GaleriActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);

        RecyclerView KarView = findViewById(R.id.rv_teams);

        List<Karawitan> teams = new ArrayList<>();
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/4/4e/Btdemung.jpg", "Demung"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/4/42/Bonang_barung_and_panerus._STSI_Surakarta.jpg", "Bonang"));
        teams.add(new Karawitan("https://i.ytimg.com/vi/hs0Hq_sFVAs/hqdefault.jpg", "Peking"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/7/7e/Traditional_indonesian_instruments04.jpg", "Gong"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/8/88/Traditional_indonesian_drums.jpg", "Kendang"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/3/37/Turkey.Konya027.jpg", "Rebab"));
        teams.add(new Karawitan("https://www.dictio.id/uploads/db3342/original/3X/3/8/385ac38d94b23465352d4a736b0f994158954d48.jpg", "Slentem"));
        teams.add(new Karawitan("https://ak9.picdn.net/shutterstock/videos/16956919/thumb/1.jpg", "Kenong"));
        teams.add(new Karawitan("https://upload.wikimedia.org/wikipedia/commons/3/32/Traditional_indonesian_instruments.jpg", "Saron"));
        teams.add(new Karawitan("https://metrobali.com/wp-content/uploads/2014/06/gambang.jpg", "Gambang"));

        GaleriAdapter adapter= new GaleriAdapter(this, teams);
        KarView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        KarView.setLayoutManager(layoutManager);

    }
}
