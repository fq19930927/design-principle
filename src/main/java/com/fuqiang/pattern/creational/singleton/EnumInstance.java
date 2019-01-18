package com.fuqiang.pattern.creational.singleton;

public enum EnumInstance {
    INSTANCE {
        public void test() {
            System.out.println("test...");
        }
    };

    /** enum单列模式中写方法 */
    public abstract void test();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
