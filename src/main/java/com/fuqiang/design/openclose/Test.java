package com.fuqiang.design.openclose;

import java.math.BigDecimal;

/**
 * @author fuqiang
 * @version Test, v0.1 2019/1/15 22:01
 */
public class Test {

    public static void main(String[] args) {
        ICourse course = new JavaDiscountCourse("java课程", new BigDecimal("288"));
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) course;
        System.out.println(javaDiscountCourse.getName());
        System.out.println(javaDiscountCourse.getPrice());
        System.out.println(javaDiscountCourse.getOrignalPrice());
    }
}
