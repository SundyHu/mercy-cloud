package io.mercy.cloud.product.api.feign;

import io.mercy.cloud.product.api.feign.factory.RemoteProductServiceFallbackFactory;
import io.mercy.cloud.product.api.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author hkc
 * @version 1.0
 * @date 2020-08-15 10:22
 * @description
 */
@FeignClient(contextId = "remoteProductService", value = "product-service", fallbackFactory = RemoteProductServiceFallbackFactory.class, path = "/products")
public interface RemoteProductService {

    @GetMapping(value = "/getProduct")
    Product getProduct();
}
