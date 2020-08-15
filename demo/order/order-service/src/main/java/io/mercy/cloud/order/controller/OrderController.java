package io.mercy.cloud.order.controller;

import io.mercy.cloud.product.api.feign.RemoteProductCategoryService;
import io.mercy.cloud.product.api.feign.RemoteProductService;
import io.mercy.cloud.product.api.model.Product;
import io.mercy.cloud.product.api.model.ProductCategory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hkc
 * @version 1.0
 * @date 2020-08-15 10:33
 * @description
 */
@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Resource
    private RemoteProductService remoteProductService;

    @Resource
    private RemoteProductCategoryService remoteProductCategoryService;

    @GetMapping(value = "/getProduct")
    public Product getProduct() {
        return remoteProductService.getProduct();
    }

    @GetMapping(value = "/list")
    public List<ProductCategory> findList() {
        return remoteProductCategoryService.findList();
    }
}
