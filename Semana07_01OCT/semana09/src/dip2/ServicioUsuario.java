/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dip2;

/**
 *
 * @author UPN
 */
public class ServicioUsuario {
    private IUsuario user;

    public ServicioUsuario(IUsuario user) {
        this.user = user;
    }
    
    public void registrar(String nombre){
        user.guardar(nombre);
    }
}
