package kr.hs.study.product.dao;

import kr.hs.study.product.dto.productDTO;

import java.util.List;

public interface productDAO {
    //insert, delete, update, select  메서드
    public void add(productDTO dto);
    public List<productDTO> listAll();
}
