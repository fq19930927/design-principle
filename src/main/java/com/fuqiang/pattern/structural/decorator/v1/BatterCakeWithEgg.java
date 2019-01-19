package com.fuqiang.pattern.structural.decorator.v1;

/**
 * @author fuqiang
 * @version BatterCakeWithEgg, v0.1 2019/1/19 22:14
 */
public class BatterCakeWithEgg extends BatterCake {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
