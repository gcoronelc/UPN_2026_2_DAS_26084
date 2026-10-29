/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dip;

/**
 *
 * @author UPN
 */
public class Notificador {
    private CanalMensaje canal;

    public Notificador(CanalMensaje canal) {
        this.canal = canal;
    }
    
    public void notificar(){
        this.canal.enviar("Mensahe Con DIP");
    }
}
