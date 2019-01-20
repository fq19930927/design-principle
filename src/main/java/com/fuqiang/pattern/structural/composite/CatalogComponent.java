package com.fuqiang.pattern.structural.composite;

/**
 * @author fuqiang
 * @version CatalogComponent, v0.1 2019/1/20 22:11
 */
public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支获取名称操作");
    }

    public double getPrice(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支获取价格操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支打印操作");
    }
}
