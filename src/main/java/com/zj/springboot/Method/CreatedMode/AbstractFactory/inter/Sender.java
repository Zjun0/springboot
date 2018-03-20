package com.zj.springboot.Method.CreatedMode.AbstractFactory.inter;

/**
 * 1、普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 * （我们举一个发送邮件和短信的例子）
 */

//创建二者的共同接口
public interface Sender {
    public void Send();
}
