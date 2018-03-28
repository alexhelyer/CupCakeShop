/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cupcakeshop.test;

import cupcakeshop.data.*;
import cupcakeshop.service.CocinaService;
import cupcakeshop.service.VendedorService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejandro
 */
public class PedirOrdenTest {
    
    public static void main(String[] args) {
        
        ClienteData cliente = new ClienteData();
        cliente.setId("PEPE");
        
        VendedorData vendedor = new VendedorData();
        vendedor.setId("Carlos");
        
        CocinaData cocina = new CocinaData();
        cocina.setId("Condesa");
        
        CupCakeData cup1 = new CupCakeData();
        cup1.setTipo("Chocolate");
        
        CupCakeData cup2 = new CupCakeData();
        cup2.setTipo("Menta");
        
        List<CupCakeData> cupcakes = new ArrayList();
        
        cupcakes.add(cup1);        
        cupcakes.add(cup2);
        
        OrdenData orden = new OrdenData();
        orden.setId("ORD-001");
        orden.setCliente(cliente);
        orden.setVendedor(vendedor);
        orden.setCocina(cocina);
        orden.setCupcake(cupcakes);
        
        VendedorService.pedir(orden);
        
        //CocinaService.pedir(orden);
    }
}
