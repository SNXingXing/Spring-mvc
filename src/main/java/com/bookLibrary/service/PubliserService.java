package com.bookLibrary.service;

import com.bookLibrary.bean.Publisher;

import java.util.List;

/**
 * @author star
 * 出版社处理接口
 */
public interface PubliserService {
    /**
     * 插入出版社信息
     * @param publisher
     * @return
     */
    boolean addPublisher(Publisher publisher);

    /**
     * 通过id删除出版社信息
     * @param p_id
     * @return
     */
    boolean deletePublisher(Integer p_id);

    /**
     * 通过id修改出版社信息
     * @param publisher
     * @return
     */
    boolean updatePublisher(Publisher publisher);

    /**
     * 通过出版社名字查询出版社id
     * @param p_name
     * @return
     */
    List<Publisher> queryByName(String p_name);

    /**
     * 通过出版社id查询出版社名字
     * @param p_id
     * @return
     */
    Publisher queryById(Integer p_id);
}
