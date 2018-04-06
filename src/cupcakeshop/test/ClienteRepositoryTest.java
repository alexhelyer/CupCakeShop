/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cupcakeshop.test;

import cupcakeshop.data.ClienteData;
import cupcakeshop.repository.ClienteRepository;
import cupcakeshop.repository.DataBaseManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandro
 */
public class ClienteRepositoryTest {
    
    public static void main(String[] args) throws SQLException {
        
        //DataBaseManager.connect("jdbc:mysql://localhost/super_cupcakes", "root", "kmmx");
        
        DataBaseManager.connect("jdbc:mysql://localhost/cupcakeshop", "root", "root");
        
        ClienteData cliente = new ClienteData();
        cliente.setNombre("Alejandro");
        cliente.setCorreo("alex@gmail.com");
        cliente.setId(1);
        
        ClienteRepository.actualizar(cliente);
        
    }
    
}
