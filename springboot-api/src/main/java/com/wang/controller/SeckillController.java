package com.wang.controller;

import com.alibaba.fastjson.JSONObject;
import com.wang.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wgs
 * @version 1.0
 * @create：2020/05/24
 */
@RestController
public class SeckillController {
    @Autowired
    private PromotionService promotionService;
    @GetMapping("/seckill")
    public String seckill(){
        return JSONObject.toJSONString(promotionService.findPsId(1L));
    }
}
