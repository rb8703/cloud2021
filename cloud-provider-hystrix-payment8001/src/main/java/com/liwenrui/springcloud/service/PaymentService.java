package com.liwenrui.springcloud.service;

/**
 * Created on 2021/6/12
 *
 * @author liwenrui
 */
public interface PaymentService {

    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id);


}
