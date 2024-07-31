package org.arif2.coba.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalReq {
    private int id;
    private String nama;
    private String umur;
    private String gender;
    private String jenis;
}
