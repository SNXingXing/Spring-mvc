package com.bookLibrary.service;

import com.bookLibrary.bean.Category;

/**
 * @author star
 * 书籍分类接口
 */
public interface CategoryService {
    /**
     * 添加分类信息
     * @param category
     * @return
     */
    boolean addCategory(Category category);

    /**
     * 修改分类信息
     * @param c_id
     * @param category
     * @return
     */
    boolean updateCategory(Long c_id,Category category);

    /**
     * 删除分类信息
     * @param c_id
     * @return
     */
    boolean deleteCategory(Long c_id);

    /**
     * 通过分类名查询分类ID
     * @param c_name
     * @return
     */
    Long queryCid(String c_name);

    /**
     * 通过分类id查询分类名
     * @param c_id
     * @return
     */
    String queryCname(Long c_id);
}
