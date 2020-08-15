package io.mercy.cloud.product.controller;

import io.mercy.cloud.product.api.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hkc
 * @version 1.0
 * @date 2020-08-15 10:28
 * @description
 */
@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping(value = "/getProduct")
    public Product getProduct() {
        Product product = new Product();
        product.setId(1);
        product.setName("XXXX");
        return product;
    }
}
