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

public class DefinisiActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definition);

        RecyclerView teamsView = findViewById(R.id.rv_teams);



        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
