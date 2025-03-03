
package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author user
 */
public class Suucess extends HttpServlet{
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
           res.setContentType("text/html");
           PrintWriter out = res.getWriter();
           out.println("<h4>Welcome to Success servlet</h4>");
    }
    
    
}
