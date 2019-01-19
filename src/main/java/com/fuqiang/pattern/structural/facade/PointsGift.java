package com.fuqiang.pattern.structural.facade;

/**
 * @author fuqiang
 * @version PointsGift, v0.1 2019/1/18 20:53
 */
public class PointsGift {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PointsGift(String name) {
        this.name = name;
    }
}
