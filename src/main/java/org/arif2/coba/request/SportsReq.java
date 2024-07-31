package org.arif2.coba.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SportsReq {
    private int id;
    private String nama;
    private String pemain;
    private String asal;
    private String tempat;
}
