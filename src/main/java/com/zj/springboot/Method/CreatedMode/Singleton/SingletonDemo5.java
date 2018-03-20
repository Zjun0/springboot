package com.zj.springboot.Method.CreatedMode.Singleton;

/**
 * @author: zj
 * @date: ${date}
 */

/**
 * 枚举方法
 */
enum SingletonDemo5 {
    INSTANCE;
    public void otherMethods(){
        System.out.println("Something");
    }
    /*
    Effective Java作者Josh Bloch 提倡的方式，在我看来简直是来自神的写法。解决了以下三个问题：

    (1)自由序列化。

    (2)保证只有一个实例。

    (3)线程安全。

    如果我们想调用它的方法时，仅需要以下操作：


    public class Hello {
        public static void main(String[] args){
            SingletonDemo.INSTANCE.otherMethods();
        }
    }
     */
}
