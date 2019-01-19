package com.fuqiang.pattern.structural.decorator.v2;

/**
 * @author fuqiang
 * @version ABatterDecorator, v0.1 2019/1/19 22:26
 */
public class ABatterDecorator extends ABatterCake {

    private ABatterCake aBatterCake;

    public ABatterDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }


    protected String getDesc() {
        return aBatterCake.getDesc();
    }

    protected int cost() {
        return aBatterCake.cost();
    }
}
