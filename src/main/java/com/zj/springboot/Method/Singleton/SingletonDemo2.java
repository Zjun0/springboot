package com.zj.springboot.Method.Singleton;

/**
 * @author: zj
 * @date: ${date}
 */

/**
 * 线程安全的懒汉模式
 */
public class SingletonDemo2 {
    private static SingletonDemo2 instance;
    private SingletonDemo2(){

    }
    public static synchronized SingletonDemo2 getInstance(){
        if(instance==null){
            instance=new SingletonDemo2();
        }
        return instance;
    }
    /*
    然而并发其实是一种特殊情况，大多时候这个锁占用的额外资源都浪费了，
    这种打补丁方式写出来的结构效率很低。
     */
}
