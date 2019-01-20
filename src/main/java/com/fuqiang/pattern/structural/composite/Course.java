package com.fuqiang.pattern.structural.composite;

/**
 * @author fuqiang
 * @version Course, v0.1 2019/1/20 22:15
 */
public class Course extends CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Course Name "+ name + " Price" +price);
    }
}
