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

    public static final String DAFTAR_KEY = "daftar_gamelan";
    public static final String PROFIL_KEY = "profil_gamelan";
    public static final String GALERI_KEY = "galeri";
    public static final String EXIT_KEY = "exit";

    private TextView daftarGamelan;
    private TextView profilGamelan;
    private TextView Galeri;
    private TextView Exit;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        daftarGamelan = findViewById(R.id.daftarGamelan);
        profilGamelan = findViewById(R.id.profilGamelan);
        Galeri = findViewById(R.id.galeri);
        Exit = findViewById(R.id.exit);
    }

    public void handleSubmit(View view) {
        String daftar_gamelan = daftarGamelan.getText().toString();
        String profil_gamelan = profilGamelan.getText().toString();
        String galeri = Galeri.getText().toString();
        String exit = Exit.getText().toString();

        Intent intent = new Intent(this, JenisActivity.class);
        intent.putExtra(DAFTAR_KEY, daftar_gamelan);
        intent.putExtra(PROFIL_KEY, profil_gamelan);
        intent.putExtra(GALERI_KEY, galeri);
        intent.putExtra(EXIT_KEY, exit);
        startActivity(intent);

    }
}
