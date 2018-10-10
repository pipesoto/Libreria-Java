/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *Esta clase se encarga de establecer la conexión con la Base de Datos. MySql es el motor de BD utilizado.
 * @author José Guzmán
 * @version 15/06/2018
 */
public class Conexion {
    Connection cn=null;
    /**
     * Este método intentará realizar la conexión con la base de datos.
     * @return Objeto de tipo Connection. Si no se pudo realizar la conexión, el objeto será null.
     */
    Connection conectar() {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost/biblioteca","root","");  
        if (cn==null) {  
            
        }else{    
        }  
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"ERROR: "+ex.getMessage(),"Error de conexión",0);
            System.exit(1);
        } 
        return cn;
    }   
}
