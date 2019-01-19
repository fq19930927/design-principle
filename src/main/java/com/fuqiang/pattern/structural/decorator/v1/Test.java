package com.fuqiang.pattern.structural.decorator.v1;

/**
 * @author fuqiang
 * @version Test, v0.1 2019/1/19 22:17
 */
public class Test {

    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + " 价格:" + batterCake.cost());
    }
}
