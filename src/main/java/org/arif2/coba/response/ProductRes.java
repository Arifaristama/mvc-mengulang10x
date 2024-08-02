package org.arif2.coba.response;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProductRes {
    private int id;
    private String nama;
    private String brand;
    private int harga;
    private String berat;

    public ProductRes(int id, String nama, String brand, int harga, String berat) {
        this.id = id;
        this.nama = nama;
        this.brand = brand;
        this.harga = harga;
        this.berat = berat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getBerat() {
        return berat;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }
}
