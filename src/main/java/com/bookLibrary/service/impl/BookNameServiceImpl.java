package com.bookLibrary.service.impl;

import com.bookLibrary.bean.BookName;
import com.bookLibrary.dao.BookNameMapper;
import com.bookLibrary.service.BookNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author star
 */
@Service
public class BookNameServiceImpl implements BookNameService {


    @Autowired
    BookNameMapper bookNameMapper;

    public boolean addBookName(BookName bookName) {
        int i = bookNameMapper.insertSelective(bookName);
        return i > 0;
    }

    public boolean updateBookName(BookName bookName) {
        int i = bookNameMapper.updateByPrimaryKey(bookName);
        return i > 0;
    }

    public boolean deleteBookName(Integer n_id) {
        int i = bookNameMapper.deleteByPrimaryKey(n_id);

        return i > 0;
    }

    public BookName queryByName(String n_name) {
        BookName bookName = bookNameMapper.selectByName(n_name);
        return bookName;
    }

    public BookName queryByid(Integer n_id) {
        BookName bookName = bookNameMapper.selectByPrimaryKey(n_id);
        return bookName;
    }
}
