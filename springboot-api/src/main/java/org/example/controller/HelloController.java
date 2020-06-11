package org.example.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "测试swagger", tags = {"测试的相关接口"})
@RestController
public class HelloController {
    @ApiOperation(value = "获取测试接口", notes = "获取测试结果", httpMethod = "GET")
    @GetMapping("/hello")
    public JSONObject hello() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        return jsonObject;
    }
}
