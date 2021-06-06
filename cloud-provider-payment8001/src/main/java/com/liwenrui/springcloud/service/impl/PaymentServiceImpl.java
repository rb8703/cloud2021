package com.liwenrui.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwenrui.springcloud.dao.PaymentDao;
import com.liwenrui.springcloud.entities.Payment;
import com.liwenrui.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * Created on 2021/6/6
 *
 * @author liwenrui
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentDao, Payment> implements PaymentService {
}
