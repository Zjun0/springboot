package com.zj.springboot.Method.FactoryMethod;

import com.zj.springboot.Method.FactoryMethod.factory.SendMailFactory;
import com.zj.springboot.Method.FactoryMethod.inter.Provider;
import com.zj.springboot.Method.FactoryMethod.inter.Sender;

public class Test {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
