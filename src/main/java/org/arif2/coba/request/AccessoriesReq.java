package org.arif2.coba.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccessoriesReq {
    private int id;
    private String nama;
    private String bahan;
    private String warna;
    private String unisex;
}
