package com.wang;


import com.wang.pojo.PromotionSeckill;
import com.wang.service.PromotionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Wgs
 * @version 1.0
 * @create：2020/05/24
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PromotionSeckillServiceImplTest {
    @Resource
    private PromotionService promotionService;

    @Test
    public void findById() {
        PromotionSeckill promotionSeckill = promotionService.findPsId(1l);
        System.out.println(promotionSeckill.toString());
//        PromotionSeckill promotionSeckill = new PromotionSeckill();
//        promotionSeckill.setPsId(11L);
//        promotionSeckill.setEndTime(new Date());
//        promotionSeckill.setGoodsId(23L);
//        promotionSeckill.setPsCount(3);
//        promotionSeckill.setStartTime(new Date());
//        promotionService.insert(promotionSeckill);
//        System.out.println(promotionSeckill.toString());
    }
}
