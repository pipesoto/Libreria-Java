/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 2guzm
 */
public class MetodoPago {
   Conexion cc = new Conexion();
    Icon iconSucces = new ImageIcon(getClass().getResource("../img/iconSucces.png"));
    Icon iconError = new ImageIcon(getClass().getResource("../img/iconError.png"));
    Icon iconQuestion = new ImageIcon(getClass().getResource("../img/iconQuestion.png"));
    Icon iconWarning = new ImageIcon(getClass().getResource("../img/iconWarning.png"));
    
    private int codigo;
    private String metodo;

    public MetodoPago() {
    }

    public MetodoPago(int codigo, String metodo) {
        this.codigo = codigo;
        this.metodo = metodo;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return metodo+" - "+codigo;
    }
    
    public void insertMetodo(String metodo){
        try ( Connection cn=cc.conectar();
               PreparedStatement pst= cn.prepareStatement("INSERT FROM METODO_PAGO (METODO_PAGO) VALUES (?)");
                ) {
            pst.setString(1, metodo);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado con éxito!", "Exito", 2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
        }
    }
    
    public void deleteMetodo(int codigo){
        try ( Connection cn=cc.conectar();
               PreparedStatement pst= cn.prepareStatement("DELETE FROM METODO_PAGO WHERE MET_COD=?");
                ) {
            pst.setInt(1, codigo);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado con éxito!", "Exito", 2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
        }
    }
    
    public void updateMetodo(int codigo, String modificacion){
        try ( Connection cn=cc.conectar();
               PreparedStatement pst= cn.prepareStatement("UPDATE METODO_PAGO SET MET_DESC=? WHERE MET_COD=?");
                ) {
            pst.setString(1,modificacion);
            pst.setInt(2, codigo);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro modificado con éxito!", "Exito", 2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
        }
    }
    
    /**
     * Método que consulta todos los Metodos de pago en la base de datos.
     * @return ArrayList con los metodos encontrados.
     */
    public ArrayList<Vector> getAllMetodosPago() {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM METODO_PAGO");
                ResultSet rs = pst.executeQuery();) {
                java.sql.ResultSetMetaData meta = rs.getMetaData();
                while(rs.next()){
                    Vector row=new Vector();
                    for (int i = 0; i <  meta.getColumnCount(); i++) {
                        row.add(rs.getObject(i+1));
                    }
                    lista.add(row);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
        }
        return lista;
    } 
    
      
}
