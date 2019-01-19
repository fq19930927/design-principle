package com.fuqiang.pattern.structural.adapter.objectadapter;

/**
 * @author fuqiang
 * @version Adapter, v0.1 2019/1/19 23:31
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    public void request() {
        adaptee.adapteeRequest();
    }
}
