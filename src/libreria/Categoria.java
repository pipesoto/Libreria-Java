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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *Esta clase define la Categoría, la cual intenta clasificar o segmentar al libro.
 * @author Marcos Palma
 * @version 23/06/2018
 */
public class Categoria {
    Conexion cc= new Conexion();
    Icon iconSucces = new ImageIcon(getClass().getResource("../img/iconSucces.png"));
    Icon iconError = new ImageIcon(getClass().getResource("../img/iconError.png"));
    Icon iconQuestion = new ImageIcon(getClass().getResource("../img/iconQuestion.png"));
    Icon iconWarning = new ImageIcon(getClass().getResource("../img/iconWarning.png"));
    
    private int codigo;
    private String nombre;

    public Categoria() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre+" - "+codigo;
    }
    
    /**
     * Permite obtener todas las Categorias desde la BD.
     * @return ArrayList de Vectores con el resultado de la consulta.
     */
    public ArrayList<Vector> getAllCategorias(){
        ArrayList<Vector> lista= new ArrayList<>();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM CATEGORIA");
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
     * Permite obtener la(s) Categoría(s) según coincidencia de nombre desde la BD.
     * @param name Nombre o indicio de nombre de la Categoria que se desea buscar, se utiliza clausula 'LIKE'.
     * @return ArrayList de Vectores con resultado de la consulta.
     */
    public ArrayList<Vector> getCategoriasForName(String name){
        ArrayList<Vector> lista= new ArrayList<>();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM CATEGORIA WHERE CATEGORIA LIKE ?");
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
     * Permite obtener la Categoría según ID desde la BD.
     * @param id Identificador Unico (PK) de la Categoría que se desea buscar.
     * @return ArrayList de Vectores con resultado de la consulta.
     */
    public ArrayList<Vector> getCategoriaForId(int id){
        ArrayList<Vector> lista= new ArrayList<>();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM CATEGORIA WHERE CAT_ID=?");
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
     * Intenta realizar un Insert de Categoría a la BD.
     * @param categoria Nombre de la Categoría que se desea ingresar.
     * @return True si el registro fue concreatdo. False si no fue completado.
     */
    public boolean insertCategoria(String categoria) {
        try (Connection cn= cc.conectar();
                PreparedStatement pst = cn.prepareStatement("INSERT INTO CATEGORIA (CATEGORIA) VALUES (?)");
                ){
            pst.setString(1, categoria.toUpperCase());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Categoría agregada con éxito!", "Idioma", 2,iconSucces);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR: "+ex.getErrorCode()+". "+ex.getMessage(),"SQLException", 0,iconError);  
        }
        return false;
    }
    
    /**
     * Permite saber si una Categoría ya existe en la BD.
     * @param categoria Nombre de la Categoría que se desea consultar.
     * @return True si la Categoría ya existe. False si no existe.
     */
    public boolean existeCategoria(String categoria){            
        try (Connection cn= cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM CATEGORIA WHERE CATEGORIA=?");
                ){
            pst.setString(1, categoria.toUpperCase());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                rs.close();
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR: "+ex.getErrorCode()+". "+ex.getMessage(),"SQLException", 0,iconError);  
        }
        return false;
    }
    
    /**
     * Intenta eliminar una Categoría de la BD.
     * @param id Identificador Unico (PK) de la Categoría que se desea eliminar.
     * @return True si se concretó la eliminación. False si no se pudo eliminar.
     */
    public boolean deleteCategoria(int id){
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar la Categoría?", "Advertencia", JOptionPane.YES_NO_OPTION,0,iconQuestion) == JOptionPane.YES_OPTION) {
            try ( Connection cn=cc.conectar();
                   PreparedStatement pst= cn.prepareStatement("DELETE FROM CATEGORIA WHERE CAT_ID=?");
                    ) {
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Categoría eliminada con éxito!", "Exito", 2,iconSucces);
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
            }
        }
        return false;
    }
    
    /**
     * Intenta realizar una modificación a una Categoría de la BD.
     * @param codigo Identificador Unico (PK) de la Categoría que se desea modificar.
     * @param categoria Nombre modificado de la Categoría en cuestión.
     * @return True si logró la modificación. False si falla en la modificación.
     */
    public boolean updateCategoria(int codigo, String categoria){
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea modificar la Categoría?", "Advertencia", JOptionPane.YES_NO_OPTION,0,iconQuestion) == JOptionPane.YES_OPTION) {
            try ( Connection cn=cc.conectar();
                   PreparedStatement pst= cn.prepareStatement("UPDATE CATEGORIA SET CATEGORIA=? WHERE CAT_ID=?");
                    ) {
                pst.setString(1,categoria);
                pst.setInt(2, codigo);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Categoría modificada con éxito!", "Exito", 2,iconSucces);
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
            }
        }
        return false;
    }
       
}
