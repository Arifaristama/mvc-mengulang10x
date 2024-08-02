package org.arif2.coba.response;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SnackRes {
    private int id;
    private String nama;
    private String brand;
    private String varRasa;
    private String berat;

    public SnackRes(int id, String nama, String brand, String varRasa, String berat) {
        this.id = id;
        this.nama = nama;
        this.brand = brand;
        this.varRasa = varRasa;
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

    public String getVarRasa() {
        return varRasa;
    }

    public void setVarRasa(String varRasa) {
        this.varRasa = varRasa;
    }

    public String getBerat() {
        return berat;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }
}
