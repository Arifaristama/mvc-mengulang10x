package org.arif2.coba.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SnackReq {
    private int id;
    private String nama;
    private String brand;
    private String varRasa;
    private String berat;
}
