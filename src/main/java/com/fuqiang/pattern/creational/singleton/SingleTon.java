package com.fuqiang.pattern.creational.singleton;

/**
 * @author fuqiang
 * @version SingleTon, v0.1 2019/1/17 23:08
 */
// 懒汉式单例模式
public class SingleTon {

    private static volatile SingleTon singleTon = null;

    private SingleTon () {}

    public static SingleTon getSingleTon() {
        if (singleTon == null) {
            synchronized (SingleTon.class) {
                if (singleTon == null) {
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }
}
