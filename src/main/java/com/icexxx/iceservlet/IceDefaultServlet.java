package com.icexxx.iceservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

/**
 * Servlet implementation class IceServlet
 */
@WebServlet({ "/static/*", "/css/*", "/lib/*", "/jslib/*", "/js/*", "/img/*", "/image/*", "/images/*", "/html/*",
        "/upload/*", "/file/*", "/font/*", "/zip/*", "/rar/*", "/xls/*", "/doc/*" })
public class IceDefaultServlet extends DefaultServlet {

    private static final long serialVersionUID = 7356527030377901738L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public IceDefaultServlet() {

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doGet(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doPost(request, response);
    }

}
