package org.arif2.coba.response;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AccessoriesRes {
    private int id;
    private String nama;
    private String bahan;
    private String warna;
    private String unisex;

    public AccessoriesRes(int id, String nama, String bahan, String warna, String unisex) {
        this.id = id;
        this.nama = nama;
        this.bahan = bahan;
        this.warna = warna;
        this.unisex = unisex;
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

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getUnisex() {
        return unisex;
    }

    public void setUnisex(String unisex) {
        this.unisex = unisex;
    }
}
