package kr.hs.study.Mybatis.dto;

import lombok.Data;

@Data
public class myUserDTO {
    private String id;
    private String name;
    private String pw;
    private String email;
    private String title;
    private String content;
    private String hit;
}
