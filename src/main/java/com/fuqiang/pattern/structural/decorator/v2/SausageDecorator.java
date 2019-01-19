package com.fuqiang.pattern.structural.decorator.v2;

/**
 * @author fuqiang
 * @version SausageDecorator, v0.1 2019/1/19 22:36
 */
public class SausageDecorator extends ABatterDecorator {
    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加个香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
