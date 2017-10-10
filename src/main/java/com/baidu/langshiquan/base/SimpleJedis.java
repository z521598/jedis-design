package com.baidu.langshiquan.base;

import redis.clients.jedis.Jedis;

/**
 * Created by langshiquan on 17/10/10.
 */
public class SimpleJedis {
    protected Jedis jedis;
    protected String host;
    protected Integer port;

    public SimpleJedis() {
        host = "127.0.0.1";
        port = 6379;
    }

    public SimpleJedis(String host, Integer port) {
        this.host = host;
        this.port = port;
    }

    public Jedis getJedis() {
        if (jedis == null) {
            jedis = new Jedis(host, port);
        }
        return jedis;
    }

}
