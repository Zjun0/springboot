package com.zj.springboot.Method.CreatedMode.FactoryMethod.factory;

import com.zj.springboot.Method.CreatedMode.FactoryMethod.Impl.SmsSender;
import com.zj.springboot.Method.CreatedMode.FactoryMethod.inter.Provider;
import com.zj.springboot.Method.CreatedMode.FactoryMethod.inter.Sender;

public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
