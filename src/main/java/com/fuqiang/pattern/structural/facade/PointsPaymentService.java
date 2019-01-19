package com.fuqiang.pattern.structural.facade;

/**
 * @author fuqiang
 * @version PointsPaymentService, v0.1 2019/1/19 10:28
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        //扣减积分
        System.out.println("支付" + pointsGift.getName() + " 积分成功");
        return true;
    }
}
