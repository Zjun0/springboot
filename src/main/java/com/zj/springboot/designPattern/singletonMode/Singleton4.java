package com.zj.springboot.designPattern.singletonMode;

/**
 * 懒汉，线程安全
 * @author: zj
 * @date: ${date}
 */
public class Singleton4 {
    private static  Singleton4 instance = null;
    static{
        instance = new Singleton4();
    }
    private Singleton4(){}
    public static Singleton4 getInstance(){
        return  instance;
    }
}
