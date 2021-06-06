package com.liwenrui.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liwenrui.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created on 2021/6/6
 *
 * @author liwenrui
 */

@Mapper
public interface PaymentDao extends BaseMapper<Payment> {
}
