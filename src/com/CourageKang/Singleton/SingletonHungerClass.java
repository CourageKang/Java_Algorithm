package com.CourageKang.Singleton;

/**
 * @author CourageKang
 * @data 2020/07/30 - 4:55
 * @Package com.CourageKang.Singleton
 */
public class SingletonHungerClass {
    private static final SingletonHungerClass instance=new SingletonHungerClass();
    //私有构造函数
    private SingletonHungerClass(){}
    public static SingletonHungerClass getInstance(){
        return instance;
    }
}
