package com.fuqiang.pattern.creational.builder;

/**
 * @author fuqiang
 * @version CourseBuilder, v0.1 2019/1/17 20:16
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course buildCourse();

}
