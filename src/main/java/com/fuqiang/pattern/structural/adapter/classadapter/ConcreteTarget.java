package com.fuqiang.pattern.structural.adapter.classadapter;

/**
 * @author fuqiang
 * @version ConcreteTarget, v0.1 2019/1/19 23:14
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
