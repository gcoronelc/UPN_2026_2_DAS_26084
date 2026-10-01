package pe.edu.upn.demo01.prueba;

import pe.edu.upn.demo01.service.MateService;

public class Prueba01 {
    
    public static void main(String[] args) {
        
        // Datos
        int n1 = 30;
        int n2 = 50;
        
        // Proceso
        MateService mateService = new MateService();
        int suma = mateService.sumar(n1, n2);
        
        // Salida
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("suma = " + suma);
        
    }
    
}
