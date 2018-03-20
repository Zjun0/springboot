package com.zj.springboot.Method.CreatedMode.AbstractFactory;

import com.zj.springboot.Method.CreatedMode.AbstractFactory.Factory.SendFactory;
import com.zj.springboot.Method.CreatedMode.AbstractFactory.Factory.SendFactory2;
import com.zj.springboot.Method.CreatedMode.AbstractFactory.Factory.SendFactoryStatic;
import com.zj.springboot.Method.CreatedMode.AbstractFactory.inter.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        Sender senderStatic = SendFactoryStatic.produceMail();
        senderStatic.Send();

        SendFactory2 factory2 = new SendFactory2();
        Sender sender2 = factory2.produceMail();
        sender2.Send();

        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }
}
