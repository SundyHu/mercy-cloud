package io.mercy.cloud.order.controller;

import io.mercy.cloud.product.api.feign.RemoteProductService;
import io.mercy.cloud.product.api.feign.fallback.RemoteProductServiceFallback;
import io.mercy.cloud.product.api.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @GetMapping(value = "/getProduct")
    public Product getProduct() {
        return remoteProductService.getProduct();
    }
}
