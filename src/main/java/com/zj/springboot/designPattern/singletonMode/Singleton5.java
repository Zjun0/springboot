package com.zj.springboot.designPattern.singletonMode;

/**
 * 懒汉，线程安全
 * @author: zj
 * @date: ${date}
 */
public class Singleton5 {
    private static class SingletonHolder {
      private static final Singleton5 INSTANCE = new Singleton5();
     }
     private Singleton5 (){}
     public static final Singleton5 getInstance() {
               return SingletonHolder.INSTANCE;
     }
}
