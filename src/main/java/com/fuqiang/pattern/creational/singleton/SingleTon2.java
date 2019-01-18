package com.fuqiang.pattern.creational.singleton;

public class SingleTon2 {

    private SingleTon2 () {}

    private static class InnerClass {
        private static SingleTon2 singleTon2 = new SingleTon2();
    }

    public static SingleTon2 getSingleTon() {
        return InnerClass.singleTon2;
    }
}
