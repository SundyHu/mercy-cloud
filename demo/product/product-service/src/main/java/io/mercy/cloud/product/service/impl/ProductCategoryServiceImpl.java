package io.mercy.cloud.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.mercy.cloud.product.api.model.ProductCategory;
import io.mercy.cloud.product.mapper.ProductCategoryMapper;
import io.mercy.cloud.product.service.IProductCategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hkc
 * @version 1.0
 * @date 2020-08-15 11:25
 * @description
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements IProductCategoryService {

}
