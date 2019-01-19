package com.fuqiang.pattern.structural.decorator.v2;

/**
 * @author fuqiang
 * @version BatterCaker, v0.1 2019/1/19 22:23
 */
public class BatterCaker extends ABatterCake {
    protected String getDesc() {
        return "煎饼";
    }

    protected int cost() {
        return 5;
    }
}
