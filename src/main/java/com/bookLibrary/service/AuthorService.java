package com.bookLibrary.service;

import com.bookLibrary.bean.Author;

/**
 * @author star
 * 作者功能接口
 */
public interface AuthorService  {
    /**
     * 添加作者方法
     * @return 结果
     */
    boolean addAuthor(Author author);

    /**
     * 通过作者名字查询作者id
     * @param a_name
     * @return
     */
    Author queryAuthorId(String a_name);

    /**
     * 通过作者id 查询作者名字
     * @param a_id
     * @return
     */
    Author queryAuthorName(Integer a_id);

    /**
     * 通过作者id,删除作者
     * @param a_id
     * @return
     */
    boolean deleteAuthor(Integer a_id);

    /**
     * 修改作者
     * @param author
     * @return
     */
    boolean updateAuthor( Author author);
}
