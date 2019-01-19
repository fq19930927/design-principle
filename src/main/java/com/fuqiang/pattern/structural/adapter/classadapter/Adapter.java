package com.fuqiang.pattern.structural.adapter.classadapter;

/**
 * @author fuqiang
 * @version Adapter, v0.1 2019/1/19 23:15
 */
public class Adapter extends Adaptee implements Target {
    public void request() {
        super.adapteeRequest();
    }
}
