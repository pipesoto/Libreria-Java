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
 *Esta clase define al Autor, quien será el escritor del algun libro. Un libro puede tener varios Autores.
 * @author José Guzmán
 * @version 23/06/2018
 */
public class Autor {
    Conexion cc = new Conexion();
    Icon iconSucces = new ImageIcon(getClass().getResource("../img/iconSucces.png"));
    Icon iconError = new ImageIcon(getClass().getResource("../img/iconError.png"));
    Icon iconQuestion = new ImageIcon(getClass().getResource("../img/iconQuestion.png"));
    Icon iconWarning = new ImageIcon(getClass().getResource("../img/iconWarning.png"));
    
    private int codigo;
    private String nombre;
    private String apellidoP;
    private String apellidoM;

    public Autor() {
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
        return nombre + " - " + codigo;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    /**
     * Método que permitirá saber si el Autor consultado existe en la base de datos.
     * @param aut Objeto de tipo Autor que se desea consultar.
     * @return true si el autor existe, false si no.
     */
    public boolean existeAutor(Autor aut) {
        try (   Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT AUT_ID FROM AUTOR WHERE AUT_NOMBRE=? AND AUT_APELLIDOP=? AND AUT_APELLIDOM=?");
                ){
            pst.setString(1, aut.getNombre());
            pst.setString(2, aut.getApellidoP());
            pst.setString(3, aut.getApellidoM());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
        }
        return false;
    }
    
    /**
     * Intenta realizar un insert a la tabla Autor de la base de datos.
     * @param aut Objeto de tipo Autor que se desea registrar en BD.
     * @return Devuelve true si el Autor pudo ser registrado correctamente. Delvuelve false si se produjo algún error.
     */
    public boolean insertAutor(Autor aut) {
        try (   Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("INSERT INTO AUTOR (AUT_NOMBRE, AUT_APELLIDOP, AUT_APELLIDOM) VALUES (?,?,?)");
                ){
            pst.setString(1, aut.getNombre().toUpperCase());
            pst.setString(2, aut.getApellidoP().toUpperCase());
            pst.setString(3, aut.getApellidoM().toUpperCase());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Autor registrado con éxito!", "Exito", 2,iconSucces);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
        }
        return false;
    }
    
    /**
     * Intenta eliminar un Autor de la BD.
     * @param id Identificador único (PK) del Autor que se desea eliminar.
     * @return True si la eliminación fue satisfactoria. False si no se pudo eliminar el Autor.
     */
    public boolean deleteAutor(int id){
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el Autor?", "Advertencia", JOptionPane.YES_NO_OPTION,0,iconQuestion) == JOptionPane.YES_OPTION) {
            try ( Connection cn=cc.conectar();
                   PreparedStatement pst= cn.prepareStatement("DELETE FROM AUTOR WHERE AUT_ID=?");
                    ) {
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Autor eliminado con éxito!", "Exito", 2,iconSucces);
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
            }
        }
        return false;
    }
    
    /**
     * Intenta realizar una modificación de Autor en la BD.
     * @param aut Autor que se desea modificar.
     * @return True si el Autor pudo modificarse. False si no pudo modificarse.
     */
    public boolean updateAutor(Autor aut){
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea modificar el Autor?", "Advertencia", JOptionPane.YES_NO_OPTION,0,iconQuestion) == JOptionPane.YES_OPTION) {
            try ( Connection cn=cc.conectar();
                   PreparedStatement pst= cn.prepareStatement("UPDATE AUTOR SET AUT_NOMBRE=?, AUT_APELLIDOP=?, AUT_APELLIDOM=? WHERE AUT_ID=?");
                    ) {
                pst.setString(1,aut.getNombre().toUpperCase());
                pst.setString(2, aut.getApellidoP().toUpperCase());
                pst.setString(3, aut.getApellidoM().toUpperCase());
                pst.setInt(4, aut.getCodigo());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Autor modificado con éxito!", "Exito", 2,iconSucces);
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
            }
        }    
        return false;
    }
    
    /**
     * Permite obtener el Autor por ID en la BD.
     * @param id Identificador (PK) para buscar el Autor.
     * @return ArrayList de Vectores con el resultado de la consulta.
     */
    public ArrayList<Vector> getAutorForId(int id){
        ArrayList<Vector> lista = new ArrayList<>();
        try (Connection cn = cc.conectar();
             PreparedStatement pst = cn.prepareStatement("SELECT * FROM AUTOR WHERE AUT_ID=?");
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
     * Permite obtener todos los Autores en la BD.
     * @return ArrayList de Vectores con el resultado de la consulta.
     */
    public ArrayList<Vector> getAllAutor(){
        ArrayList<Vector> lista = new ArrayList<>();
        try (Connection cn = cc.conectar();
             PreparedStatement pst = cn.prepareStatement("SELECT * FROM AUTOR");
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
     * Permite obtener el/los Autor(es) por inidicio o coincidencia de nombre en al BD.
     * @param name Nombre para buscar Autor o Autores con clausula 'LIKE'.
     * @return ArrayList de Vectores con el resultado de la consulta.
     */
    public ArrayList<Vector> getAutorForName(String name){
        ArrayList<Vector> lista = new ArrayList<>();
        try (Connection cn = cc.conectar();
             PreparedStatement pst = cn.prepareStatement("SELECT * FROM AUTOR WHERE AUT_NOMBRE LIKE ?");
             ) {
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
     * Permite obtener el/los Autor(es) por inidicio o coincidencia de Apellidos en al BD.
     * @param name Apellido para buscar Autor o Autores con clausula 'LIKE'.
     * @return ArrayList de Vectores con el resultado de la consulta.
     */
    public ArrayList<Vector> getAutorForLastName(String name){
        ArrayList<Vector> lista = new ArrayList<>();
        try (Connection cn = cc.conectar();
             PreparedStatement pst = cn.prepareStatement("SELECT * FROM AUTOR WHERE AUT_APELLIDOP LIKE ? OR AUT_APELLIDOM LIKE ?");
             ) {
                pst.setString(1, "%"+name+"%");
                pst.setString(2, "%"+name+"%");
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
    
}
