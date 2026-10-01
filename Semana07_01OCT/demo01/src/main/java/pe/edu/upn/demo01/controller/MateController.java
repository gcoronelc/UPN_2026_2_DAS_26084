package pe.edu.upn.demo01.controller;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pe.edu.upn.demo01.service.MateService;

@WebServlet(name = "MateController", urlPatterns = {"/MateController"})
public class MateController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        // Datos
        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));
    
        // Proceso
        MateService mateService = new MateService();
        int suma = mateService.sumar(n1, n2);
        
        // Forward
        request.setAttribute("n1", n1);
        request.setAttribute("n2", n2);
        request.setAttribute("panchito", suma);
        RequestDispatcher rd = request.getRequestDispatcher("sumar.jsp");
        rd.forward(request, response);
    
    }

    
    
    
}
