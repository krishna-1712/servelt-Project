package org.example;


import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

    @WebServlet("/hello2")
    public class WelcomeServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request,
                             HttpServletResponse response)
                throws IOException {
            response.setContentType("text/html");
            response.getWriter().println("<h1>Hello Dhineshraji!!</h1>");
        }
    }

