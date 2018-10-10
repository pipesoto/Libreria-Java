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
 *Esta clase define la relación existente entre un libro y su(s) respectivo(s) autor(es).
 * @author José Guzmán
 * @version 23/06/2018
 */
public class AutorLibro{
    Conexion cc = new Conexion();
    Icon iconSucces = new ImageIcon(getClass().getResource("../img/iconSucces.png"));
    Icon iconError = new ImageIcon(getClass().getResource("../img/iconError.png"));
    Icon iconQuestion = new ImageIcon(getClass().getResource("../img/iconQuestion.png"));
    Icon iconWarning = new ImageIcon(getClass().getResource("../img/iconWarning.png"));
    
    private String codigoIsbn;
    private int codigoAutor;

    public AutorLibro() {
    }

    public AutorLibro(String codigoIsbn, int codigoAutor) {
        this.codigoIsbn = codigoIsbn;
        this.codigoAutor = codigoAutor;
    }

    public String getCodigoIsbn() {
        return codigoIsbn;
    }

    public void setCodigoIsbn(String codigoIsbn) {
        this.codigoIsbn = codigoIsbn;
    }

    public int getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(int codigoAutor) {
        this.codigoAutor = codigoAutor;
    }
    
    /**
     * Permite insertar relacion de Autores asociados a un libro (isbn) especifico.
     * @param isbn Identificador del Libro del cual se desea insertar el autor.
     * @param codigoAutor PK del autor que será asociado al libro.
     * @return True si el registro fue insertado con éxito. False si no pudo ser insertado.
     */
    public boolean insertAutorLibro(int codigoAutor, String isbn){
        try ( Connection cn=cc.conectar();
                PreparedStatement pst= cn.prepareStatement("INSERT INTO LIBRO_AUTOR (LIB_ISBN, AUT_ID) VALUES (?,?)");
                ){
            pst.setString(1, isbn);
            pst.setInt(2, codigoAutor);
            pst.executeUpdate();
            return true;
        }catch (SQLException ex) {
            Logger.getLogger(AutorLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Permite obtener el listado de Autores de un libro (isbn) especifico.
     * @param isbn Identificador del Libro del cual se desea consultar los autores.
     * @return ArrayList de Vectores con las filas resultantes de la consulta.
     */
    public ArrayList<Vector> getAutoresForIsbn(String isbn) {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM LIBRO_AUTOR WHERE LIB_ISBN=?");
                ) {
                pst.setString(1, isbn);
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
    
    /**
     * Permite obtener el listado de Autores (nombre, apellido paterno y apellido materno, concatenados en un String) de un libro (isbn) especifico.
     * @param isbn Identificador del Libro del cual se desea consultar los autores.
     * @return Vector con String (Autor) resultantes de la consulta.
     */
    public Vector getAutoresNombreForIsbn(String isbn) {
        Vector lista=new Vector();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT AUTOR.AUT_NOMBRE, AUTOR.AUT_APELLIDOP, AUTOR.AUT_APELLIDOM\n" +
                                                            "FROM AUTOR\n" +
                                                            "INNER JOIN LIBRO_AUTOR\n" +
                                                            "ON AUTOR.AUT_ID=LIBRO_AUTOR.AUT_ID\n" +
                                                            "WHERE LIBRO_AUTOR.LIB_ISBN=?;");
                ) {
                pst.setString(1, isbn);
                ResultSet rs = pst.executeQuery();
                java.sql.ResultSetMetaData meta = rs.getMetaData();
            while(rs.next()){
                String row="";
                for (int i = 0; i <  meta.getColumnCount(); i++) {
                    row=row+rs.getString(i+1)+" ";
                }
                lista.add(row);
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
        }
        return lista;
    }
    
    /**
     * Permite eliminar relacion de Autores asociados a un libro (isbn) especifico.
     * @param isbn Identificador del Libro del cual se desea eliminar los autores.
     * @return True si el registro fue eliminado con éxito. False si no pudo ser eliminado.
     */
    public boolean deleteAutorLibro(String isbn){
            try ( Connection cn=cc.conectar();
                   PreparedStatement pst= cn.prepareStatement("DELETE FROM LIBRO_AUTOR WHERE LIB_ISBN=?");
                    ) {
                pst.setString(1, isbn);
                pst.executeUpdate();
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
            }
        return false;
    }
}
