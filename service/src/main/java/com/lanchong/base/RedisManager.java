package com.lanchong.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class RedisManager {

    @Autowired
    private StringRedisTemplate redisTemplate;

    private static RedisManager redisManager;

    @PostConstruct
    public void init() {
        redisManager = this;
    }

    /**
     * Redis Set String Ops
     *
     * @param key
     * @param value
     */
    public static void set(String key, String value) {
        redisManager.redisTemplate.opsForValue().set(key, value);
    }

    /**
     * Redis Get String Ops
     * @param key
     * @return
     */
    public static String get(String key) {
        return redisManager.redisTemplate.opsForValue().get(key);
    }

}