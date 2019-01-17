package com.fuqiang.pattern.creational.builder;

/**
 * @author fuqiang
 * @version Test, v0.1 2019/1/17 20:40
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new JavaCourseBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("java course", "java PPT",
                "java Video", "java article", "java QA");
        System.out.println(course);
    }
}
