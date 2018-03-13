package com.zj.springboot.designPattern.singletonMode;

/**
 * 懒汉，线程安全
 * @author: zj
 * @date: ${date}
 */
public class  Singleton7 {
   private volatile static Singleton7 singleton7;
   private Singleton7(){}
   public static Singleton7 getSingleton7(){
       if (singleton7 == null){
           synchronized (Singleton7.class){
               if (singleton7 == null) {
                   singleton7 = new Singleton7() ;
               }
           }
       }
       return singleton7;
   }
}
