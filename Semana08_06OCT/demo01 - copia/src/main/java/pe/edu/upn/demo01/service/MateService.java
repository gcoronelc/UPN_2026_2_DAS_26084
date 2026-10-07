package pe.edu.upn.demo01.service;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upn.demo01.dto.TablaDto;

public class MateService {
    
    
    public int sumar(int n1, int n2){
        return (n1 + n2);
    }
    
    public long factorial(int n){
		 long f = 1;
		 for(int i=2; i<=n; i++){
			 f *= i;
		 }
		 return f;
	 }
    
	 
	 public List<TablaDto> tablaMultiplicar(int n){
		 List<TablaDto> tabla = new ArrayList<>();
		 for(int i = 1; i<=12; i++){
			 int rpta = n * i;
			 TablaDto dto = new TablaDto(n, "x", i, rpta);
			 tabla.add(dto);
		 }
		 return tabla;
	 }
}
