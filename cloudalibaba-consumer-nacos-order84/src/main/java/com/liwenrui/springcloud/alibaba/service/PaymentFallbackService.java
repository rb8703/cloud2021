package com.liwenrui.springcloud.alibaba.service;

import com.liwenrui.springcloud.entities.Payment;
import com.liwenrui.springcloud.result.CommonResult;
import org.springframework.stereotype.Component;

/**
 * Created on 2021/8/1
 *
 * @author liwenrui
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<Payment>(4444,"服务降级----PaymentFallBackService",new Payment(id,"errorSerial"));
    }
}
