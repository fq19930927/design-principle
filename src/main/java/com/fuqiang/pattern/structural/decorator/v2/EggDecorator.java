package com.fuqiang.pattern.structural.decorator.v2;

/**
 * @author fuqiang
 * @version EggDecorator, v0.1 2019/1/19 22:35
 */
public class EggDecorator extends ABatterDecorator {
    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
