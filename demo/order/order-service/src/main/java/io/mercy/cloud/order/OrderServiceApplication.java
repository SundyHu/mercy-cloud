package io.mercy.cloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hkc
 * @version 1.0
 * @date 2020-08-15 10:32
 * @description
 */
@SpringBootApplication(scanBasePackages = {"io.mercy.cloud"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"io.mercy.cloud"})
@EnableHystrix
@EnableCircuitBreaker
public class OrderServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
