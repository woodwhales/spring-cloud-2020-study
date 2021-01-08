package cn.woodwhales.springcloud.controller;

import cn.woodwhales.springcloud.entity.CommonResult;
import cn.woodwhales.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk/{id}")
    public CommonResult<String> paymentzk(@PathVariable Integer id) {
        Payment payment = new Payment();
        payment.setId(Long.valueOf(id + ""));
        payment.setSerial(UUID.randomUUID().toString());
        return new CommonResult(200, "zk-payment, 响应成功, serverPort = " + serverPort, payment);
    }
}