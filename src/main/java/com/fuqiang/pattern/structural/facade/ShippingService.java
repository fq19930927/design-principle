package com.fuqiang.pattern.structural.facade;

/**
 * @author fuqiang
 * @version ShippingService, v0.1 2019/1/19 10:30
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        // 物流系统的对接逻辑
        System.out.println(pointsGift.getName() + " 进入物流系统");
        String orderID = "666";
        return orderID;

    }
}
