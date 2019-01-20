package com.fuqiang.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fuqiang
 * @version EmployeeFactory, v0.1 2019/1/20 13:46
 */
public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<String, Employee>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理: " + department);
            String reportContent = department + " 部门汇报:...";
            manager.setReportContent(reportContent);
            System.out.println("创建报告: " + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
