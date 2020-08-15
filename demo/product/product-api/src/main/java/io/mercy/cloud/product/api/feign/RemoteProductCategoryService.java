package io.mercy.cloud.product.api.feign;

import io.mercy.cloud.product.api.feign.factory.RemoteProductCategoryServiceFallbackFactory;
import io.mercy.cloud.product.api.model.ProductCategory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author hkc
 * @version 1.0
 * @date 2020-08-15 11:14
 * @description
 */
@FeignClient(contextId = "remoteProductCategoryService", value = "product-service", fallbackFactory = RemoteProductCategoryServiceFallbackFactory.class, path = "/productCategory")
public interface RemoteProductCategoryService {

    @GetMapping(value = "/list")
    List<ProductCategory> findList();
}
