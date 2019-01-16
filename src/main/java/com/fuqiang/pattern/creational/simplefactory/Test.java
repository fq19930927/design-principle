package com.fuqiang.pattern.creational.simplefactory;

/**
 * @author fuqiang
 * @version Test, v0.1 2019/1/16 21:49
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
      /*  Video java = videoFactory.getVideo("java");
        java.studyClass();
        videoFactory.getVideo("python");
        java.studyClass();*/

        Video video = videoFactory.getVideo(JavaVideo.class);
        video.studyClass();
    }
}
