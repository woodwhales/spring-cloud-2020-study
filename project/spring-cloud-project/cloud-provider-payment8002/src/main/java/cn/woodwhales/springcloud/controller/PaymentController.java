package cn.woodwhales.springcloud.controller;

import cn.woodwhales.springcloud.entity.CommonResult;
import cn.woodwhales.springcloud.entity.Payment;
import cn.woodwhales.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.concurrent.TimeUnit;

/**
 * @author woodwhales
 * @date 2020-12-19 18:51
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult<Void> create(@Valid @RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果：{}", result);

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,serverPort: " + serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);

        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPort:  " + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询ID: " + id);
        }
    }

    @GetMapping("/timeout")
    public String timeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "timeout";
    }

}
