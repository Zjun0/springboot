package com.zj.springboot.Method.Singleton;

/**
 * @author: zj
 * @date: ${date}
 */

/**
 * 双重校验锁法
 */
public class SingletonDemo6 {
    private volatile static SingletonDemo6 instance;
    private SingletonDemo6(){
        System.out.println("Singleton has loaded");
    }
    public static SingletonDemo6 getInstance(){
        if (instance == null) {
            synchronized (SingletonDemo6.class){
                if (instance == null) {
                    instance = new SingletonDemo6();
                }
            }
        }
        return instance;
    }

    /*
    接下来我解释一下在并发时，双重校验锁法会有怎样的情景：

    STEP 1. 线程A访问getInstance()方法，因为单例还没有实例化，所以进入了锁定块。

    STEP 2. 线程B访问getInstance()方法，因为单例还没有实例化，得以访问接下来代码块，而接下来代码块已经被线程1锁定。

    STEP 3. 线程A进入下一判断，因为单例还没有实例化，所以进行单例实例化，成功实例化后退出代码块，解除锁定。

    STEP 4. 线程B进入接下来代码块，锁定线程，进入下一判断，因为已经实例化，退出代码块，解除锁定。

    STEP 5. 线程A获取到了单例实例并返回，线程B没有获取到单例并返回Null。

    理论上双重校验锁法是线程安全的，并且，这种方法实现了lazyloading。
     */
}
