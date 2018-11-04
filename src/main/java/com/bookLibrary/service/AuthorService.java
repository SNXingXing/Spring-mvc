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
    boolean authorAdd();

    /**
     * 通过作者名字查询作者id
     * @param a_name
     * @return
     */
    Long queryAuthorId(String a_name);

    /**
     * 通过作者id 查询作者名字
     * @param a_id
     * @return
     */
    String queryAuthorName(Long a_id);

    /**
     * 通过作者id,删除作者
     * @param a_id
     * @return
     */
    boolean deleteAuthor(Long a_id);

    /**
     * 修改作者
     * @param a_id
     * @param author
     * @return
     */
    boolean updateAuthor(Long a_id, Author author);
}
