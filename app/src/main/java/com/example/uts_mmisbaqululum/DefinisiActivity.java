package com.example.uts_mmisbaqululum;


import android.os.Bundle;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class DefinisiActivity extends AppCompatActivity {

    public TextView daftar;
    public TextView profil;
    public TextView galeri;
    public TextView exit;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definition);
        daftar = findViewById(R.id.daftarGamelan);
        profil = findViewById(R.id.profilGamelan);
        galeri = findViewById(R.id.galeri);
        exit = findViewById(R.id.exit);
    }
}
