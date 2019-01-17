package com.fuqiang.pattern.creational.builder.version2;

/**
 * @author fuqiang
 * @version Test, v0.1 2019/1/17 21:09
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java course").buildCourse();
        System.out.println(course);
    }
}
