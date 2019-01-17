package com.fuqiang.pattern.creational.singleton;

/**
 * @author fuqiang
 * @version Test, v0.1 2019/1/17 23:12
 */
public class Test {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new T());
        Thread thread2 = new Thread(new T());
        thread1.start();
        thread2.start();
    }
}
