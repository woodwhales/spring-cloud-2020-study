package cn.woodwhales.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author woodwhales
 * @date 2021-01-06 00:03
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulOrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulOrderMain80.class, args);
    }
}
