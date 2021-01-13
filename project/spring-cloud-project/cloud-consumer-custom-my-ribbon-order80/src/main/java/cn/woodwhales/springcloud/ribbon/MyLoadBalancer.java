package cn.woodwhales.springcloud.ribbon;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author woodwhales
 * @date 2021-01-13 23:03
 */
@Component
public interface MyLoadBalancer {

    /**
     * 从可用节点列表中获取要执行的节点
     * @param serviceInstances
     * @return
     */
    ServiceInstance getInstance(List<ServiceInstance> serviceInstances);

}
