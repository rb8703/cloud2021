package com.liwenrui.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * Created on 2021/6/13
 *
 * @author liwenrui
 */
@Component
public class PaymentFallbackService implements  PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "80端paymentInfo_OK降级";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "80端paymentInfo_TimeOut降级";
    }
}
