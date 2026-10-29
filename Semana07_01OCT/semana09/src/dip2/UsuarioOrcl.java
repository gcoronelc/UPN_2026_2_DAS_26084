/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dip2;

/**
 *
 * @author UPN
 */
public class UsuarioOrcl implements IUsuario{

    @Override
    public void guardar(String nombre) {
        System.out.println("Guardado en ORACLE con DIP :"+nombre);        
    }
    
}
