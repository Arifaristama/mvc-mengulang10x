package org.arif2.coba.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FruitsReq {
    private int id;
    private String nama;
    private String warna;
    private int harga;
    private String rasa;
}
