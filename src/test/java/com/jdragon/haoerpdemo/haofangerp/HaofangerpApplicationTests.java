package com.jdragon.haoerpdemo.haofangerp;

import com.baomidou.mybatisplus.extension.api.R;
import com.jdragon.haoerpdemo.haofangerp.commons.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
@Slf4j
@SpringBootTest
class HaofangerpApplicationTests {


    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void test01(){
//        String msg = stringRedisTemplate.opsForValue().get("msg");
//        System.out.println(msg);
    }

    @Test
    void contextLoads()  {
    }
}
