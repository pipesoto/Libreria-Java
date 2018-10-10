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
 *Esta clase define la Editorial, quien es la empresa que promueve el Libro. Un Libro solo puede tener una Editorial.
 * @author Marcos Palma
 * @version 23/06/2018
 */
public class Editorial {
    Conexion cc=new Conexion();
    Icon iconSucces = new ImageIcon(getClass().getResource("../img/iconSucces.png"));
    Icon iconError = new ImageIcon(getClass().getResource("../img/iconError.png"));
    Icon iconQuestion = new ImageIcon(getClass().getResource("../img/iconQuestion.png"));
    Icon iconWarning = new ImageIcon(getClass().getResource("../img/iconWarning.png"));
    
    private int codigo;
    private String nombre;

    public Editorial() {
    }

    public Editorial(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return nombre+" - "+codigo;
    }
    
    /**
     * Permite obtener todas las Editoriales desde la BD.
     * @return ArrayList de Vectores con el resultado de la consulta.
     */
    public ArrayList<Vector> getAllEditoriales(){
        ArrayList<Vector> lista= new ArrayList<>();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM EDITORIAL");
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
     * Permite obtener la(s) Editorial(es) según coincidencia de nombre en la BD.
     * @param name Nombre o indicio de la(s) Editorial(es) que se desea(n) buscar.
     * @return ArrayList de Vectores con el resultado de la consulta.
     */
    public ArrayList<Vector> getEditorialesForName(String name){
        ArrayList<Vector> lista= new ArrayList<>();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM EDITORIAL WHERE EDI_NOMBRE LIKE ?");
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
     * Permite obtener una Editorial segun ID desde la BD.
     * @param id Identificador Unico (PK) de la Editorial que se desea buscar.
     * @return ArrayList de Vectores con el resultado de la consulta. 
     */
    public ArrayList<Vector> getEditorialForId(int id){
        ArrayList<Vector> lista= new ArrayList<>();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM EDITORIAL WHERE EDI_ID=?");
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
     * Intenta realizar un Insert de Editorial a la BD.
     * @param nombreEdi Nombre de la Editorial que se desea registrar.
     * @return True se el proceso fue satisfactorio. False si no pudo insertar la Editorial.
     */
    public boolean insertEditorial(String nombreEdi){
        try ( Connection cn=cc.conectar();
               PreparedStatement pst= cn.prepareStatement("INSERT INTO EDITORIAL (EDI_NOMBRE) VALUES (?)");
                ) {
            pst.setString(1, nombreEdi.toUpperCase());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Editorial registrada con éxito!","Exito",2,iconSucces);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
        }
        return false;
    }
    
    /**
     * Intenta realizar una eliminación de Editorial en la BD.
     * @param id Identificador Unico (PK) de la Editorial que se desea eliminar.
     * @return True se pudo ser eliminada. False si no.
     */
    public boolean deleteEditorial(int id){
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar la Editorial?", "Advertencia", JOptionPane.YES_NO_OPTION,0,iconQuestion) == JOptionPane.YES_OPTION) {
            try ( Connection cn=cc.conectar();
                   PreparedStatement pst= cn.prepareStatement("DELETE FROM EDITORIAL WHERE EDI_ID=?");
                    ) {
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Editorial eliminada con éxito!", "Exito", 2,iconSucces);
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
            }
        }
        return false;
    }
    
    /**
     * Intenta realizar una modificación de Editorial en la BD.
     * @param codigo Identificador Unico (PK) de la Editorial que se desea modificar.
     * @param modificacion Nombre de la Editorial con modificación incluida.
     * @return True si la modificación se realizó sin problemas. False si no se pudo modificar.
     */
    public boolean updateEditorial(int codigo, String modificacion){
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea modificar la Editorial?", "Advertencia", JOptionPane.YES_NO_OPTION,0,iconQuestion) == JOptionPane.YES_OPTION) {
            try ( Connection cn=cc.conectar();
                   PreparedStatement pst= cn.prepareStatement("UPDATE EDITORIAL SET EDI_NOMBRE=? WHERE EDI_ID=?");
                    ) {
                pst.setString(1, modificacion);
                pst.setInt(2, codigo);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Editorial modificada con éxito!", "Exito", 2,iconSucces);
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
            }
        }
        return false;
    }
    
    /**
     * Permite conocer si una Editorial ya existe en nuestra BD.
     * @param editorial Nombre de la Editorial que se desea consultar.
     * @return True si ya eiste la Editorial. False si no existe.
     */
    public Editorial existEditorial(String editorial){       
        Editorial edi=new Editorial();
        try (Connection cn= cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM EDITORIAL WHERE EDI_NOMBRE=?");
                ){
                pst.setString(1, editorial.toUpperCase());
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    edi.setCodigo(rs.getInt(1));
                    edi.setNombre(rs.getString(2));
                    return edi;
                }
                rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR: "+ex.getErrorCode()+". "+ex.getMessage(),"SQLException", 0,iconError);
        }
        return null;
    }
    
    /**
     * Permite conocer si una Editorial ya existe en nuestra BD.
     * @param editorial Nombre de la Editorial que se desea consultar.
     * @return True si ya eiste la Editorial. False si no existe.
     */
    public Editorial existEditorial(int codigoEditorial){       
        Editorial edi=new Editorial();
        try (Connection cn= cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM EDITORIAL WHERE EDI_ID=?");
                ){
                pst.setInt(1, codigoEditorial);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    edi.setCodigo(rs.getInt(1));
                    edi.setNombre(rs.getString(2));
                }
                rs.close();
                return edi;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR: "+ex.getErrorCode()+". "+ex.getMessage(),"SQLException", 0,iconError);
        }
        return null;
    }
    
}
