/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sindip2;

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
        ServicioUsuario usr = new ServicioUsuario();
        ServicioUsuarioORCL usro = new ServicioUsuarioORCL();
        usr.registrar("aaa");
        usro.registrar("bbb");
    }
    
}
