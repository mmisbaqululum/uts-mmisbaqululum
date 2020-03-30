package com.example.uts_mmisbaqululum.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.uts_mmisbaqululum.R;
import com.example.uts_mmisbaqululum.models.Karawitan;

import java.util.List;

public class GaleriAdapter extends RecyclerView.Adapter<GaleriAdapter.ViewHolder>{

    private Context context;
    private List<Karawitan> items;

    public GaleriAdapter(Context context, List<Karawitan> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_galeri, parent, false);
        return new GaleriAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Karawitan item = items.get(position);
        holder.nameText.setText(item.getName());
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
        public ImageView logoImage;
        public TextView nameText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo_galeri);
            nameText = itemView.findViewById(R.id.text_name_galeri);
        }
    }
}
