package com.fuqiang.pattern.structural.decorator.v1;

/**
 * @author fuqiang
 * @version BatterCakeEggSausage, v0.1 2019/1/19 22:17
 */
public class BatterCakeEggSausage extends BatterCakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
