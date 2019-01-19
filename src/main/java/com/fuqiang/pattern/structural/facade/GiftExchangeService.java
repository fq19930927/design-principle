package com.fuqiang.pattern.structural.facade;

/**
 * @author fuqiang
 * @version GiftExchangeService, v0.1 2019/1/19 10:32
 */
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvaliable(pointsGift)) {
            if (pointsPaymentService.pay(pointsGift)) {
                String orderID = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功,订单号 " + orderID);
            }
        }

    }
}
