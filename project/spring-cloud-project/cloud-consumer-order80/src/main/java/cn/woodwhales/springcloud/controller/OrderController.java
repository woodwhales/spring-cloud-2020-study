package cn.woodwhales.springcloud.controller;

import cn.woodwhales.springcloud.entity.CommonResult;
import cn.woodwhales.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author woodwhales
 * @date 2020-12-19 22:25
 */
@Slf4j
@Controller
@RequestMapping("/consumer")
@RestController
public class OrderController {

    public static final String PAYMENT_URL = "http://CLOUD-PROVIDER-PAYMENT";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping("/payment/discovery")
    public Object discovery() {
        // 获取所有serviceId
        List<String> serviceIds = discoveryClient.getServices();
        Map<String, Map<String, Object>> eurekaMap = new HashMap<>(serviceIds.size());
        for (String serviceId : serviceIds) {
            Map<String, Object> instanceInfoMap = new HashMap<>(5);
            // 通过serviceId获取相应的服务详情信息
            List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
            for (ServiceInstance instance : instances) {
                instanceInfoMap.put("serviceId", instance.getServiceId());
                instanceInfoMap.put("instanceId", instance.getInstanceId());
                instanceInfoMap.put("host", instance.getHost());
                instanceInfoMap.put("port", instance.getPort());
                instanceInfoMap.put("uri", instance.getUri());
            }
            eurekaMap.put(serviceId, instanceInfoMap);
        }
        return eurekaMap;
    }

}
