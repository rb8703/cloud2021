package com.liwenruii.springcloud.controller;

import com.liwenrui.springcloud.entities.Payment;
import com.liwenrui.springcloud.result.CommonResult;
import com.liwenruii.springcloud.seeervice.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created on 2021/6/7
 *
 * @author liwenrui
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        Payment payment = paymentService.getById(id);

        if(payment != null)
        {
            return new CommonResult(200,"查询成功了,serverPort:  "+serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }

    }

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        if(paymentService.save(payment))
        {
            return new CommonResult(200,"插入数据库成功,serverPort: "+serverPort,payment);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }



}