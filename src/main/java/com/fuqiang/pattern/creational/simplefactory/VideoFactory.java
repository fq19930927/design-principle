package com.fuqiang.pattern.creational.simplefactory;

/**
 * @author fuqiang
 * @version VideoFactory, v0.1 2019/1/16 21:48
 */
public class VideoFactory {

    Video getVideo(Class name) {
      /*  if ("java".equalsIgnoreCase(name)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(name)) {
            return new PythonVideo();
        }
        return null;*/
        Video video =  null;
        try {
            video = (Video) Class.forName(name.getName()).newInstance();
            return video;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
