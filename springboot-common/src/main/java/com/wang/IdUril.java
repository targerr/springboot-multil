package com.wang;

import java.util.Random;

/**
 * @author Wgs
 * @version 1.0
 * @create：2020/05/24
 */
public class IdUril {
    public static String getId() {
        Random random = new Random();
        int num = random.nextInt(1000);
        return System.currentTimeMillis() + String.valueOf(num);
    }
}
