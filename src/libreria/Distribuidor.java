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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Esta clase define al Distribuidor (con sus respectivos atributos), quien es el que provee de libros a la Biblioteca. 
 * @author José Guzmán
 * @version 15/06/2018
 */
public class Distribuidor {

    Conexion cc = new Conexion();
    Icon iconSucces = new ImageIcon(getClass().getResource("../img/iconSucces.png"));
    Icon iconError = new ImageIcon(getClass().getResource("../img/iconError.png"));
    Icon iconQuestion = new ImageIcon(getClass().getResource("../img/iconQuestion.png"));
    Icon iconWarning = new ImageIcon(getClass().getResource("../img/iconWarning.png"));
    
    private String rut, nombre, telefono, direccion;
    private int codigo, ano;

    /**
     * Constructor por defecto de Distribuidor, sin parametros.
     */
    public Distribuidor() {
    }

    /**
     * Constructor con parametros, que crea un objeto Distribuidor con los atributos que se indiquen.
     * @param rut Se refiere al Rol Unico Tributario chileno que identifica al Distribuidor. 
     * @param nombre Nombre del Distribuidor.
     * @param ano Año desde el cual existe un convenio entre el Distribuidor y la Biblioteca.
     * @param telefono Teléfono de contacto del Distribuidor.
     * @param direccion Dirección del Distribuidor.
     */
    public Distribuidor(String rut, String nombre, int ano, String telefono, String direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.ano = ano;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Permite obtener el rut de un objeto Distribuidor.
     * @return Retorna el rut del Distribuidor desde el cual se ejecutó el método.
     */
    public String getRut() {
        return rut;
    }

    /**
     * Permite asignar el rut a un objeto Distribuidor.
     * @param rut Rol Unico Tributario chileno que se quiere asignar al Distribuidor desde el cual se ejecuta el método.
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * Permite obtener el nombre de un objeto Distribuidor.
     * @return Retorna el nombre del Distribuidor desde el cual se ejecutó el método.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite asignar el nombre a un objeto Distribuidor.
     * @param nombre Nombre que se quiere asignar al Distribuidor desde el cual se ejecuta el método. 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite obtener el teléfono de un objeto Distribuidor.
     * @return Retorna el teléfono del Distribuidor desde el cual se ejecutó el método.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Permite asignar el teléfono a un objeto Distribuidor.
     * @param telefono Teléfono que se quiere asignar al Distribuidor desde el cual se ejecuta el método.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Permite obtener la dirección de un objeto Distribuidor.
     * @return Retorna la dirección del Distribuidor desde el cual se ejecutó el método.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Permite asignar la dirección a un objeto Distribuidor.
     * @param direccion Dirección que se quiere asignar al Distribuidor desde el cual se ejecuta el método.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;

    }

    /**
     * Permite obtener el código (id PK) de un objeto Distribuidor.
     * @return Retorna el código (id) del Distribuidor desde el cual se ejecutó el método.
     */
    public int getCodigo() {
        return codigo;
    }
    
    /**
     * Pemrite asignar un codigo a un objeto Distribuidor. (NO SE RECOMIENDA UTILIZAR ESTE METODO PORQUE ESTE DATO ES GENERADO DE MANERA AUTOMATICA POR LA BASE DE DATOS.)
     * @param codigo Código que se desea asignar a un Distribuidor desde el cual fue utilizado el método. (NO SE RECOMIENDA EL USO DE ESTE METODO).
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Permite obtener el año de convenio de un objeto Distribuidor.
     * @return Retorna el año de convenio del Distribuidor desde el cual se ejecutó el método.
     */
    public int getAno() {
        return ano;
    }

    /**
     * Permite asignar el año de convenio a un Distribuidor.
     * @param ano Año de convenio que se desea asignar al Distribuidor desde el cual fue ejecutado el método.
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return nombre + " - " + codigo; //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Este método nos permite verificar si un Distribuidor ya existe en la base de datos.
     * @param rut String rut con el que buscaremos en la base de datos.
     * @return Devuelve true si el Distribuidor consultado existe. Caso contrario devuelve false.
     */
    public boolean existDistribuidor(String rut) {
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT DIS_ID FROM DISTRIBUIDOR WHERE DIS_RUT=?");) {
            pst.setString(1, rut);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                rs.close();
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
        }
        return false;
    }

    /**
    * Este método consulta un Distribuidor en la base de datos
    * @param id Id del distribuidor (pk)
    * @return Devuelve un objeto Distribuidor que contiene todos los datos del resultado de la consulta.
    */
    public Distribuidor getDist(int id) {
        Distribuidor d=new Distribuidor();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM DISTRIBUIDOR WHERE DIS_ID=?");
                ) {
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery();
            while(rs.next()){
                d.setCodigo(rs.getInt(1));
                d.setRut(rs.getString(2));
                d.setNombre(rs.getString(3));
                d.setAno(rs.getInt(4));
                d.setTelefono(rs.getString(5));
                d.setDireccion(rs.getString(6));
                return d;
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
        }
        return null;
    }
    
    /**
    * Este método consulta un Distribuidor en la base de datos segun el indicio de rut proporcionado
    * @param rut indicio de rut del Distribuidor.
    * @return Devuleve un ArrayList con el resultado de la consulta.
    */
    public ArrayList<Vector> getDistForRut(String rut) {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM DISTRIBUIDOR WHERE DIS_RUT LIKE ?");
                ) {
                pst.setString(1, rut+"%");
                ResultSet rs = pst.executeQuery();
                java.sql.ResultSetMetaData meta = rs.getMetaData();
                meta.getColumnCount();
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
    * Este método consulta un Distribuidor en la base de datos segun el indicio de nombre proporcionado
    * @param name indicio de nombre del Distribuidor.
    * @return Devuleve un ArrayList con el resultado de la consulta.
    */
    public ArrayList<Vector> getDistForName(String name) {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM DISTRIBUIDOR WHERE DIS_NOMBRE LIKE ?");
                ) {
                pst.setString(1, "%"+name+"%");
                ResultSet rs = pst.executeQuery();
                java.sql.ResultSetMetaData meta = rs.getMetaData();
                meta.getColumnCount();
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
     * Método que consulta todos los distribuidores en la base de datos.
     * @return ArrayList con los distribuidores encontrados.
     */
    public ArrayList<Vector> getAllDist() {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM DISTRIBUIDOR");
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
     * Este método intentará realizar un insert en la tabla Distribuidor de la base de datos.
     * @param distri Objeto Distribuidor que será ingresado.
     * @return Devuelve true si la insercción fue exitosa. False si no lo logra.
     */
    public boolean insertDistribuidor(Distribuidor distri) {
        try (Connection cn = cc.conectar();
                Statement st = cn.createStatement();
                PreparedStatement pst = cn.prepareStatement("INSERT INTO DISTRIBUIDOR (DIS_RUT, DIS_NOMBRE, DIS_ANOCON, DIS_TELEFONO, DIS_DIRECCION) VALUES (?,?,?,?,?)");) {
            ResultSet rs = st.executeQuery("SELECT * FROM DISTRIBUIDOR WHERE DIS_RUT='" + distri.getRut() + "' AND DIS_NOMBRE='" + distri.getNombre() + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "El distribuidor que inteta ingresar ya existe!", "Error", 0,iconError);
            } else {
                pst.setString(1, distri.getRut());
                pst.setString(2, distri.getNombre().toUpperCase());
                pst.setInt(3, distri.getAno());
                pst.setString(4, distri.getTelefono());
                pst.setString(5, distri.getDireccion().toUpperCase());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro realizado con éxito", "Exito",0,iconSucces);
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
        }
        return false;
    }

    /**
     * Este método intentará realizar una modificacion a un Distribuidor ya existente.
     * @param distri Objeto Dsitribuidor con los cambios ya realizados.
     * @return Devuelve true si la modificación fue exitosa. De lo contrario devuelve false.
     */
    public boolean updateDistribuidor(Distribuidor distri) {
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea modificar el Distribuidor?", "Advertencia", JOptionPane.YES_NO_OPTION,0,iconQuestion) == JOptionPane.YES_OPTION) {
            try (Connection cn = cc.conectar();
                 PreparedStatement pst = cn.prepareStatement("UPDATE DISTRIBUIDOR SET DIS_NOMBRE=?, DIS_ANOCON=?, DIS_TELEFONO=?, DIS_DIRECCION=? WHERE DIS_RUT=?");
                    ) {
                pst.setString(1, distri.getNombre().toUpperCase());
                pst.setInt(2, distri.getAno());
                pst.setString(3, distri.getTelefono());
                pst.setString(4, distri.getDireccion().toUpperCase());
                pst.setString(5, distri.getRut());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Modificación realizada con éxito", "Exito", 0,iconSucces);
                return true;
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
            }
        }
        return false;
    }
    
    /**
     * Este método intentará eliminar un Distribuidor de la base de datos.
     * @param id Identificador del Dsitribuidor que se desea eliminar.
     * @return  Devuelve true si el Distribuidor pudo ser eliminado. En caso contrario devuelve false.
     */
    public boolean deleteDistribuidor(int id) {
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea realizar eliminar el Distribuidor?", "Advertencia", JOptionPane.YES_NO_OPTION,0,iconQuestion) == JOptionPane.YES_OPTION) {
            try (Connection cn = cc.conectar();
                    PreparedStatement pst = cn.prepareStatement("DELETE FROM DISTRIBUIDOR WHERE DIS_ID=?");) {
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Distribuidor eliminado con éxito!", "Exito", 0, iconSucces);
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
            }
        }
        return false;
    }
    
}
