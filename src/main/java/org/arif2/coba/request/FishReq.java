package org.arif2.coba.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FishReq {
    private String id;
    private String nama;
    private String bobot;
    private String warna;
    private String habitat;
}
