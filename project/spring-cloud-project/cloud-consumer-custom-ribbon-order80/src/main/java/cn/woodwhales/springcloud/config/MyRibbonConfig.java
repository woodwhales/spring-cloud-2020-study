package cn.woodwhales.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author woodwhales on 2021-01-13 19:48
 * @description
 */
@ExcludeFromComponentScan
@Configuration
public class MyRibbonConfig {

    @Bean
    public IRule ribbonClient() {
        // 自定义ribbon的策略为随机策略
        return new RandomRule();
    }

}
