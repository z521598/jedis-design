package com.baidu.langshiquan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.baidu.langshiquan.base.PoolJedis;
import com.baidu.langshiquan.base.SimpleJedis;

import redis.clients.jedis.Jedis;

/**
 * Created by langshiquan on 17/10/9.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class HelloRedisTest2 extends PoolJedis {

    @Test
    public void testHello() {
        Jedis jedis = getJedis();
        jedis.set("redis", "hello,redis");
        System.out.println(jedis.get("redis"));
    }
}
