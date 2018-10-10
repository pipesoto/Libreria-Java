/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *Esta clase define el Idioma, que será la lengua escrita que se encuntra presente en un Libro. Un Libro puede tener mas de un Idioma.
 * @author Marcos Palma
 * @version 23/06/2018
 */
public class Idioma {

    Conexion cc = new Conexion();
    Icon iconSucces = new ImageIcon(getClass().getResource("../img/iconSucces.png"));
    Icon iconError = new ImageIcon(getClass().getResource("../img/iconError.png"));
    Icon iconQuestion = new ImageIcon(getClass().getResource("../img/iconQuestion.png"));
    Icon iconWarning = new ImageIcon(getClass().getResource("../img/iconWarning.png"));
    
    private int codigo;
    private String idioma;

    public Idioma() {
    }

    public Idioma(int codigo, String idioma) {
        this.codigo = codigo;
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return idioma+" - "+codigo;
    }
  
    /**
     * Permite obtener todos los Idiomas desde la BD.
     * @return ArrayList de Vectores con el resultado de la consulta.
     */
    public ArrayList<Vector> getAllIdiomas(){
        ArrayList<Vector> lista= new ArrayList<>();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM IDIOMA");
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

    /**
     * Permite obtener Idiomas por inidicio de nombre.
     * @param name Nombre o indicio de Idioma que se desea buscar, utilizando clausula 'LIKE'.
     * @return ArrayList de Vectores con el resultado de la consulta. 
     */
    public ArrayList<Vector> getIdiomasForName(String name){
        ArrayList<Vector> lista= new ArrayList<>();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM IDIOMA WHERE IDIOMA LIKE ?");
                ){
                pst.setString(1, "%"+name+"%");
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
     * Permite obtener un Idioma segun ID desde la BD.
     * @param id Identificador Unico (PK) del Idioma que se desea buscar.
     * @return ArrayList de Vectores con el resultado de la consulta.
     */
    public ArrayList<Vector> getIdiomaForId(int id){
        ArrayList<Vector> lista= new ArrayList<>();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM IDIOMA WHERE IDI_ID=?");
                ) {
                pst.setInt(1, id);
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
     * Intenta relizar un Insert de Idioma en la BD.
     * @param idioma Idioma que se desea insertar.
     * @return True si fue ingresado correctamente. False si no fue posible.
     */
    public boolean insertIdioma(String idioma) {
        try (Connection cn= cc.conectar();
                PreparedStatement pst = cn.prepareStatement("INSERT INTO IDIOMA (IDIOMA) VALUES (?)");
                ){
            pst.setString(1, idioma.toUpperCase());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Idioma agregado con exito!", "Exito", 0, iconSucces);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR: "+ex.getErrorCode()+". "+ex.getMessage(),"SQLException", 0, iconError);  
        }
        return false;
    }
    
    /**
     * Intenta realizar una modificación de Idioma de la BD.
     * @param codigo Identificador Unico (PK) del Idioma que se desea modificar.
     * @param modificacion Idioma con modificación incluida.
     * @return true si la modificación fue exitosa. False si no fue posible.
     */
    public boolean updateIdioma(int codigo, String modificacion){
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea modificar el Idioma?", "Advertencia", JOptionPane.YES_NO_OPTION,0,iconQuestion) == JOptionPane.YES_OPTION) {
            try ( Connection cn=cc.conectar();
                   PreparedStatement pst= cn.prepareStatement("UPDATE IDIOMA SET IDIOMA=? WHERE IDI_ID=?");
                    ) {
                pst.setString(1,modificacion);
                pst.setInt(2, codigo);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Idioma modificado con éxito!", "Exito", 0, iconSucces);
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
            }
        }
        return false;
    }
    
    /**
     * Intenta realizar una eliminación de Idioma de la BD.
     * @param id Identificador Unico (PK) del Idioma que se desea eliminar.
     * @return true si la eliminación fue posible. False si no pudo ser eliminado el Idioma.
     */
    public boolean deleteIdioma(int id){
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el Idioma?", "Advertencia", JOptionPane.YES_NO_OPTION,0,iconQuestion) == JOptionPane.YES_OPTION) {
            try ( Connection cn=cc.conectar();
                   PreparedStatement pst= cn.prepareStatement("DELETE FROM IDIOMA WHERE IDI_ID=?");
                    ) {
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Idioma eliminado con éxito!", "Exito", 0, iconSucces);
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0, iconError);
            }
        }
        return false;
    }
    
    /**
     * Permite conocer si un Idioma ya eiste en la BD.
     * @param idioma Idioma que se desea consultar.
     * @return True si el Idioma ya existe. False si el Idioma no existe.
     */
    public boolean existIdioma(String idioma){       
        try (Connection cn= cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM IDIOMA WHERE IDIOMA=?");
                ){
                pst.setString(1, idioma);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    rs.close();
                    return true;
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR: "+ex.getErrorCode()+". "+ex.getMessage(),"SQLException", 0, iconError);
        }
        return false;
    }
    
}

