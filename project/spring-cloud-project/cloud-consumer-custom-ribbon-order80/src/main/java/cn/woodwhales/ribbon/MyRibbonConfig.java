package cn.woodwhales.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @author woodwhales on 2021-01-13 19:48
 * @description
 */
public class MyRibbonConfig {

    @Bean
    public IRule ribbonClient() {
        return new RandomRule();
    }

}
