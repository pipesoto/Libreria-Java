/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.sql.Blob;
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
 *
 * @author 2guzm
 */
public class LibroIsbn {
    Conexion cc = new Conexion();
    Icon iconSucces = new ImageIcon(getClass().getResource("../img/iconSucces.png"));
    Icon iconError = new ImageIcon(getClass().getResource("../img/iconError.png"));
    Icon iconQuestion = new ImageIcon(getClass().getResource("../img/iconQuestion.png"));
    Icon iconWarning = new ImageIcon(getClass().getResource("../img/iconWarning.png"));
    
    private String isbn;
    private int nropaginas;
    private int cantidad;
    private int anopubli;
    private int idEdi;
    private String titulo;
    private double precio;
    private Blob portada;

    public LibroIsbn(String isbn, int nropaginas, int cantidad, int anopubli, int idEdi, String titulo, double precio) {
        this.isbn = isbn;
        this.nropaginas = nropaginas;
        this.cantidad = cantidad;
        this.anopubli = anopubli;
        this.idEdi = idEdi;
        this.titulo = titulo;
        this.precio = precio;
    }

    public LibroIsbn() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNropaginas() {
        return nropaginas;
    }

    public void setNropaginas(int nropaginas) {
        this.nropaginas = nropaginas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getAnopubli() {
        return anopubli;
    }

    public void setAnopubli(int anopubli) {
        this.anopubli = anopubli;
    }

    public int getIdEdi() {
        return idEdi;
    }

    public void setIdEdi(int idEdi) {
        this.idEdi = idEdi;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean insertLibroIsbn(LibroIsbn libro) { //PARA INSERTAR UN NUEVO LIBRO EN LA BASE DE DATOS
        try (
                Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("INSERT INTO LIBRO_ISBN (LIB_ISBN, LIB_TITULO, LIB_NPAGINAS, LIB_PRECIO, LIB_ANOPUBLI, EDI_ID, LIB_PORTADA) VALUES (?,?,?,?,?,?,?)")) {
            pst.setString(1, libro.getIsbn());
            pst.setString(2, libro.getTitulo().toUpperCase());
            pst.setInt(3, libro.getNropaginas());
            pst.setDouble(4, libro.getPrecio());
            pst.setInt(5, libro.getAnopubli());
            pst.setInt(6, libro.getIdEdi());
            pst.setBlob(7, libro.getPortada());
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(LibroIsbn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateLibroIsbn(LibroIsbn libro) { //PARA SUMAR (compra) o RESTAR (venta) CANTIDAD A LIBROS EXISTENTES
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea modificar el Libro?", "Advertencia", JOptionPane.YES_NO_OPTION,0,iconQuestion) == JOptionPane.YES_OPTION) {
            try (
                Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("UPDATE LIBRO_ISBN SET LIB_TITULO=?, LIB_NPAGINAS=?, LIB_ANOPUBLI=?, EDI_ID=?, LIB_PORTADA=? WHERE LIB_ISBN=?")) 
                {
                    pst.setString(1,libro.getTitulo() );
                    pst.setInt(2, libro.getNropaginas());
                    pst.setInt(3, libro.getAnopubli());
                    pst.setInt(4, libro.getIdEdi());
                    pst.setBlob(5, libro.getPortada());
                    pst.setString(6, libro.getIsbn());
                    pst.executeUpdate();
                    return true;
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
            }
        }
        return false;
    }

    public boolean deleteLibroIsbn(String isbn) {
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el Libro?", "Advertencia", JOptionPane.YES_NO_OPTION,0,iconQuestion) == JOptionPane.YES_OPTION) {
            try (Connection cn = cc.conectar();
                    PreparedStatement pst = cn.prepareStatement("DELETE FROM LIBRO_ISBN WHERE LIB_ISBN=?");) {
                pst.setString(1, isbn);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Libro eliminado con éxito!", "Exito", 0, iconSucces);
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0,iconError);
            }
        }
        return false;
    }
    
    public LibroIsbn existLibroIsbn(String isbn) { //PARA CONSULTAR SI EXISTE YA UN LIBRO CON ESE ISBN (RETORNA TRUE DE EXISTIR, FALSE  EN CASO CONTRARIO
        LibroIsbn l=new LibroIsbn();
        try (
                Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM LIBRO_ISBN WHERE LIB_ISBN=?")) {
            pst.setString(1, isbn);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                l.setIsbn(rs.getString(1));
                l.setTitulo(rs.getString(2));
                l.setNropaginas(rs.getInt(3));
                l.setPrecio(rs.getDouble(4));
                l.setAnopubli(rs.getInt(5));
                l.setIdEdi(rs.getInt(6));
                l.setPortada(rs.getBlob(7));
                rs.close();
                return l;
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
        }
        return null;
    }

    /**
    * Este método consulta un LibroIsbn en la base de datos segun el indicio de isbn proporcionado
    * @param isbn indicio de isbn del Libro.
    * @return Devuleve un ArrayList con el resultado de la consulta.
    */
    public ArrayList<Vector> getLibroForIsbn(String isbn) {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT L.LIB_ISBN, L.LIB_TITULO, E.EDI_NOMBRE, L.LIB_NPAGINAS, L.LIB_PRECIO FROM LIBRO_ISBN L, EDITORIAL E WHERE L.EDI_ID=E.EDI_ID AND L.LIB_ISBN LIKE ?");
                ) {
                pst.setString(1, isbn+"%");
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
    * Este método consulta un LibroIsbn en la base de datos segun el indicio de isbn proporcionado
    * @param isbn indicio de isbn del Libro.
    * @return Devuleve un ArrayList con el resultado de la consulta.
    */
    public ArrayList<Vector> getLibroForAutor(String autor) {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT L.LIB_ISBN, L.LIB_TITULO, E.EDI_NOMBRE, L.LIB_PRECIO FROM LIBRO_ISBN L, EDITORIAL E, AUTOR A WHERE L.EDI_ID=E.EDI_ID AND L.LIB_ISBN= L.LIB_ISBN LIKE ?");
                ) {
                pst.setString(1, autor+"%");
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

    public ArrayList<Vector> getIsbnForTitulo(String name) {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT LIBRO_ISBN.LIB_ISBN, LIBRO_ISBN.LIB_TITULO, LIBRO_ISBN.LIB_PRECIO \n" +
                                                            "FROM LIBRO_ISBN \n" +
                                                            "LEFT JOIN LIBRO\n" +
                                                            "ON LIBRO_ISBN.LIB_ISBN=LIBRO.LIB_ISBN\n" +
                                                            "WHERE LIBRO_ISBN.LIB_TITULO LIKE ?\n" +
                                                            "GROUP BY LIBRO_ISBN.LIB_ISBN;");
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
    
    public ArrayList<Vector> getIsbnForAutor(String name) {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT DISTINCT(LIBRO_ISBN.LIB_ISBN), LIBRO_ISBN.LIB_TITULO, LIBRO_ISBN.LIB_PRECIO \n" +
                                                            "FROM LIBRO\n" +
                                                            "RIGHT JOIN LIBRO_ISBN \n" +
                                                            "ON LIBRO.LIB_ISBN=LIBRO_ISBN.LIB_ISBN\n" +
                                                            "INNER JOIN LIBRO_AUTOR \n" +
                                                            "ON LIBRO_ISBN.LIB_ISBN=LIBRO_AUTOR.LIB_ISBN \n" +
                                                            "INNER JOIN AUTOR \n" +
                                                            "ON LIBRO_AUTOR.AUT_ID=AUTOR.AUT_ID \n" +
                                                            "WHERE AUTOR.AUT_NOMBRE LIKE ?\n" +
                                                            "OR AUTOR.AUT_APELLIDOP LIKE ? \n" +
                                                            "OR  AUTOR.AUT_APELLIDOM LIKE ?\n" +
                                                            "GROUP BY LIBRO_ISBN.LIB_ISBN;");
                ) {
                pst.setString(1, "%"+name+"%");
                pst.setString(2, "%"+name+"%");
                pst.setString(3, "%"+name+"%");
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
    
    public ArrayList<Vector> getIsbnForCategoria(String name) {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT DISTINCT(LIBRO_ISBN.LIB_ISBN), LIBRO_ISBN.LIB_TITULO, LIBRO_ISBN.LIB_PRECIO \n" +
                                                            "FROM LIBRO\n" +
                                                            "RIGHT JOIN LIBRO_ISBN \n" +
                                                            "ON LIBRO.LIB_ISBN=LIBRO_ISBN.LIB_ISBN\n" +
                                                            "INNER JOIN LIBRO_CATEGORIA \n" +
                                                            "ON LIBRO_ISBN.LIB_ISBN=LIBRO_CATEGORIA.LIB_ISBN \n" +
                                                            "INNER JOIN CATEGORIA \n" +
                                                            "ON LIBRO_CATEGORIA.CAT_ID=CATEGORIA.CAT_ID \n" +
                                                            "WHERE CATEGORIA.CATEGORIA LIKE ?\n" +
                                                            "GROUP BY LIBRO_ISBN.LIB_ISBN;");
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
    
    public ArrayList<Vector> getIsbnForIdioma(String name) {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT DISTINCT(LIBRO_ISBN.LIB_ISBN), LIBRO_ISBN.LIB_TITULO, LIBRO_ISBN.LIB_PRECIO \n" +
                                                            "FROM LIBRO\n" +
                                                            "RIGHT JOIN LIBRO_ISBN \n" +
                                                            "ON LIBRO.LIB_ISBN=LIBRO_ISBN.LIB_ISBN\n" +
                                                            "INNER JOIN LIBRO_IDIOMA \n" +
                                                            "ON LIBRO_ISBN.LIB_ISBN=LIBRO_IDIOMA.LIB_ISBN \n" +
                                                            "INNER JOIN IDIOMA \n" +
                                                            "ON LIBRO_IDIOMA.IDI_ID=IDIOMA.IDI_ID \n" +
                                                            "WHERE IDIOMA.IDIOMA LIKE ?\n" +
                                                            "GROUP BY LIBRO_ISBN.LIB_ISBN;");
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
    
    public ArrayList<Vector> getIsbnForEditorial(String name) {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT DISTINCT(LIBRO_ISBN.LIB_ISBN), LIBRO_ISBN.LIB_TITULO, LIBRO_ISBN.LIB_PRECIO \n" +
                                                            "FROM LIBRO\n"+
                                                            "RIGHT JOIN  LIBRO_ISBN \n" +
                                                            "ON LIBRO.LIB_ISBN=LIBRO_ISBN.LIB_ISBN \n"+
                                                            "INNER JOIN EDITORIAL\n" +
                                                            "ON LIBRO_ISBN.EDI_ID=EDITORIAL.EDI_ID\n" +
                                                            "WHERE EDITORIAL.EDI_NOMBRE LIKE ?;");
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

    public Blob getPortada() {
        return portada;
    }

    public void setPortada(Blob portada) {
        this.portada = portada;
    }
}
