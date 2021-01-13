package cn.woodwhales.springcloud;

import cn.woodwhales.springcloud.config.ExcludeFromComponentScan;
import cn.woodwhales.springcloud.config.MyRibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author woodwhales
 * @date 2020-12-19 22:18
 * 排序掉 ExcludeFromComponentScan 注解标记的类，不被 ComponentScan 扫描到
 */
@RibbonClient(name = "CLOUD-PROVIDER-PAYMENT", configuration = MyRibbonConfig.class)
@ComponentScan(excludeFilters= {@ComponentScan.Filter(type= FilterType.ANNOTATION, value= ExcludeFromComponentScan.class)})
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class CustomRibbonOrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(CustomRibbonOrderMain80.class, args);
    }

}
