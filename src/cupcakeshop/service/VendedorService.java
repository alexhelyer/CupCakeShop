/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cupcakeshop.service;

import cupcakeshop.data.OrdenData;
import cupcakeshop.data.PagoData;
import cupcakeshop.data.StatusData;

/**
 *
 * @author alejandro
 */
public class VendedorService {
    
    public static void pedir(OrdenData orden) {
        //El cliente le pide la orden del vendedor
        //OrdenData orden = new OrdenData();
        StatusData status = new StatusData();
        status.setStatus("El vendedor recibe la orden");
        orden.setStatus(status);
        
        ClienteService.cobrar(orden);
        
    }
    
    public static void pagar(OrdenData orden) {
        //El vendedor procesa el pago
        
        StatusData status = new StatusData();
        status.setStatus("El vendedor procesa el pago");
        orden.setStatus(status);
        
        PagoData pago = new PagoData();
        pago.setPagado(true);
        orden.setPago(pago);
        
        CocinaService.pedir(orden);
        
    }
    
    public static void entregar(OrdenData orden) {
        //El vendedor recibe la orden de la cocina
        
        StatusData status = new StatusData();
        status.setStatus("El vendedor recibe los cupcakes de la cocina");
        orden.setStatus(status);
        
        ClienteService.entregar(orden);
        
    }
    
}
