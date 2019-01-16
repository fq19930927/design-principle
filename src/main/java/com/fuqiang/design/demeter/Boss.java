package com.fuqiang.design.demeter;

/**
 * @author fuqiang
 * @version Boss, v0.1 2019/1/16 20:24
 */
public class Boss {

    void commandTeamLeader(TeamLeader teamLeader) {
        teamLeader.checkCourse();
    }
}
