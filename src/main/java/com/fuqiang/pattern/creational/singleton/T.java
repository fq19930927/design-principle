package com.fuqiang.pattern.creational.singleton;

/**
 * @author fuqiang
 * @version T, v0.1 2019/1/17 23:09
 */
public class T implements Runnable {
    public void run() {
        SingleTon singleTon = SingleTon.getSingleTon();
        System.out.println(Thread.currentThread().getName() + "..." + singleTon);
    }
}
