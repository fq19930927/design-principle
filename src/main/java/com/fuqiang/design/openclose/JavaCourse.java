package com.fuqiang.design.openclose;

import java.math.BigDecimal;

/**
 * @author fuqiang
 * @version JavaCourse, v0.1 2019/1/15 21:57
 */
public class JavaCourse implements ICourse {

    private String name;
    private BigDecimal price;

    public JavaCourse(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
