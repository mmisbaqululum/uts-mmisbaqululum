package com.example.uts_mmisbaqululum.models;

public class Karawitan {
    public String image;
    public String name;
    public String deskripsi;

    public Karawitan(String image, String name, String deskripsi) {
        this.image = image;
        this.name = name;
        this.deskripsi = deskripsi;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
