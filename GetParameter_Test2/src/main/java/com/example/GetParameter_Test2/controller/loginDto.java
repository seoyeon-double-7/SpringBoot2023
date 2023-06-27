package com.example.GetParameter_Test2.controller;

import lombok.Data;

@Data
public class loginDto {
    public loginDto(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "loginDto{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }

    private String id;
    private String pw;
}
