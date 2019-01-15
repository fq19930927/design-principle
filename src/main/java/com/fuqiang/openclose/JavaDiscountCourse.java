package com.fuqiang.openclose;

import java.math.BigDecimal;

/**
 * @author fuqiang
 * @version JavaDiscountCourse, v0.1 2019/1/15 22:00
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().multiply(new BigDecimal("0.8"));
    }

    public BigDecimal getOrignalPrice() {
        return super.getPrice();
    }
}
