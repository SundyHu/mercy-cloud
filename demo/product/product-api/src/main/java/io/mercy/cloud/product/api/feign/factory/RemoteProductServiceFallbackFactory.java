package io.mercy.cloud.product.api.feign.factory;

import feign.hystrix.FallbackFactory;
import io.mercy.cloud.product.api.feign.RemoteProductService;
import io.mercy.cloud.product.api.feign.fallback.RemoteProductServiceFallback;
import org.springframework.stereotype.Component;

/**
 * @author hkc
 * @version 1.0
 * @date 2020-08-15 10:24
 * @description
 */
@Component
public class RemoteProductServiceFallbackFactory implements FallbackFactory<RemoteProductService> {

    @Override
    public RemoteProductService create(Throwable throwable) {
        RemoteProductServiceFallback remoteProductServiceFallback = new RemoteProductServiceFallback();

        return remoteProductServiceFallback;
    }
}
