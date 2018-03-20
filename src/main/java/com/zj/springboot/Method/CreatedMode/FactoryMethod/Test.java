package com.zj.springboot.Method.CreatedMode.FactoryMethod;

import com.zj.springboot.Method.CreatedMode.FactoryMethod.factory.SendMailFactory;
import com.zj.springboot.Method.CreatedMode.FactoryMethod.inter.Provider;
import com.zj.springboot.Method.CreatedMode.FactoryMethod.inter.Sender;

public class Test {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
