package kr.hs.study.book.dao;

import kr.hs.study.book.dto.bookDTO;

import java.util.List;

public interface bookDAO {
    public void add(bookDTO dto);

    public List<bookDTO> listAll();

    public void delete(String id);

    public bookDTO read(String id);

    public void update(bookDTO dto, String id);

}
