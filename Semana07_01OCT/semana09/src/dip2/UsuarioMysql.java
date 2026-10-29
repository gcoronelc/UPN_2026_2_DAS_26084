/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dip2;

/**
 *
 * @author UPN
 */
public class UsuarioMysql implements IUsuario{

    @Override
    public void guardar(String nombre) {
        System.out.println("Guardado en MYSQL con DIP :"+nombre);
    }
    
}
