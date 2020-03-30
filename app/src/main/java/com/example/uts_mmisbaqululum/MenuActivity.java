package com.example.uts_mmisbaqululum;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

//    public static final String DAFTAR_KEY = "daftar_gamelan";
//    public static final String PROFIL_KEY = "profil_gamelan";
//    public static final String GALERI_KEY = "galeri";
//    public static final String EXIT_KEY = "exit";
//
//    private TextView daftarGamelan;
//    private TextView profilGamelan;
//    private TextView Galeri;
//    private TextView Exit;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void handleSubmit(View view) {
        Intent i = new Intent (this, JenisActivity.class);
        startActivity(i);

    }

    public void handleGaleri(View view) {
        Intent i = new Intent (this, GaleriActivity.class);
        startActivity(i);
    }

    public void handleDaftar(View view) {
        Intent i = new Intent (this, DaftarActivity.class);
        startActivity(i);
    }
}
