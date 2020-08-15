package io.mercy.cloud.product.controller;

import io.mercy.cloud.product.api.model.ProductCategory;
import io.mercy.cloud.product.service.IProductCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hkc
 * @version 1.0
 * @date 2020-08-15 11:26
 * @description
 */
@RestController
@RequestMapping(value = "/productCategory")
public class ProductCategoryController {

    @Resource
    private IProductCategoryService productCategoryService;

    @GetMapping(value = "/list")
    public List<ProductCategory> findList() {

        return productCategoryService.list();
    }
}
