package com.zj.springboot.Method.Singleton;

/**
 * @author: zj
 * @date: ${date}
 */

/**
 * 饿汉模式
 */
public class SingletonDemo3 {

    private static SingletonDemo3 instance=new SingletonDemo3();
    private SingletonDemo3(){

    }
    public static SingletonDemo3 getInstance(){
        return instance;
    }

    /*
    直接在运行这个类的时候进行一次loading，之后直接访问。
    显然，这种方法没有起到lazy loading的效果，考虑到前面提到的和静态类的对比，
    这种方法只比静态类多了一个内存常驻而已。
     */
}
