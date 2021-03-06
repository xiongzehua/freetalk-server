package com.xiongzehua.freetalk.utils;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Created by xiongzehua on 2019/2/19.
 */
public class TokenUtilTest {
    @Test
    public void test1() throws UnsupportedEncodingException {
        String token = TokenUtil.create(1L, "123456");
        System.out.println(token);
        //Assert.assertEquals("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxIiwiaXNzIjoiemhpZm91IiwiZXhwIjoxNTUwNTk1OTM1fQ.Iaxfw7ITg6x0iqOnqXaxe5sBjRlVrjYU1FdSIMLZSlc", token);
    }

    @Test
    public void test2() {
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxIiwiaXNzIjoiemhpZm91IiwiZXhwIjoxNTUyMjM2NzMwfQ.ot5Ca3IGnt-xafDcEQgraHQNp3oA-rP2nJSoGU9rfRs";
        System.out.println(TokenUtil.verify(token, "123456"));
        System.out.println("校验结束");
    }

    @Test
    public void test3() {
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxIiwiaXNzIjoiemhpZm91IiwiZXhwIjoxNTUwNTk1OTM1fQ.Iaxfw7ITg6x0iqOnqXaxe5sBjRlVrjYU1FdSIMLZSlc";
        System.out.println(TokenUtil.getSub(token));
    }

    @Test
    public void test4() {
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxIiwiaXNzIjoiemhpZm91IiwiZXhwIjoxNTUwNTk1OTM1fQ.Iaxfw7ITg6x0iqOnqXaxe5sBjRlVrjYU1FdSIMLZSlc";
        System.out.println(TokenUtil.getPayload(token));;
    }
}
