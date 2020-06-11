package org.example.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "测试swagger", tags = {"测试的相关接口"})
@RestController
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @ApiOperation(value = "获取测试接口", notes = "获取测试结果", httpMethod = "GET")
    @GetMapping("/hello")
    public JSONObject hello() {
        logger.debug("debug: hello~");
        logger.info("info: hello~");
        logger.warn("warn: hello~");
        logger.error("error: hello~");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        return jsonObject;
    }
}
