package com.liwenrui.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.liwenrui.springcloud.result.CommonResult;

/**
 * Created on 2021/7/31
 *
 * @author liwenrui
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }

}
