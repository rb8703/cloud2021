package com.liwenrui.springcloud.controller;

import com.liwenrui.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import javafx.beans.DefaultProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created on 2021/6/12
 *
 * @author liwenrui
 */
@RestController
@Slf4j
//该controller统一降级，不在controller做降级，controller层不建议做逻辑
//在调用service做降级，调用的 服务不可用时使用PaymentFallbackService中的对应降级方法
//@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystirxController {

    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfo_OK(id);
        return result;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand(commandProperties = {@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="5000")})
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id)
    {
//        int age = 10/0;
        String result = paymentHystrixService.paymentInfo_TimeOut(id);
        return result;
    }

//    使用上全局默认降级方法defaultFallback
//    @HystrixCommand
    @GetMapping("/consumer/payment/hystrix/defaultFallback")
    public String defaultFallback()
    {
//        int age = 10/0;
        return "成功";
    }

    // 下面是全局fallback方法
//    public String payment_Global_FallbackMethod()
//    {
//        return "Global异常处理信息，请稍后再试，/(ㄒoㄒ)/~~";
//    }



}
