package org.arif2.coba.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonReq {
    private int id;
    private String name;
    private String tempatTgl;
    private String alamat;
    private String agama;
}
