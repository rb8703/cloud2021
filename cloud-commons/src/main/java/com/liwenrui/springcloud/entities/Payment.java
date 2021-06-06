package com.liwenrui.springcloud.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created on 2021/6/6
 *
 * @author liwenrui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_rb_payment")
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
