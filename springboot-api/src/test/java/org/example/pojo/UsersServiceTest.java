package org.example.pojo;

import com.alibaba.fastjson.JSON;
import org.example.mapper.UsersMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Wgs
 * @version 1.0
 * @create：2020/06/11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersServiceTest {
    @Autowired
    private UsersMapper usersMapper ;
    @Test
    public void getUserBuId(){
        Users users = usersMapper.queryById("159063669295256592");
        System.out.println(JSON.toJSONString(users,true));
    }

}
