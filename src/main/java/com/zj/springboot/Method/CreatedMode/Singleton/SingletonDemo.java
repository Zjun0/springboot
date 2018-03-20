package com.zj.springboot.Method.CreatedMode.Singleton;

/**
 * @author: zj
 * @date: ${date}
 */

/**
 * 懒汉模式
 */
public class SingletonDemo {
    private static SingletonDemo instance;
    private SingletonDemo(){

    }
    public static SingletonDemo getInstance(){
        if(instance==null){
            instance=new SingletonDemo();
        }
        return instance;
    }
}
