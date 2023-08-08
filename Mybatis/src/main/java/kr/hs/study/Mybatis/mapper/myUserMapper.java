package kr.hs.study.Mybatis.mapper;

import kr.hs.study.Mybatis.dto.myUserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface myUserMapper {
    public void insert(myUserDTO dto);
    public List<myUserDTO> listAll();
    public void update(myUserDTO dto, String id);
    public myUserDTO read(String id);
}
