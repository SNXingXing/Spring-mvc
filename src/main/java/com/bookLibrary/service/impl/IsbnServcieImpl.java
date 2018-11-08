package com.bookLibrary.service.impl;

import com.bookLibrary.bean.Isbn;
import com.bookLibrary.service.IsbnService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IsbnServcieImpl implements IsbnService {
    public boolean addIsbn(Isbn isbn) {
        return false;
    }

    public boolean updateIsbn(Isbn isbn) {
        return false;
    }

    public boolean deleteIsbn(Integer isbn_id) {
        return false;
    }

    public Isbn queryByIsbn(String isbn) {
        return null;
    }

    public List<Isbn> queryByPublisher(String p_name) {
        return null;
    }

    public List<Isbn> queryByCategory(String c_name) {
        return null;
    }

    public List<Isbn> queryByAuthor(String a_name) {
        return null;
    }

    public List<Isbn> queryByBookName(String n_name) {
        return null;
    }
}
