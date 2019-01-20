package com.fuqiang.pattern.structural.flyweight;

/**
 * @author fuqiang
 * @version Manager, v0.1 2019/1/20 13:42
 */
public class Manager implements Employee {

    private String department;  // 外部状态
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void report() {
        System.out.println(reportContent);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
