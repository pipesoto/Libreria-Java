/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2guzm
 */
public class Libro {
    Conexion cc=new Conexion();
    private int estado;
    private int id;
    private String isbn;

    public Libro() {
    }

    public Libro(int estado, int id, String isbn) {
        this.estado = estado;
        this.id = id;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Libro{" + "estado=" + estado + ", id=" + id + ", isbn=" + isbn + '}';
    }
    
    public boolean insertLibro(Libro lib){
        try (   Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("INSERT INTO LIBRO (LIB_ISBN,EST_ID) VALUES (?,?)")) {
                pst.setString(1, lib.getIsbn());
                pst.setInt(2, lib.getEstado());
                pst.executeUpdate();
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(LibroIsbn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean deleteLibro(String pkLibro){
        try (   Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("DELETE FROM LIBRO WHERE LIB_SERIE=? AND EST_ID=1")) {
                pst.setString(1, pkLibro);
                pst.executeUpdate();
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(LibroIsbn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<Libro> getLibrosForIsbn(String isbn){
        ArrayList<Libro> lista = new ArrayList();
        try (   Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM LIBRO WHERE LIB_ISBN=?")) {
                pst.setString(1, isbn);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    Libro l = new Libro();
                    l.setId(rs.getInt(1));
                    l.setIsbn(rs.getString(2));
                    l.setEstado(rs.getInt(3));
                    lista.add(l);
                }
                return lista;
        } catch (SQLException ex) {
            Logger.getLogger(LibroIsbn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    
    
}
