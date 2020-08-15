package io.mercy.cloud.product.api.feign.fallback;

import io.mercy.cloud.product.api.feign.RemoteProductService;
import io.mercy.cloud.product.api.model.Product;
import org.springframework.stereotype.Component;

/**
 * @author hkc
 * @version 1.0
 * @date 2020-08-15 10:23
 * @description
 */
@Component
public class RemoteProductServiceFallback implements RemoteProductService {

    @Override
    public Product getProduct() {
        System.err.println("服务发生熔断");
        return null;
    }
}
