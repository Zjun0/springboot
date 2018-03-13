package com.zj.springboot.designPattern.singletonMode;

/**
 * 懒汉，线程安全
 * @author: zj
 * @date: ${date}
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3(){}
    public static  Singleton3 getInstance(){
        return  instance;
    }
}
