package com.bookLibrary.service;

import com.bookLibrary.bean.Isbn;

import java.util.List;

/**
 * @author star
 * 书籍信息处理接口
 */
public interface IsbnService {
    /**
     * 添加书籍信息
     * @param isbn
     * @return
     */
    boolean addIsbn(Isbn isbn);

    /**
     * 修改书籍信息
     * @param isbn
     * @return
     */
    boolean updateIsbn(Isbn isbn);

    /**
     * 删除书籍信息
     * @param isbn_id
     * @return
     */
    boolean deleteIsbn(Integer isbn_id);

    /**
     * 通过isbn号 查询isbn信息
     * @param isbn
     * @return
     */
    Isbn queryByIsbn(String isbn);

    /**
     * 通过出版社 查询isbn信息
     * @param p_name
     * @return
     */
    List<Isbn> queryByPublisher(String p_name);

    /**
     * 通过分类名 查询isbn信息
     * @param c_name
     * @return
     */
    List<Isbn> queryByCategory(String c_name);

    /**
     * 通过作者名 查询isbn信息
     * @param a_name
     * @return
     */
    List<Isbn> queryByAuthor(String a_name);

    /**
     * 通过书名 查询isbn信息
     * @param n_name
     * @return
     */
    List<Isbn> queryByBookName(String n_name);


}
