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
public class IdiomaLibro {
    Conexion cc = new Conexion();
    Icon iconSucces = new ImageIcon(getClass().getResource("../img/iconSucces.png"));
    Icon iconError = new ImageIcon(getClass().getResource("../img/iconError.png"));
    Icon iconQuestion = new ImageIcon(getClass().getResource("../img/iconQuestion.png"));
    Icon iconWarning = new ImageIcon(getClass().getResource("../img/iconWarning.png"));
    
    private int codigo;
    private String isbn;

    public IdiomaLibro() {
    }

    public IdiomaLibro(String isbn, int codigo) {
        this.codigo = codigo;
        this.isbn = isbn;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return  "";
    }
    
    public ArrayList<Vector> getIdiomasForIsbn(String isbn) {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM LIBRO_IDIOMA WHERE LIB_ISBN=?");
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

    public boolean insertIdiomaLibro(int codigoIdioma, String isbn){
        try ( Connection cn=cc.conectar();
                PreparedStatement pst= cn.prepareStatement("INSERT INTO LIBRO_IDIOMA (IDI_ID,LIB_ISBN) VALUES (?,?)");
                ){
            pst.setInt(1, codigoIdioma);
            pst.setString(2, isbn);
            pst.executeUpdate();
            return true;
        }catch (SQLException ex) {
            Logger.getLogger(IdiomaLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public Vector getIdiomasNombreForIsbn(String isbn) {
        Vector lista=new Vector();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT IDIOMA.IDIOMA\n" +
                                                            "FROM IDIOMA\n" +
                                                            "INNER JOIN LIBRO_IDIOMA\n" +
                                                            "ON IDIOMA.IDI_ID=LIBRO_IDIOMA.IDI_ID\n" +
                                                            "WHERE LIBRO_IDIOMA.LIB_ISBN=?;");
                ) {
                pst.setString(1, isbn);
                ResultSet rs = pst.executeQuery();
                java.sql.ResultSetMetaData meta = rs.getMetaData();
            while(rs.next()){
                lista.add(rs.getObject(1));
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
        }
        return lista;
    }
    
    public boolean deleteIdiomaLibro(String isbn){
            try ( Connection cn=cc.conectar();
                   PreparedStatement pst= cn.prepareStatement("DELETE FROM LIBRO_IDIOMA WHERE LIB_ISBN=?");
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
