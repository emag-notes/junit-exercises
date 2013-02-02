package org.study.java.junit.exercises.testdouble20_5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
                                        throws ServletException, IOException {
        
        String name= req.getParameter("name");
        res.getOutputStream().println("Hello " + name);
        res.setContentType("text/plain; charset=UTF-8");
        res.flushBuffer();
        
    }
}
