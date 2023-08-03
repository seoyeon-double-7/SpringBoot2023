package kr.hs.study.Mybatis.mapper;

import kr.hs.study.Mybatis.dto.myUserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface myUserMapper {
    public void insert(myUserDTO dto);
}
