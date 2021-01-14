package cn.woodwhales.springcloud.controller;

import cn.woodwhales.springcloud.entity.CommonResult;
import cn.woodwhales.springcloud.entity.Payment;
import cn.woodwhales.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author woodwhales
 * @date 2020-12-19 22:25
 */
@Slf4j
@Controller
@RequestMapping("/consumer")
@RestController
public class OrderController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return paymentService.getPaymentById(id);
    }


    @GetMapping("/timeout")
    public String timeout() {
        return paymentService.timeout();
    }
}
