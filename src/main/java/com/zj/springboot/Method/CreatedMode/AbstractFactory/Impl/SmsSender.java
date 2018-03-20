package com.zj.springboot.Method.CreatedMode.AbstractFactory.Impl;

import com.zj.springboot.Method.CreatedMode.AbstractFactory.inter.Sender;

public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
