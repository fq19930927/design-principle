package com.fuqiang.pattern.structural.flyweight;

/**
 * @author fuqiang
 * @version Test, v0.1 2019/1/20 21:50
 */
public class Test {
    private static final String departments[] = {"RD", "QA", "PM"};

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
