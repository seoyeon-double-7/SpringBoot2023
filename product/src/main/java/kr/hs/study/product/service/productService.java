package kr.hs.study.product.service;

import kr.hs.study.product.dto.productDTO;

import java.util.List;

public interface productService {
    //insert
    public void add(productDTO dto);

    //select
    public List<productDTO> listAll();

    //delete
    public void delete(String id);

    //update
    public productDTO read(String id);

    public void update(productDTO dto, String id);
}
