package com.wang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Wgs
 * @version 1.0
 * @create：2020/05/24
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class IdTest {
    @Test
    public void  getId(){
        System.out.println(IdUril.getId());
    }
}
