package pe.edu.upn.demo01.service;

import pe.edu.upn.demo01.dto.VentaDto;

public class VentaService {

    /**
     * El objeto bean trae el precio y la cantidad; 
     * con estos datos se calula el total.
     * @param bean
     * @return bean
     */
    public VentaDto procesar( VentaDto bean){
        // Proceso
        bean.setTotal(bean.getPrecio() * bean.getCantidad());
        // Salida
        return bean;
    }
}
