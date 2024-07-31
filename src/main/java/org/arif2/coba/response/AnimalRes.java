package org.arif2.coba.response;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AnimalRes {
    private int id;
    private String nama;
    private String umur;
    private String gender;
    private String jenis;

    public AnimalRes(int id, String nama, String umur, String gender, String jenis) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.jenis = jenis;
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

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
