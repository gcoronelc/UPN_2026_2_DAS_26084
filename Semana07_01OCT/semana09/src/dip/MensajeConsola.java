/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dip;

/**
 *
 * @author UPN
 */
public class MensajeConsola implements CanalMensaje {

    @Override
    public void enviar(String mensaje) {
        System.out.println(mensaje);
    }
    
}
