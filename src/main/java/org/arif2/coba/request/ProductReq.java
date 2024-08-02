package org.arif2.coba.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductReq {
    private int id;
    private String nama;
    private String brand;
    private int harga;
    private String berat;

}
