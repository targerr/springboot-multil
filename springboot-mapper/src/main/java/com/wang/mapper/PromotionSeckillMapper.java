package com.wang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wang.pojo.PromotionSeckill;

/**
 * @author Wgs
 * @version 1.0
 * @create：2020/05/24
 */
public interface PromotionSeckillMapper extends BaseMapper<PromotionSeckill> {
    public PromotionSeckill findById(Long ps_id);
}
