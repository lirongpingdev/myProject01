package com.es.jpa.model;

import lombok.Data;

@Data
public class Contact {
    private String tel = "189000000001";
    private String address = "深圳XXXXX";
    private String email = "haha@163.com";

    public Contact(String tel, String address, String email) {
        this.tel = tel;
        this.address = address;
        this.email = email;
    }
}
