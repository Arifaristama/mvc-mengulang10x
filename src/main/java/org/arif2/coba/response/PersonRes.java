package org.arif2.coba.response;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PersonRes {
    private int id;
    private String name;
    private String tempatTgl;
    private String alamat;
    private String agama;

    public PersonRes(int id, String name, String tempatTgl, String alamat, String agama) {
        this.id = id;
        this.name = name;
        this.tempatTgl = tempatTgl;
        this.alamat = alamat;
        this.agama = agama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTempatTgl() {
        return tempatTgl;
    }

    public void setTempatTgl(String tempatTgl) {
        this.tempatTgl = tempatTgl;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }
}
