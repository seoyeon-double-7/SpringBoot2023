package kr.hs.study.product.service;

import kr.hs.study.product.dao.productDAO;
import kr.hs.study.product.dto.productDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productServiceImpl implements productService{
    @Autowired
    private productDAO dao;

    @Override
    public void add(productDTO dto) {
        dao.add(dto);

    }
}
