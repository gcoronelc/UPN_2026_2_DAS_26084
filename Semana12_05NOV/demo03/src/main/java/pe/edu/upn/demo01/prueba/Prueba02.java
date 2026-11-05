package pe.edu.upn.demo01.prueba;

import pe.edu.upn.demo01.dto.VentaDto;
import pe.edu.upn.demo01.service.VentaService;

public class Prueba02 {
    
    public static void main(String[] args) {
        
        // Datos
        VentaDto bean = new VentaDto(67.89, 5);
        
        // Proceso
        VentaService service = new VentaService();
        bean = service.procesar(bean);
        
        // Salida
        System.out.println("Precio: " + bean.getPrecio());
        System.out.println("Cantidad: " + bean.getCantidad());
        System.out.println("Total: " + bean.getTotal());
        
    }
    
}
