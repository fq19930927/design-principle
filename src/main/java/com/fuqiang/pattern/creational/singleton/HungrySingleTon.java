package com.fuqiang.pattern.creational.singleton;

import java.io.Serializable;

public class HungrySingleTon implements Serializable {

    private final static HungrySingleTon HUNGRY_SINGLE_TON;

    static {
        HUNGRY_SINGLE_TON = new HungrySingleTon();
    }

    public HungrySingleTon getHungrySingleTon() {
        return HUNGRY_SINGLE_TON;
    }

    private Object readResolve() {
        return HUNGRY_SINGLE_TON;
    }
}
