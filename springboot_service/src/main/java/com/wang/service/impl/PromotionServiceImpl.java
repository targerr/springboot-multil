package com.wang.service.impl;

import com.wang.mapper.PromotionSeckillMapper;
import com.wang.pojo.PromotionSeckill;
import com.wang.service.PromotionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Wgs
 * @version 1.0
 * @create：2020/05/24
 */
@Service
public class PromotionServiceImpl implements PromotionService {
    @Resource
    private PromotionSeckillMapper promotionSeckillMapper;

    @Override
    public PromotionSeckill findPsId(Long psId) {
        return promotionSeckillMapper.findById(psId);
    }
}
