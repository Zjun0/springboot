package com.zj.springboot.Method.CreatedMode.FactoryMethod.factory;

import com.zj.springboot.Method.CreatedMode.FactoryMethod.Impl.MailSender;
import com.zj.springboot.Method.CreatedMode.FactoryMethod.inter.Provider;
import com.zj.springboot.Method.CreatedMode.FactoryMethod.inter.Sender;

public class SendMailFactory  implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
