package com.zj.springboot.Method.FactoryMethod.factory;

import com.zj.springboot.Method.FactoryMethod.Impl.MailSender;
import com.zj.springboot.Method.FactoryMethod.inter.Provider;
import com.zj.springboot.Method.FactoryMethod.inter.Sender;

public class SendMailFactory  implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
