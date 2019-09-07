package com.atcdu.liujun;

import javax.servlet.*;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: liujun
 * \* Date: 2019/8/30
 * \* Time: 15:39
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class myFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setContentType("text/html;charset=UTF-8");
        System.out.println("我是hello.jsp的拦截器");
        String money=servletRequest.getParameter("money");
        if (money==null){
            servletResponse.getWriter().write("没钱还来找美女，要点脸");
        }else
        {
            filterChain.doFilter(servletRequest, servletResponse);
        }

    }

    @Override
    public void destroy() {

    }
}