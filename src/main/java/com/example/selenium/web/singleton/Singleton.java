package com.example.selenium.web.singleton;

/**
 * 饿汉式，线程安全
 */
public class Singleton {
    /**
     * 饿汉式，线程安全
     */
   /* private Singleton(){}
    private static Singleton uniqueInstance = new Singleton();
    public static Singleton getInstance(){
        return uniqueInstance;
    }*/

    /**
     * 懒汉式，静态内部类
     */
    /*private Singleton(){}
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }*/
    /**
     * 懒汉式，双重锁
     */
    private Singleton(){}
    private volatile static Singleton instance;
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
