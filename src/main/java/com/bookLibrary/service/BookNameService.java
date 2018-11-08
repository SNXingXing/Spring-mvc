package com.bookLibrary.service;

import com.bookLibrary.bean.BookName;

/**
 * @author star
 * 书名功能接口
 *
 */
public interface BookNameService {
    /**
     * 添加书名
     * @param bookName
     * @return
     */
    boolean addBookName(BookName bookName);

    /**
     * 修改书名
     * @param bookName 要改的内容
     * @return
     */
    boolean updateBookName(BookName bookName);

    /**
     * 删除书名
     * @param n_id 要删除的书名id
     * @return
     */
    boolean deleteBookName(Integer n_id);

    /**
     * 通过书名查询id
     * @param n_name 书名
     * @return
     */
    BookName  queryByName(String n_name);

    /**
     * 通过id查询书名
     * @param n_id id
     * @return
     */
    BookName queryByid(Integer n_id);
}
