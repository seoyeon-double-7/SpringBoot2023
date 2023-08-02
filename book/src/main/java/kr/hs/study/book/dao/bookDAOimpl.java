package kr.hs.study.book.dao;

import kr.hs.study.book.dto.bookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class bookDAOimpl implements bookDAO{
    @Autowired
    private JdbcTemplate jdbc;
    @Override
    public void add(bookDTO dto) {
        String sql = "insert into book values(?,?,?)";
        jdbc.update(sql, dto.getBook_id(), dto.getBook_title(), dto.getBook_author());
    }

    @Override
    public List<bookDTO> listAll() {
        String sql = "select * from book order by book_id";
        List<bookDTO> dto = jdbc.query(sql, new BeanPropertyRowMapper<>(bookDTO.class));
        return dto;
    }
}
