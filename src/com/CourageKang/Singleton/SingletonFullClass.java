package com.CourageKang.Singleton;

/**
 * @author CourageKang
 * @data 2020/07/30 - 4:58
 * @Package com.CourageKang.Singleton
 */
public class SingletonFullClass {
    private static SingletonFullClass instance=null;
    //私有构造函数
    private SingletonFullClass(){}
    public static SingletonFullClass getInstance(){
        if(instance==null){
            instance=new SingletonFullClass();
        }
        return instance;
    }
}
