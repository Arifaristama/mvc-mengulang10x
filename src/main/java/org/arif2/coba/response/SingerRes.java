package org.arif2.coba.response;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SingerRes {
    private int id;
    private String nama;
    private String asal;
    private String genre;
    private int lagu;

    public SingerRes(int id, String nama, String asal, String genre, int lagu) {
        this.id = id;
        this.nama = nama;
        this.asal = asal;
        this.genre = genre;
        this.lagu = lagu;
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

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getLagu() {
        return lagu;
    }

    public void setLagu(int lagu) {
        this.lagu = lagu;
    }
}
