package com.ljq.product.service;

import com.ljq.product.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
