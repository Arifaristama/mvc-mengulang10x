package org.arif2.coba.response;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FruitsRes {
    private int id;
    private String nama;
    private String warna;
    private int harga;
    private String rasa;

    public FruitsRes(int id, String nama, String warna, int harga, String rasa) {
        this.id = id;
        this.nama = nama;
        this.warna = warna;
        this.harga = harga;
        this.rasa = rasa;
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

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
}
