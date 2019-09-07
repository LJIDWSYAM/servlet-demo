package com.atcdu.liujun;

import javax.servlet.*;
import javax.servlet.Servlet;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: liujun
 * \* Date: 2019/8/26
 * \* Time: 16:40
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class myServerlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        servletConfig.getServletContext();
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("我是第一个servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}