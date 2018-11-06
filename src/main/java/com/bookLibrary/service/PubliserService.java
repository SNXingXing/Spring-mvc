package com.bookLibrary.service;

import com.bookLibrary.bean.Publisher;

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
    boolean deletePublisher(Long p_id);

    /**
     * 通过id修改出版社信息
     * @param p_id
     * @param publisher
     * @return
     */
    boolean updatePublisher(Long p_id,Publisher publisher);

    /**
     * 通过出版社名字查询出版社id
     * @param p_name
     * @return
     */
    Long queryPublisherId(String p_name);

    /**
     * 通过出版社id查询出版社名字
     * @param p_id
     * @return
     */
    String queryPublisherName(Long p_id);
}
