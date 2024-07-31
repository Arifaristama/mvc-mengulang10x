package org.arif2.coba.response;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SportsRes {
    private int id;
    private String nama;
    private String pemain;
    private String asal;
    private String tempat;

    public SportsRes(int id, String nama, String pemain, String asal, String tempat) {
        this.id = id;
        this.nama = nama;
        this.pemain = pemain;
        this.asal = asal;
        this.tempat = tempat;
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

    public String getPemain() {
        return pemain;
    }

    public void setPemain(String pemain) {
        this.pemain = pemain;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }
}
