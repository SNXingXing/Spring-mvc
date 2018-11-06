package com.bookLibrary.service;

import com.bookLibrary.bean.Store;

import java.util.List;

/**
 * @author star
 * 书的库存接口
 */
public interface BookStoreService {
    /**
     * 添加库存
     * @param store
     * @return
     */
    boolean addStore(Store store);

    /**
     * 添加多个库存
     * @param stores
     * @return
     */
    boolean addStore(List<Store> stores);

    /**
     * 修改库存信息
     * @param s_id
     * @param store
     * @return
     */
    boolean updateStore(Long s_id ,Store store);

    /**
     * 删除库存信息
     * @param s_id
     * @return
     */
    boolean deleteStore(Long s_id);
}
