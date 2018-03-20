package com.zj.springboot.Method.AbstractFactory.Factory;

import com.zj.springboot.Method.AbstractFactory.Impl.MailSender;
import com.zj.springboot.Method.AbstractFactory.Impl.SmsSender;
import com.zj.springboot.Method.AbstractFactory.inter.Sender;

/**
 * 静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 */
public class SendFactoryStatic {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
