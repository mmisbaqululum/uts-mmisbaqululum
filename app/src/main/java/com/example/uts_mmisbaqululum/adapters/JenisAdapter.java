package com.example.uts_mmisbaqululum.adapters;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.uts_mmisbaqululum.JenisActivity;
import com.example.uts_mmisbaqululum.JenisDetailActivity;
import com.example.uts_mmisbaqululum.R;
import com.example.uts_mmisbaqululum.models.Karawitan;

import java.util.List;

public class JenisAdapter extends RecyclerView.Adapter<JenisAdapter.ViewHolder> {

    private Context context;
    private List<Karawitan> items;

    public JenisAdapter(Context context, List<Karawitan> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_jenis, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Karawitan item = items.get(position);
        // Atur image di baris ini, dapat menggunakan Picasso atau Glide
        holder.nameText.setText(item.getName());
        holder.parent_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, JenisDetailActivity.class);
                intent.putExtra("image_url", item.getImage());
                intent.putExtra("image_name", item.getName());
                intent.putExtra("image_desc", item.getDeskripsi());
                context.startActivity(intent);
            }
        });
        Glide.with(context).load(item.getImage()).into(holder.logoImage);
    }

    @Override
    public int getItemCount() {
        if (items != null) {
            return items.size();
        } else {
            return 0;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText;
        CardView parent_layout;


        public ViewHolder(@NonNull View itemJenis) {
            super(itemJenis);
            logoImage = itemJenis.findViewById(R.id.image_logo_jenis);
            nameText = itemJenis.findViewById(R.id.text_name_jenis);
            parent_layout = itemView.findViewById(R.id.parent_layout);

        }
    }
}
