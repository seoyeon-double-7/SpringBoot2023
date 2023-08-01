package kr.hs.study.product.dao;

import kr.hs.study.product.dto.productDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class productDAOImpl implements productDAO{
    @Autowired
    private JdbcTemplate jdbc;

    @Override
    public void add(productDTO dto) {
        String sql="insert into product values(?,?)";
            jdbc.update(sql, dto.getProduct_id(), dto.getProduct_name());

    }
}
