package com.liwenrui.springcloud.alibaba.controller;

import com.liwenrui.springcloud.entities.Payment;
import com.liwenrui.springcloud.result.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created on 2021/8/1
 *
 * @author liwenrui
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap =new HashMap<>();

    static {
        hashMap.put(1L,new Payment(1L,"111"));
        hashMap.put(2L,new Payment(2L,"222"));
        hashMap.put(2L,new Payment(2L,"333"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
        Payment payment = hashMap.get(id);
        return new CommonResult<Payment>(200,"来自："+serverPort,payment);
    }
}
