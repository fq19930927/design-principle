package com.fuqiang.design.demeter;

/**
 * @author fuqiang
 * @version Test, v0.1 2019/1/16 20:24
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.commandTeamLeader(new TeamLeader());
    }
}
