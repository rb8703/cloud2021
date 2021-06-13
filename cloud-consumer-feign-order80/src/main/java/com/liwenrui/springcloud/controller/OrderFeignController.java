package com.liwenrui.springcloud.controller;

import com.liwenrui.springcloud.entities.Payment;
import com.liwenrui.springcloud.result.CommonResult;
import com.liwenrui.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * Created on 2021/6/12
 *
 * @author liwenrui
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        CommonResult<Payment> result = paymentFeignService.getPaymentById(id);
        return result;

    }


}
