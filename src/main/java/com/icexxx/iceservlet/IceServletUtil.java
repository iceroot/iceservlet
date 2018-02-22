package com.icexxx.iceservlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * servlet工具类
 * 
 * @author IceRoot
 *
 */
public class IceServletUtil {
    /**
     * 重定向首页
     * 
     * @param request 请求
     * @param response 响应
     */
    public static void indexForward(HttpServletRequest request, HttpServletResponse response) {
        String contextPath = request.getContextPath();
        String requestURI = request.getRequestURI();
        if (contextPath != null && contextPath.equals(requestURI)) {
            try {
                request.getRequestDispatcher("/").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 向响应对象追加内容
     * 
     * @param response 响应对象
     * @param context 需要写入的内容
     */
    public static void append(HttpServletResponse response, String context) {
        try {
            response.getWriter().append(context);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 向响应写入不换行的内容
     * 
     * @param response 响应对象
     * @param context 需要写入的内容
     */
    public static void print(HttpServletResponse response, String context) {
        try {
            response.getWriter().print(context);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 向响应对象写入换行的内容
     * 
     * @param response 响应对象
     * @param context 需要写入的内容
     */
    public static void println(HttpServletResponse response, String context) {
        try {
            response.getWriter().println(context);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 设置响应允许跨域
     * 
     * @param response 响应对象
     */
    public static void allowOrigin(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
    }

    /**
     * 设置请求对象编码
     * 
     * @param request 请求对象
     */
    public static void utf8(HttpServletRequest request) {
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /**
     * 设置响应对象编码
     * 
     * @param response 响应对象
     */
    public static void utf8(HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
    }
}
