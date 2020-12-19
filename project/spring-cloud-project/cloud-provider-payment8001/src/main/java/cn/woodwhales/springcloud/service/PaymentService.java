package cn.woodwhales.springcloud.service;

import cn.woodwhales.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author woodwhales
 * @date 2020-12-19 18:49
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
