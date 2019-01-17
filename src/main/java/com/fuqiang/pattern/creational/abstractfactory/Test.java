package com.fuqiang.pattern.creational.abstractfactory;

public class Test {

    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();
        Video video = factory.getVideo();
        video.produce();
        Article article = factory.getArticle();
        article.produce();
    }
}
