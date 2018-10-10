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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 2guzm
 */
public class Compra {
    Conexion cc = new Conexion();
    Icon iconSucces = new ImageIcon(getClass().getResource("../img/iconSucces.png"));
    Icon iconError = new ImageIcon(getClass().getResource("../img/iconError.png"));
    Icon iconQuestion = new ImageIcon(getClass().getResource("../img/iconQuestion.png"));
    Icon iconWarning = new ImageIcon(getClass().getResource("../img/iconWarning.png"));
    
    
    private String isbn;
    private int cantidad;
    private int factura;
    private int idcompra;
    private double precio;
    
    public Compra() {
    }

    public Compra(String isbn, int cantidad, int factura) {
        this.isbn = isbn;
        this.cantidad = cantidad;
        this.factura = factura;
    }

    public int ultimaCompra() {
        int ultimacompra;
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT MAX(COM_ID) FROM COMPRA");
                ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                ultimacompra = rs.getInt(1);
                return ultimacompra;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
        }
        return -1;
    }

    public boolean insertCompra(Compra compra) {
        try (Connection cn = cc.conectar();
            PreparedStatement pst = cn.prepareStatement("INSERT INTO COMPRA (FAC_ID, LIB_ISBN, COM_CANTIDAD, COM_PRECIO) VALUES (?,?,?,?)");) {
            pst.setInt(1, compra.getFactura());
            pst.setString(2, compra.getIsbn());
            pst.setInt(3, compra.getCantidad());
            pst.setDouble(4, compra.getPrecio());
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
        }
        return false;
    }
    
    public boolean deleteCompra(int pkCompra){
        if (JOptionPane.showConfirmDialog(null, "Esto podría afectar al stock del Libro e información de Factura asociados a esta compra. \n¿Está seguro que desea eliminar la Factura?\nSi tiene dudas, mejor consulte a un supervisor.", "Advertencia", JOptionPane.YES_NO_OPTION,0,iconQuestion) == JOptionPane.YES_OPTION) {
            try (Connection cn = cc.conectar();
                    PreparedStatement pst = cn.prepareStatement("DELETE FROM COMPRA WHERE COM_ID=?");) {
                pst.setInt(1, pkCompra);
                pst.executeUpdate();
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
            }
        }
        return false;
    }
    
    public void updateCompra(String modificacion, String columna, int codCompra){
         try (Connection cn = cc.conectar();
            PreparedStatement pst = cn.prepareStatement("UPDATE COMPRA SET ?=? WHERE COM_ID=?");) {
            pst.setString(1, columna);
            pst.setString(2, modificacion);
            pst.setInt(3, codCompra);
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
        }
        
    }
    
    public Compra getCompraForPk(int pkCompra){
        Compra c = new Compra();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM COMPRA WHERE COM_ID=?");
                ) {
                pst.setInt(1, pkCompra);
                ResultSet rs = pst.executeQuery();
            while(rs.next()){
                c.setIdcompra(rs.getInt(1));
                c.setFactura(rs.getInt(2));
                c.setIsbn(rs.getString(3));
                c.setCantidad(rs.getInt(4));
                c.setPrecio(rs.getDouble(5));
                return c;
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
        }
        return null;
    }   
    
    public ArrayList selectCompraTodo(){
        
        ArrayList <Compra> compras = new ArrayList<Compra>();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM COMPRA");
                ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdcompra(rs.getInt(1));
                compra.setFactura(rs.getInt(2));
                compra.setIsbn(rs.getString(3));
                compra.setCantidad(rs.getInt(4));
                compras.add(compra);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
        }
        
      return compras;  
    }
    
    public ArrayList<Vector> getComprasForFactura(int fac){
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM COMPRA WHERE FAC_ID=?");
                ) {
                pst.setInt(1, fac);
                ResultSet rs = pst.executeQuery();
                java.sql.ResultSetMetaData meta = rs.getMetaData();
            while(rs.next()){
                Vector row=new Vector();
                for (int i = 0; i <  meta.getColumnCount(); i++) {
                    row.add(rs.getObject(i+1));
                }
                lista.add(row);
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
        }
        return lista;
    }   
    
    public ArrayList selectCompraIsbn(String isbn){
        ArrayList <Compra> compras = new ArrayList<Compra>();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM COMPRA WHERE LIB_ISBN=?");
                ) {
            pst.setString(1, isbn);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdcompra(rs.getInt(1));
                compra.setFactura(rs.getInt(2));
                compra.setIsbn(rs.getString(3));
                compra.setCantidad(rs.getInt(4));
                compras.add(compra);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
        }
        
      return compras; 
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    /**
    * Este método consulta un Distribuidor en la base de datos
    * @param id Id del distribuidor (pk)
    * @return Devuelve un objeto Distribuidor que contiene todos los datos del resultado de la consulta.
    */
    public boolean existCompraForIsbn(String isbn) {
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM COMPRA WHERE LIB_ISBN=?");
                ) {
                pst.setString(1, isbn);
                ResultSet rs = pst.executeQuery();
            while(rs.next()){
                return true;
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
        }
        return false;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
