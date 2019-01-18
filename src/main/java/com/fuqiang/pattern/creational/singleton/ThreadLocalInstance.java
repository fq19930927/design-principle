package com.fuqiang.pattern.creational.singleton;

public class ThreadLocalInstance {

    private ThreadLocalInstance() {

    }

    private static final ThreadLocal<ThreadLocalInstance> THREAD_LOCAL_INSTANCE
            = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    public static ThreadLocalInstance getInstance() {
        return THREAD_LOCAL_INSTANCE.get();
    }
}
