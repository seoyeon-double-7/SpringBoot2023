package kr.hs.study.product.service;

import kr.hs.study.product.dto.productDTO;

import java.util.List;

public interface productService {
    public void add(productDTO dto);

//    select
    public List<productDTO> listAll();
}
