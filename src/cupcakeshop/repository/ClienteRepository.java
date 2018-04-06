/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cupcakeshop.repository;

import cupcakeshop.data.ClienteData;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandro
 */
public class ClienteRepository {
    
    public static void insertar(ClienteData cliente) throws SQLException {
        
        
        PreparedStatement st = DataBaseManager.generateQuery("INSERT INTO clientes (nombre, correo) VALUES (?, ?);");
        
        st.setString(1, cliente.getNombre());
        st.setString(2, cliente.getCorreo());
        
        int id = DataBaseManager.executeInsert(st);
        
        cliente.setId(id);
    }
    
    public static void actualizar(ClienteData cliente) throws SQLException {
        PreparedStatement st = DataBaseManager.generateQuery("UPDATE clientes SET nombre=?, correo=? WHERE id=?;");
        
        st.setString(1, cliente.getNombre());
        st.setString(2, cliente.getCorreo());
        st.setInt(3, cliente.getId());
        
        st.executeUpdate();
    }
    
}

