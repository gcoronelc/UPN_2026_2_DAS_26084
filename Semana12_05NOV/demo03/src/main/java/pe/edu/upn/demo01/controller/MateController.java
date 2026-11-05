package pe.edu.upn.demo01.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import pe.edu.upn.demo01.service.MateService;

@WebServlet(name = "MateController", urlPatterns = {"/SumarController"})
public class MateController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        switch(path){
            case "/SumarController" -> sumar(request, response);
            case "/FactorialController" -> factorial(request, response);
        }
        
        
    }
    
    
    protected void sumar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        // Datos
        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));
    
        // Proceso
        MateService mateService = new MateService();
        int suma = mateService.sumar(n1, n2);
        
        // Respuesta
        Map<String,Object> datos = new HashMap<>();
        datos.put("n1", n1);
        datos.put("n2", n2);
        datos.put("suma", suma);
        UtilController.responseMap(response,datos);    
    }

    private void factorial(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
