package org.arif2.coba.response;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FishRes {
    private int id;
    private String nama;
    private String bobot;
    private String warna;
    private String habitat;

    public FishRes(int id, String nama, String bobot, String warna, String habitat) {
        this.id = id;
        this.nama = nama;
        this.bobot = bobot;
        this.warna = warna;
        this.habitat = habitat;
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

    public String getBobot() {
        return bobot;
    }

    public void setBobot(String bobot) {
        this.bobot = bobot;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
