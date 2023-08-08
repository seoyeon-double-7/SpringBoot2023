package kr.hs.study.Mybatis.service;

import kr.hs.study.Mybatis.dto.myUserDTO;

import java.util.List;

public interface myUserService {

//    insert 메서드, 추가
    public void insert(myUserDTO dto);
    public List<myUserDTO> listAll();
    public myUserDTO read(String id);
    public void update(myUserDTO dto);
    public void delete(String id);

}
