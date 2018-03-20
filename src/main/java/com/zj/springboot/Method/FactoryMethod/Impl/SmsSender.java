package com.zj.springboot.Method.FactoryMethod.Impl;

import com.zj.springboot.Method.FactoryMethod.inter.Sender;

public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
