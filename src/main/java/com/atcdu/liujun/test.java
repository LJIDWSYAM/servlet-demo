package com.atcdu.liujun;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: liujun
 * \* Date: 2019/9/1
 * \* Time: 15:21
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class test {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String t=new String("你好.jps".getBytes("gbk"),"iso8859-1");
        System.out.println(t);

        byte[] b =t.getBytes("iso8859-1");
        String a=new String(b,"gbk");
        System.out.println(a);
    }
}