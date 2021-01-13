package cn.woodwhales.springcloud.ribbon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author woodwhales
 * @date 2021-01-13 23:22
 */
@Slf4j
@Component
public class MyLoadBalancerImpl implements MyLoadBalancer {
   
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 统计请求次数，采用自旋锁方式获取请求次数
     * @return
     */
    private final int compareAndGet() {
        int current;
        int next;
        do {
            current = atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        } while (!atomicInteger.compareAndSet(current, next));

        log.info("*********** next => {} ***********", next);
        return next;
    }
    
    @Override
    public ServiceInstance getInstance(List<ServiceInstance> serviceInstances) {
        // 请求的第几次 % 可用节点总数 = 当前要执行的节点
        int index = compareAndGet() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
