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
        String sql = "select * from book";
        System.out.println("list all 호출");
        List<bookDTO> dto = jdbc.query(sql, new BeanPropertyRowMapper<>(bookDTO.class));
        return dto;
    }

    @Override
    public void delete(String id) {
        String sql = "delete from book where book_id = ?";
        jdbc.update(sql, id);
    }

    @Override
    public bookDTO read(String id) {
        String sql = "select * from book where book_id = " + id;
        bookDTO dto = jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(bookDTO.class));
        return dto;
    }

    @Override
    public void update(bookDTO dto, String id) {
        String sql = "update book set book_id = ?, book_title = ?, book_author = ? where book_id="+id;
        jdbc.update(sql, dto.getBook_id(), dto.getBook_title(), dto.getBook_author());
    }
}
