package com.fuqiang.pattern.creational.prototype.clone;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(0L);
        Pig pig = new Pig("佩琦", date);
        Pig pig2 = (Pig) pig.clone();
        pig.setName("乔治");
        pig.getBirthday().setTime(666666666666L);
        System.out.println(pig);
        System.out.println(pig2);
    }
}
