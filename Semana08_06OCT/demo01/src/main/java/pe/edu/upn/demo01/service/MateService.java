package pe.edu.upn.demo01.service;

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
    
}
