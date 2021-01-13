package cn.woodwhales.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author woodwhales
 * @date 2021-01-13 23:01
 */
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class CustomMyRibbonOrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(CustomMyRibbonOrderMain80.class, args);
    }

}
