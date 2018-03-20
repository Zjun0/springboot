package com.zj.springboot.Method.CreatedMode.FactoryMethod.Impl;

import com.zj.springboot.Method.CreatedMode.FactoryMethod.inter.Sender;

public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
