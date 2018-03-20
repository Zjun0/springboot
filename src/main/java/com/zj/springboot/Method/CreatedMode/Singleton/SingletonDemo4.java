package com.zj.springboot.Method.CreatedMode.Singleton;

/**
 * @author: zj
 * @date: ${date}
 */

/**
 * 静态类内部加载
 */
public class SingletonDemo4 {
    private static class StringletonHolder{
        private  static SingletonDemo4 instance = new SingletonDemo4();
    }

    private SingletonDemo4(){
        System.out.println("Siingleton has loaded");
    }
    private static SingletonDemo4 getInstance(){
        return StringletonHolder.instance;
    }

    /*
    使用内部类的好处是，静态内部类不会在单例加载时就加载，
    而是在调用getInstance()方法时才进行加载，达到了类似懒汉模式的效果，
    而这种方法又是线程安全的。
     */
}
