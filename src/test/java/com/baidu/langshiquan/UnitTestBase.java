package com.baidu.langshiquan;

import org.junit.After;
import org.junit.Before;

import redis.clients.jedis.Jedis;

/**
 * Created by langshiquan on 17/10/9.
 */
public class UnitTestBase {

    protected Jedis jedis;
    protected String host;
    protected Integer port;

    public UnitTestBase() {
        host = "127.0.0.1";
        port = 6379;
    }

    public UnitTestBase(String host, Integer port) {
        this.host = host;
        this.port = port;
    }

    @Before
    public void init() {
        jedis = new Jedis(host, port);
    }

    @After
    public void destory() {
        jedis.close();
    }
}
