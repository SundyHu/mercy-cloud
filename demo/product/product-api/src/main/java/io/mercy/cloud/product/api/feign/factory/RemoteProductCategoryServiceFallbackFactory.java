package io.mercy.cloud.product.api.feign.factory;

import feign.hystrix.FallbackFactory;
import io.mercy.cloud.product.api.feign.RemoteProductCategoryService;
import io.mercy.cloud.product.api.feign.fallback.RemoteProductCategoryServiceFallback;
import org.springframework.stereotype.Component;

/**
 * @author hkc
 * @version 1.0
 * @date 2020-08-15 11:15
 * @description
 */
@Component
public class RemoteProductCategoryServiceFallbackFactory implements FallbackFactory<RemoteProductCategoryService> {

    @Override
    public RemoteProductCategoryService create(Throwable throwable) {
        
        RemoteProductCategoryServiceFallback remoteProductCategoryServiceFallback = new RemoteProductCategoryServiceFallback();

        return remoteProductCategoryServiceFallback;
    }
}
