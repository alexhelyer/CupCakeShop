/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cupcakeshop.service;

import cupcakeshop.data.CobroData;
import cupcakeshop.data.OrdenData;
import cupcakeshop.data.StatusData;

/**
 *
 * @author alejandro
 */
public class ClienteService {
    
    public static void entregar(OrdenData orden) {
        // El cliente recive sus cupcakes
        StatusData status = new StatusData();
        status.setStatus("El cliente recibe sus Cupcakes :D");
        orden.setStatus(status);
        
    }
    
    public static void cobrar(OrdenData orden) {
        // Se le solicita cobro al cliente, el cliente paga al vendedor.
        
        // El cliente ajusta los datos de cobro
        CobroData cobro = new CobroData();
        cobro.setCobrado(true);
        orden.setCobro(cobro);
        
        StatusData status = new StatusData();
        status.setStatus("El cliente acepta el cobro...");
        orden.setStatus(status);
        
        VendedorService.entregar(orden);
        
        
        
    }
    
}
