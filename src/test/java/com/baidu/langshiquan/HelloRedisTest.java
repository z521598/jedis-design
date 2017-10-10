package com.baidu.langshiquan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.baidu.langshiquan.base.SimpleJedis;


/**
 * Created by langshiquan on 17/10/9.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class HelloRedisTest extends SimpleJedis {

    @Test
    public void testHello() {
        getJedis().set("redis", "hello,redis");
        System.out.println(jedis.get("redis"));
    }
}
