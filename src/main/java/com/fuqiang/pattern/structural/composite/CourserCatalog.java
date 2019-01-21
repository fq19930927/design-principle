package com.fuqiang.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CourserCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private String name;

    public CourserCatalog(String name) {
        this.name = name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return name;
    }

    @Override
    public void print() {
       for (CatalogComponent catalogComponent : items) {
           catalogComponent.print();
       }
    }
}
