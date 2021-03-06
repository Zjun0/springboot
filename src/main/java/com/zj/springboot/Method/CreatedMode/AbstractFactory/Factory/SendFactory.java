package com.zj.springboot.Method.CreatedMode.AbstractFactory.Factory;

import com.zj.springboot.Method.CreatedMode.AbstractFactory.Impl.MailSender;
import com.zj.springboot.Method.CreatedMode.AbstractFactory.Impl.SmsSender;
import com.zj.springboot.Method.CreatedMode.AbstractFactory.inter.Sender;

/**
 * 工厂类
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
