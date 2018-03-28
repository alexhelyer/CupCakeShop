/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cupcakeshop.service;

import cupcakeshop.data.OrdenData;
import cupcakeshop.data.StatusData;

/**
 *
 * @author alejandro
 */
public class CocinaService {
    
    public static void pedir(OrdenData orden) {
        //La cocina recibe la orden para preparar los cucakes
        StatusData status = new StatusData();
        status.setStatus("La cocina esta preparando los cupcakes");
        orden.setStatus(status);
        
        VendedorService.entregar(orden);
    }
    
}
