package com.zj.springboot.Method.CreatedMode.AbstractFactory.Impl;

import com.zj.springboot.Method.CreatedMode.AbstractFactory.inter.Sender;

public class MailSender implements Sender {
    @Override
    public void Send() {
        /**
         * 创建实现类
         */
        System.out.println("this is mailsender!");
    }
}
