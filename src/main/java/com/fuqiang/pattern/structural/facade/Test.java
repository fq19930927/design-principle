package com.fuqiang.pattern.structural.facade;

/**
 * @author fuqiang
 * @version Test, v0.1 2019/1/19 10:35
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
