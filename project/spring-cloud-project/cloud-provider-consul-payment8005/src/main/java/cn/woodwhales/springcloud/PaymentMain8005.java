package cn.woodwhales.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author woodwhales
 * @date 2021-01-02 24:03
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain8005 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8005.class, args);
    }

}
