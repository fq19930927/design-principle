package com.fuqiang.pattern.structural.decorator.v2;

/**
 * @author fuqiang
 * @version Test, v0.1 2019/1/19 22:37
 */
public class Test {

    public static void main(String[] args) {
        ABatterCake aBatterCake = new BatterCaker();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);
        System.out.println(aBatterCake.getDesc() + " 价格:" + aBatterCake.cost());
    }
}
