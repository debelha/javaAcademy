package com.servlet.aula.servlet;
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/login")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getServletPath();
        if (action.equals("/login")) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            System.out.println("Email: " + email + ", Password: " + password);

            if(email.equals("dleitedias@gmail.com") && password.equals("123")){
                request.getRequestDispatcher("welcome.jsp").forward(request, response);
            } else{
                request.getRequestDispatcher("fail.jsp").forward(request, response);
            }
        }
    }
}