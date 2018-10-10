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
import java.util.Calendar;
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
public class Factura {

    Conexion cc = new Conexion();
    Icon iconSucces = new ImageIcon(getClass().getResource("../img/iconSucces.png"));
    Icon iconError = new ImageIcon(getClass().getResource("../img/iconError.png"));
    Icon iconQuestion = new ImageIcon(getClass().getResource("../img/iconQuestion.png"));
    Icon iconWarning = new ImageIcon(getClass().getResource("../img/iconWarning.png"));
    
    private int facId;
    private String folio;
    private String fecha, hora;
    private double precioN, iva, precioT;
    private int idDis;
    private int metodoPago;

    public Factura() {
    }

    public Factura(String folio, String fecha, String hora, double precioN, double iva, double precioT, int idDis, int metodoPago) {
        this.folio = folio;
        this.fecha = fecha;
        this.hora = hora;
        this.precioN = precioN;
        this.iva = iva;
        this.precioT = precioT;
        this.idDis = idDis;
        this.metodoPago = metodoPago;
    }

    public boolean existeFactura(String nroFac, int dist){
        try (Connection cn= cc.conectar();
              PreparedStatement pst = cn.prepareStatement("SELECT * FROM FACTURA WHERE FAC_FOLIO=? AND DIS_ID=?");
                ) {
            pst.setString(1, nroFac);
            pst.setInt(2, dist);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                rs.close();
                return true;
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
        }
        return false;
    }
    
    public Factura getFactura(String pkFactura){
        Factura fac=new Factura();
        try (Connection cn= cc.conectar();
              PreparedStatement pst = cn.prepareStatement("SELECT * FROM FACTURA WHERE FAC_ID=?");
                ) {
            pst.setInt(1, Integer.parseInt(pkFactura));
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                fac.setFacId(rs.getInt(1));
                fac.setFolio(rs.getString(2));
                fac.setIdDis(rs.getInt(3));
                fac.setMetodoPago(rs.getInt(4));
                fac.setFecha(rs.getString(5));
                fac.setHora(rs.getString(6));
                fac.setPrecioN(rs.getDouble(7));
                fac.setIva(rs.getDouble(8));
                fac.setPrecioT(rs.getDouble(9));
                return fac;
            }
            rs.close();
            return fac;
        } catch (SQLException ex) {
           
           JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
        }
        
        return null;
        
    }
    
    public boolean insertFactura(Factura fac) {

        try (Connection cn = cc.conectar();
                PreparedStatement pst=cn.prepareStatement("INSERT INTO FACTURA(FAC_FOLIO, DIS_ID, MET_COD, FAC_FECHA, FAC_HORA, FAC_PRECION, FAC_IVA, FAC_PRECIOT)" + 
                    " VALUES (?,?,?,CURRENT_DATE,CURRENT_TIME,?,?,?)");
                ) {
            pst.setString(1, fac.getFolio());
            pst.setInt(2, fac.getIdDis());
            pst.setInt(3, fac.getMetodoPago());
            pst.setDouble(4, fac.getPrecioN());
            pst.setDouble(5, fac.getIva());
            pst.setDouble(6, fac.getPrecioT());
            
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
        }
        return false;
    }
    
    public void updateFactura(Factura fac){
         try (Connection cn = cc.conectar();
            PreparedStatement pst = cn.prepareStatement("UPDATE FACTURA SET FAC_FOLIO=?,  DIS_ID=?, MET_COD=?, FAC_PRECION=?, FAC_IVA=?, FAC_PRECIOT=? WHERE FAC_ID=?");
                 Statement st=cn.createStatement();
                 ) 
         {
            double precion=0,iva=0,preciot=0; 
            ResultSet rs = st.executeQuery("SELECT SUM(COM_PRECIO) FROM COMPRA WHERE FAC_ID="+fac.getFacId());
            while(rs.next()){
                precion=rs.getDouble(1);
                iva=precion*0.19;
                preciot=precion+iva;
            }
            pst.setString(1, fac.getFolio());
            pst.setInt(2, fac.getIdDis());
            pst.setInt(3, fac.getMetodoPago());
            pst.setDouble(4, precion);
            pst.setDouble(5, iva);
            pst.setDouble(6, preciot);
            pst.setInt(7, fac.getFacId());
            pst.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
        }
        
    }
    
     /**
    * Este método consulta un Distribuidor en la base de datos segun el indicio de nombre proporcionado
    * @param name indicio de nombre del Distribuidor.
    * @return Devuleve un ArrayList con el resultado de la consulta.
    */
    public ArrayList<Vector> getAllFacturas() {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT FACTURA.FAC_ID, FACTURA.FAC_FOLIO, DISTRIBUIDOR.DIS_NOMBRE, METODO_PAGO.MET_DESC, FACTURA.FAC_FECHA, FACTURA.FAC_HORA, FACTURA.FAC_PRECION, FACTURA.FAC_IVA, FACTURA.FAC_PRECIOT "+
                                                            "FROM DISTRIBUIDOR "+
                                                            "INNER JOIN FACTURA "+
                                                            "ON DISTRIBUIDOR.DIS_ID=FACTURA.DIS_ID "+
                                                            "INNER JOIN METODO_PAGO "+
                                                            "ON FACTURA.MET_COD=METODO_PAGO.MET_COD;");
                ) {
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
    
    public ArrayList<Vector> getFacturasForMetodoPago(int codMetodo) {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT FACTURA.FAC_ID, FACTURA.FAC_FOLIO, DISTRIBUIDOR.DIS_NOMBRE, METODO_PAGO.MET_DESC, FACTURA.FAC_FECHA, FACTURA.FAC_HORA, FACTURA.FAC_PRECION, FACTURA.FAC_IVA, FACTURA.FAC_PRECIOT "+
                                                            "FROM DISTRIBUIDOR "+
                                                            "INNER JOIN FACTURA "+
                                                            "ON DISTRIBUIDOR.DIS_ID=FACTURA.DIS_ID "+
                                                            "INNER JOIN METODO_PAGO "+
                                                            "ON FACTURA.MET_COD=METODO_PAGO.MET_COD "+
                                                            "WHERE FACTURA.MET_COD=?;");
                ) {
                pst.setInt(1, codMetodo);
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
    
     public ArrayList<Vector> getFacturasForDistribuidor(int codMetodo) {
        ArrayList<Vector> lista= new ArrayList();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM FACTURA WHERE MET_COD=?");
                ) {
                pst.setInt(1, codMetodo);
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
    
    
    public boolean deleteFactura(int pkFactura){
        if (JOptionPane.showConfirmDialog(null, "Esto solo es posible debido a que la Factura se encuentra vacía\n¿Está seguro que desea eliminar la Factura?\nSi tiene dudas, mejor consulte a un supervisor.", "Advertencia", JOptionPane.YES_NO_OPTION,0,iconQuestion) == JOptionPane.YES_OPTION) {
            try (   Connection cn = cc.conectar();
                    PreparedStatement pst = cn.prepareStatement("DELETE FROM FACTURA WHERE FAC_ID=?")) {
                pst.setInt(1, pkFactura);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Factura eliminada con éxito!", "Exito", JOptionPane.INFORMATION_MESSAGE , iconSucces);
                return true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
            }
        }
        return false;
    }
    
    public Factura consultaFactura(int id_dist, String folio){
       Factura fac=new Factura();
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT FAC_ID FROM FACTURA WHERE FAC_FOLIO=? AND DIS_ID=?");
                ) {
            pst.setString(1, folio);
            pst.setInt(2, id_dist);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                fac.setFacId(rs.getInt(1));
                return fac;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
        }
       return null;
   }
    
    public int ultimaFactura(){
        int ultimafac;
        try (Connection cn = cc.conectar();
                PreparedStatement pst = cn.prepareStatement("SELECT MAX(FAC_ID) FROM FACTURA");
                ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                ultimafac = rs.getInt(1);
                return ultimafac;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getErrorCode() + ". " + ex.getMessage(), "SQLException", 0);
        }
        return -1;
    }

    public int getIdDis() {
        return idDis;
    }

    public void setIdDis(int idDis) {
        this.idDis = idDis;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getPrecioN() {
        return precioN;
    }

    public void setPrecioN(double precioN) {
        this.precioN = precioN;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecioT() {
        return precioT;
    }

    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }

    public int getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(int metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getFacId() {
        return facId;
    }

    public void setFacId(int facId) {
        this.facId = facId;
    }

}
