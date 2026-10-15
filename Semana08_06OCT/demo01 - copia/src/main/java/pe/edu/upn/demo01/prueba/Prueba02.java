package pe.edu.upn.demo01.prueba;

import java.util.List;
import pe.edu.upn.demo01.dto.TablaDto;
import pe.edu.upn.demo01.service.MateService;

public class Prueba02 {
    
    public static void main(String[] args) {
        
        // Datos
        int n = 5;
        
        // Proceso
        MateService mateService = new MateService();
        List<TablaDto> tabla = mateService.tablaMultiplicar(n);
        
        // Salida
        for (TablaDto dto : tabla) {
			  System.out.println(dto);
		 }
        
    }
    
}
