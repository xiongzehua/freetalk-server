package com.xiongzehua.zhifou.DaoTest;

import com.alibaba.druid.pool.DruidDataSource;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiongzehua.zhifou.dao.ProblemMapper;
import com.xiongzehua.zhifou.dao.UserMapper;
import com.xiongzehua.zhifou.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import springfox.documentation.spring.web.json.Json;

import javax.sql.DataSource;

/**
 * Created by xiongzehua on 2019/2/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PromblemMapperTest {
    @Autowired
    ProblemMapper problemMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void test(){
        System.out.println(userMapper.selectByPrimaryKey(1));
    }

    @Test
    public void test2(){
        System.out.println(redisTemplate.opsForValue().get("msg"));
    }

    @Test
    public void test3() throws JsonProcessingException {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(objectMapper.writeValueAsString(user));
        redisTemplate.opsForValue().set("user11", user);
    }
}
