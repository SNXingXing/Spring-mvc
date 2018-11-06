package com.bookLibrary.service;

import com.bookLibrary.bean.Purchasebatch;

/**
 * @author star
 * 购买批次接口
 */
public interface PurchaseBatchService {
    /**
     * 添加购买批次
     * @param purchasebatch
     * @return
     */
    boolean addPurchaseBatch(Purchasebatch purchasebatch);


}
