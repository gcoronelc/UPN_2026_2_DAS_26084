package pe.edu.upn.educaweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Demo01", urlPatterns = {"/Demo01","/Panchito"})
public class Demo01 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Demo01</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Demo01 at " + request.getContextPath() + "</h1>");
            out.println("<h1>Hola Panchito!!!</h1>");
            out.println("</body>");
            out.println("</html>");
        }

    }

}
