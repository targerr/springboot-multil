package org.example.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wgs (ˇˍˇ)
 * @version 1.0
 * @create：2020/06/10
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public JSONObject hello() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        return jsonObject;
    }
}
