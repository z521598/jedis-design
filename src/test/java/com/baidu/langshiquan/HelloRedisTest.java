package com.baidu.langshiquan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by langshiquan on 17/10/9.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class HelloRedisTest extends UnitTestBase {

    @Test
    public void testHello() {
        jedis.set("redis","hello,redis");
        System.out.println(jedis.get("redis"));
    }
}
