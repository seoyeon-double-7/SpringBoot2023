package kr.hs.study.book.service;

import kr.hs.study.book.dto.bookDTO;

import java.util.List;

public interface bookService {
    public void add(bookDTO dto);

    public List<bookDTO> listAll();
}
