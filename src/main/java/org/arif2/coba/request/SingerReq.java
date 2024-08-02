package org.arif2.coba.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SingerReq {
    private int id;
    private String nama;
    private String asal;
    private String genre;
    private int lagu;
}
