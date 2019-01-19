package com.fuqiang.pattern.structural.facade;

/**
 * @author fuqiang
 * @version QualifyService, v0.1 2019/1/18 20:54
 */
public class QualifyService {
    public boolean isAvaliable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + "积分资格通过");
        return true;
    }
}
