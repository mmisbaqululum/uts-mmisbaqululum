package com.example.uts_mmisbaqululum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void handleDefinisi(View view) {
        Intent i = new Intent (this, DefinisiActivity.class);
        startActivity(i);
    }

    public void handleMenu(View view) {
        Intent i = new Intent (this, MenuActivity.class);
        startActivity(i);
    }

}
