package com.CourageKang.Singleton;

/**
 * @author CourageKang
 * @data 2020/07/30 - 4:59
 * @Package com.CourageKang.Singleton
 */
public class SingletonFullThreadSafeClass {
    private static SingletonFullThreadSafeClass instance=null;
    //私有构造函数
    private SingletonFullThreadSafeClass(){}
    public synchronized static SingletonFullThreadSafeClass getInstance(){
        if(instance==null){
            instance=new SingletonFullThreadSafeClass();
        }
        return instance;
    }
}
