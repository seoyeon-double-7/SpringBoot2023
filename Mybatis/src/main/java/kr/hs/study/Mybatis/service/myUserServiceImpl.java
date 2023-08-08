package kr.hs.study.Mybatis.service;

import kr.hs.study.Mybatis.dto.myUserDTO;
import kr.hs.study.Mybatis.mapper.myUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class myUserServiceImpl implements myUserService{
    @Autowired
    private myUserMapper mapper;

    @Override
    public void insert(myUserDTO dto) {
        mapper.insert(dto);
    }

    @Override
    public List<myUserDTO> listAll() {
        return mapper.listAll();
    }

    @Override
    public myUserDTO read(String id) {
        return mapper.read(id);
    }

    @Override
    public void update(myUserDTO dto) {
        mapper.update(dto);
    }

    @Override
    public void delete(String id) {
        mapper.delete(id);
    }
}
