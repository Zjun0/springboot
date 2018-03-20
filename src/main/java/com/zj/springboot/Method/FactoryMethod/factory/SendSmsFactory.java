package com.zj.springboot.Method.FactoryMethod.factory;

import com.zj.springboot.Method.FactoryMethod.Impl.SmsSender;
import com.zj.springboot.Method.FactoryMethod.inter.Provider;
import com.zj.springboot.Method.FactoryMethod.inter.Sender;

public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
