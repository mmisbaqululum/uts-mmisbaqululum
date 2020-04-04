package com.example.uts_mmisbaqululum;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class JenisDetailActivity extends AppCompatActivity {

    private static final String TAG = "JenisActivity";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_detail);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");
            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String imageDescription = getIntent().getStringExtra("image_desc");
            setImage(imageUrl,imageName,imageDescription);
        }
    }

    private void setImage(String imageUrl,String imageName, String imageDescription) {
        Log.d(TAG, "setImage: setting te image and name to widgets.");
        ImageView image = findViewById(R.id.image);
        Glide.with(this).asBitmap().load(imageUrl).into(image);
        TextView name = findViewById(R.id.titleText);
        TextView desc = findViewById(R.id.textDesc);
        desc.setText(imageDescription);
        name.setText(imageName);
    }
}
