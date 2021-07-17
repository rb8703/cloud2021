package com.liwenrui.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created on 2021/6/12
 *
 * @author liwenrui
 */
public interface PaymentService {

    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id);

    String paymentCircuitBreaker(Integer id);




}
