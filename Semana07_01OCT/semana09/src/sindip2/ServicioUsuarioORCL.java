/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sindip2;

/**
 *
 * @author UPN
 */
public class ServicioUsuarioORCL {
    private UsuarioORCL u = new UsuarioORCL();
    
    public void registrar(String nombre){
        u.guardar(nombre);
    }
    
}
