package cn.woodwhales.springcloud;

import cn.woodwhales.ribbon.MyRibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author woodwhales
 * @date 2020-12-19 22:18
 */
@RibbonClient(name = "custom", configuration = MyRibbonConfig.class)
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class CustomRibbonOrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(CustomRibbonOrderMain80.class, args);
    }

}
