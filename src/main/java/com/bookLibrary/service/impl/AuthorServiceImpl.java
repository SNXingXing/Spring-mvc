package com.bookLibrary.service.impl;

import com.bookLibrary.bean.Author;
import com.bookLibrary.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    public boolean addAuthor(Author author) {
        return false;
    }

    public Author queryAuthorId(String a_name) {
        return null;
    }

    public Author queryAuthorName(Integer a_id) {
        return null;
    }

    public boolean deleteAuthor(Integer a_id) {
        return false;
    }

    public boolean updateAuthor( Author author) {
        return false;
    }
}
