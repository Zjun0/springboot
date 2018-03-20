package com.zj.springboot.Method.AbstractFactory.Impl;

import com.zj.springboot.Method.AbstractFactory.inter.Sender;

public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
