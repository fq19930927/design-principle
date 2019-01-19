package com.fuqiang.pattern.structural.adapter.objectadapter;

/**
 * @author fuqiang
 * @version Test, v0.1 2019/1/19 23:32
 */
public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();
        Target target1 = new Adapter();
        target1.request();
    }
}
