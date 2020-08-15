package io.mercy.cloud.product.api.feign.fallback;

import io.mercy.cloud.product.api.feign.RemoteProductCategoryService;
import io.mercy.cloud.product.api.model.ProductCategory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hkc
 * @version 1.0
 * @date 2020-08-15 11:15
 * @description
 */
@Component
public class RemoteProductCategoryServiceFallback implements RemoteProductCategoryService {

    @Override
    public List<ProductCategory> findList() {
        System.err.println("服务发生熔断");
        return null;
    }
}
