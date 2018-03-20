package com.zj.springboot.Method.AbstractFactory.Impl;

import com.zj.springboot.Method.AbstractFactory.inter.Sender;

public class MailSender implements Sender {
    @Override
    public void Send() {
        /**
         * 创建实现类
         */
        System.out.println("this is mailsender!");
    }
}
