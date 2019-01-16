package com.fuqiang.design.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fuqiang
 * @version TeamLeader, v0.1 2019/1/16 20:24
 */
public class TeamLeader {

        public void checkCourse() {
        List<Course> list = new ArrayList<Course>();
        System.out.println("在线课程树为 " + list.size());
    }
}
