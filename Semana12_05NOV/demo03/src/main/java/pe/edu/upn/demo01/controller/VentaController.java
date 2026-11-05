package pe.edu.upn.demo01.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(
        name = "VentaController", 
        urlPatterns = {"/VentaProcesar","VentaConsultar"}
)
public class VentaController extends HttpServlet {
    
    /*
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String path = request.getServletPath();
        switch(path){
            case "/VentaProcesar" -> procesar(request, response);
            case "/VentaConsultar" -> consultar(request, response);
        }
        
    }

    private void procesar(HttpServletRequest request, HttpServletResponse response) 
            throws IOException {
        
        // Datos
        double precio = Double.parseDouble(request.getParameter("precio"));
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        
        // Proceso
        VentaService service = new VentaService();
        VentaDto bean = new VentaDto(precio, cantidad);
        bean = service.procesar(bean);
    
        // Salida
        Gson gson = new Gson();
        String json = gson.toJson(bean);
        UtilController.responseJson(response, json);
        
    }

    private void consultar(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    */

}
