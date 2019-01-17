package com.fuqiang.pattern.creational.builder;

/**
 * @author fuqiang
 * @version JavaCourseBuilder, v0.1 2019/1/17 20:33
 */
public class JavaCourseBuilder extends CourseBuilder {

    private Course course = new Course();

    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    public void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    public Course buildCourse() {
        return course;
    }
}
