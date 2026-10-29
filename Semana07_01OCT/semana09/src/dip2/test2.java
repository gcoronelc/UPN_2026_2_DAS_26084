/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dip2;

/**
 *
 * @author UPN
 */
public class test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IUsuario user = new UsuarioOrcl();
        ServicioUsuario s = new ServicioUsuario(user);
        s.registrar("Ejemplo");
        
    }
    
}
