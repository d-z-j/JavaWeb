package com.example.servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.java.Log;

import java.io.IOException;
import java.util.Enumeration;

@Log
@WebServlet("/test")
public class TestServlet implements Servlet {

    //初始化方法
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //首先将其转换为HttpServletRequest（继承自ServletRequest，一般是此接口实现）
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        System.out.println(request.getProtocol());//获取协议版本
        System.out.println(request.getRemoteAddr());//获取访问者的IP地址
        System.out.println(request.getMethod());//获取请求方法

        //获取头部信息
        Enumeration<String> enumeration = request.getHeaderNames();
        while (enumeration.hasMoreElements()){
            String name = enumeration.nextElement();
            System.out.println(name+":"+request.getHeader(name));
        }

        //转换为HttpServletResponse（同上）
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //设定内容类型以及编码格式（普通HTML文本使用text/html，之后会讲解文件传输）
        //response.setHeader("Content-type","text/html;charset=UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //获取Writer直接写入内容
        response.getWriter().write("<h1>我是响应内容</h1>");
        //所有内容写入完成之后，在发送给浏览器







//        log.info("浏览器发起了一次请求");
//        log.info(servletRequest.getClass().getName());
//        log.info(servletResponse.getClass().getName());
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    //服务器关闭时调用
    @Override
    public void destroy() {
    }
}
