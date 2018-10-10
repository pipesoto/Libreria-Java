/*
 * To change t    @Override
    protected void computeTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void computeFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int field, int amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void roll(int field, boolean up) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMinimum(int field) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMaximum(int field) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getGreatestMinimum(int field) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLeastMaximum(int field) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
his license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.List;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.RadioButton;
import javax.imageio.ImageIO;
import javax.sql.rowset.serial.SerialBlob;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import libreria.Autor;
import libreria.AutorLibro;
import libreria.Categoria;
import libreria.CategoriaLibro;
import libreria.Compra;
import libreria.DetalleFacCompra;
import libreria.Distribuidor;
import libreria.Editorial;
import libreria.Factura;
import libreria.Idioma;
import libreria.IdiomaLibro;
import libreria.Libro;
import libreria.LibroIsbn;
import libreria.MetodoPago;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author 2guzm
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creación de Form de Inicio al aplicativo.
     */
    public Inicio() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupDist = new javax.swing.ButtonGroup();
        buttonGroupAut = new javax.swing.ButtonGroup();
        buttonGroupIdi = new javax.swing.ButtonGroup();
        buttonGroupCat = new javax.swing.ButtonGroup();
        buttonGroupEdi = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroupLibro = new javax.swing.ButtonGroup();
        jDialogAñadeAutor = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tableAutorAñadir = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tableAutorAñadidos = new javax.swing.JTable();
        btnNuevoAutorAñadAut = new javax.swing.JButton();
        btnConfirmAñadAut = new javax.swing.JButton();
        txtConsultaAñadeAutor = new javax.swing.JTextField();
        rdBtnConsultaTodoAñadAut = new javax.swing.JRadioButton();
        rdBtnConsultaAutorAñadAut = new javax.swing.JRadioButton();
        jLabel40 = new javax.swing.JLabel();
        btnLimpiarAñadAut = new javax.swing.JButton();
        btnAutorToRightAñadAut = new javax.swing.JButton();
        btnAutorToLeftAñadAut = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        btnGrpConsAñadAut = new javax.swing.ButtonGroup();
        jDialogAñadeCategoria = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        rdBtnConsultaTodoAñadCat = new javax.swing.JRadioButton();
        rdBtnConsultaCategoriaAñadCat = new javax.swing.JRadioButton();
        txtConsultaAñadeCategoria = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tableCategoriaAñadir = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        tableCategoriaAñadidas = new javax.swing.JTable();
        btnCategoriaToRightAñadCat = new javax.swing.JButton();
        btnCategoriaToLeftAñadCat = new javax.swing.JButton();
        btnNuevaCategoriaAñadCat = new javax.swing.JButton();
        btnConfirmAñadCat = new javax.swing.JButton();
        btnLimpiarAñadCat = new javax.swing.JButton();
        btnGrpConsAñadCat = new javax.swing.ButtonGroup();
        jDialogAñadeIdioma = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        rdBtnConsultaTodoAñadIdi = new javax.swing.JRadioButton();
        rdBtnConsultaIdiomaAñadIdi = new javax.swing.JRadioButton();
        txtConsultaAñadeIdioma = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tableIdiomaAñadir = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        tableIdiomaAñadidos = new javax.swing.JTable();
        btnIdiomaToRightAñadIdi = new javax.swing.JButton();
        btnIdiomaToLeftAñadIdi = new javax.swing.JButton();
        btnNuevoIdiomaAñadIdi = new javax.swing.JButton();
        btnConfirmAñadIdi = new javax.swing.JButton();
        btnLimpiarAñadIdi = new javax.swing.JButton();
        btnGrpConsAñadIdi = new javax.swing.ButtonGroup();
        jDialogResumenLibro = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        lblPortadaLibroResumen = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jListIdiomas = new javax.swing.JList<>();
        jScrollPane18 = new javax.swing.JScrollPane();
        jListAutores = new javax.swing.JList<>();
        jScrollPane17 = new javax.swing.JScrollPane();
        jListCategorias = new javax.swing.JList<>();
        lblIsbnResumenLibro = new javax.swing.JLabel();
        lblTituloResumenLibro = new javax.swing.JLabel();
        lblEditorialResumenLibro = new javax.swing.JLabel();
        lblPaginasResumenLibro = new javax.swing.JLabel();
        lblPrecioResumenLibro = new javax.swing.JLabel();
        lblAnoResumenLibro = new javax.swing.JLabel();
        jDialogCamara = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jDialogFilePortada = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jFileChooser1 = new javax.swing.JFileChooser();
        btnGrpConsFacturas = new javax.swing.ButtonGroup();
        panelBarraNavegacionLat = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        panelBotonesCompra = new javax.swing.JPanel();
        btnCompra = new javax.swing.JButton();
        btnDistribuidor = new javax.swing.JButton();
        btnAdminCompras = new javax.swing.JButton();
        btnLibros = new javax.swing.JButton();
        panelBotonesLibro = new javax.swing.JPanel();
        btnLibro = new javax.swing.JButton();
        btnAutor = new javax.swing.JButton();
        btnDetalles = new javax.swing.JButton();
        panelOtro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        panelDistribuidor = new javax.swing.JPanel();
        btnEliminarDist = new javax.swing.JButton();
        btnEditarDist = new javax.swing.JButton();
        txtNuevoDistRut = new javax.swing.JTextField();
        txtNuevoDistNom = new javax.swing.JTextField();
        txtNuevoDistDVrut = new javax.swing.JTextField();
        yearChooserNuevoDist = new com.toedter.calendar.JYearChooser();
        txtNuevoDisNroT = new javax.swing.JTextField();
        txtNuevoDisDir = new javax.swing.JTextField();
        btnRegNuevDis = new javax.swing.JButton();
        btnLimpCampNuevDis = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lblNuevoDistRutexiste = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lblModDist = new javax.swing.JLabel();
        rdConsDisCod = new javax.swing.JRadioButton();
        rdConsDisRut = new javax.swing.JRadioButton();
        rdConsDisNom = new javax.swing.JRadioButton();
        txtCodConsDis = new javax.swing.JTextField();
        txtNomConsDis = new javax.swing.JTextField();
        rdConsDisTodo = new javax.swing.JRadioButton();
        jLabel53 = new javax.swing.JLabel();
        txtRutConsDis = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDistCons = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panelAutor = new javax.swing.JPanel();
        lblCodigoAutor = new javax.swing.JLabel();
        lblCodigoAutor1 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        txtAutorNombre = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        txtAutorApeP = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        txtAutorApeM = new javax.swing.JTextField();
        btnAutEliminar = new javax.swing.JButton();
        btnAutEditar = new javax.swing.JButton();
        btnRegAutor = new javax.swing.JButton();
        btnLimpAutor = new javax.swing.JButton();
        rdConsAutCod = new javax.swing.JRadioButton();
        rdConsAutApes = new javax.swing.JRadioButton();
        rdConsAutNom = new javax.swing.JRadioButton();
        txtAutorCodCons = new javax.swing.JTextField();
        txtAutorNombreCons = new javax.swing.JTextField();
        rdConsAutTodo = new javax.swing.JRadioButton();
        txtAutorApesCons = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaAutCons = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lblCuadroAutor = new javax.swing.JLabel();
        panelDetallesLibro = new javax.swing.JPanel();
        subPanelIdioma = new javax.swing.JPanel();
        lblCodigoIdioma1 = new javax.swing.JLabel();
        lblCodigoIdioma = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        txtIdioma = new javax.swing.JTextField();
        btnRegIdioma = new javax.swing.JButton();
        btnCancelEditorial = new javax.swing.JButton();
        rdConsIdioTodo = new javax.swing.JRadioButton();
        rdConsIdioCod = new javax.swing.JRadioButton();
        txtIdioCodCons = new javax.swing.JTextField();
        rdConsIdioma = new javax.swing.JRadioButton();
        txtIdiomaCons = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaIdiomaCons = new javax.swing.JTable();
        btnIdiomaEditar = new javax.swing.JButton();
        btnIdiomaEliminar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnCancelIdioma = new javax.swing.JButton();
        subPanelCategoria = new javax.swing.JPanel();
        lblCodigoCategoria1 = new javax.swing.JLabel();
        lblCodigoCategoria = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        btnRegCategoria = new javax.swing.JButton();
        rdConsCatTodo = new javax.swing.JRadioButton();
        rdConsCatCod = new javax.swing.JRadioButton();
        txtCatCodCons = new javax.swing.JTextField();
        rdConsCategoria = new javax.swing.JRadioButton();
        txtCategoriaCons = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaCategoriaCons = new javax.swing.JTable();
        btnCatEditar = new javax.swing.JButton();
        btnCatEliminar = new javax.swing.JButton();
        btnCancelCategoria = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        subPanelEditorial = new javax.swing.JPanel();
        lblCodigoEditorial1 = new javax.swing.JLabel();
        lblCodigoEditorial = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        btnRegEditorial = new javax.swing.JButton();
        rdConsEdiTodo = new javax.swing.JRadioButton();
        rdConsEdiCod = new javax.swing.JRadioButton();
        txtEdiCodCons = new javax.swing.JTextField();
        rdConsEditorial = new javax.swing.JRadioButton();
        txtEditorialCons = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaEditorialCons = new javax.swing.JTable();
        btnEditorialEditar = new javax.swing.JButton();
        btnEditorialEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        panelLibro = new javax.swing.JPanel();
        panelFacturaNueva = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        txtNroFactura = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        cbxDistribuidorNuevaFactura = new javax.swing.JComboBox<>();
        btnNuevoDistribuidor = new javax.swing.JButton();
        btnProcesaFactura = new javax.swing.JButton();
        panelDetalleLibro = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtIsbnLibro = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTituloLibro = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cbxEditorialLibro = new javax.swing.JComboBox<>();
        btnNuevaEditorial = new javax.swing.JButton();
        btnCargarPortada = new javax.swing.JButton();
        lblPortadaLibro = new javax.swing.JLabel();
        btnAñadeAutor = new javax.swing.JButton();
        lblCountAutorAñad = new javax.swing.JLabel();
        btnAñadeCategoria = new javax.swing.JButton();
        lblCountCategoriaAñad = new javax.swing.JLabel();
        btnAñadeIdioma = new javax.swing.JButton();
        lblCountIdiomaAñad = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        yearChooserAnoLibro = new com.toedter.calendar.JYearChooser();
        lblCantidadLibro = new javax.swing.JLabel();
        txtCantidadLibro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtPaginasLibro = new javax.swing.JTextField();
        lblPrecioLibro = new javax.swing.JLabel();
        txtPrecioLibro = new javax.swing.JTextField();
        btnConfirmarLibro = new javax.swing.JButton();
        btnLimpiarLibro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelBusquedaLibro = new javax.swing.JPanel();
        rdConsultaLibroTodo = new javax.swing.JRadioButton();
        rdConsultaLibroFiltro = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLibroConsulta = new javax.swing.JTable();
        btnEditarLibro = new javax.swing.JButton();
        btnEliminarLibro = new javax.swing.JButton();
        rdConsultaLibroIsbn = new javax.swing.JRadioButton();
        txtIsbnLibroConsulta = new javax.swing.JTextField();
        cbxFiltroLibro = new javax.swing.JComboBox<>();
        txtFiltroLibro = new javax.swing.JTextField();
        panelFacturaResumen = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableDetallesFactura = new javax.swing.JTable();
        cbxMetodoPagoNuevaCompra = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblNroFactura = new javax.swing.JLabel();
        lblRutDistribuidorFactura = new javax.swing.JLabel();
        lblFechaFactura = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblIvaFactura = new javax.swing.JLabel();
        lblTotalFactura = new javax.swing.JLabel();
        lblNetoFactura = new javax.swing.JLabel();
        btnAutEditar4 = new javax.swing.JButton();
        lblNombreDistribuidorFactura = new javax.swing.JLabel();
        btnLimpiarComprasFactura = new javax.swing.JButton();
        lblRutDistribuidorFactura1 = new javax.swing.JLabel();
        lblNombreDistribuidorFactura1 = new javax.swing.JLabel();
        lblNombreDistribuidorFactura2 = new javax.swing.JLabel();
        lblHoraFactura = new javax.swing.JLabel();
        panelAdminCompra = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnEliminarFactura = new javax.swing.JButton();
        rdConsFacTodo = new javax.swing.JRadioButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tableFacturas = new javax.swing.JTable();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        cbxConsFacMetodo = new javax.swing.JComboBox<>();
        txtConsFacDistribuidor = new javax.swing.JTextField();
        panelComprasFactura = new javax.swing.JPanel();
        btnEliminarCompraFac = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableCompras = new javax.swing.JTable();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jDialogAñadeAutor.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialogAñadeAutor.setMinimumSize(new java.awt.Dimension(800, 420));
        jDialogAñadeAutor.setModal(true);
        jDialogAñadeAutor.setResizable(false);
        jDialogAñadeAutor.setSize(new java.awt.Dimension(800, 400));
        jDialogAñadeAutor.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jDialogAñadeAutorWindowClosed(evt);
            }
        });
        jDialogAñadeAutor.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(251, 251, 242));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane12.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N

        tableAutorAñadir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO P", "APELLIDO M"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(tableAutorAñadir);
        if (tableAutorAñadir.getColumnModel().getColumnCount() > 0) {
            tableAutorAñadir.getColumnModel().getColumn(0).setResizable(false);
            tableAutorAñadir.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableAutorAñadir.getColumnModel().getColumn(1).setResizable(false);
            tableAutorAñadir.getColumnModel().getColumn(1).setPreferredWidth(300);
            tableAutorAñadir.getColumnModel().getColumn(2).setResizable(false);
            tableAutorAñadir.getColumnModel().getColumn(2).setPreferredWidth(100);
            tableAutorAñadir.getColumnModel().getColumn(2).setHeaderValue("APELLIDO P");
            tableAutorAñadir.getColumnModel().getColumn(3).setResizable(false);
            tableAutorAñadir.getColumnModel().getColumn(3).setPreferredWidth(100);
            tableAutorAñadir.getColumnModel().getColumn(3).setHeaderValue("APELLIDO M");
        }
        ArrayListToTable(tableAutorAñadir, Aut.getAllAutor());
        selectionTableListener(btnAutorToRightAñadAut, btnAutorToRightAñadAut, tableAutorAñadir);
        tableFilter("", tableAutorAñadir);

        jPanel3.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 330, 220));

        jScrollPane11.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N

        tableAutorAñadidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO P", "APELLIDO M"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(tableAutorAñadidos);
        if (tableAutorAñadidos.getColumnModel().getColumnCount() > 0) {
            tableAutorAñadidos.getColumnModel().getColumn(0).setResizable(false);
            tableAutorAñadidos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableAutorAñadidos.getColumnModel().getColumn(1).setResizable(false);
            tableAutorAñadidos.getColumnModel().getColumn(1).setPreferredWidth(300);
            tableAutorAñadidos.getColumnModel().getColumn(2).setResizable(false);
            tableAutorAñadidos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tableAutorAñadidos.getColumnModel().getColumn(2).setHeaderValue("APELLIDO P");
            tableAutorAñadidos.getColumnModel().getColumn(3).setResizable(false);
            tableAutorAñadidos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tableAutorAñadidos.getColumnModel().getColumn(3).setHeaderValue("APELLIDO M");
        }
        selectionTableListener(btnAutorToLeftAñadAut, btnAutorToLeftAñadAut, tableAutorAñadidos);
        tableFilter("", tableAutorAñadidos);

        jPanel3.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 330, 220));

        btnNuevoAutorAñadAut.setBackground(new java.awt.Color(29, 53, 87));
        btnNuevoAutorAñadAut.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnNuevoAutorAñadAut.setForeground(new java.awt.Color(241, 250, 238));
        btnNuevoAutorAñadAut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconPlus24.png"))); // NOI18N
        btnNuevoAutorAñadAut.setText("Nuevo");
        btnNuevoAutorAñadAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAutorAñadAutActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevoAutorAñadAut, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 340, 110, 30));

        btnConfirmAñadAut.setBackground(new java.awt.Color(29, 53, 87));
        btnConfirmAñadAut.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnConfirmAñadAut.setForeground(new java.awt.Color(241, 250, 238));
        btnConfirmAñadAut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCheck.png"))); // NOI18N
        btnConfirmAñadAut.setText("Confirmar");
        btnConfirmAñadAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmAñadAutActionPerformed(evt);
            }
        });
        jPanel3.add(btnConfirmAñadAut, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, 30));

        txtConsultaAñadeAutor.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        txtConsultaAñadeAutor.setEnabled(false);
        txtConsultaAñadeAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultaAñadeAutorKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultaAñadeAutorKeyReleased(evt);
            }
        });
        jPanel3.add(txtConsultaAñadeAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 150, 28));
        InputMap autorañad = txtConsultaAñadeAutor.getInputMap(JTextField.WHEN_FOCUSED);
        autorañad.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        btnGrpConsAñadAut.add(rdBtnConsultaTodoAñadAut);
        rdBtnConsultaTodoAñadAut.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        rdBtnConsultaTodoAñadAut.setSelected(true);
        rdBtnConsultaTodoAñadAut.setText("Todo");
        rdBtnConsultaTodoAñadAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnConsultaTodoAñadAutActionPerformed(evt);
            }
        });
        jPanel3.add(rdBtnConsultaTodoAñadAut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 20));

        btnGrpConsAñadAut.add(rdBtnConsultaAutorAñadAut);
        rdBtnConsultaAutorAñadAut.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        rdBtnConsultaAutorAñadAut.setText("Autor:");
        rdBtnConsultaAutorAñadAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnConsultaAutorAñadAutActionPerformed(evt);
            }
        });
        jPanel3.add(rdBtnConsultaAutorAñadAut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel40.setFont(new java.awt.Font("Lora", 1, 18)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("A Ñ A D I R:");
        jPanel3.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 330, -1));

        btnLimpiarAñadAut.setBackground(new java.awt.Color(29, 53, 87));
        btnLimpiarAñadAut.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnLimpiarAñadAut.setForeground(new java.awt.Color(241, 250, 238));
        btnLimpiarAñadAut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconTrash.png"))); // NOI18N
        btnLimpiarAñadAut.setText("Limpiar");
        btnLimpiarAñadAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarAñadAutActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiarAñadAut, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 100, 30));

        btnAutorToRightAñadAut.setBackground(new java.awt.Color(29, 53, 87));
        btnAutorToRightAñadAut.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnAutorToRightAñadAut.setForeground(new java.awt.Color(241, 250, 238));
        btnAutorToRightAñadAut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toright24.png"))); // NOI18N
        btnAutorToRightAñadAut.setEnabled(false);
        btnAutorToRightAñadAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorToRightAñadAutActionPerformed(evt);
            }
        });
        jPanel3.add(btnAutorToRightAñadAut, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 30, 30));

        btnAutorToLeftAñadAut.setBackground(new java.awt.Color(29, 53, 87));
        btnAutorToLeftAñadAut.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnAutorToLeftAñadAut.setForeground(new java.awt.Color(241, 250, 238));
        btnAutorToLeftAñadAut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toleft24.png"))); // NOI18N
        btnAutorToLeftAñadAut.setEnabled(false);
        btnAutorToLeftAñadAut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorToLeftAñadAutActionPerformed(evt);
            }
        });
        jPanel3.add(btnAutorToLeftAñadAut, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 30, 30));

        jLabel41.setFont(new java.awt.Font("Lora", 1, 18)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("A Ñ A D I D O S:");
        jPanel3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 330, -1));

        jDialogAñadeAutor.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));

        jDialogAñadeCategoria.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialogAñadeCategoria.setMinimumSize(new java.awt.Dimension(800, 420));
        jDialogAñadeCategoria.setModal(true);
        jDialogAñadeCategoria.setResizable(false);
        jDialogAñadeCategoria.setSize(new java.awt.Dimension(800, 400));
        jDialogAñadeCategoria.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jDialogAñadeCategoriaWindowClosed(evt);
            }
        });
        jDialogAñadeCategoria.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(251, 251, 242));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGrpConsAñadCat.add(rdBtnConsultaTodoAñadCat);
        rdBtnConsultaTodoAñadCat.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        rdBtnConsultaTodoAñadCat.setSelected(true);
        rdBtnConsultaTodoAñadCat.setText("Todo");
        rdBtnConsultaTodoAñadCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnConsultaTodoAñadCatActionPerformed(evt);
            }
        });
        jPanel6.add(rdBtnConsultaTodoAñadCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 20));

        btnGrpConsAñadCat.add(rdBtnConsultaCategoriaAñadCat);
        rdBtnConsultaCategoriaAñadCat.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        rdBtnConsultaCategoriaAñadCat.setText("Categoría:");
        rdBtnConsultaCategoriaAñadCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnConsultaCategoriaAñadCatActionPerformed(evt);
            }
        });
        jPanel6.add(rdBtnConsultaCategoriaAñadCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        txtConsultaAñadeCategoria.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        txtConsultaAñadeCategoria.setEnabled(false);
        txtConsultaAñadeCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultaAñadeCategoriaKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultaAñadeCategoriaKeyReleased(evt);
            }
        });
        jPanel6.add(txtConsultaAñadeCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 150, 28));
        InputMap cateañad = txtConsultaAñadeCategoria.getInputMap(JTextField.WHEN_FOCUSED);
        cateañad.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        jLabel42.setFont(new java.awt.Font("Lora", 1, 18)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("P O R    A Ñ A D I R:");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 330, -1));

        jLabel43.setFont(new java.awt.Font("Lora", 1, 18)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("A Ñ A D I D A S:");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 330, -1));

        jScrollPane14.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N

        tableCategoriaAñadir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CATEGORIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCategoriaAñadir.getTableHeader().setReorderingAllowed(false);
        jScrollPane14.setViewportView(tableCategoriaAñadir);
        if (tableCategoriaAñadir.getColumnModel().getColumnCount() > 0) {
            tableCategoriaAñadir.getColumnModel().getColumn(0).setResizable(false);
            tableCategoriaAñadir.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableCategoriaAñadir.getColumnModel().getColumn(1).setResizable(false);
            tableCategoriaAñadir.getColumnModel().getColumn(1).setPreferredWidth(300);
        }
        ArrayListToTable(tableCategoriaAñadir, Cat.getAllCategorias());
        selectionTableListener(btnCategoriaToRightAñadCat, btnCategoriaToRightAñadCat, tableCategoriaAñadir);
        tableFilter("", tableCategoriaAñadir);

        jPanel6.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 330, 220));

        jScrollPane13.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N

        tableCategoriaAñadidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CATEGORIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCategoriaAñadidas.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(tableCategoriaAñadidas);
        if (tableCategoriaAñadidas.getColumnModel().getColumnCount() > 0) {
            tableCategoriaAñadidas.getColumnModel().getColumn(0).setResizable(false);
            tableCategoriaAñadidas.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableCategoriaAñadidas.getColumnModel().getColumn(1).setResizable(false);
            tableCategoriaAñadidas.getColumnModel().getColumn(1).setPreferredWidth(300);
        }
        selectionTableListener(btnCategoriaToLeftAñadCat, btnCategoriaToLeftAñadCat, tableCategoriaAñadidas);
        tableFilter("", tableCategoriaAñadidas);

        jPanel6.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 330, 220));

        btnCategoriaToRightAñadCat.setBackground(new java.awt.Color(29, 53, 87));
        btnCategoriaToRightAñadCat.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnCategoriaToRightAñadCat.setForeground(new java.awt.Color(241, 250, 238));
        btnCategoriaToRightAñadCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toright24.png"))); // NOI18N
        btnCategoriaToRightAñadCat.setEnabled(false);
        btnCategoriaToRightAñadCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaToRightAñadCatActionPerformed(evt);
            }
        });
        jPanel6.add(btnCategoriaToRightAñadCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 30, 30));

        btnCategoriaToLeftAñadCat.setBackground(new java.awt.Color(29, 53, 87));
        btnCategoriaToLeftAñadCat.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnCategoriaToLeftAñadCat.setForeground(new java.awt.Color(241, 250, 238));
        btnCategoriaToLeftAñadCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toleft24.png"))); // NOI18N
        btnCategoriaToLeftAñadCat.setEnabled(false);
        btnCategoriaToLeftAñadCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaToLeftAñadCatActionPerformed(evt);
            }
        });
        jPanel6.add(btnCategoriaToLeftAñadCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 30, 30));

        btnNuevaCategoriaAñadCat.setBackground(new java.awt.Color(29, 53, 87));
        btnNuevaCategoriaAñadCat.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnNuevaCategoriaAñadCat.setForeground(new java.awt.Color(241, 250, 238));
        btnNuevaCategoriaAñadCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconPlus24.png"))); // NOI18N
        btnNuevaCategoriaAñadCat.setText("Nuevo");
        btnNuevaCategoriaAñadCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCategoriaAñadCatActionPerformed(evt);
            }
        });
        jPanel6.add(btnNuevaCategoriaAñadCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 340, 110, 30));

        btnConfirmAñadCat.setBackground(new java.awt.Color(29, 53, 87));
        btnConfirmAñadCat.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnConfirmAñadCat.setForeground(new java.awt.Color(241, 250, 238));
        btnConfirmAñadCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCheck.png"))); // NOI18N
        btnConfirmAñadCat.setText("Confirmar");
        btnConfirmAñadCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmAñadCatActionPerformed(evt);
            }
        });
        jPanel6.add(btnConfirmAñadCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, 30));

        btnLimpiarAñadCat.setBackground(new java.awt.Color(29, 53, 87));
        btnLimpiarAñadCat.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnLimpiarAñadCat.setForeground(new java.awt.Color(241, 250, 238));
        btnLimpiarAñadCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconTrash.png"))); // NOI18N
        btnLimpiarAñadCat.setText("Limpiar");
        btnLimpiarAñadCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarAñadCatActionPerformed(evt);
            }
        });
        jPanel6.add(btnLimpiarAñadCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 100, 30));

        jDialogAñadeCategoria.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));

        jDialogAñadeCategoria.getAccessibleContext().setAccessibleParent(panelLibro);

        jDialogAñadeIdioma.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialogAñadeIdioma.setMinimumSize(new java.awt.Dimension(800, 420));
        jDialogAñadeIdioma.setModal(true);
        jDialogAñadeIdioma.setResizable(false);
        jDialogAñadeIdioma.setSize(new java.awt.Dimension(800, 400));
        jDialogAñadeIdioma.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jDialogAñadeIdiomaWindowClosed(evt);
            }
        });
        jDialogAñadeIdioma.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(251, 251, 242));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGrpConsAñadIdi.add(rdBtnConsultaTodoAñadIdi);
        rdBtnConsultaTodoAñadIdi.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        rdBtnConsultaTodoAñadIdi.setSelected(true);
        rdBtnConsultaTodoAñadIdi.setText("Todo");
        rdBtnConsultaTodoAñadIdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnConsultaTodoAñadIdiActionPerformed(evt);
            }
        });
        jPanel7.add(rdBtnConsultaTodoAñadIdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 20));

        btnGrpConsAñadIdi.add(rdBtnConsultaIdiomaAñadIdi);
        rdBtnConsultaIdiomaAñadIdi.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        rdBtnConsultaIdiomaAñadIdi.setText("Idioma:");
        rdBtnConsultaIdiomaAñadIdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnConsultaIdiomaAñadIdiActionPerformed(evt);
            }
        });
        jPanel7.add(rdBtnConsultaIdiomaAñadIdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        txtConsultaAñadeIdioma.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        txtConsultaAñadeIdioma.setEnabled(false);
        txtConsultaAñadeIdioma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultaAñadeIdiomaKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultaAñadeIdiomaKeyReleased(evt);
            }
        });
        jPanel7.add(txtConsultaAñadeIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 150, 28));
        InputMap idioañad = txtConsultaAñadeIdioma.getInputMap(JTextField.WHEN_FOCUSED);
        idioañad.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        jLabel44.setFont(new java.awt.Font("Lora", 1, 18)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("P O R    A Ñ A D I R:");
        jPanel7.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 330, -1));

        jLabel45.setFont(new java.awt.Font("Lora", 1, 18)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("A Ñ A D I D A S:");
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 330, -1));

        jScrollPane16.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N

        tableIdiomaAñadir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "IDIOMA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableIdiomaAñadir.getTableHeader().setReorderingAllowed(false);
        jScrollPane16.setViewportView(tableIdiomaAñadir);
        if (tableIdiomaAñadir.getColumnModel().getColumnCount() > 0) {
            tableIdiomaAñadir.getColumnModel().getColumn(0).setResizable(false);
            tableIdiomaAñadir.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableIdiomaAñadir.getColumnModel().getColumn(1).setResizable(false);
            tableIdiomaAñadir.getColumnModel().getColumn(1).setPreferredWidth(300);
        }
        ArrayListToTable(tableIdiomaAñadir, Idi.getAllIdiomas());
        selectionTableListener(btnIdiomaToRightAñadIdi, btnIdiomaToRightAñadIdi, tableIdiomaAñadir);
        tableFilter("", tableIdiomaAñadir);

        jPanel7.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 330, 220));

        jScrollPane15.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N

        tableIdiomaAñadidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "IDIOMA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableIdiomaAñadidos.getTableHeader().setReorderingAllowed(false);
        jScrollPane15.setViewportView(tableIdiomaAñadidos);
        if (tableIdiomaAñadidos.getColumnModel().getColumnCount() > 0) {
            tableIdiomaAñadidos.getColumnModel().getColumn(0).setResizable(false);
            tableIdiomaAñadidos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableIdiomaAñadidos.getColumnModel().getColumn(1).setResizable(false);
            tableIdiomaAñadidos.getColumnModel().getColumn(1).setPreferredWidth(300);
        }
        selectionTableListener(btnIdiomaToLeftAñadIdi, btnIdiomaToLeftAñadIdi, tableIdiomaAñadidos);
        tableFilter("", tableIdiomaAñadidos);

        jPanel7.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 330, 220));

        btnIdiomaToRightAñadIdi.setBackground(new java.awt.Color(29, 53, 87));
        btnIdiomaToRightAñadIdi.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnIdiomaToRightAñadIdi.setForeground(new java.awt.Color(241, 250, 238));
        btnIdiomaToRightAñadIdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toright24.png"))); // NOI18N
        btnIdiomaToRightAñadIdi.setEnabled(false);
        btnIdiomaToRightAñadIdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdiomaToRightAñadIdiActionPerformed(evt);
            }
        });
        jPanel7.add(btnIdiomaToRightAñadIdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 30, 30));

        btnIdiomaToLeftAñadIdi.setBackground(new java.awt.Color(29, 53, 87));
        btnIdiomaToLeftAñadIdi.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnIdiomaToLeftAñadIdi.setForeground(new java.awt.Color(241, 250, 238));
        btnIdiomaToLeftAñadIdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toleft24.png"))); // NOI18N
        btnIdiomaToLeftAñadIdi.setEnabled(false);
        btnIdiomaToLeftAñadIdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdiomaToLeftAñadIdiActionPerformed(evt);
            }
        });
        jPanel7.add(btnIdiomaToLeftAñadIdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 30, 30));

        btnNuevoIdiomaAñadIdi.setBackground(new java.awt.Color(29, 53, 87));
        btnNuevoIdiomaAñadIdi.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnNuevoIdiomaAñadIdi.setForeground(new java.awt.Color(241, 250, 238));
        btnNuevoIdiomaAñadIdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconPlus24.png"))); // NOI18N
        btnNuevoIdiomaAñadIdi.setText("Nuevo");
        btnNuevoIdiomaAñadIdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoIdiomaAñadIdiActionPerformed(evt);
            }
        });
        jPanel7.add(btnNuevoIdiomaAñadIdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 340, 110, 30));

        btnConfirmAñadIdi.setBackground(new java.awt.Color(29, 53, 87));
        btnConfirmAñadIdi.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnConfirmAñadIdi.setForeground(new java.awt.Color(241, 250, 238));
        btnConfirmAñadIdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCheck.png"))); // NOI18N
        btnConfirmAñadIdi.setText("Confirmar");
        btnConfirmAñadIdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmAñadIdiActionPerformed(evt);
            }
        });
        jPanel7.add(btnConfirmAñadIdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, 30));

        btnLimpiarAñadIdi.setBackground(new java.awt.Color(29, 53, 87));
        btnLimpiarAñadIdi.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnLimpiarAñadIdi.setForeground(new java.awt.Color(241, 250, 238));
        btnLimpiarAñadIdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconTrash.png"))); // NOI18N
        btnLimpiarAñadIdi.setText("Limpiar");
        btnLimpiarAñadIdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarAñadIdiActionPerformed(evt);
            }
        });
        jPanel7.add(btnLimpiarAñadIdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 100, 30));

        jDialogAñadeIdioma.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));

        jDialogResumenLibro.setPreferredSize(new java.awt.Dimension(510, 470));
        jDialogResumenLibro.setResizable(false);
        jDialogResumenLibro.setSize(new java.awt.Dimension(510, 470));
        jDialogResumenLibro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(251, 251, 242));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPortadaLibroResumen.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        lblPortadaLibroResumen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPortadaLibroResumen.setText("PORTADA");
        jPanel1.add(lblPortadaLibroResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 190));

        jLabel18.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        jLabel18.setText("ISBN:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 60, 30));

        jLabel26.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        jLabel26.setText("TITULO:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 70, 30));

        jLabel28.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        jLabel28.setText("EDITORIAL:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 90, 30));

        jLabel34.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        jLabel34.setText("PAGINAS:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 80, 30));

        jLabel32.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        jLabel32.setText("AÑO PUB:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 80, 30));

        jLabel22.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        jLabel22.setText("PRECIO REF:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 100, 30));

        jLabel19.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("IDIOMA:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 130, 30));

        jLabel31.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("AUTOR:");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 200, 30));

        jLabel30.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("CATEGORIA:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 140, 30));

        jListIdiomas.setBackground(new java.awt.Color(251, 251, 242));
        jListIdiomas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jListIdiomas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListIdiomas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane19.setViewportView(jListIdiomas);

        jPanel1.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, 140));

        jListAutores.setBackground(new java.awt.Color(251, 251, 242));
        jListAutores.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jListAutores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListAutores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane18.setViewportView(jListAutores);

        jPanel1.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 200, 140));

        jListCategorias.setBackground(new java.awt.Color(251, 251, 242));
        jListCategorias.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jListCategorias.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListCategorias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane17.setViewportView(jListCategorias);

        jPanel1.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 140, 140));
        jPanel1.add(lblIsbnResumenLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 250, 30));
        jPanel1.add(lblTituloResumenLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 260, 30));
        jPanel1.add(lblEditorialResumenLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 260, 30));
        jPanel1.add(lblPaginasResumenLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 80, 30));
        jPanel1.add(lblPrecioResumenLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 210, 30));
        jPanel1.add(lblAnoResumenLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 80, 30));

        jDialogResumenLibro.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 440));

        jDialogResumenLibro.getAccessibleContext().setAccessibleParent(this);

        jDialogCamara.setModal(true);
        jDialogCamara.setResizable(false);
        jDialogCamara.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jDialogCamaraWindowClosed(evt);
            }
        });

        jButton3.setText("Capturar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDialogCamara.getContentPane().add(jButton3, java.awt.BorderLayout.PAGE_END);

        jDialogFilePortada.setResizable(false);
        jDialogFilePortada.setSize(new java.awt.Dimension(530, 350));
        jDialogFilePortada.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jFileChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

        jDialogFilePortada.getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 420));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca FastDevelopment");
        setIconImage((new ImageIcon(getClass().getResource("../img/iconBook2.png"))).getImage());
        setLocation(new java.awt.Point(350, 50));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBarraNavegacionLat.setBackground(new java.awt.Color(29, 53, 87));
        panelBarraNavegacionLat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBarraNavegacionLat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(251, 251, 242));
        jLabel3.setFont(new java.awt.Font("Lora", 1, 54)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(251, 251, 242));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("F D");
        panelBarraNavegacionLat.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 25, 140, 100));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(251, 251, 242));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book128.png"))); // NOI18N
        panelBarraNavegacionLat.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 120));

        btnInicio.setBackground(new java.awt.Color(29, 53, 87));
        btnInicio.setFont(new java.awt.Font("Lora", 1, 22)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(241, 250, 238));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconHome.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        panelBarraNavegacionLat.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, 40));

        btnCompras.setBackground(new java.awt.Color(29, 53, 87));
        btnCompras.setFont(new java.awt.Font("Lora", 1, 22)); // NOI18N
        btnCompras.setForeground(new java.awt.Color(241, 250, 238));
        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconDistribuidor2.png"))); // NOI18N
        btnCompras.setText("Compras");
        btnCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCompras.setMaximumSize(new java.awt.Dimension(121, 41));
        btnCompras.setMinimumSize(new java.awt.Dimension(121, 41));
        btnCompras.setPreferredSize(new java.awt.Dimension(121, 41));
        btnCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprasMouseEntered(evt);
            }
        });
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });
        panelBarraNavegacionLat.add(btnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 180, 40));

        panelBotonesCompra.setBackground(new java.awt.Color(38, 69, 114));
        panelBotonesCompra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray));
        panelBotonesCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBotonesCompraMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBotonesCompraMouseEntered(evt);
            }
        });
        panelBotonesCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCompra.setBackground(new java.awt.Color(29, 53, 87));
        btnCompra.setFont(new java.awt.Font("Lora", 1, 16)); // NOI18N
        btnCompra.setForeground(new java.awt.Color(241, 250, 238));
        btnCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconBuy241.png"))); // NOI18N
        btnCompra.setText("Compra");
        btnCompra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCompra.setMaximumSize(new java.awt.Dimension(121, 41));
        btnCompra.setMinimumSize(new java.awt.Dimension(121, 41));
        btnCompra.setPreferredSize(new java.awt.Dimension(121, 41));
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });
        panelBotonesCompra.add(btnCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 45, 160, 30));

        btnDistribuidor.setBackground(new java.awt.Color(29, 53, 87));
        btnDistribuidor.setFont(new java.awt.Font("Lora", 1, 16)); // NOI18N
        btnDistribuidor.setForeground(new java.awt.Color(241, 250, 238));
        btnDistribuidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconDist24.png"))); // NOI18N
        btnDistribuidor.setText(" Distribuidor");
        btnDistribuidor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDistribuidor.setMaximumSize(new java.awt.Dimension(121, 41));
        btnDistribuidor.setMinimumSize(new java.awt.Dimension(121, 41));
        btnDistribuidor.setPreferredSize(new java.awt.Dimension(121, 41));
        btnDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistribuidorActionPerformed(evt);
            }
        });
        panelBotonesCompra.add(btnDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 80, 160, 30));

        btnAdminCompras.setBackground(new java.awt.Color(29, 53, 87));
        btnAdminCompras.setFont(new java.awt.Font("Lora", 1, 16)); // NOI18N
        btnAdminCompras.setForeground(new java.awt.Color(241, 250, 238));
        btnAdminCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconInvoice241.png"))); // NOI18N
        btnAdminCompras.setText("Facturas");
        btnAdminCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdminCompras.setName(""); // NOI18N
        btnAdminCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdminComprasMouseEntered(evt);
            }
        });
        btnAdminCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminComprasActionPerformed(evt);
            }
        });
        panelBotonesCompra.add(btnAdminCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 115, 160, 30));
        btnDetalles.setVisible(false);

        panelBarraNavegacionLat.add(panelBotonesCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 203, 170, 160));
        panelBotonesCompra.setVisible(false);

        btnLibros.setBackground(new java.awt.Color(29, 53, 87));
        btnLibros.setFont(new java.awt.Font("Lora", 1, 22)); // NOI18N
        btnLibros.setForeground(new java.awt.Color(241, 250, 238));
        btnLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconBook32.png"))); // NOI18N
        btnLibros.setText("Libros");
        btnLibros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLibros.setMaximumSize(new java.awt.Dimension(121, 41));
        btnLibros.setMinimumSize(new java.awt.Dimension(121, 41));
        btnLibros.setPreferredSize(new java.awt.Dimension(121, 41));
        btnLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLibrosMouseEntered(evt);
            }
        });
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });
        panelBarraNavegacionLat.add(btnLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 180, 40));

        panelBotonesLibro.setBackground(new java.awt.Color(38, 69, 114));
        panelBotonesLibro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        panelBotonesLibro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLibro.setBackground(new java.awt.Color(29, 53, 87));
        btnLibro.setFont(new java.awt.Font("Lora", 1, 16)); // NOI18N
        btnLibro.setForeground(new java.awt.Color(241, 250, 238));
        btnLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconAddBook24.png"))); // NOI18N
        btnLibro.setText("Libro");
        btnLibro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLibro.setName(""); // NOI18N
        btnLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLibroMouseEntered(evt);
            }
        });
        btnLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibroActionPerformed(evt);
            }
        });
        panelBotonesLibro.add(btnLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 45, 160, 30));

        btnAutor.setBackground(new java.awt.Color(29, 53, 87));
        btnAutor.setFont(new java.awt.Font("Lora", 1, 16)); // NOI18N
        btnAutor.setForeground(new java.awt.Color(241, 250, 238));
        btnAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconAutor24.png"))); // NOI18N
        btnAutor.setText("  Autor");
        btnAutor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAutorMouseEntered(evt);
            }
        });
        btnAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorActionPerformed(evt);
            }
        });
        panelBotonesLibro.add(btnAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 80, 160, 30));

        btnDetalles.setBackground(new java.awt.Color(29, 53, 87));
        btnDetalles.setFont(new java.awt.Font("Lora", 1, 16)); // NOI18N
        btnDetalles.setForeground(new java.awt.Color(241, 250, 238));
        btnDetalles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconDetails24.png"))); // NOI18N
        btnDetalles.setText(" Detalles");
        btnDetalles.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDetalles.setName(""); // NOI18N
        btnDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDetallesMouseEntered(evt);
            }
        });
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });
        panelBotonesLibro.add(btnDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 115, 160, 30));
        btnDetalles.setVisible(true);

        panelBarraNavegacionLat.add(panelBotonesLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 253, 170, 160));
        panelBotonesLibro.setVisible(false);

        getContentPane().add(panelBarraNavegacionLat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 770));
        panelBarraNavegacionLat.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseMoved(MouseEvent e) {
                if(panelBotonesCompra.isVisible()){
                    Point p = e.getPoint();
                    int px = p.x;
                    int py = p.y;

                    Point pIniPanelBotonesCompra = panelBotonesCompra.getLocation();
                    int cix = pIniPanelBotonesCompra.x;
                    int ciy = pIniPanelBotonesCompra.y;
                    int cfx = cix+panelBotonesCompra.getWidth();
                    int cfy = ciy+panelBotonesCompra.getHeight();

                    if(px<cix || px>cfx || py<ciy || py>cfy){
                        panelBarraNavegacionLat.setLayout(null);
                        panelBotonesCompra.setVisible(false);
                        btnLibros.setLocation(btnLibros.getX(), 250);
                    }
                }else if(panelBotonesLibro.isVisible()){
                    Point p = e.getPoint();
                    int px = p.x;
                    int py = p.y;

                    Point panel = panelBotonesLibro.getLocation();
                    int cix = panel.x;
                    int ciy = panel.y;
                    int cfx = cix+panelBotonesLibro.getWidth();
                    int cfy = ciy+panelBotonesLibro.getHeight();

                    if(px<cix || px>cfx || py<ciy || py>cfy){
                        panelBarraNavegacionLat.setLayout(null);
                        panelBotonesLibro.setVisible(false);
                    }
                }
            }
            @Override
            public void mouseDragged(MouseEvent e) {
                /*hoveredRow = hoveredColumn = -1;
                tableLibroConsulta.repaint();*/
            }
        });

        panelOtro.setBackground(new java.awt.Color(251, 251, 242));
        panelOtro.setName("Inicio"); // NOI18N
        panelOtro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lora", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html>\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Biblioteca<br>\nFast Development<html/>");
        panelOtro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 920, 220));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 251, 242)));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(251, 251, 242));
        jTextPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 251, 242)));
        jTextPane1.setContentType("text/html"); // NOI18N
        jTextPane1.setFont(new java.awt.Font("Monospaced", 2, 16)); // NOI18N
        jTextPane1.setText("<html>\n\t<body bgcolor=\"#FBFBF2\">\n\t\t<p align=\"justify\">\"Cada libro, cada volumen que ves aquí, tiene un alma. El alma de la \t\t\tpersona que lo escribió y de aquellos que lo leyeron, vivieron y soñaron con él. Cada \t\t\tvez que un libro cambia de manos, cada vez que alguien baja sus ojos a las páginas, su \t\t\tespíritu crece y se fortalece.\" </p>\n\t\t<p align=\"right\"><b>La Sombra del Viento - Carlos Ruiz Zafón</b></p>\n\t</body>\n</html>");
        jScrollPane3.setViewportView(jTextPane1);

        panelOtro.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 560, 190));

        getContentPane().add(panelOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 925, 770));
        paneles.add(panelOtro);

        panelDistribuidor.setBackground(new java.awt.Color(251, 251, 242));
        panelDistribuidor.setName("Distribuidor"); // NOI18N
        panelDistribuidor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarDist.setBackground(new java.awt.Color(29, 53, 87));
        btnEliminarDist.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarDist.setForeground(new java.awt.Color(241, 250, 238));
        btnEliminarDist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconTrash.png"))); // NOI18N
        btnEliminarDist.setText("Eliminar");
        btnEliminarDist.setEnabled(false);
        btnEliminarDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDistActionPerformed(evt);
            }
        });
        panelDistribuidor.add(btnEliminarDist, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 700, -1, 30));

        btnEditarDist.setBackground(new java.awt.Color(29, 53, 87));
        btnEditarDist.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarDist.setForeground(new java.awt.Color(241, 250, 238));
        btnEditarDist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconEdit.png"))); // NOI18N
        btnEditarDist.setText("Editar");
        btnEditarDist.setEnabled(false);
        btnEditarDist.setMaximumSize(new java.awt.Dimension(115, 33));
        btnEditarDist.setMinimumSize(new java.awt.Dimension(115, 33));
        btnEditarDist.setPreferredSize(new java.awt.Dimension(115, 33));
        btnEditarDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDistActionPerformed(evt);
            }
        });
        panelDistribuidor.add(btnEditarDist, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 700, 110, 30));

        txtNuevoDistRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNuevoDistRutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNuevoDistRutFocusLost(evt);
            }
        });
        txtNuevoDistRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNuevoDistRutKeyTyped(evt);
            }
        });
        panelDistribuidor.add(txtNuevoDistRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 130, 30));
        InputMap rutdismap = txtNuevoDistRut.getInputMap(JTextField.WHEN_FOCUSED);
        rutdismap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        txtNuevoDistNom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNuevoDistNomFocusLost(evt);
            }
        });
        txtNuevoDistNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNuevoDistNomKeyTyped(evt);
            }
        });
        panelDistribuidor.add(txtNuevoDistNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 180, 30));
        InputMap nomdismap = txtNuevoDistNom.getInputMap(JTextField.WHEN_FOCUSED);
        nomdismap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        txtNuevoDistDVrut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNuevoDistDVrutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNuevoDistDVrutFocusLost(evt);
            }
        });
        txtNuevoDistDVrut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNuevoDistDVrutKeyTyped(evt);
            }
        });
        panelDistribuidor.add(txtNuevoDistDVrut, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 30, 30));
        InputMap dvrutdismap = txtNuevoDistDVrut.getInputMap(JTextField.WHEN_FOCUSED);
        dvrutdismap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        yearChooserNuevoDist.setDayChooser(null);
        yearChooserNuevoDist.setEndYear(2018);
        yearChooserNuevoDist.setStartYear(1970);
        panelDistribuidor.add(yearChooserNuevoDist, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 80, 30));
        spinner = (JSpinner)yearChooserNuevoDist.getSpinner();
        ((javax.swing.JTextField)spinner.getEditor()).setEditable(false);

        txtNuevoDisNroT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNuevoDisNroTKeyTyped(evt);
            }
        });
        panelDistribuidor.add(txtNuevoDisNroT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 180, 30));
        InputMap teldismap = txtNuevoDisNroT.getInputMap(JTextField.WHEN_FOCUSED);
        teldismap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        txtNuevoDisDir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNuevoDisDirFocusLost(evt);
            }
        });
        txtNuevoDisDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNuevoDisDirKeyTyped(evt);
            }
        });
        panelDistribuidor.add(txtNuevoDisDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 460, 30));
        InputMap dirdismap = txtNuevoDisDir.getInputMap(JTextField.WHEN_FOCUSED);
        dirdismap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        btnRegNuevDis.setBackground(new java.awt.Color(29, 53, 87));
        btnRegNuevDis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegNuevDis.setForeground(new java.awt.Color(241, 250, 238));
        btnRegNuevDis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCheck.png"))); // NOI18N
        btnRegNuevDis.setText("Registrar");
        btnRegNuevDis.setMaximumSize(new java.awt.Dimension(115, 33));
        btnRegNuevDis.setMinimumSize(new java.awt.Dimension(115, 33));
        btnRegNuevDis.setPreferredSize(new java.awt.Dimension(115, 33));
        btnRegNuevDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegNuevDisActionPerformed(evt);
            }
        });
        panelDistribuidor.add(btnRegNuevDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 160, 30));

        btnLimpCampNuevDis.setBackground(new java.awt.Color(29, 53, 87));
        btnLimpCampNuevDis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpCampNuevDis.setForeground(new java.awt.Color(241, 250, 238));
        btnLimpCampNuevDis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconBroom.png"))); // NOI18N
        btnLimpCampNuevDis.setText("Limpiar");
        btnLimpCampNuevDis.setMaximumSize(new java.awt.Dimension(115, 33));
        btnLimpCampNuevDis.setMinimumSize(new java.awt.Dimension(115, 33));
        btnLimpCampNuevDis.setPreferredSize(new java.awt.Dimension(115, 33));
        btnLimpCampNuevDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpCampNuevDisActionPerformed(evt);
            }
        });
        panelDistribuidor.add(btnLimpCampNuevDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 150, 30));

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel94.setText("Teléfono:");
        panelDistribuidor.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 70, 30));

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel95.setText("Nombre:");
        panelDistribuidor.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 60, 30));

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel96.setText("RUT:");
        panelDistribuidor.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 40, 30));

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel98.setText("Dirección:");
        panelDistribuidor.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 70, 30));

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel100.setText("Año Convenio:");
        panelDistribuidor.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 110, 30));

        jLabel29.setForeground(java.awt.Color.gray);
        jLabel29.setText(" Ejemplo: 12345678   -     4");
        panelDistribuidor.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 180, -1));

        lblNuevoDistRutexiste.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelDistribuidor.add(lblNuevoDistRutexiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 130, 20));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("-");
        panelDistribuidor.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 20, 30));

        lblModDist.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Distribuidor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 16), java.awt.Color.darkGray)); // NOI18N
        panelDistribuidor.add(lblModDist, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 780, 290));

        buttonGroupDist.add(rdConsDisCod);
        rdConsDisCod.setText("Código:");
        rdConsDisCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsDisCodActionPerformed(evt);
            }
        });
        panelDistribuidor.add(rdConsDisCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        buttonGroupDist.add(rdConsDisRut);
        rdConsDisRut.setText("Rut:");
        rdConsDisRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsDisRutActionPerformed(evt);
            }
        });
        panelDistribuidor.add(rdConsDisRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, -1, -1));

        buttonGroupDist.add(rdConsDisNom);
        rdConsDisNom.setText("Nombre:");
        rdConsDisNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsDisNomActionPerformed(evt);
            }
        });
        panelDistribuidor.add(rdConsDisNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));

        txtCodConsDis.setEnabled(false);
        txtCodConsDis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodConsDisKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodConsDisKeyTyped(evt);
            }
        });
        panelDistribuidor.add(txtCodConsDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 100, 30));
        InputMap coddisConmap = txtCodConsDis.getInputMap(JTextField.WHEN_FOCUSED);
        coddisConmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        txtNomConsDis.setEnabled(false);
        txtNomConsDis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomConsDisKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomConsDisKeyTyped(evt);
            }
        });
        panelDistribuidor.add(txtNomConsDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 160, 30));
        InputMap nomdisConmap = txtNomConsDis.getInputMap(JTextField.WHEN_FOCUSED);
        nomdisConmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        buttonGroupDist.add(rdConsDisTodo);
        rdConsDisTodo.setSelected(true);
        rdConsDisTodo.setText("Todo");
        rdConsDisTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsDisTodoActionPerformed(evt);
            }
        });
        panelDistribuidor.add(rdConsDisTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        jLabel53.setForeground(java.awt.Color.gray);
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Sin dígito verificador");
        panelDistribuidor.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 150, -1));

        txtRutConsDis.setEnabled(false);
        txtRutConsDis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutConsDisKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutConsDisKeyTyped(evt);
            }
        });
        panelDistribuidor.add(txtRutConsDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 110, 30));
        InputMap rutdisConmap = txtRutConsDis.getInputMap(JTextField.WHEN_FOCUSED);
        rutdisConmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        tablaDistCons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUT", "NOMBRE", "AÑO CONV", "TELEFONO", "DIRECCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDistCons.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaDistCons.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaDistCons);
        if (tablaDistCons.getColumnModel().getColumnCount() > 0) {
            tablaDistCons.getColumnModel().getColumn(0).setResizable(false);
            tablaDistCons.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaDistCons.getColumnModel().getColumn(1).setResizable(false);
            tablaDistCons.getColumnModel().getColumn(1).setPreferredWidth(90);
            tablaDistCons.getColumnModel().getColumn(2).setResizable(false);
            tablaDistCons.getColumnModel().getColumn(2).setPreferredWidth(200);
            tablaDistCons.getColumnModel().getColumn(3).setResizable(false);
            tablaDistCons.getColumnModel().getColumn(3).setPreferredWidth(90);
            tablaDistCons.getColumnModel().getColumn(4).setResizable(false);
            tablaDistCons.getColumnModel().getColumn(4).setPreferredWidth(100);
            tablaDistCons.getColumnModel().getColumn(5).setResizable(false);
            tablaDistCons.getColumnModel().getColumn(5).setPreferredWidth(300);
        }
        consultaDistribuidor();
        selectionTableListener(btnEditarDist, btnEliminarDist, tablaDistCons);

        panelDistribuidor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 820, 190));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda Distribuidor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 16), java.awt.Color.darkGray)); // NOI18N
        panelDistribuidor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 910, 380));

        getContentPane().add(panelDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 925, 770));
        panelDistribuidor.setVisible(false);
        paneles.add(panelDistribuidor);

        panelAutor.setBackground(new java.awt.Color(251, 251, 242));
        panelAutor.setName("Autor"); // NOI18N
        panelAutor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigoAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigoAutor.setForeground(java.awt.Color.lightGray);
        lblCodigoAutor.setText("Código:");
        panelAutor.add(lblCodigoAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 60, -1));
        lblCodigoAutor.setVisible(false);

        lblCodigoAutor1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigoAutor1.setForeground(java.awt.Color.lightGray);
        panelAutor.add(lblCodigoAutor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 130, 20));
        lblCodigoAutor1.setVisible(false);

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel105.setText("Nombre:");
        panelAutor.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 70, 30));

        txtAutorNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAutorNombreFocusLost(evt);
            }
        });
        txtAutorNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutorNombreKeyTyped(evt);
            }
        });
        panelAutor.add(txtAutorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 190, 30));
        InputMap nomautmap = txtAutorNombre.getInputMap(JTextField.WHEN_FOCUSED);
        nomautmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel99.setText("Apellido Paterno:");
        panelAutor.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 120, -1, 30));

        txtAutorApeP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAutorApePFocusLost(evt);
            }
        });
        txtAutorApeP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutorApePKeyTyped(evt);
            }
        });
        panelAutor.add(txtAutorApeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 190, 30));
        InputMap apepautmap = txtAutorApeP.getInputMap(JTextField.WHEN_FOCUSED);
        apepautmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel104.setText("Apellido Materno:");
        panelAutor.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 130, 30));

        txtAutorApeM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAutorApeMFocusLost(evt);
            }
        });
        txtAutorApeM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutorApeMKeyTyped(evt);
            }
        });
        panelAutor.add(txtAutorApeM, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 190, 30));
        InputMap apemautmap = txtAutorApeM.getInputMap(JTextField.WHEN_FOCUSED);
        apemautmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        btnAutEliminar.setBackground(new java.awt.Color(29, 53, 87));
        btnAutEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAutEliminar.setForeground(new java.awt.Color(241, 250, 238));
        btnAutEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconTrash.png"))); // NOI18N
        btnAutEliminar.setText("Eliminar");
        btnAutEliminar.setEnabled(false);
        btnAutEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutEliminarActionPerformed(evt);
            }
        });
        panelAutor.add(btnAutEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 680, -1, 30));

        btnAutEditar.setBackground(new java.awt.Color(29, 53, 87));
        btnAutEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAutEditar.setForeground(new java.awt.Color(241, 250, 238));
        btnAutEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconEdit.png"))); // NOI18N
        btnAutEditar.setText("Editar");
        btnAutEditar.setEnabled(false);
        btnAutEditar.setMaximumSize(new java.awt.Dimension(115, 33));
        btnAutEditar.setMinimumSize(new java.awt.Dimension(115, 33));
        btnAutEditar.setPreferredSize(new java.awt.Dimension(115, 33));
        btnAutEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutEditarActionPerformed(evt);
            }
        });
        panelAutor.add(btnAutEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 680, 110, 30));

        btnRegAutor.setBackground(new java.awt.Color(29, 53, 87));
        btnRegAutor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegAutor.setForeground(new java.awt.Color(241, 250, 238));
        btnRegAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCheck.png"))); // NOI18N
        btnRegAutor.setText("Registrar");
        btnRegAutor.setMaximumSize(new java.awt.Dimension(115, 33));
        btnRegAutor.setMinimumSize(new java.awt.Dimension(115, 33));
        btnRegAutor.setPreferredSize(new java.awt.Dimension(115, 33));
        btnRegAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAutorActionPerformed(evt);
            }
        });
        panelAutor.add(btnRegAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 160, 30));

        btnLimpAutor.setBackground(new java.awt.Color(29, 53, 87));
        btnLimpAutor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpAutor.setForeground(new java.awt.Color(241, 250, 238));
        btnLimpAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconBroom.png"))); // NOI18N
        btnLimpAutor.setText("Limpiar");
        btnLimpAutor.setMaximumSize(new java.awt.Dimension(115, 33));
        btnLimpAutor.setMinimumSize(new java.awt.Dimension(115, 33));
        btnLimpAutor.setPreferredSize(new java.awt.Dimension(115, 33));
        btnLimpAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpAutorActionPerformed(evt);
            }
        });
        panelAutor.add(btnLimpAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 150, 30));

        rdConsAutCod.setBackground(new java.awt.Color(251, 251, 242));
        buttonGroupAut.add(rdConsAutCod);
        rdConsAutCod.setText("Código:");
        rdConsAutCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsAutCodActionPerformed(evt);
            }
        });
        panelAutor.add(rdConsAutCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 90, 30));

        rdConsAutApes.setBackground(new java.awt.Color(251, 251, 242));
        buttonGroupAut.add(rdConsAutApes);
        rdConsAutApes.setText("Apellidos:");
        rdConsAutApes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsAutApesActionPerformed(evt);
            }
        });
        panelAutor.add(rdConsAutApes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, 90, 30));

        rdConsAutNom.setBackground(new java.awt.Color(251, 251, 242));
        buttonGroupAut.add(rdConsAutNom);
        rdConsAutNom.setText("Nombre:");
        rdConsAutNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsAutNomActionPerformed(evt);
            }
        });
        panelAutor.add(rdConsAutNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 90, 30));

        txtAutorCodCons.setEnabled(false);
        txtAutorCodCons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAutorCodConsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutorCodConsKeyTyped(evt);
            }
        });
        panelAutor.add(txtAutorCodCons, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 120, 30));
        InputMap codautConmap = txtAutorCodCons.getInputMap(JTextField.WHEN_FOCUSED);
        codautConmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        txtAutorNombreCons.setEnabled(false);
        txtAutorNombreCons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAutorNombreConsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutorNombreConsKeyTyped(evt);
            }
        });
        panelAutor.add(txtAutorNombreCons, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 120, 30));
        InputMap nomautConmap = txtAutorNombreCons.getInputMap(JTextField.WHEN_FOCUSED);
        nomautConmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        rdConsAutTodo.setBackground(new java.awt.Color(251, 251, 242));
        buttonGroupAut.add(rdConsAutTodo);
        rdConsAutTodo.setSelected(true);
        rdConsAutTodo.setText("Todo");
        rdConsAutTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsAutTodoActionPerformed(evt);
            }
        });
        panelAutor.add(rdConsAutTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 110, -1));

        txtAutorApesCons.setEnabled(false);
        txtAutorApesCons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAutorApesConsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutorApesConsKeyTyped(evt);
            }
        });
        panelAutor.add(txtAutorApesCons, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, 120, 30));
        InputMap apesautConmap = txtAutorApesCons.getInputMap(JTextField.WHEN_FOCUSED);
        apesautConmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        tablaAutCons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO P", "APELLIDO M"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAutCons.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaAutCons.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tablaAutCons);
        if (tablaAutCons.getColumnModel().getColumnCount() > 0) {
            tablaAutCons.getColumnModel().getColumn(0).setMinWidth(30);
            tablaAutCons.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaAutCons.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaAutCons.getColumnModel().getColumn(1).setMinWidth(100);
            tablaAutCons.getColumnModel().getColumn(2).setMinWidth(100);
            tablaAutCons.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaAutCons.getColumnModel().getColumn(3).setMinWidth(100);
            tablaAutCons.getColumnModel().getColumn(3).setPreferredWidth(100);
        }
        ArrayListToTable(tablaAutCons, Aut.getAllAutor());
        selectionTableListener(btnAutEditar, btnAutEliminar, tablaAutCons);

        panelAutor.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 450, 260));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda Autor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 16), java.awt.Color.darkGray)); // NOI18N
        panelAutor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 780, 380));

        lblCuadroAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Autor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 16), java.awt.Color.darkGray)); // NOI18N
        panelAutor.add(lblCuadroAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 720, 290));

        getContentPane().add(panelAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 925, 770));
        panelAutor.setVisible(false);
        paneles.add(panelAutor);

        panelDetallesLibro.setBackground(new java.awt.Color(251, 251, 242));
        panelDetallesLibro.setEnabled(false);
        panelDetallesLibro.setName("Detalles"); // NOI18N
        panelDetallesLibro.setPreferredSize(new java.awt.Dimension(860, 730));
        panelDetallesLibro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subPanelIdioma.setBackground(new java.awt.Color(251, 251, 242));
        subPanelIdioma.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Idioma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lora", 1, 18))); // NOI18N
        subPanelIdioma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigoIdioma1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigoIdioma1.setForeground(java.awt.Color.lightGray);
        subPanelIdioma.add(lblCodigoIdioma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 80, 30));

        lblCodigoIdioma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigoIdioma.setForeground(java.awt.Color.lightGray);
        lblCodigoIdioma.setText("Código:");
        subPanelIdioma.add(lblCodigoIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, 30));
        lblCodigoIdioma.setVisible(false);

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setText("Idioma:");
        subPanelIdioma.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 70, 30));

        txtIdioma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdiomaFocusLost(evt);
            }
        });
        txtIdioma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdiomaKeyTyped(evt);
            }
        });
        subPanelIdioma.add(txtIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 190, 30));
        InputMap idimap = txtIdioma.getInputMap(JTextField.WHEN_FOCUSED);
        idimap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        btnRegIdioma.setBackground(new java.awt.Color(29, 53, 87));
        btnRegIdioma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegIdioma.setForeground(new java.awt.Color(241, 250, 238));
        btnRegIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCheck.png"))); // NOI18N
        btnRegIdioma.setText("Registrar");
        btnRegIdioma.setMaximumSize(new java.awt.Dimension(115, 33));
        btnRegIdioma.setMinimumSize(new java.awt.Dimension(115, 33));
        btnRegIdioma.setPreferredSize(new java.awt.Dimension(115, 33));
        btnRegIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegIdiomaActionPerformed(evt);
            }
        });
        subPanelIdioma.add(btnRegIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 130, 30));

        btnCancelEditorial.setBackground(new java.awt.Color(29, 53, 87));
        btnCancelEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCancel24.png"))); // NOI18N
        btnCancelEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelEditorialActionPerformed(evt);
            }
        });
        subPanelIdioma.add(btnCancelEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 40, 30));
        btnCancelEditorial.setVisible(false);

        rdConsIdioTodo.setBackground(new java.awt.Color(251, 251, 242));
        buttonGroupIdi.add(rdConsIdioTodo);
        rdConsIdioTodo.setSelected(true);
        rdConsIdioTodo.setText("Todo");
        rdConsIdioTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsIdioTodoActionPerformed(evt);
            }
        });
        subPanelIdioma.add(rdConsIdioTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 110, -1));

        rdConsIdioCod.setBackground(new java.awt.Color(251, 251, 242));
        buttonGroupIdi.add(rdConsIdioCod);
        rdConsIdioCod.setText("Código:");
        rdConsIdioCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsIdioCodActionPerformed(evt);
            }
        });
        subPanelIdioma.add(rdConsIdioCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 80, 30));

        txtIdioCodCons.setEnabled(false);
        txtIdioCodCons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdioCodConsKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdioCodConsKeyReleased(evt);
            }
        });
        subPanelIdioma.add(txtIdioCodCons, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 110, 30));
        InputMap codIdiConmap = txtIdioCodCons.getInputMap(JTextField.WHEN_FOCUSED);
        codIdiConmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        rdConsIdioma.setBackground(new java.awt.Color(251, 251, 242));
        buttonGroupIdi.add(rdConsIdioma);
        rdConsIdioma.setText("Idioma:");
        rdConsIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsIdiomaActionPerformed(evt);
            }
        });
        subPanelIdioma.add(rdConsIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 80, 30));

        txtIdiomaCons.setEnabled(false);
        txtIdiomaCons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdiomaConsKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdiomaConsKeyReleased(evt);
            }
        });
        subPanelIdioma.add(txtIdiomaCons, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 110, 30));
        InputMap idiConmap = txtIdiomaCons.getInputMap(JTextField.WHEN_FOCUSED);
        idiConmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        tablaIdiomaCons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "IDIOMA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaIdiomaCons.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaIdiomaCons.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tablaIdiomaCons);
        if (tablaIdiomaCons.getColumnModel().getColumnCount() > 0) {
            tablaIdiomaCons.getColumnModel().getColumn(0).setMinWidth(30);
            tablaIdiomaCons.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaIdiomaCons.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaIdiomaCons.getColumnModel().getColumn(1).setMinWidth(100);
        }
        ArrayListToTable(tablaIdiomaCons, Idi.getAllIdiomas());
        selectionTableListener(btnIdiomaEditar, btnIdiomaEliminar, tablaIdiomaCons);

        subPanelIdioma.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 250, 150));

        btnIdiomaEditar.setBackground(new java.awt.Color(29, 53, 87));
        btnIdiomaEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIdiomaEditar.setForeground(new java.awt.Color(241, 250, 238));
        btnIdiomaEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconEdit.png"))); // NOI18N
        btnIdiomaEditar.setText("Editar");
        btnIdiomaEditar.setEnabled(false);
        btnIdiomaEditar.setMaximumSize(new java.awt.Dimension(115, 33));
        btnIdiomaEditar.setMinimumSize(new java.awt.Dimension(115, 33));
        btnIdiomaEditar.setPreferredSize(new java.awt.Dimension(115, 33));
        btnIdiomaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdiomaEditarActionPerformed(evt);
            }
        });
        subPanelIdioma.add(btnIdiomaEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 110, 30));

        btnIdiomaEliminar.setBackground(new java.awt.Color(29, 53, 87));
        btnIdiomaEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIdiomaEliminar.setForeground(new java.awt.Color(241, 250, 238));
        btnIdiomaEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconTrash.png"))); // NOI18N
        btnIdiomaEliminar.setText("Eliminar");
        btnIdiomaEliminar.setEnabled(false);
        btnIdiomaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdiomaEliminarActionPerformed(evt);
            }
        });
        subPanelIdioma.add(btnIdiomaEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, -1, 30));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        subPanelIdioma.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 10, 180));

        btnCancelIdioma.setBackground(new java.awt.Color(29, 53, 87));
        btnCancelIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCancel24.png"))); // NOI18N
        btnCancelIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelIdiomaActionPerformed(evt);
            }
        });
        subPanelIdioma.add(btnCancelIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 40, 30));
        btnCancelIdioma.setVisible(false);

        panelDetallesLibro.add(subPanelIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 850, 250));

        subPanelCategoria.setBackground(new java.awt.Color(251, 251, 242));
        subPanelCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoría", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lora", 1, 18))); // NOI18N
        subPanelCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigoCategoria1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigoCategoria1.setForeground(java.awt.Color.lightGray);
        subPanelCategoria.add(lblCodigoCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 80, 30));

        lblCodigoCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigoCategoria.setForeground(java.awt.Color.lightGray);
        lblCodigoCategoria.setText("Código:");
        subPanelCategoria.add(lblCodigoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, 30));
        lblCodigoCategoria.setVisible(false);

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel107.setText("Categoría:");
        subPanelCategoria.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, 30));

        txtCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCategoriaFocusLost(evt);
            }
        });
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyTyped(evt);
            }
        });
        subPanelCategoria.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 190, 30));
        InputMap catmap = txtCategoria.getInputMap(JTextField.WHEN_FOCUSED);
        catmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        btnRegCategoria.setBackground(new java.awt.Color(29, 53, 87));
        btnRegCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegCategoria.setForeground(new java.awt.Color(241, 250, 238));
        btnRegCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCheck.png"))); // NOI18N
        btnRegCategoria.setText("Registrar");
        btnRegCategoria.setMaximumSize(new java.awt.Dimension(115, 33));
        btnRegCategoria.setMinimumSize(new java.awt.Dimension(115, 33));
        btnRegCategoria.setPreferredSize(new java.awt.Dimension(115, 33));
        btnRegCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegCategoriaActionPerformed(evt);
            }
        });
        subPanelCategoria.add(btnRegCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 130, 30));

        rdConsCatTodo.setBackground(new java.awt.Color(251, 251, 242));
        buttonGroupCat.add(rdConsCatTodo);
        rdConsCatTodo.setSelected(true);
        rdConsCatTodo.setText("Todo");
        rdConsCatTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsCatTodoActionPerformed(evt);
            }
        });
        subPanelCategoria.add(rdConsCatTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 120, -1));

        rdConsCatCod.setBackground(new java.awt.Color(251, 251, 242));
        buttonGroupCat.add(rdConsCatCod);
        rdConsCatCod.setText("Código:");
        rdConsCatCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsCatCodActionPerformed(evt);
            }
        });
        subPanelCategoria.add(rdConsCatCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 90, 30));

        txtCatCodCons.setEnabled(false);
        txtCatCodCons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCatCodConsKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCatCodConsKeyReleased(evt);
            }
        });
        subPanelCategoria.add(txtCatCodCons, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 110, 30));
        InputMap codCatConmap = txtCatCodCons.getInputMap(JTextField.WHEN_FOCUSED);
        codCatConmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        rdConsCategoria.setBackground(new java.awt.Color(251, 251, 242));
        buttonGroupCat.add(rdConsCategoria);
        rdConsCategoria.setText("Categoría:");
        rdConsCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsCategoriaActionPerformed(evt);
            }
        });
        subPanelCategoria.add(rdConsCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 90, 30));

        txtCategoriaCons.setEnabled(false);
        txtCategoriaCons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaConsKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCategoriaConsKeyReleased(evt);
            }
        });
        subPanelCategoria.add(txtCategoriaCons, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 110, 30));
        InputMap catConmap = txtCategoriaCons.getInputMap(JTextField.WHEN_FOCUSED);
        catConmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        tablaCategoriaCons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CATEGORIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCategoriaCons.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaCategoriaCons.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tablaCategoriaCons);
        if (tablaCategoriaCons.getColumnModel().getColumnCount() > 0) {
            tablaCategoriaCons.getColumnModel().getColumn(0).setMinWidth(30);
            tablaCategoriaCons.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaCategoriaCons.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaCategoriaCons.getColumnModel().getColumn(1).setMinWidth(100);
        }
        ArrayListToTable(tablaCategoriaCons, Cat.getAllCategorias());
        selectionTableListener(btnCatEditar, btnCatEliminar, tablaCategoriaCons);

        subPanelCategoria.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 250, 150));

        btnCatEditar.setBackground(new java.awt.Color(29, 53, 87));
        btnCatEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCatEditar.setForeground(new java.awt.Color(241, 250, 238));
        btnCatEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconEdit.png"))); // NOI18N
        btnCatEditar.setText("Editar");
        btnCatEditar.setEnabled(false);
        btnCatEditar.setMaximumSize(new java.awt.Dimension(115, 33));
        btnCatEditar.setMinimumSize(new java.awt.Dimension(115, 33));
        btnCatEditar.setPreferredSize(new java.awt.Dimension(115, 33));
        btnCatEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatEditarActionPerformed(evt);
            }
        });
        subPanelCategoria.add(btnCatEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 110, 30));

        btnCatEliminar.setBackground(new java.awt.Color(29, 53, 87));
        btnCatEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCatEliminar.setForeground(new java.awt.Color(241, 250, 238));
        btnCatEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconTrash.png"))); // NOI18N
        btnCatEliminar.setText("Eliminar");
        btnCatEliminar.setEnabled(false);
        btnCatEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatEliminarActionPerformed(evt);
            }
        });
        subPanelCategoria.add(btnCatEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, 30));

        btnCancelCategoria.setBackground(new java.awt.Color(29, 53, 87));
        btnCancelCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCancel24.png"))); // NOI18N
        btnCancelCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelCategoriaActionPerformed(evt);
            }
        });
        subPanelCategoria.add(btnCancelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 40, 30));
        btnCancelCategoria.setVisible(false);

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        subPanelCategoria.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 10, 180));

        panelDetallesLibro.add(subPanelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 850, 250));

        subPanelEditorial.setBackground(new java.awt.Color(251, 251, 242));
        subPanelEditorial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editorial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lora", 1, 18))); // NOI18N
        subPanelEditorial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigoEditorial1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigoEditorial1.setForeground(java.awt.Color.lightGray);
        subPanelEditorial.add(lblCodigoEditorial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 80, 30));

        lblCodigoEditorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigoEditorial.setForeground(java.awt.Color.lightGray);
        lblCodigoEditorial.setText("Código:");
        subPanelEditorial.add(lblCodigoEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, 30));
        lblCodigoEditorial.setVisible(false);

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setText("Editorial:");
        subPanelEditorial.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 70, 30));

        txtEditorial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEditorialFocusLost(evt);
            }
        });
        txtEditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditorialKeyTyped(evt);
            }
        });
        subPanelEditorial.add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 190, 30));
        InputMap edimap = txtEditorial.getInputMap(JTextField.WHEN_FOCUSED);
        edimap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        btnRegEditorial.setBackground(new java.awt.Color(29, 53, 87));
        btnRegEditorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegEditorial.setForeground(new java.awt.Color(241, 250, 238));
        btnRegEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCheck.png"))); // NOI18N
        btnRegEditorial.setText("Registrar");
        btnRegEditorial.setMaximumSize(new java.awt.Dimension(115, 33));
        btnRegEditorial.setMinimumSize(new java.awt.Dimension(115, 33));
        btnRegEditorial.setPreferredSize(new java.awt.Dimension(115, 33));
        btnRegEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegEditorialActionPerformed(evt);
            }
        });
        subPanelEditorial.add(btnRegEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 130, 30));

        rdConsEdiTodo.setBackground(new java.awt.Color(251, 251, 242));
        buttonGroupEdi.add(rdConsEdiTodo);
        rdConsEdiTodo.setSelected(true);
        rdConsEdiTodo.setText("Todo");
        rdConsEdiTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsEdiTodoActionPerformed(evt);
            }
        });
        subPanelEditorial.add(rdConsEdiTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 110, -1));

        rdConsEdiCod.setBackground(new java.awt.Color(251, 251, 242));
        buttonGroupEdi.add(rdConsEdiCod);
        rdConsEdiCod.setText("Código:");
        rdConsEdiCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsEdiCodActionPerformed(evt);
            }
        });
        subPanelEditorial.add(rdConsEdiCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 80, 30));

        txtEdiCodCons.setEnabled(false);
        txtEdiCodCons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdiCodConsKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEdiCodConsKeyReleased(evt);
            }
        });
        subPanelEditorial.add(txtEdiCodCons, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 110, 30));
        InputMap codEdiConmap = txtEdiCodCons.getInputMap(JTextField.WHEN_FOCUSED);
        codEdiConmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        rdConsEditorial.setBackground(new java.awt.Color(251, 251, 242));
        buttonGroupEdi.add(rdConsEditorial);
        rdConsEditorial.setText("Editorial:");
        rdConsEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsEditorialActionPerformed(evt);
            }
        });
        subPanelEditorial.add(rdConsEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 80, 30));

        txtEditorialCons.setEnabled(false);
        txtEditorialCons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditorialConsKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEditorialConsKeyReleased(evt);
            }
        });
        subPanelEditorial.add(txtEditorialCons, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 110, 30));
        InputMap ediConmap = txtEditorialCons.getInputMap(JTextField.WHEN_FOCUSED);
        ediConmap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        tablaEditorialCons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "EDITORIAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEditorialCons.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaEditorialCons.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tablaEditorialCons);
        if (tablaEditorialCons.getColumnModel().getColumnCount() > 0) {
            tablaEditorialCons.getColumnModel().getColumn(0).setMinWidth(30);
            tablaEditorialCons.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaEditorialCons.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaEditorialCons.getColumnModel().getColumn(1).setMinWidth(100);
        }
        ArrayListToTable(tablaEditorialCons, Edit.getAllEditoriales());
        selectionTableListener(btnEditorialEditar, btnEditorialEliminar, tablaEditorialCons);

        subPanelEditorial.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 250, 150));

        btnEditorialEditar.setBackground(new java.awt.Color(29, 53, 87));
        btnEditorialEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditorialEditar.setForeground(new java.awt.Color(241, 250, 238));
        btnEditorialEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconEdit.png"))); // NOI18N
        btnEditorialEditar.setText("Editar");
        btnEditorialEditar.setEnabled(false);
        btnEditorialEditar.setMaximumSize(new java.awt.Dimension(115, 33));
        btnEditorialEditar.setMinimumSize(new java.awt.Dimension(115, 33));
        btnEditorialEditar.setPreferredSize(new java.awt.Dimension(115, 33));
        btnEditorialEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditorialEditarActionPerformed(evt);
            }
        });
        subPanelEditorial.add(btnEditorialEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 110, 30));

        btnEditorialEliminar.setBackground(new java.awt.Color(29, 53, 87));
        btnEditorialEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditorialEliminar.setForeground(new java.awt.Color(241, 250, 238));
        btnEditorialEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconTrash.png"))); // NOI18N
        btnEditorialEliminar.setText("Eliminar");
        btnEditorialEliminar.setEnabled(false);
        btnEditorialEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditorialEliminarActionPerformed(evt);
            }
        });
        subPanelEditorial.add(btnEditorialEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, 30));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        subPanelEditorial.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 10, 180));

        panelDetallesLibro.add(subPanelEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 850, 250));

        getContentPane().add(panelDetallesLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 925, 770));
        panelDetallesLibro.setVisible(false);
        paneles.add(panelDetallesLibro);

        panelLibro.setBackground(new java.awt.Color(251, 251, 242));
        panelLibro.setName("Libro"); // NOI18N
        panelLibro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFacturaNueva.setBackground(new java.awt.Color(251, 251, 242));
        panelFacturaNueva.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lora", 1, 18))); // NOI18N
        panelFacturaNueva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel109.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        jLabel109.setText("Nro. Factura:");
        panelFacturaNueva.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 30));

        txtNroFactura.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        txtNroFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroFacturaKeyTyped(evt);
            }
        });
        panelFacturaNueva.add(txtNroFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 120, 28));
        InputMap facCompra = txtNroFactura.getInputMap(JTextField.WHEN_FOCUSED);
        facCompra.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        jLabel101.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        jLabel101.setText("Distribuidor:");
        panelFacturaNueva.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 100, 30));

        cbxDistribuidorNuevaFactura.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        cbxDistribuidorNuevaFactura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelFacturaNueva.add(cbxDistribuidorNuevaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 190, 28));
        vectorsToComboBox(cbxDistribuidorNuevaFactura, Dist.getAllDist(),2);

        btnNuevoDistribuidor.setBackground(new java.awt.Color(29, 53, 87));
        btnNuevoDistribuidor.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        btnNuevoDistribuidor.setForeground(new java.awt.Color(241, 250, 238));
        btnNuevoDistribuidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconPlus24.png"))); // NOI18N
        btnNuevoDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoDistribuidorActionPerformed(evt);
            }
        });
        panelFacturaNueva.add(btnNuevoDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 30, 30));

        btnProcesaFactura.setBackground(new java.awt.Color(29, 53, 87));
        btnProcesaFactura.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        btnProcesaFactura.setForeground(new java.awt.Color(241, 250, 238));
        btnProcesaFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCheck.png"))); // NOI18N
        btnProcesaFactura.setText("Procesar");
        btnProcesaFactura.setMaximumSize(new java.awt.Dimension(115, 33));
        btnProcesaFactura.setMinimumSize(new java.awt.Dimension(115, 33));
        btnProcesaFactura.setPreferredSize(new java.awt.Dimension(115, 33));
        btnProcesaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesaFacturaActionPerformed(evt);
            }
        });
        panelFacturaNueva.add(btnProcesaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 140, 30));

        panelLibro.add(panelFacturaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 810, 90));

        panelDetalleLibro.setBackground(new java.awt.Color(251, 251, 242));
        panelDetalleLibro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lora", 1, 18))); // NOI18N
        panelDetalleLibro.setName("LibroC"); // NOI18N
        panelDetalleLibro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        jLabel7.setText("ISBN:");
        panelDetalleLibro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 80, 20));

        txtIsbnLibro.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        txtIsbnLibro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIsbnLibroFocusLost(evt);
            }
        });
        txtIsbnLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbnLibroActionPerformed(evt);
            }
        });
        txtIsbnLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIsbnLibroKeyTyped(evt);
            }
        });
        panelDetalleLibro.add(txtIsbnLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, 28));
        InputMap isbnLIbro = txtIsbnLibro.getInputMap(JTextField.WHEN_FOCUSED);
        isbnLIbro.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        jLabel16.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        jLabel16.setText("Título:");
        panelDetalleLibro.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 80, 20));

        txtTituloLibro.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        txtTituloLibro.setEnabled(false);
        txtTituloLibro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTituloLibroFocusLost(evt);
            }
        });
        txtTituloLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTituloLibroKeyTyped(evt);
            }
        });
        panelDetalleLibro.add(txtTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 190, 28));
        InputMap titLibro = txtTituloLibro.getInputMap(JTextField.WHEN_FOCUSED);
        titLibro.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        jLabel23.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        jLabel23.setText("Editorial:");
        panelDetalleLibro.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 100, 20));

        cbxEditorialLibro.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        cbxEditorialLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxEditorialLibro.setEnabled(false);
        panelDetalleLibro.add(cbxEditorialLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 190, 28));
        vectorsToComboBox(cbxEditorialLibro, Edit.getAllEditoriales(), 1);

        btnNuevaEditorial.setBackground(new java.awt.Color(29, 53, 87));
        btnNuevaEditorial.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        btnNuevaEditorial.setForeground(new java.awt.Color(241, 250, 238));
        btnNuevaEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconPlus24.png"))); // NOI18N
        btnNuevaEditorial.setEnabled(false);
        btnNuevaEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaEditorialActionPerformed(evt);
            }
        });
        panelDetalleLibro.add(btnNuevaEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 30, 30));

        btnCargarPortada.setBackground(new java.awt.Color(29, 53, 87));
        btnCargarPortada.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        btnCargarPortada.setForeground(new java.awt.Color(241, 250, 238));
        btnCargarPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconUpload24.png"))); // NOI18N
        btnCargarPortada.setEnabled(false);
        btnCargarPortada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarPortadaActionPerformed(evt);
            }
        });
        panelDetalleLibro.add(btnCargarPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 60, 30));

        lblPortadaLibro.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        lblPortadaLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPortadaLibro.setText("PORTADA");
        lblPortadaLibro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelDetalleLibro.add(lblPortadaLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 97, 150));

        btnAñadeAutor.setBackground(new java.awt.Color(29, 53, 87));
        btnAñadeAutor.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnAñadeAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconAuthor.png"))); // NOI18N
        btnAñadeAutor.setEnabled(false);
        btnAñadeAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadeAutorActionPerformed(evt);
            }
        });
        panelDetalleLibro.add(btnAñadeAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 50, -1));

        lblCountAutorAñad.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        lblCountAutorAñad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountAutorAñad.setText("(0)");
        panelDetalleLibro.add(lblCountAutorAñad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 50, 20));

        btnAñadeCategoria.setBackground(new java.awt.Color(29, 53, 87));
        btnAñadeCategoria.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnAñadeCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorys32.png"))); // NOI18N
        btnAñadeCategoria.setEnabled(false);
        btnAñadeCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadeCategoriaActionPerformed(evt);
            }
        });
        panelDetalleLibro.add(btnAñadeCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 50, -1));

        lblCountCategoriaAñad.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        lblCountCategoriaAñad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountCategoriaAñad.setText("(0)");
        panelDetalleLibro.add(lblCountCategoriaAñad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 50, 20));

        btnAñadeIdioma.setBackground(new java.awt.Color(29, 53, 87));
        btnAñadeIdioma.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        btnAñadeIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/idioma32.png"))); // NOI18N
        btnAñadeIdioma.setEnabled(false);
        btnAñadeIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadeIdiomaActionPerformed(evt);
            }
        });
        panelDetalleLibro.add(btnAñadeIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 50, -1));

        lblCountIdiomaAñad.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        lblCountIdiomaAñad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountIdiomaAñad.setText("(0)");
        panelDetalleLibro.add(lblCountIdiomaAñad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 50, 20));

        jLabel25.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        jLabel25.setText("Año Public:");
        panelDetalleLibro.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 80, 30));

        yearChooserAnoLibro.setEnabled(false);
        yearChooserAnoLibro.setEndYear(2018);
        yearChooserAnoLibro.setMaximum(Integer.parseInt(getActualYear())
        );
        yearChooserAnoLibro.setMinimum(0);
        yearChooserAnoLibro.setValue(Integer.parseInt(getActualYear()));
        yearChooserAnoLibro.setVerifyInputWhenFocusTarget(false);
        yearChooserAnoLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yearChooserAnoLibroKeyTyped(evt);
            }
        });
        panelDetalleLibro.add(yearChooserAnoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 70, 28));

        lblCantidadLibro.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        lblCantidadLibro.setText("Cantidad:");
        panelDetalleLibro.add(lblCantidadLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, 30));

        txtCantidadLibro.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        txtCantidadLibro.setEnabled(false);
        txtCantidadLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadLibroKeyTyped(evt);
            }
        });
        panelDetalleLibro.add(txtCantidadLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 90, 28));
        InputMap cantlibro = txtCantidadLibro.getInputMap(JTextField.WHEN_FOCUSED);
        cantlibro.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        jLabel21.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        jLabel21.setText("Páginas:");
        panelDetalleLibro.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 80, 30));

        txtPaginasLibro.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        txtPaginasLibro.setEnabled(false);
        txtPaginasLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaginasLibroKeyTyped(evt);
            }
        });
        panelDetalleLibro.add(txtPaginasLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 70, 28));
        InputMap paglibro = txtPaginasLibro.getInputMap(JTextField.WHEN_FOCUSED);
        paglibro.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        lblPrecioLibro.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        lblPrecioLibro.setText("Precio U:");
        panelDetalleLibro.add(lblPrecioLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, 30));

        txtPrecioLibro.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        txtPrecioLibro.setEnabled(false);
        txtPrecioLibro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecioLibroFocusLost(evt);
            }
        });
        txtPrecioLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioLibroKeyTyped(evt);
            }
        });
        panelDetalleLibro.add(txtPrecioLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 90, 28));
        InputMap preclibro = txtPrecioLibro.getInputMap(JTextField.WHEN_FOCUSED);
        preclibro.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        btnConfirmarLibro.setBackground(new java.awt.Color(29, 53, 87));
        btnConfirmarLibro.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        btnConfirmarLibro.setForeground(new java.awt.Color(241, 250, 238));
        btnConfirmarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCheck.png"))); // NOI18N
        btnConfirmarLibro.setText("Registrar");
        btnConfirmarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarLibroActionPerformed(evt);
            }
        });
        panelDetalleLibro.add(btnConfirmarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 130, 30));

        btnLimpiarLibro.setBackground(new java.awt.Color(29, 53, 87));
        btnLimpiarLibro.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        btnLimpiarLibro.setForeground(new java.awt.Color(241, 250, 238));
        btnLimpiarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconTrash.png"))); // NOI18N
        btnLimpiarLibro.setText("Limpiar");
        btnLimpiarLibro.setEnabled(false);
        btnLimpiarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarLibroActionPerformed(evt);
            }
        });
        panelDetalleLibro.add(btnLimpiarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 120, 30));

        jButton2.setBackground(new java.awt.Color(29, 53, 87));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconX24.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelDetalleLibro.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 210, 35, 30));

        panelLibro.add(panelDetalleLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 860, 250));
        panelDetalleLibro.setVisible(false);

        panelBusquedaLibro.setBackground(new java.awt.Color(251, 251, 242));
        panelBusquedaLibro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda Libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lora", 1, 18))); // NOI18N
        panelBusquedaLibro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroupLibro.add(rdConsultaLibroTodo);
        rdConsultaLibroTodo.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        rdConsultaLibroTodo.setSelected(true);
        rdConsultaLibroTodo.setText("Todo");
        rdConsultaLibroTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsultaLibroTodoActionPerformed(evt);
            }
        });
        panelBusquedaLibro.add(rdConsultaLibroTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        buttonGroupLibro.add(rdConsultaLibroFiltro);
        rdConsultaLibroFiltro.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        rdConsultaLibroFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsultaLibroFiltroActionPerformed(evt);
            }
        });
        panelBusquedaLibro.add(rdConsultaLibroFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));

        tableLibroConsulta.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        tableLibroConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ISBN", "TITULO", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableLibroConsulta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableLibroConsulta.getTableHeader().setReorderingAllowed(false);
        tableLibroConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tableLibroConsultaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tableLibroConsultaMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tableLibroConsulta);
        if (tableLibroConsulta.getColumnModel().getColumnCount() > 0) {
            tableLibroConsulta.getColumnModel().getColumn(0).setResizable(false);
            tableLibroConsulta.getColumnModel().getColumn(0).setPreferredWidth(120);
            tableLibroConsulta.getColumnModel().getColumn(1).setResizable(false);
            tableLibroConsulta.getColumnModel().getColumn(1).setPreferredWidth(410);
            tableLibroConsulta.getColumnModel().getColumn(2).setResizable(false);
            tableLibroConsulta.getColumnModel().getColumn(2).setPreferredWidth(100);
        }
        tableFilter("", tableLibroConsulta);
        tableLibroConsulta.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseMoved(MouseEvent e) {
                Point p = e.getPoint();
                hoveredRow = tableLibroConsulta.rowAtPoint(p);
                hoveredColumn = tableLibroConsulta.columnAtPoint(p);

                if(hoveredRow>-1){
                    //METODO QUE PINTE EN JDIALOG LOS DETALLES DEL LIBRO
                    pintaResumenLibro(hoveredRow, tableLibroConsulta);
                    jDialogResumenLibro.setLocation(e.getLocationOnScreen().x,e.getLocationOnScreen().y-500);
                    jDialogResumenLibro.setVisible(true);
                }else{

                    jDialogResumenLibro.setVisible(false);
                }

            }
            @Override
            public void mouseDragged(MouseEvent e) {
                /*hoveredRow = hoveredColumn = -1;
                tableLibroConsulta.repaint();*/
            }
        });
        ArrayListToTable(tableLibroConsulta, LibIsbn.getIsbnForAutor(""));
        selectionTableListener(btnEditarLibro, btnEliminarLibro, tableLibroConsulta);

        panelBusquedaLibro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 830, 190));

        btnEditarLibro.setBackground(new java.awt.Color(29, 53, 87));
        btnEditarLibro.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        btnEditarLibro.setForeground(new java.awt.Color(241, 250, 238));
        btnEditarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconEdit.png"))); // NOI18N
        btnEditarLibro.setText("Editar");
        btnEditarLibro.setEnabled(false);
        btnEditarLibro.setMaximumSize(new java.awt.Dimension(115, 33));
        btnEditarLibro.setMinimumSize(new java.awt.Dimension(115, 33));
        btnEditarLibro.setPreferredSize(new java.awt.Dimension(115, 33));
        btnEditarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLibroActionPerformed(evt);
            }
        });
        panelBusquedaLibro.add(btnEditarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 110, 30));

        btnEliminarLibro.setBackground(new java.awt.Color(29, 53, 87));
        btnEliminarLibro.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        btnEliminarLibro.setForeground(new java.awt.Color(241, 250, 238));
        btnEliminarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconTrash.png"))); // NOI18N
        btnEliminarLibro.setText("Eliminar");
        btnEliminarLibro.setEnabled(false);
        btnEliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLibroActionPerformed(evt);
            }
        });
        panelBusquedaLibro.add(btnEliminarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, 30));

        buttonGroupLibro.add(rdConsultaLibroIsbn);
        rdConsultaLibroIsbn.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        rdConsultaLibroIsbn.setText("ISBN:");
        rdConsultaLibroIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsultaLibroIsbnActionPerformed(evt);
            }
        });
        panelBusquedaLibro.add(rdConsultaLibroIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        txtIsbnLibroConsulta.setEnabled(false);
        txtIsbnLibroConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIsbnLibroConsultaKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIsbnLibroConsultaKeyReleased(evt);
            }
        });
        panelBusquedaLibro.add(txtIsbnLibroConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 140, -1));
        InputMap isbnconslib = txtIsbnLibroConsulta.getInputMap(JTextField.WHEN_FOCUSED);
        isbnconslib.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        cbxFiltroLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Título", "Autor", "Categoría", "Idioma", "Editorial" }));
        cbxFiltroLibro.setEnabled(false);
        panelBusquedaLibro.add(cbxFiltroLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 130, -1));

        txtFiltroLibro.setEnabled(false);
        txtFiltroLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroLibroKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroLibroKeyReleased(evt);
            }
        });
        panelBusquedaLibro.add(txtFiltroLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 130, -1));
        InputMap filtconslib = txtFiltroLibro.getInputMap(JTextField.WHEN_FOCUSED);
        filtconslib.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        panelLibro.add(panelBusquedaLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 880, 390));
        panelBusquedaLibro.setVisible(false);

        panelFacturaResumen.setBackground(new java.awt.Color(251, 251, 242));
        panelFacturaResumen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Factura", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lora", 1, 18))); // NOI18N
        panelFacturaResumen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane8.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N

        tableDetallesFactura.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        tableDetallesFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "TITULO", "PRECIO U", "CANTIDAD", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDetallesFactura.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableDetallesFactura.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(tableDetallesFactura);
        if (tableDetallesFactura.getColumnModel().getColumnCount() > 0) {
            tableDetallesFactura.getColumnModel().getColumn(0).setResizable(false);
            tableDetallesFactura.getColumnModel().getColumn(0).setPreferredWidth(110);
            tableDetallesFactura.getColumnModel().getColumn(1).setResizable(false);
            tableDetallesFactura.getColumnModel().getColumn(1).setPreferredWidth(200);
            tableDetallesFactura.getColumnModel().getColumn(2).setResizable(false);
            tableDetallesFactura.getColumnModel().getColumn(2).setPreferredWidth(100);
            tableDetallesFactura.getColumnModel().getColumn(3).setResizable(false);
            tableDetallesFactura.getColumnModel().getColumn(3).setPreferredWidth(60);
            tableDetallesFactura.getColumnModel().getColumn(4).setResizable(false);
            tableDetallesFactura.getColumnModel().getColumn(4).setPreferredWidth(100);
        }
        selectionTableListener(btnLimpiarComprasFactura, btnLimpiarComprasFactura, tableDetallesFactura);

        panelFacturaResumen.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 810, 160));

        cbxMetodoPagoNuevaCompra.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        cbxMetodoPagoNuevaCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelFacturaResumen.add(cbxMetodoPagoNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 120, 28));
        vectorsToComboBox(cbxMetodoPagoNuevaCompra, Met.getAllMetodosPago(), 1);

        jLabel8.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        jLabel8.setText("Neto:");
        panelFacturaResumen.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, 20));

        jLabel9.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        jLabel9.setText("Iva (19%):");
        panelFacturaResumen.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, 20));

        jLabel10.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        jLabel10.setText("Total a pagar:");
        panelFacturaResumen.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, 20));

        lblNroFactura.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        lblNroFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNroFactura.setText("Nro. Factura");
        panelFacturaResumen.add(lblNroFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 110, 20));

        lblRutDistribuidorFactura.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        lblRutDistribuidorFactura.setText("123456789");
        panelFacturaResumen.add(lblRutDistribuidorFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 160, 20));

        lblFechaFactura.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        lblFechaFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaFactura.setText("Fecha");
        panelFacturaResumen.add(lblFechaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 130, 20));

        jLabel14.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Detalles de Factura");
        panelFacturaResumen.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 810, 20));

        jLabel15.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        jLabel15.setText("Método de pago:");
        panelFacturaResumen.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, 20));

        lblIvaFactura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIvaFactura.setText("0");
        panelFacturaResumen.add(lblIvaFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 110, 20));

        lblTotalFactura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalFactura.setText("0");
        panelFacturaResumen.add(lblTotalFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 110, 20));

        lblNetoFactura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNetoFactura.setText("0");
        panelFacturaResumen.add(lblNetoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 110, 20));

        btnAutEditar4.setBackground(new java.awt.Color(29, 53, 87));
        btnAutEditar4.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        btnAutEditar4.setForeground(new java.awt.Color(241, 250, 238));
        btnAutEditar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCheck.png"))); // NOI18N
        btnAutEditar4.setText("Guardar");
        btnAutEditar4.setMaximumSize(new java.awt.Dimension(115, 33));
        btnAutEditar4.setMinimumSize(new java.awt.Dimension(115, 33));
        btnAutEditar4.setPreferredSize(new java.awt.Dimension(115, 33));
        btnAutEditar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutEditar4ActionPerformed(evt);
            }
        });
        panelFacturaResumen.add(btnAutEditar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 140, 30));

        lblNombreDistribuidorFactura.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        lblNombreDistribuidorFactura.setText("TTT");
        panelFacturaResumen.add(lblNombreDistribuidorFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 260, 20));

        btnLimpiarComprasFactura.setBackground(new java.awt.Color(29, 53, 87));
        btnLimpiarComprasFactura.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        btnLimpiarComprasFactura.setForeground(new java.awt.Color(241, 250, 238));
        btnLimpiarComprasFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconTrash.png"))); // NOI18N
        btnLimpiarComprasFactura.setText("Limpiar");
        btnLimpiarComprasFactura.setEnabled(false);
        btnLimpiarComprasFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarComprasFacturaActionPerformed(evt);
            }
        });
        panelFacturaResumen.add(btnLimpiarComprasFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 120, 30));

        lblRutDistribuidorFactura1.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        lblRutDistribuidorFactura1.setText("Rut:");
        panelFacturaResumen.add(lblRutDistribuidorFactura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 160, 20));

        lblNombreDistribuidorFactura1.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        lblNombreDistribuidorFactura1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreDistribuidorFactura1.setText("Nro. Factura:");
        panelFacturaResumen.add(lblNombreDistribuidorFactura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 110, 20));

        lblNombreDistribuidorFactura2.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        lblNombreDistribuidorFactura2.setText("Nombre:");
        panelFacturaResumen.add(lblNombreDistribuidorFactura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, 20));

        lblHoraFactura.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        lblHoraFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoraFactura.setText("Hora");
        panelFacturaResumen.add(lblHoraFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 130, 20));

        panelLibro.add(panelFacturaResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 830, 390));
        panelFacturaResumen.setVisible(false);

        getContentPane().add(panelLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 925, 770));
        panelLibro.setVisible(false);
        paneles.add(panelLibro);

        panelAdminCompra.setBackground(new java.awt.Color(251, 251, 242));
        panelAdminCompra.setName("Facturas"); // NOI18N
        panelAdminCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(251, 251, 242));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lora", 1, 18))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarFactura.setBackground(new java.awt.Color(29, 53, 87));
        btnEliminarFactura.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        btnEliminarFactura.setForeground(new java.awt.Color(241, 250, 238));
        btnEliminarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconTrash.png"))); // NOI18N
        btnEliminarFactura.setText("Eliminar");
        btnEliminarFactura.setEnabled(false);
        btnEliminarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFacturaActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, 30));

        btnGrpConsFacturas.add(rdConsFacTodo);
        rdConsFacTodo.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        rdConsFacTodo.setSelected(true);
        rdConsFacTodo.setText("Todo");
        rdConsFacTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdConsFacTodoActionPerformed(evt);
            }
        });
        jPanel4.add(rdConsFacTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        tableFacturas.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        tableFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID FACTURA", "FOLIO", "DISTRIBUIDOR", "METODO", "FECHA", "HORA", "NETO", "IVA", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFacturas.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(tableFacturas);
        ArrayListToTable(tableFacturas, Fac.getAllFacturas());
        selectionTableListener(btnEliminarFactura, btnEliminarFactura, tableFacturas);
        selectionTableListener2(tableFacturas, tableCompras);
        tableFilter("", tableFacturas);

        jPanel4.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 830, 170));

        btnGrpConsFacturas.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        jRadioButton5.setText("Filtro:");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        btnGrpConsFacturas.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        jRadioButton6.setText("Metodo pago:");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, -1));

        cbxConsFacMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxConsFacMetodo.setEnabled(false);
        cbxConsFacMetodo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxConsFacMetodoItemStateChanged(evt);
            }
        });
        jPanel4.add(cbxConsFacMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 130, -1));
        vectorsToComboBox(cbxConsFacMetodo, new MetodoPago().getAllMetodosPago(), 1);

        txtConsFacDistribuidor.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        txtConsFacDistribuidor.setEnabled(false);
        txtConsFacDistribuidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsFacDistribuidorKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsFacDistribuidorKeyReleased(evt);
            }
        });
        jPanel4.add(txtConsFacDistribuidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 190, -1));

        panelAdminCompra.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 880, 350));

        panelComprasFactura.setBackground(new java.awt.Color(251, 251, 242));
        panelComprasFactura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lora", 1, 18))); // NOI18N
        panelComprasFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarCompraFac.setBackground(new java.awt.Color(29, 53, 87));
        btnEliminarCompraFac.setFont(new java.awt.Font("Lora", 1, 15)); // NOI18N
        btnEliminarCompraFac.setForeground(new java.awt.Color(241, 250, 238));
        btnEliminarCompraFac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconTrash.png"))); // NOI18N
        btnEliminarCompraFac.setText("Eliminar");
        btnEliminarCompraFac.setEnabled(false);
        btnEliminarCompraFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCompraFacActionPerformed(evt);
            }
        });
        panelComprasFactura.add(btnEliminarCompraFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, 30));

        tableCompras.setFont(new java.awt.Font("Lora", 0, 15)); // NOI18N
        tableCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID COMPRA", "ID FACTURA", "ISBN", "CANTIDAD", "COSTO T"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCompras.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(tableCompras);
        selectionTableListener(btnEliminarCompraFac, btnEliminarCompraFac, tableCompras);
        tableFilter("", tableCompras);

        panelComprasFactura.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 830, 210));

        panelAdminCompra.add(panelComprasFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 880, 330));
        panelComprasFactura.setVisible(false);

        getContentPane().add(panelAdminCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 925, 770));
        panelAdminCompra.setVisible(false);
        paneles.add(panelAdminCompra);

        pack();
    }// </editor-fold>//GEN-END:initComponents
// DISTRIBUIDOR
    private void btnEditarDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDistActionPerformed
        int id = Integer.parseInt(tablaDistCons.getValueAt(tablaDistCons.getSelectedRow(), 0).toString());
        preModifyDist(Dist.getDist(id));
    }//GEN-LAST:event_btnEditarDistActionPerformed
// DISTRIBUIDOR
    private void txtNuevoDistNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevoDistNomKeyTyped
        txtLimite(txtNuevoDistNom, 30, evt);
        txtAlphaNumericWithSpace(evt);
    }//GEN-LAST:event_txtNuevoDistNomKeyTyped
// DISTRIBUIDOR
    private void txtNuevoDistRutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNuevoDistRutFocusGained
        lblNuevoDistRutexiste.setText("");
        lblNuevoDistRutexiste.setForeground(Color.red);
    }//GEN-LAST:event_txtNuevoDistRutFocusGained
// DISTRIBUIDOR
    private void txtNuevoDistRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNuevoDistRutFocusLost
        if (txtNuevoDistRut.getText().length() > 6 && Integer.parseInt(txtNuevoDistRut.getText()) != 0) { //Si el rut ingresado es mayor a 6 dígitos.
            if (!txtNuevoDistDVrut.getText().isEmpty()) { //True si el verificador está lleno.
                if (validoRut(txtNuevoDistRut.getText(), txtNuevoDistDVrut.getText())) { //True si el rut es válido.
                    if (new Distribuidor().existDistribuidor(txtNuevoDistRut.getText() + txtNuevoDistDVrut.getText())) {
                        lblNuevoDistRutexiste.setText("Ya existe");
                        lblNuevoDistRutexiste.setForeground(Color.red);
                    } else {
                        lblNuevoDistRutexiste.setText("Válido");
                        lblNuevoDistRutexiste.setForeground(new Color(0, 128, 0));
                    }
                } else { //El rut no es válido.
                    lblNuevoDistRutexiste.setText("Inválido");
                    lblNuevoDistRutexiste.setForeground(Color.red);
                }
            } else { //Si el verificador está vacío.
                txtNuevoDistDVrut.requestFocus();
            }
        } else { //False si el rut no es mayor a 6 digitos.
            txtNuevoDistRut.requestFocus();
        }  
    }//GEN-LAST:event_txtNuevoDistRutFocusLost
// DISTRIBUIDOR
    private void txtNuevoDistRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevoDistRutKeyTyped
        txtLimite(txtNuevoDistRut, 8, evt);
        txtOnlyNums(evt);
    }//GEN-LAST:event_txtNuevoDistRutKeyTyped
// DISTRIBUIDOR
    private void txtNuevoDistDVrutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNuevoDistDVrutFocusGained
        if (!(txtNuevoDistRut.getText().length() > 6)) {
            txtNuevoDistRut.requestFocus();
        }
    }//GEN-LAST:event_txtNuevoDistDVrutFocusGained
// DISTRIBUIDOR
    private void txtNuevoDistDVrutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNuevoDistDVrutFocusLost
        if (txtNuevoDistRut.getText().length() > 6 && !txtNuevoDistDVrut.getText().isEmpty()) {
            if (!validoRut(txtNuevoDistRut.getText(), txtNuevoDistDVrut.getText())) {
                lblNuevoDistRutexiste.setText("Inválido");
                lblNuevoDistRutexiste.setForeground(Color.red);
            } else {
                if (Dist.existDistribuidor(txtNuevoDistRut.getText() + txtNuevoDistDVrut.getText())) {
                    lblNuevoDistRutexiste.setText("Ya existe");
                    lblNuevoDistRutexiste.setForeground(Color.red);
                } else {
                    lblNuevoDistRutexiste.setText("Válido");
                    lblNuevoDistRutexiste.setForeground(new Color(0, 128, 0));
                }
            }
        } else {
            txtNuevoDistRut.requestFocus();
        }
    }//GEN-LAST:event_txtNuevoDistDVrutFocusLost
// DISTRIBUIDOR
    private void txtNuevoDistDVrutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevoDistDVrutKeyTyped
        txtLimite(txtNuevoDistDVrut, 1, evt);
        txtOnlyNumsAndK(evt);
    }//GEN-LAST:event_txtNuevoDistDVrutKeyTyped
// DISTRIBUIDOR
    private void txtNuevoDisNroTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevoDisNroTKeyTyped
        txtLimite(txtNuevoDisNroT, 9, evt);
        txtOnlyNums(evt);
    }//GEN-LAST:event_txtNuevoDisNroTKeyTyped
// DISTRIBUIDOR
    private void txtNuevoDisDirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevoDisDirKeyTyped
        txtLimite(txtNuevoDisDir, 79, evt);
        txtAlphaNumericWithSpace(evt);
    }//GEN-LAST:event_txtNuevoDisDirKeyTyped
// DISTRIBUIDOR
    private void btnRegNuevDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegNuevDisActionPerformed
        Distribuidor d = verifyDistribuidor();
        if (btnRegNuevDis.getText().equals("Registrar")) {
            if (d != null && Dist.insertDistribuidor(d)) {
                vectorsToComboBox(cbxDistribuidorNuevaFactura, Dist.getAllDist(), 2);
                preNuevoDist();
                consultaDistribuidor();
            } else {
                JOptionPane.showMessageDialog(null, "Error en datos de ingreso", "Campo Inválido", 0,iconError);
            }
        } else {
            if (d != null) {
                if (Dist.updateDistribuidor(d)) { //Se intenta realizar la modificacion llamando al método updateDistribuidor de la clase Distribuidor.
                    vectorsToComboBox(cbxDistribuidorNuevaFactura, Dist.getAllDist(), 2);
                    preNuevoDist(); //De haber sido exitosa la modificación se limpian los campos de la ventana Distribuidor.
                    consultaDistribuidor(); //Se actualiza la consulta realizada previamente para mostrar los cambios.
                }//En caso de que la respuesta del usuario sea negativa no sucede nada.
            } else {
                JOptionPane.showMessageDialog(null, "Error en datos de modificación", "Campo Inválido", 0,iconError);
            }
        }
    }//GEN-LAST:event_btnRegNuevDisActionPerformed
// DISTRIBUIDOR
    private void btnLimpCampNuevDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpCampNuevDisActionPerformed
        preNuevoDist();
    }//GEN-LAST:event_btnLimpCampNuevDisActionPerformed
// MENU
    private void btnDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistribuidorActionPerformed
        execBtnMenu(btnDistribuidor);
    }//GEN-LAST:event_btnDistribuidorActionPerformed
// DISTRIBUIDOR
    private void rdConsDisCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsDisCodActionPerformed
        txtRutConsDis.setEnabled(false);
        txtRutConsDis.setText("");
        txtNomConsDis.setEnabled(false);
        txtNomConsDis.setText("");
        txtCodConsDis.setEnabled(true);
    }//GEN-LAST:event_rdConsDisCodActionPerformed
// DISTRIBUIDOR
    private void rdConsDisRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsDisRutActionPerformed
        txtNomConsDis.setEnabled(false);
        txtNomConsDis.setText("");
        txtCodConsDis.setEnabled(false);
        txtCodConsDis.setText("");
        txtRutConsDis.setEnabled(true);
    }//GEN-LAST:event_rdConsDisRutActionPerformed
// DISTRIBUIDOR
    private void rdConsDisNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsDisNomActionPerformed
        txtRutConsDis.setEnabled(false);
        txtRutConsDis.setText("");
        txtCodConsDis.setEnabled(false);
        txtCodConsDis.setText("");
        txtNomConsDis.setEnabled(true);
    }//GEN-LAST:event_rdConsDisNomActionPerformed
// DISTRIBUIDOR
    private void rdConsDisTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsDisTodoActionPerformed
        txtRutConsDis.setEnabled(false);
        txtRutConsDis.setText("");
        txtCodConsDis.setEnabled(false);
        txtCodConsDis.setText("");
        txtNomConsDis.setEnabled(false);
        txtNomConsDis.setText("");
        ArrayListToTable(tablaDistCons, Dist.getAllDist());
    }//GEN-LAST:event_rdConsDisTodoActionPerformed
// DISTRIBUIDOR
    private void txtRutConsDisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutConsDisKeyTyped
        txtLimite(txtRutConsDis, 8, evt);
        txtOnlyNums(evt);
    }//GEN-LAST:event_txtRutConsDisKeyTyped
//DISTRIBUIDOR 
    private void txtNomConsDisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomConsDisKeyTyped
        txtLimite(txtNomConsDis, 30, evt);
        txtAlphaNumericWithSpace(evt);
    }//GEN-LAST:event_txtNomConsDisKeyTyped
//DISTRIBUIDOR
    private void txtCodConsDisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodConsDisKeyTyped
        txtLimite(txtCodConsDis, 8, evt);
        txtOnlyNums(evt);
    }//GEN-LAST:event_txtCodConsDisKeyTyped
// DISTRIBUIDOR
    private void txtCodConsDisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodConsDisKeyReleased
        consultaDistribuidor();
    }//GEN-LAST:event_txtCodConsDisKeyReleased
// DISTRIBUIDOR
    private void txtNomConsDisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomConsDisKeyReleased
       consultaDistribuidor();
    }//GEN-LAST:event_txtNomConsDisKeyReleased
// DISTRIBUIDOR
    private void txtRutConsDisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutConsDisKeyReleased
        consultaDistribuidor();
    }//GEN-LAST:event_txtRutConsDisKeyReleased
// DISTRIBUIDOR
    private void btnEliminarDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDistActionPerformed
        deleteDistribuidor();
    }//GEN-LAST:event_btnEliminarDistActionPerformed
// MENU
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        execBtnMenu(btnInicio);
    }//GEN-LAST:event_btnInicioActionPerformed
// DISTRIBUIDOR
    private void txtNuevoDistNomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNuevoDistNomFocusLost
        if (!txtNuevoDistNom.getText().isEmpty()) {
            txtNuevoDistNom.setText(quitaEspacios(txtNuevoDistNom.getText()).toUpperCase());  
        }
    }//GEN-LAST:event_txtNuevoDistNomFocusLost
// DISTRIBUIDOR
    private void txtNuevoDisDirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNuevoDisDirFocusLost
        if (!txtNuevoDisDir.getText().isEmpty()) {  
            txtNuevoDisDir.setText(quitaEspacios(txtNuevoDisDir.getText()).toUpperCase());
        }
    }//GEN-LAST:event_txtNuevoDisDirFocusLost
// AUTOR
    private void txtAutorApesConsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorApesConsKeyTyped
        txtLimite(txtAutorApesCons, 20, evt);
        txtAlphaNumericWithSpace(evt);
    }//GEN-LAST:event_txtAutorApesConsKeyTyped
// AUTOR
    private void txtAutorApesConsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorApesConsKeyReleased
        consultaAutor();
    }//GEN-LAST:event_txtAutorApesConsKeyReleased
// AUTOR
    private void rdConsAutTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsAutTodoActionPerformed
        radiosAutor();
    }//GEN-LAST:event_rdConsAutTodoActionPerformed
// AUTOR
    private void txtAutorNombreConsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorNombreConsKeyTyped
        txtLimite(txtAutorNombreCons, 20, evt);
        txtAlphaNumericWithSpace(evt);
    }//GEN-LAST:event_txtAutorNombreConsKeyTyped
// AUTOR
    private void txtAutorNombreConsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorNombreConsKeyReleased
        consultaAutor();
    }//GEN-LAST:event_txtAutorNombreConsKeyReleased
// AUTOR
    private void txtAutorCodConsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorCodConsKeyTyped
        txtLimite(txtAutorCodCons, 8, evt);
        txtOnlyNums(evt);
    }//GEN-LAST:event_txtAutorCodConsKeyTyped
// AUTOR
    private void txtAutorCodConsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorCodConsKeyReleased
        consultaAutor();
    }//GEN-LAST:event_txtAutorCodConsKeyReleased
// AUTOR
    private void rdConsAutNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsAutNomActionPerformed
       radiosAutor();
    }//GEN-LAST:event_rdConsAutNomActionPerformed
// AUTOR
    private void rdConsAutApesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsAutApesActionPerformed
       radiosAutor();
    }//GEN-LAST:event_rdConsAutApesActionPerformed
// AUTOR
    private void rdConsAutCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsAutCodActionPerformed
        radiosAutor();
    }//GEN-LAST:event_rdConsAutCodActionPerformed
// AUTOR
    private void btnLimpAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpAutorActionPerformed
        preNuevoAutor();
    }//GEN-LAST:event_btnLimpAutorActionPerformed
// AUTOR
    private void btnRegAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAutorActionPerformed
        buttonAutor();
    }//GEN-LAST:event_btnRegAutorActionPerformed
// AUTOR
    private void txtAutorApeMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorApeMKeyTyped
        txtLimite(txtAutorApeM, 15, evt);
        txtOnlyTextWithSpace(evt);
    }//GEN-LAST:event_txtAutorApeMKeyTyped
// AUTOR
    private void txtAutorApeMFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAutorApeMFocusLost
        txtAutorApeM.setBorder(g);
        txtAutorApeM.setText(quitaEspacios(txtAutorApeM.getText()).toUpperCase());
    }//GEN-LAST:event_txtAutorApeMFocusLost
// AUTOR
    private void btnAutEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutEditarActionPerformed
        preModifyAutor();
    }//GEN-LAST:event_btnAutEditarActionPerformed
// AUTOR
    private void btnAutEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutEliminarActionPerformed
        deleteAutor();
    }//GEN-LAST:event_btnAutEliminarActionPerformed
// AUTOR
    private void txtAutorNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAutorNombreFocusLost
        txtAutorNombre.setBorder(g);
        txtAutorNombre.setText(quitaEspacios(txtAutorNombre.getText()).toUpperCase());
    }//GEN-LAST:event_txtAutorNombreFocusLost
// AUTOR
    private void txtAutorNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorNombreKeyTyped
        txtLimite(txtAutorNombre, 15, evt);
        txtOnlyTextWithSpace(evt);
    }//GEN-LAST:event_txtAutorNombreKeyTyped
// AUTOR
    private void txtAutorApePFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAutorApePFocusLost
        txtAutorApeP.setBorder(g);
        txtAutorApeP.setText(quitaEspacios(txtAutorApeP.getText()).toUpperCase());
    }//GEN-LAST:event_txtAutorApePFocusLost
// AUTOR
    private void txtAutorApePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorApePKeyTyped
        txtLimite(txtAutorApeP, 15, evt);
        txtOnlyTextWithSpace(evt);
    }//GEN-LAST:event_txtAutorApePKeyTyped
// MENU
    private void btnAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorActionPerformed
        execBtnMenu(btnAutor);    
    }//GEN-LAST:event_btnAutorActionPerformed
// IDIOMA
    private void txtIdiomaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdiomaKeyTyped
        txtLimite(txtIdioma, 15, evt);
        txtOnlyTextWithoutSpace(evt);
    }//GEN-LAST:event_txtIdiomaKeyTyped
// IDIOMA
    private void btnIdiomaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdiomaEliminarActionPerformed
        deleteIdioma();
    }//GEN-LAST:event_btnIdiomaEliminarActionPerformed
// IDIOMA
    private void btnIdiomaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdiomaEditarActionPerformed
        preModifyIdioma();
    }//GEN-LAST:event_btnIdiomaEditarActionPerformed
// IDIOMA
    private void btnRegIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegIdiomaActionPerformed
        buttonIdioma();
    }//GEN-LAST:event_btnRegIdiomaActionPerformed
// IDIOMA
    private void rdConsIdioCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsIdioCodActionPerformed
        radiosIdioma();
    }//GEN-LAST:event_rdConsIdioCodActionPerformed
// IDIOMA
    private void rdConsIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsIdiomaActionPerformed
        radiosIdioma();
    }//GEN-LAST:event_rdConsIdiomaActionPerformed
// IDIOMA
    private void txtIdioCodConsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdioCodConsKeyReleased
        if (!txtIdioCodCons.getText().isEmpty()) {
            ArrayListToTable(tablaIdiomaCons, Idi.getIdiomaForId(Integer.parseInt(txtIdioCodCons.getText())));
        }else{
            ArrayListToTable(tablaIdiomaCons, Idi.getIdiomaForId(0));
        }
    }//GEN-LAST:event_txtIdioCodConsKeyReleased
// IDIOMA
    private void txtIdioCodConsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdioCodConsKeyTyped
        txtLimite(txtIdioCodCons, 8, evt);
        txtOnlyNums(evt);
    }//GEN-LAST:event_txtIdioCodConsKeyTyped
// IDIOMA
    private void txtIdiomaConsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdiomaConsKeyReleased
        ArrayListToTable(tablaIdiomaCons, Idi.getIdiomasForName(txtIdiomaCons.getText()));
    }//GEN-LAST:event_txtIdiomaConsKeyReleased
// IDIOMA
    private void txtIdiomaConsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdiomaConsKeyTyped
        txtLimite(txtIdiomaCons, 15, evt);
        txtOnlyTextWithoutSpace(evt);
    }//GEN-LAST:event_txtIdiomaConsKeyTyped
// IDIOMA
    private void rdConsIdioTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsIdioTodoActionPerformed
        radiosIdioma();
    }//GEN-LAST:event_rdConsIdioTodoActionPerformed
// MENU
    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        execBtnMenu(btnDetalles);
    }//GEN-LAST:event_btnDetallesActionPerformed
// CATEGORIA
    private void txtCategoriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCategoriaFocusLost
        txtCategoria.setText(quitaEspacios(txtCategoria.getText()).toUpperCase());
        txtCategoria.setBorder(g);
    }//GEN-LAST:event_txtCategoriaFocusLost
// CATEGORIA
    private void txtCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyTyped
        txtLimite(txtCategoria, 20, evt);
        txtOnlyTextWithSpace(evt);
    }//GEN-LAST:event_txtCategoriaKeyTyped
// CATEGORIA
    private void btnRegCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegCategoriaActionPerformed
        buttonCategoria();
    }//GEN-LAST:event_btnRegCategoriaActionPerformed
// CATEGORIA
    private void rdConsCatTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsCatTodoActionPerformed
        txtCatCodCons.setEnabled(false);
        txtCatCodCons.setText("");
        txtCategoriaCons.setEnabled(false);
        txtCategoriaCons.setText("");
        ArrayListToTable(tablaCategoriaCons, Cat.getAllCategorias());
    }//GEN-LAST:event_rdConsCatTodoActionPerformed
// CATEGORIA
    private void rdConsCatCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsCatCodActionPerformed
        txtCatCodCons.setEnabled(true);
        txtCategoriaCons.setEnabled(false);
        txtCategoriaCons.setText("");
    }//GEN-LAST:event_rdConsCatCodActionPerformed
// CATEGORIA
    private void txtCatCodConsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCatCodConsKeyReleased
        consultaCategoria();
    }//GEN-LAST:event_txtCatCodConsKeyReleased
// CATEGORIA
    private void txtCatCodConsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCatCodConsKeyTyped
        txtLimite(txtCatCodCons, 8, evt);
        txtOnlyNums(evt);
    }//GEN-LAST:event_txtCatCodConsKeyTyped
// CATEGORIA
    private void rdConsCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsCategoriaActionPerformed
        txtCatCodCons.setEnabled(false);
        txtCatCodCons.setText("");
        txtCategoriaCons.setEnabled(true);
    }//GEN-LAST:event_rdConsCategoriaActionPerformed
// CATEGORIA
    private void txtCategoriaConsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaConsKeyReleased
        consultaCategoria();
    }//GEN-LAST:event_txtCategoriaConsKeyReleased
// CATEGORIA
    private void txtCategoriaConsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaConsKeyTyped
        txtLimite(txtCategoriaCons, 20, evt);
        txtAlphaNumericWithSpace(evt);
    }//GEN-LAST:event_txtCategoriaConsKeyTyped
// CATEGORIA
    private void btnCatEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatEditarActionPerformed
        preModifyCategoria();
    }//GEN-LAST:event_btnCatEditarActionPerformed
// CATEGORIA
    private void btnCatEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatEliminarActionPerformed
        deleteCategoria();
    }//GEN-LAST:event_btnCatEliminarActionPerformed
// EDITORIAL
    private void txtEditorialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEditorialFocusLost
       txtEditorial.setText(quitaEspacios(txtEditorial.getText()).toUpperCase());
       txtEditorial.setBorder(g);
    }//GEN-LAST:event_txtEditorialFocusLost
// EDITORIAL
    private void txtEditorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorialKeyTyped
        txtLimite(txtEditorial, 25, evt);
        txtAlphaNumericWithSpace(evt);
    }//GEN-LAST:event_txtEditorialKeyTyped
// EDITORIAL
    private void btnRegEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegEditorialActionPerformed
        buttonEditorial();
    }//GEN-LAST:event_btnRegEditorialActionPerformed
// EDITORIAL
    private void rdConsEdiTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsEdiTodoActionPerformed
        radiosEditorial();
    }//GEN-LAST:event_rdConsEdiTodoActionPerformed
// EDITORIAL
    private void rdConsEdiCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsEdiCodActionPerformed
        radiosEditorial();
    }//GEN-LAST:event_rdConsEdiCodActionPerformed
// EDITORIAL
    private void txtEdiCodConsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdiCodConsKeyReleased
       consultaEditorial();
    }//GEN-LAST:event_txtEdiCodConsKeyReleased
// EDITORIAL
    private void txtEdiCodConsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdiCodConsKeyTyped
        txtLimite(txtEdiCodCons, 8, evt);
        txtOnlyNums(evt);
    }//GEN-LAST:event_txtEdiCodConsKeyTyped
// EDITORIAL
    private void rdConsEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsEditorialActionPerformed
        radiosEditorial();
    }//GEN-LAST:event_rdConsEditorialActionPerformed
// EDITORIAL
    private void txtEditorialConsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorialConsKeyReleased
        consultaEditorial();
    }//GEN-LAST:event_txtEditorialConsKeyReleased
// EDITORIAL
    private void txtEditorialConsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorialConsKeyTyped
        txtLimite(txtEditorialCons, 20, evt);
        txtAlphaNumericWithSpace(evt);
    }//GEN-LAST:event_txtEditorialConsKeyTyped
// EDITORIAL
    private void btnEditorialEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditorialEditarActionPerformed
        preModifyEditorial();
    }//GEN-LAST:event_btnEditorialEditarActionPerformed
// EDITORIAL
    private void btnEditorialEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditorialEliminarActionPerformed
        deleteEditorial();
    }//GEN-LAST:event_btnEditorialEliminarActionPerformed
// IDIOMA
    private void txtIdiomaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdiomaFocusLost
       txtIdioma.setBorder(g);
       txtIdioma.setText(txtIdioma.getText().toUpperCase());
    }//GEN-LAST:event_txtIdiomaFocusLost
// IDIOMA
    private void btnCancelIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelIdiomaActionPerformed
        preNuevoIdioma();
    }//GEN-LAST:event_btnCancelIdiomaActionPerformed
// CATEGORIA
    private void btnCancelCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelCategoriaActionPerformed
        preNuevaCategoria();
    }//GEN-LAST:event_btnCancelCategoriaActionPerformed
// EDITORIAL
    private void btnCancelEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelEditorialActionPerformed
        preNuevoEditorial();
    }//GEN-LAST:event_btnCancelEditorialActionPerformed

    private void btnAutorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutorMouseEntered
//        if (!tglBtnLibro.isSelected()) {
//            btnAutor.setVisible(true);
//            btnDetalles.setVisible(true);
//            lblBordeLibroPanelNav.setVisible(true);
//            tglBtnLibro.setText("Libro      ↑");
//            
//        }
    }//GEN-LAST:event_btnAutorMouseEntered
// MENU
    private void btnDetallesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetallesMouseEntered
//       if (!tglBtnLibro.isSelected()) {
//            btnAutor.setVisible(true);
//            btnDetalles.setVisible(true);
//            lblBordeLibroPanelNav.setVisible(true);
//            tglBtnLibro.setText("Libro          ↑");
//        }
    }//GEN-LAST:event_btnDetallesMouseEntered
// MENU
    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        panelLibro.setName("Compra");
        execBtnMenu(btnCompra);
        panelLibro(btnCompra);
    }//GEN-LAST:event_btnCompraActionPerformed
// COMPRA NUEVA
    private void btnProcesaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesaFacturaActionPerformed
        buttonProcesaFactura();
    }//GEN-LAST:event_btnProcesaFacturaActionPerformed
//NUEVA COMPRA
    private void btnAñadeAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadeAutorActionPerformed
        if (jDialogAñadeAutor.getName().equals("Libro")) {
            btnLimpiarAñadAut.doClick();
        }
        jDialogAñadeAutor.setName("Factura");
        jDialogAñadeAutor.setLocationRelativeTo(this);
        jDialogAñadeAutor.setVisible(true);
    }//GEN-LAST:event_btnAñadeAutorActionPerformed
//NUEVA COMPRA
    private void btnCargarPortadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarPortadaActionPerformed
        String [] op= new  String[3];
        op[2]="Camara";
        op[1]="Archivo";
        op[0]="Cancelar";
        int resp=JOptionPane.showOptionDialog(panelLibro, "¿Como desea cargar la portada del Libro?", "Portada", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, iconQuestion, op, null);
        if (resp==2) {
            webcam = Webcam.getDefault();
            webcam.setViewSize(WebcamResolution.VGA.getSize());
            webcamPanel= new WebcamPanel(webcam);
            webcamPanel.setFPSDisplayed(false);
            webcamPanel.setDisplayDebugInfo(false);
            webcamPanel.setImageSizeDisplayed(false);
            webcamPanel.setMirrored(false);
            webcamPanel.setSize(webcam.getViewSize());
            webcamPanel.setLayout(new AbsoluteLayout());
            
            lblMarco.setSize(480, 640);
            lblMarco.setBorder(new LineBorder(Color.RED));
            webcamPanel.add(lblMarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 480, 640));
            jDialogCamara.setSize(900, 700);
            jDialogCamara.add(webcamPanel);

            jDialogCamara.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            jDialogCamara.setLocationRelativeTo(panelLibro);
            
            jDialogCamara.setVisible(true);
            
            
           
            
        }else if(resp==1){
            int resultado;
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
            resultado= jFileChooser1.showOpenDialog(null);
        if (jFileChooser1.APPROVE_OPTION == resultado){
            File fichero = jFileChooser1.getSelectedFile();
            try{
                ImageIcon icon = new ImageIcon(fichero.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lblPortadaLibro.getWidth(), lblPortadaLibro.getHeight(), Image.SCALE_DEFAULT));
                lblPortadaLibro.setText(null);
                lblPortadaLibro.setIcon(icono);
                
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error abriendo la imagen: "+ ex);
            }
        }
        }else if (resp==0){

        }

    }//GEN-LAST:event_btnCargarPortadaActionPerformed
 
public void actionPerformed(java.awt.event.ActionEvent evt) {
                capturaFoto(evt);
}

private void capturaFoto(ActionEvent evt) {
    if (evt.getSource()==btnTomaFoto) {
        BufferedImage image = webcam.getImage();
        Icon icon=(Icon)new ImageIcon((Image)image);
        lblPortadaLibro.setIcon(icon);
    }
}

//NUEVA COMPRA
    private void btnAñadeCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadeCategoriaActionPerformed
        if (jDialogAñadeCategoria.getName().equals("Libro")) {
            btnLimpiarAñadCat.doClick();
        }
        jDialogAñadeCategoria.setName("Factura");
        jDialogAñadeCategoria.setLocationRelativeTo(this);
        jDialogAñadeCategoria.setVisible(true);
        
    }//GEN-LAST:event_btnAñadeCategoriaActionPerformed
//NUEVA COMPRA
    private void btnConfirmarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarLibroActionPerformed
        buttonAñadirCompra();
    }//GEN-LAST:event_btnConfirmarLibroActionPerformed
// LIBRO
    private void btnEliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLibroActionPerformed
        deleteLibroIsbn(tableLibroConsulta.getValueAt(tableLibroConsulta.getSelectedRow(), 0).toString());  
    }//GEN-LAST:event_btnEliminarLibroActionPerformed
// LIBRO
    private void btnEditarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLibroActionPerformed
        limpiarDetalleCompra();
        panelDetalleLibro.setName("LibroM");
        txtIsbnLibro.setText(tableLibroConsulta.getValueAt(tableLibroConsulta.getSelectedRow(), 0).toString());
        txtIsbnLibro.requestFocus();
        panelDetalleLibro.requestFocus();
    }//GEN-LAST:event_btnEditarLibroActionPerformed
// LIBRO
    private void rdConsultaLibroTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsultaLibroTodoActionPerformed
        txtIsbnLibroConsulta.setText("");
        txtIsbnLibroConsulta.setEnabled(false);
        cbxFiltroLibro.setSelectedIndex(0);
        cbxFiltroLibro.setEnabled(false);
        txtFiltroLibro.setText("");
        txtFiltroLibro.setEnabled(false);
        tableFilter("", tableLibroConsulta);
        ArrayListToTable(tableLibroConsulta, new LibroIsbn().getIsbnForCategoria(""));
        
    }//GEN-LAST:event_rdConsultaLibroTodoActionPerformed
// LIBRO
    private void btnLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibroMouseEntered
    }//GEN-LAST:event_btnLibroMouseEntered
//MENU
    private void btnLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibroActionPerformed
        panelLibro.setName("Libro");
        execBtnMenu(btnLibro);
        panelLibro(btnLibro);
    }//GEN-LAST:event_btnLibroActionPerformed
//FACTURA
    private void btnEliminarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFacturaActionPerformed
            int pkFactura=Integer.parseInt(tableFacturas.getValueAt(tableFacturas.getSelectedRow(), 0).toString());
        if(new Compra().getComprasForFactura(pkFactura).size()==0){
            if (new Factura().deleteFactura(pkFactura)) {
                rdConsFacTodo.doClick();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No es posible eliminar una factura con compras asociadas.", "Error", JOptionPane.ERROR_MESSAGE , iconError);
        }
    }//GEN-LAST:event_btnEliminarFacturaActionPerformed
//FACTURA
    private void rdConsFacTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsFacTodoActionPerformed
        cbxConsFacMetodo.setEnabled(false);
        cbxConsFacMetodo.setSelectedIndex(0);
        txtConsFacDistribuidor.setEnabled(false);
        txtConsFacDistribuidor.setText("");
        tableFacturas.clearSelection();
        tableFilter("", tableFacturas);
        ArrayListToTable(tableFacturas, new Factura().getAllFacturas());
    }//GEN-LAST:event_rdConsFacTodoActionPerformed
//FACTURA
    private void btnEliminarCompraFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCompraFacActionPerformed
        Compra c=new Compra().getCompraForPk(Integer.parseInt(tableCompras.getValueAt(tableCompras.getSelectedRow(), 0).toString()));
        if (c!=null) {
            if (new Compra().deleteCompra(c.getIdcompra())) {
                Factura f=new Factura().getFactura(tableFacturas.getValueAt(tableFacturas.getSelectedRow(), 0).toString());
                //PROCESO DE MODIFICACION DE FACTURA
                new Factura().updateFactura(f);
                ArrayList<Libro> a=new Libro().getLibrosForIsbn(tableCompras.getValueAt(tableCompras.getSelectedRow(), 2).toString());
                for (int i = 0; i < c.getCantidad(); i++) {
                    new Libro().deleteLibro(a.get(i).getId()+"");
                }
            }
        }
          rdConsFacTodo.doClick();
    }//GEN-LAST:event_btnEliminarCompraFacActionPerformed

    private void btnAdminComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminComprasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminComprasMouseEntered

    private void btnAdminComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminComprasActionPerformed
        execBtnMenu(btnAdminCompras);
    }//GEN-LAST:event_btnAdminComprasActionPerformed

    private void btnNuevoAutorAñadAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAutorAñadAutActionPerformed
        jDialogAñadeAutor.dispose();
        dialogAtras=jDialogAñadeAutor;
        execBtnMenu(btnAutor);
    }//GEN-LAST:event_btnNuevoAutorAñadAutActionPerformed

    private void btnConfirmAñadAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmAñadAutActionPerformed
        jDialogAñadeAutor.dispose();
    }//GEN-LAST:event_btnConfirmAñadAutActionPerformed

    private void btnLimpiarAñadAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarAñadAutActionPerformed
        tableAutorAñadidos.selectAll();
        btnAutorToLeftAñadAut.doClick();
    }//GEN-LAST:event_btnLimpiarAñadAutActionPerformed

    private void btnAutorToRightAñadAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorToRightAñadAutActionPerformed
        TableToTable(tableAutorAñadir, tableAutorAñadidos);
    }//GEN-LAST:event_btnAutorToRightAñadAutActionPerformed

    private void btnAutorToLeftAñadAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorToLeftAñadAutActionPerformed
        TableToTable(tableAutorAñadidos, tableAutorAñadir);
    }//GEN-LAST:event_btnAutorToLeftAñadAutActionPerformed

    private void btnAutEditar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutEditar4ActionPerformed
        String error="";
        if (tableDetallesFactura.getRowCount()<1) {
            error=error+"- La Factura debe contener al menos una compra.\n";
        }
        if (cbxMetodoPagoNuevaCompra.getSelectedIndex()<1) {
            error=error+"- Debe seleccionar un método de pago.\n";
        }
        if (error.isEmpty()) {
            confirmaFactura();
        }else{
            JOptionPane.showMessageDialog(null, "No es posible continuar debido a lo siguiente:\n"+error, "Error en datos", 1 , iconError);
        }
        
    }//GEN-LAST:event_btnAutEditar4ActionPerformed

    private void btnLimpiarComprasFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarComprasFacturaActionPerformed
        deleteRowSelectedToTable(tableDetallesFactura);
        preciosFactura();
    }//GEN-LAST:event_btnLimpiarComprasFacturaActionPerformed

    private void btnNuevaEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaEditorialActionPerformed
        execBtnMenu(btnDetalles);
        subPanelIdioma.setVisible(false);
        subPanelCategoria.setVisible(false);
    }//GEN-LAST:event_btnNuevaEditorialActionPerformed

    private void btnNuevoDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDistribuidorActionPerformed
        execBtnMenu(btnDistribuidor);
    }//GEN-LAST:event_btnNuevoDistribuidorActionPerformed

    private void btnLimpiarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarLibroActionPerformed
        if (btnLimpiarLibro.getText().equals("Limpiar")) {
            limpiarDetalleCompra();
        }else if (btnLimpiarLibro.getText().equals("Cancelar")){
            preNewLibro();
        }
        
    }//GEN-LAST:event_btnLimpiarLibroActionPerformed

    private void txtNroFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroFacturaKeyTyped
        txtLimite(txtNroFactura, 10, evt);
        txtOnlyNums(evt);
    }//GEN-LAST:event_txtNroFacturaKeyTyped

    private void txtIsbnLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIsbnLibroKeyTyped
        txtLimite(txtIsbnLibro, 13, evt);
        txtOnlyNums(evt);
    }//GEN-LAST:event_txtIsbnLibroKeyTyped

    private void txtCantidadLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadLibroKeyTyped
        txtLimite(txtCantidadLibro, 2, evt);
        txtOnlyNums(evt);
    }//GEN-LAST:event_txtCantidadLibroKeyTyped

    private void txtTituloLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloLibroKeyTyped
        txtLimite(txtTituloLibro, 30, evt);
        txtAlphaNumericWithSpace(evt);
    }//GEN-LAST:event_txtTituloLibroKeyTyped

    private void txtPaginasLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaginasLibroKeyTyped
        txtLimite(txtPaginasLibro, 4, evt);
        txtOnlyNums(evt);
    }//GEN-LAST:event_txtPaginasLibroKeyTyped

    private void txtPrecioLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioLibroKeyTyped
        txtLimite(txtPrecioLibro, 8, evt);
        txtOnlyNums(evt);
    }//GEN-LAST:event_txtPrecioLibroKeyTyped

    private void yearChooserAnoLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearChooserAnoLibroKeyTyped
        
    }//GEN-LAST:event_yearChooserAnoLibroKeyTyped

    private void txtConsultaAñadeAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaAñadeAutorKeyTyped
        txtLimite(txtConsultaAñadeAutor, 20, evt);
        txtAlphaNumericWithSpace(evt);
    }//GEN-LAST:event_txtConsultaAñadeAutorKeyTyped

    private void rdBtnConsultaAutorAñadAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnConsultaAutorAñadAutActionPerformed
       txtConsultaAñadeAutor.setEnabled(true);
    }//GEN-LAST:event_rdBtnConsultaAutorAñadAutActionPerformed

    private void rdBtnConsultaTodoAñadAutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnConsultaTodoAñadAutActionPerformed
        txtConsultaAñadeAutor.setEnabled(false);
        txtConsultaAñadeAutor.setText("");
        tableFilter("", tableAutorAñadir);
    }//GEN-LAST:event_rdBtnConsultaTodoAñadAutActionPerformed

    private void txtConsultaAñadeAutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaAñadeAutorKeyReleased
        tableFilter(txtConsultaAñadeAutor.getText(), tableAutorAñadir);
    }//GEN-LAST:event_txtConsultaAñadeAutorKeyReleased

    private void jDialogAñadeAutorWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialogAñadeAutorWindowClosed
        if (jDialogAñadeAutor.getName().equals("Factura")) {
            lblCountAutorAñad.setText("("+tableAutorAñadidos.getRowCount()+")");
        }else if (jDialogAñadeAutor.getName().equals("Libro")){
            lblCountAutorAñad.setText("(0)");
        }
    }//GEN-LAST:event_jDialogAñadeAutorWindowClosed

    private void btnNuevaCategoriaAñadCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCategoriaAñadCatActionPerformed
        jDialogAñadeCategoria.dispose();
        dialogAtras=jDialogAñadeCategoria;
        execBtnMenu(btnDetalles);
        subPanelEditorial.setVisible(false);
        subPanelIdioma.setVisible(false);
    }//GEN-LAST:event_btnNuevaCategoriaAñadCatActionPerformed

    private void btnConfirmAñadCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmAñadCatActionPerformed
        jDialogAñadeCategoria.dispose();
    }//GEN-LAST:event_btnConfirmAñadCatActionPerformed

    private void txtConsultaAñadeCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaAñadeCategoriaKeyTyped
        txtLimite(txtConsultaAñadeCategoria, 15, evt);
        txtOnlyTextWithSpace(evt);
    }//GEN-LAST:event_txtConsultaAñadeCategoriaKeyTyped

    private void txtConsultaAñadeCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaAñadeCategoriaKeyReleased
        tableFilter(txtConsultaAñadeCategoria.getText(), tableCategoriaAñadir);
    }//GEN-LAST:event_txtConsultaAñadeCategoriaKeyReleased

    private void rdBtnConsultaTodoAñadCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnConsultaTodoAñadCatActionPerformed
        txtConsultaAñadeCategoria.setEnabled(false);
        txtConsultaAñadeCategoria.setText("");
        tableFilter("", tableCategoriaAñadir);
    }//GEN-LAST:event_rdBtnConsultaTodoAñadCatActionPerformed

    private void rdBtnConsultaCategoriaAñadCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnConsultaCategoriaAñadCatActionPerformed
        txtConsultaAñadeCategoria.setEnabled(true);
    }//GEN-LAST:event_rdBtnConsultaCategoriaAñadCatActionPerformed

    private void btnLimpiarAñadCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarAñadCatActionPerformed
        tableCategoriaAñadidas.selectAll();
        btnCategoriaToLeftAñadCat.doClick();
    }//GEN-LAST:event_btnLimpiarAñadCatActionPerformed

    private void btnCategoriaToRightAñadCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaToRightAñadCatActionPerformed
        TableToTable(tableCategoriaAñadir, tableCategoriaAñadidas);
    }//GEN-LAST:event_btnCategoriaToRightAñadCatActionPerformed

    private void btnCategoriaToLeftAñadCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaToLeftAñadCatActionPerformed
        TableToTable(tableCategoriaAñadidas, tableCategoriaAñadir);
    }//GEN-LAST:event_btnCategoriaToLeftAñadCatActionPerformed

    private void jDialogAñadeCategoriaWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialogAñadeCategoriaWindowClosed
        if (jDialogAñadeCategoria.getName().equals("Factura")) {
            lblCountCategoriaAñad.setText("("+tableCategoriaAñadidas.getRowCount()+")");
        }else if (jDialogAñadeCategoria.getName().equals("Libro")){
            lblCountCategoriaAñad.setText("(0)");
        }
    }//GEN-LAST:event_jDialogAñadeCategoriaWindowClosed

    private void btnNuevoIdiomaAñadIdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoIdiomaAñadIdiActionPerformed
        jDialogAñadeIdioma.dispose();
        dialogAtras=jDialogAñadeIdioma;
        execBtnMenu(btnDetalles);
        subPanelEditorial.setVisible(false);
        subPanelCategoria.setVisible(false);
    }//GEN-LAST:event_btnNuevoIdiomaAñadIdiActionPerformed

    private void btnConfirmAñadIdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmAñadIdiActionPerformed
        jDialogAñadeIdioma.dispose();
    }//GEN-LAST:event_btnConfirmAñadIdiActionPerformed

    private void txtConsultaAñadeIdiomaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaAñadeIdiomaKeyTyped
        txtLimite(txtConsultaAñadeIdioma, 15, evt);
        txtOnlyTextWithoutSpace(evt);
    }//GEN-LAST:event_txtConsultaAñadeIdiomaKeyTyped

    private void txtConsultaAñadeIdiomaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaAñadeIdiomaKeyReleased
         tableFilter(txtConsultaAñadeIdioma.getText(), tableIdiomaAñadir);
    }//GEN-LAST:event_txtConsultaAñadeIdiomaKeyReleased

    private void rdBtnConsultaTodoAñadIdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnConsultaTodoAñadIdiActionPerformed
        txtConsultaAñadeIdioma.setEnabled(false);
        txtConsultaAñadeIdioma.setText("");
        tableFilter("", tableIdiomaAñadir);
    }//GEN-LAST:event_rdBtnConsultaTodoAñadIdiActionPerformed

    private void rdBtnConsultaIdiomaAñadIdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnConsultaIdiomaAñadIdiActionPerformed
        txtConsultaAñadeIdioma.setEnabled(true);
    }//GEN-LAST:event_rdBtnConsultaIdiomaAñadIdiActionPerformed

    private void btnLimpiarAñadIdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarAñadIdiActionPerformed
        tableIdiomaAñadidos.selectAll();
        btnIdiomaToLeftAñadIdi.doClick();
    }//GEN-LAST:event_btnLimpiarAñadIdiActionPerformed

    private void btnIdiomaToRightAñadIdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdiomaToRightAñadIdiActionPerformed
        TableToTable(tableIdiomaAñadir, tableIdiomaAñadidos);
    }//GEN-LAST:event_btnIdiomaToRightAñadIdiActionPerformed

    private void btnIdiomaToLeftAñadIdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdiomaToLeftAñadIdiActionPerformed
        TableToTable(tableIdiomaAñadidos, tableIdiomaAñadir);
    }//GEN-LAST:event_btnIdiomaToLeftAñadIdiActionPerformed

    private void jDialogAñadeIdiomaWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialogAñadeIdiomaWindowClosed
        if (jDialogAñadeIdioma.getName().equals("Factura")) {
            lblCountIdiomaAñad.setText("("+tableIdiomaAñadidos.getRowCount()+")");
        }else if (jDialogAñadeIdioma.getName().equals("Libro")){
            lblCountIdiomaAñad.setText("(0)");
        }
    }//GEN-LAST:event_jDialogAñadeIdiomaWindowClosed

    private void btnAñadeIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadeIdiomaActionPerformed
        if (jDialogAñadeIdioma.getName().equals("Libro")) {
            btnLimpiarAñadIdi.doClick();
        }
        jDialogAñadeIdioma.setLocationRelativeTo(this);
        jDialogAñadeIdioma.setName("Factura");
        jDialogAñadeIdioma.setVisible(true);
    }//GEN-LAST:event_btnAñadeIdiomaActionPerformed

    private void txtTituloLibroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTituloLibroFocusLost
       txtTituloLibro.setText(quitaEspacios(txtTituloLibro.getText()).toUpperCase());
    }//GEN-LAST:event_txtTituloLibroFocusLost

    private void txtPrecioLibroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioLibroFocusLost
        if (!txtPrecioLibro.getText().isEmpty()) {
            DecimalFormat df = new DecimalFormat("");
            txtPrecioLibro.setText(df.format(Double.parseDouble(txtPrecioLibro.getText())));
        }
    }//GEN-LAST:event_txtPrecioLibroFocusLost

    private void txtIsbnLibroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIsbnLibroFocusLost
        if (!txtIsbnLibro.getText().isEmpty()) {
            LibIsbn=new LibroIsbn().existLibroIsbn(txtIsbnLibro.getText());
            procesaIsbn(LibIsbn);
        } 
        
    }//GEN-LAST:event_txtIsbnLibroFocusLost

    private void txtIsbnLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbnLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsbnLibroActionPerformed

    private void txtIsbnLibroConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIsbnLibroConsultaKeyReleased
        tableFilter(txtIsbnLibroConsulta.getText(), tableLibroConsulta);
    }//GEN-LAST:event_txtIsbnLibroConsultaKeyReleased

    private void rdConsultaLibroFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsultaLibroFiltroActionPerformed
        txtIsbnLibroConsulta.setEnabled(false);
        cbxFiltroLibro.setEnabled(true);
        txtFiltroLibro.setEnabled(true);
    }//GEN-LAST:event_rdConsultaLibroFiltroActionPerformed

    private void txtFiltroLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroLibroKeyTyped
        txtAlphaNumericWithSpace(evt);
        txtLimite(txtFiltroLibro, 20, evt);
    }//GEN-LAST:event_txtFiltroLibroKeyTyped

    private void txtFiltroLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroLibroKeyReleased
        switch (cbxFiltroLibro.getSelectedItem().toString()) {
            case "Título":
                ArrayListToTable(tableLibroConsulta, LibIsbn.getIsbnForTitulo(txtFiltroLibro.getText()));
                break;
            case "Autor":
                ArrayListToTable(tableLibroConsulta, LibIsbn.getIsbnForAutor(txtFiltroLibro.getText()));
                break;
            case "Categoría":
                ArrayListToTable(tableLibroConsulta, LibIsbn.getIsbnForCategoria(txtFiltroLibro.getText()));
                break;
            case "Idioma":
                ArrayListToTable(tableLibroConsulta, LibIsbn.getIsbnForIdioma(txtFiltroLibro.getText()));
                break;
            case "Editorial":
                ArrayListToTable(tableLibroConsulta, LibIsbn.getIsbnForEditorial(txtFiltroLibro.getText()));
                break;
            default:
                
                break;
        }
        
        
    }//GEN-LAST:event_txtFiltroLibroKeyReleased

    private void tableLibroConsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLibroConsultaMouseExited
        jDialogResumenLibro.setVisible(false);
    }//GEN-LAST:event_tableLibroConsultaMouseExited

    private void tableLibroConsultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLibroConsultaMouseEntered
        
    }//GEN-LAST:event_tableLibroConsultaMouseEntered

    private void rdConsultaLibroIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdConsultaLibroIsbnActionPerformed
        cbxFiltroLibro.setEnabled(false);
        txtFiltroLibro.setEnabled(false);
        txtIsbnLibroConsulta.setEnabled(true);
    }//GEN-LAST:event_rdConsultaLibroIsbnActionPerformed

    private void txtIsbnLibroConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIsbnLibroConsultaKeyTyped
        txtLimite(txtIsbnLibroConsulta, 13, evt);
        txtOnlyNums(evt);
    }//GEN-LAST:event_txtIsbnLibroConsultaKeyTyped

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLibrosActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       lblPortadaLibro.setText("PORTADA");
       lblPortadaLibro.setIcon(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseEntered
        panelBarraNavegacionLat.setLayout(null);
        btnLibros.setLocation(btnLibros.getX(), 370);
        panelBotonesCompra.setVisible(true);
    }//GEN-LAST:event_btnComprasMouseEntered

    private void btnComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseExited
    }//GEN-LAST:event_btnComprasMouseExited
       
    private void panelBotonesCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBotonesCompraMouseEntered
        
    }//GEN-LAST:event_panelBotonesCompraMouseEntered

    private void panelBotonesCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBotonesCompraMouseExited
       
    }//GEN-LAST:event_panelBotonesCompraMouseExited

    private void btnLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosMouseEntered
       panelBarraNavegacionLat.setLayout(null);
       panelBotonesLibro.setVisible(true);
    }//GEN-LAST:event_btnLibrosMouseEntered

    private void jDialogCamaraWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialogCamaraWindowClosed
        webcamPanel.stop();
    }//GEN-LAST:event_jDialogCamaraWindowClosed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            BufferedImage image = webcam.getImage();
            BufferedImage image2 = image.getSubimage(220, 1, 291 ,450 );
            Icon icon=(Icon)new ImageIcon((Image)image2.getScaledInstance(97, 150, 0));
            lblPortadaLibro.setText("");
            lblPortadaLibro.setIcon(icon);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        txtConsFacDistribuidor.setEnabled(true);
        cbxConsFacMetodo.setEnabled(false);
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        cbxConsFacMetodo.setEnabled(true);
        txtConsFacDistribuidor.setEnabled(false);
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void txtConsFacDistribuidorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsFacDistribuidorKeyTyped
        txtLimite(txtConsFacDistribuidor, 30, evt);
        txtAlphaNumericWithSpace(evt);
    }//GEN-LAST:event_txtConsFacDistribuidorKeyTyped

    private void txtConsFacDistribuidorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsFacDistribuidorKeyReleased
         tableFilter(txtConsFacDistribuidor.getText(), tableFacturas);
    }//GEN-LAST:event_txtConsFacDistribuidorKeyReleased

    private void cbxConsFacMetodoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxConsFacMetodoItemStateChanged
        if (cbxConsFacMetodo.getSelectedIndex()>0) {
            int cod= codForComboSelected(cbxConsFacMetodo);
            ArrayListToTable(tableFacturas, new Factura().getFacturasForMetodoPago(cod));
        }
    }//GEN-LAST:event_cbxConsFacMetodoItemStateChanged

/* -------------------------------------------------------------------------- INICIO METODOS GENERALES ----- */
    
    /**
     * Permite disponibilizar el panel solicitado por el usuario y esconder el que no sea necesario.
     * @param btn JButton que se presiona para ejecutar este método, el cual quiere ser visibilizado.
     */
    public void execBtnMenu(JButton btn){
        
        for (JPanel panel : paneles) {
            if (panel.getName().equals(quitaEspacios(btn.getText()))) {
                panel.setVisible(true);
                if (panel.getName().equals(quitaEspacios(btnDetalles.getText()))) {
                    subPanelIdioma.setVisible(true);
                    subPanelEditorial.setVisible(true);
                    subPanelCategoria.setVisible(true);
                }
            }else{
                panel.setVisible(false);
            }
        }
    }
        
    /**
     * Este método elimina todas la filas de una tabla.
     *
     * @param tabla - JTable del cual se eliminarán todos sus registros.
     */
    public void limpiarTabla(JTable tabla) {
        dfmodel = (DefaultTableModel) tabla.getModel(); //Se obtiene el modelo del JTable proporcionado y se asigna a un DefaultTableModel.
        int rows = dfmodel.getRowCount(); //Se cuentan las filas que tiene el DefaultTableModel.
        for (int i = 0; rows > i; i++) { //Se recorre cada una de las filas del DefaultTableModel.
            dfmodel.removeRow(0); //Se elimina siempre la fila cero, porque al eliminar una fila, las de abajo ruedan posición. Ejemplo, de una tabla de 5 filas, si se elimina la 3, la que antes de la eliminacion era la 4 pasara a ser la 3 y la 5 pasara a ser 4. Por lo que conviene eliminar siempre la fila cero en el For.
        }
        tabla.setModel(dfmodel); // Se asigna el DefaultTableModel (ya limpio de filas) a la tabla proporcionada.
    }

    /**
     * Este método se encarga de trasladar la fila seleccionada en la tabla1 a
     * la tabla2.
     *
     * @param tabla1 - Hace referencia a la tabla desde la cual será extraida la
     * fila, la cual debe tener una fila seleccionada. En caso de tener varias
     * filas seleccionadas, tomará en cuenta solo la primera fila de la
     * selección.
     * @param tabla2 - Hace referencia a la tabla que recibirá la fila
     * proveniente de la tabla1.
     */
    public void TableToTable(JTable tabla1, JTable tabla2) {
        if (tabla1.getSelectedRow() != -1) { //Se evalua que la tabla1 tenga al menos una fila seleccionada.
            ArrayList<Vector> rows= new ArrayList<>();
            //tabla1.getSelectedRow(); 
            
            dfmodel = (DefaultTableModel) tabla1.getModel(); //Se asigna el modelo de la tabla1 a un DefaultTableModel
            for (int i = 0; i < tabla1.getSelectedRows().length; i++) {
                Vector row = new Vector(); //Se crea un vector.
                for (int j = 0; j < dfmodel.getColumnCount(); j++) {
                    row.addElement(tabla1.getValueAt(tabla1.getSelectedRows()[i], j)); //Se añaden los valores de la fila seleccionada al Vector "row".
                    
                }
                rows.add(row);
            }
            
            for (Vector r : rows) {
                String pk= r.get(0).toString();
                for (int i = 0; i < dfmodel.getRowCount(); i++) {
                    if (pk.equals(dfmodel.getValueAt(i, 0).toString())) {
                        dfmodel.removeRow(i);
                    }
                }
            }
            tabla1.setModel(dfmodel); //Se asigna el DefaultTableModel a la tabla1 (Con la eliminacion anterior).
            
            dfmodel = (DefaultTableModel) tabla2.getModel(); //Se asigna el modelo de la tabla2 a un DefaultTableModel.
            for (Vector r : rows) {
                dfmodel.addRow(r); //Se añade la fila (el vector "row") al DefaultTableModel.
            }
            tabla2.setModel(dfmodel); //Se asigna el DefaultTableModel a la tabla2.
        } 
    }
      
    public void deleteRowSelectedToTable(JTable tabla){
        dfmodel=(DefaultTableModel)tabla.getModel();
        dfmodel.removeRow(tabla.getSelectedRow());
        tabla.setModel(dfmodel);
    }
    
    /**
     * Método que permite aplicar un filtro a una tabla específica.
     * @param consult String que queremos buscar en la tabla.
     * @param table JTable donde aplicaremos el filtro.
     */
    public void tableFilter(String consult, JTable table){
        dfmodel=(DefaultTableModel)table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dfmodel);
        table.setRowSorter(tr);
        if (consult.isEmpty()) {
            tr.setRowFilter(null);
        }else{
            tr.setRowFilter(RowFilter.regexFilter(consult.toUpperCase()));
        }
    }
    
     /**
     * Este método nos ayuda a solo permitir números en un campo de texto.
     *
     * @param e - Hace referecnia al KeyEvent que será evaluado. Si el usuario
     * pulsó alguna tecla que no sea númerica, se ignora el evento (la tecla).
     */
    public void txtOnlyNums(KeyEvent e) {
        if (e.getKeyCode() != 8 || e.getKeyCode() != 46) {//Se evalua que la tecla precionada sea diferente de "Suprimir" o "BackSpace".
            try {
                Integer.parseInt(Character.toString(e.getKeyChar())); //Se intenta hacer un Parse de un Int. Si no se puede, quiere decir que NO es un número. De lograrse, no se hace nada.
            } catch (Exception ex) {
                e.consume(); //La tecla pulsada no es número, por lo que se ignora el evento (tecla).
            }
        }
    }

    /**
     * Este método nos ayuda a solo permitir números y la letra "k" en un campo
     * de texto.
     *
     * @param e Hace referencia al KeyEvent que será evaluado. Si el usuario
     * pulsó alguna tecla que no sea númerica o "k", se ignora el evento (la
     * tecla).
     */
    public void txtOnlyNumsAndK(KeyEvent e) {
        if (e.getKeyCode() != 8 || e.getKeyCode() != 46) {//Se evalua que la tecla precionada sea diferente de "Suprimir" o "BackSpace".
            try {
                Integer.parseInt(Character.toString(e.getKeyChar())); //Se intenta hacer un Parse de un Int. Si no se puede, quiere decir que NO es un número. De lograrse, no se hace nada.
            } catch (Exception ex) {
                if (!Character.toString(e.getKeyChar()).equalsIgnoreCase("k")) {
                    e.consume(); //La tecla pulsada no es número, por lo que se ignora el evento (tecla).    
                }
            }
        }
    }

    /**
     * Este método nos ayuda a solo permitir Alfa Numéricos y espacios en un
     * campo de texto.
     *
     * @param e - Hace referecnia al KeyEvent que será evaluado. Si el usuario
     * pulsó alguna tecla que no cumpla al condición, se ignora el evento (la
     * tecla).
     */
    public void txtAlphaNumericWithSpace(KeyEvent e) {
        if (e.getKeyCode() != 8 || e.getKeyCode() != 46) {//Se evalua que la tecla precionada sea diferente de "Suprimir" o "BackSpace".
            try {
                Integer.parseInt(Character.toString(e.getKeyChar())); //Se intenta hacer un Parse de un Int. Si no se puede, quiere decir que NO es un número. De lograrse, no se hace nada.
            } catch (Exception ex) {
                if (Character.isLetter(e.getKeyChar()) || Character.isSpaceChar(e.getKeyChar())) { //Como no es un número se evalua si es Letra o Espacio.
                } else { //De no ser letra, ni espacio, ni tampoco número, quiere decir que es algun Símbolo.
                    e.consume(); //Como es un símbolo, se ignora el evento (tecla).
                }
            }
        }
    }

    /**
     * Este método nos ayuda a solo permitir letras y espacios en un campo de
     * texto. Probado en KeyTyped.
     *
     * @param e - Hace referecnia al KeyEvent que será evaluado. Si el usuario
     * pulsó alguna tecla que no cumpla al condición, se ignora el evento (la
     * tecla).
     */
    public void txtOnlyTextWithSpace(KeyEvent e) {
        if (e.getKeyCode() != 8 || e.getKeyCode() != 46) { //Se evalua que la tecla precionada sea diferente de "Suprimir" o "BackSpace".
            if (Character.isLetter(e.getKeyChar()) || Character.isSpaceChar(e.getKeyChar())) { //Si la tecla accionada es letra o espacio no hace nada.
            } else {
                e.consume(); //De lo contrario, ignora el evento (tecla).
            }
        }
    } //METODO PARA VALIDAR SOLO LETRAS CON ESPACIOS (DEBE IR EN EL EVENTO KEYTYPED DEL JTEXTFIELD).

    /**
     * Este método nos ayuda a solo permitir letras sin espacios en un campo de
     * texto. Probado en KeyTyped.
     *
     * @param e - Hace referecnia al KeyEvent que será evaluado. Si el usuario
     * pulsó alguna tecla que no cumpla al condición, se ignora el evento (la
     * tecla).
     */
    public void txtOnlyTextWithoutSpace(KeyEvent e) {
        if (e.getKeyCode() != 8 || e.getKeyCode() != 46) {//Se evalua que la tecla presionada sea diferente de "Suprimir" o "BackSpace".
            if (!Character.isLetter(e.getKeyChar())) { //Si la tecla accionada es diferente de una letra.
                e.consume(); //Entonces ignora el evento (tecla).
            }// De ser una letra, no hace nada.
        }
    } //METODO PARA VALIDAR SOLO LETRAS SIN ESPACIOS (DEBE IR EN EL EVENTO KEYTYPED DEL JTEXTFIELD).

    /**
     * Este método nos permite establecer un límite de dígitos a ingresar en un
     * campo de texto. Probado en KeyTyped.
     *
     * @param txt - Hace referencia al JTextField que será limitado.
     * @param limit - Hace referencia al número límite de dígitos que seran
     * permitidos.
     * @param e - Hace referecnia al KeyEvent que será evaluado. Si el usuario
     * pulsó alguna tecla que no cumpla al condición, se ignora el evento (la
     * tecla).
     */
    public void txtLimite(JTextField txt, int limit, KeyEvent e) {
        if (txt.getText().length() == limit) {
            e.consume();
        }
    }

    /**
     * Este método verifica la valides de un rut (Rol Unico Tributario, solo
     * para Chile) proporcionado.
     *
     * @param rut identificador sin digito verificador, puede contener 8 o 7
     * dígitos, todos numéricos.
     * @param verif comprende un solo dígito númerico, del 0 al 9. Tambien es
     * válido recibir una "k" en este párametro.
     * @return true si el rut es válido, false si no cumple la validación.
     */
    public boolean validoRut(String rut, String verif) {
        String rut2 = "";
        int sum = 0, num = 0;
        int cont = 2, mod = 0;
        int dv;
        if (Integer.parseInt(rut) == 0) {
            return false;
        }
        if (rut.length() < 7) {
            return false;
        } else {
            for (int i = rut.length(); i > 0; i--) {
                num = Integer.parseInt(rut.substring(i - 1, i));
                sum = sum + (num * cont);
                cont++;
                if (cont == 8) {
                    cont = 2;
                }
            }
            mod = (sum % 11);
            dv = 11 - mod;
            switch (dv) {
                case 10:
                    return verif.equalsIgnoreCase("k");
                case 11:
                    if (!verif.equalsIgnoreCase("k")) {
                        return Integer.parseInt(verif) == 0;
                    }
                default:
                    if (!verif.equalsIgnoreCase("k")) {
                        return dv == Integer.parseInt(verif);
                    }
            }
        }
        return false;
    }
    
    /**
     * Este método elimina los espacios continuos de un String. Tambien elimina
     * espacios al comienzo o final del String.
     *
     * @param text - String del cual necesitamos eliminar los espacios
     * innecesarios.
     * @return String limpio, sin espacios no deseados.
     */
    public String quitaEspacios(String text) {
        text = text.replaceAll("\\s+", " "); //Se reemplazan dos espacios seguidos por uno solo.
        if (!text.isEmpty()) { //Si el texto contiene algo despues de la limpieza anterior.
            if (text.substring(0, 1).equals(" ")) { //Si encuentra un esapcio al comienzo del String.
                text = text.substring(1, text.length()); //Asigna a text el contenido del String pero ignorando el primer caracter, ya que es esapcio.
            }
            if (text.substring(text.length() - 1, text.length()).equals(" ")) { //Si encuentra un espacio al final del String
                text = text.substring(0, text.length() - 1); //Asigna a text el mismo String pero sin tomar en cuenta el ultimo caracter, ya que es espacio.
            }
        }
        return text; //Retorna el texto ya procesado.
    }
    
    /**
     * Método que permite seleccionar un Item de un JComboBox segun la id PK que le proporcionemos.
     * @param cbx JComboBox donde se ejecutará el proceso.
     * @param cod PK o identificador que permitirá hacer la relación.
     */
    public void objectToCombo(JComboBox cbx, String cod){
        String item;
        String cod2;
        for (int i = 0; i < cbx.getItemCount(); i++) {
            item=cbx.getItemAt(i).toString();
            cod2=item.substring(item.indexOf("-")+2,item.length());
            if (cod2.equals(cod)) {
                cbx.setSelectedIndex(i);
            }
        }
    }
    
    /**
     * Método para obtener la hora actual del sistema en formato (HH:mm) de 24 horas. 
     * @return String con hora del sistema
     */
    public String getActualTime(){
       return new SimpleDateFormat("HH:mm").format(new Date());
    }
    
    /**
     * Método que permite obtener la fecha del sistema en formato dd/mm/yyyy. 
     * @return String con fecha del sistema.
     */
    public String getActualDate(){
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }
    
    /**
     * Método que nos permite obtener el año actual en formato yyyy.
     * @return String con año del sistema.
     */
    public String getActualYear(){
        return new SimpleDateFormat("yyyy").format(new Date());
    }
    
    /**
     * Método que plasma en una tabla el contenido de un ArrayList.
     * @param tabla Donde se desean mostrar los datos.
     * @param lista Donde estan los datos previamente almacenados.
     */
    public void ArrayListToTable(JTable tabla, ArrayList<Vector> lista){
        limpiarTabla(tabla);
        dfmodel=(DefaultTableModel)tabla.getModel();
        for (Vector vector : lista) {
            dfmodel.addRow(vector);
        }
        tabla.setModel(dfmodel);
    }
    
    /**
     * Permite identificar el RadioButton que se encuentra seleccionado de un ButtonGroup.
     * @param group Grupo de botones del cual se desea identificar el elemento seleccionado.
     * @return JRadioButton seleccionado. Si retorna null es porque no hay ninguna seleecion.
     */
    public JRadioButton radioButtonSelected(ButtonGroup group){
        for (Enumeration e = group.getElements(); e.hasMoreElements();) {
            JRadioButton btn = (JRadioButton)e.nextElement();
            if (btn.getModel()==group.getSelection()) {  
                return btn;
            }
        }       
        return null;
    }
    
    /**
     *  Permite establecer un Listener a una tabla, para que realice una acción cuando se seleccione una celda.
     * @param btnEd JButton Editar que reaccionará al Listener de la Tabla.
     * @param btnEl JButton Eliminar que reaccionará al Listener de la Tabla.
     * @param tabla JTable a la cual se desea agregar el Listener.
     */
    public void selectionTableListener(JButton btnEd, JButton btnEl, JTable tabla){
        ListSelectionModel lsmod ;
        lsmod = tabla.getSelectionModel();
        lsmod.addListSelectionListener(new MyListSelectionListener(btnEd,btnEl,tabla));
        tabla.setSelectionModel(lsmod);
    }
    
    /**
     * Clase que permite crear un objeto de tipo ListSelectionListener para agregar luego implementar evento a tabla, y poder saber cuando es seleccionada una fila.
     */
    class MyListSelectionListener implements ListSelectionListener{
        JButton btnEd;
        JButton btnEl;
        JTable tabla;

        public MyListSelectionListener(JButton btnEd, JButton btnEl, JTable tabla) {
            this.btnEd = btnEd;
            this.btnEl = btnEl;
            this.tabla = tabla;
        }
        @Override
        public void valueChanged(ListSelectionEvent e) {   
            if (tabla.getSelectedRow()!=-1) {
                btnEd.setEnabled(true);
                btnEl.setEnabled(true);
            }else{
                btnEd.setEnabled(false);
                btnEl.setEnabled(false);
            }        
        }
    }
    
     /**
     *  Permite establecer un Listener a una tabla, para que realice una acción cuando se seleccione una celda.
     * @param btnEd JButton Editar que reaccionará al Listener de la Tabla.
     * @param btnEl JButton Eliminar que reaccionará al Listener de la Tabla.
     * @param tabla JTable a la cual se desea agregar el Listener.
     */
    public void selectionTableListener2(JTable tabla1, JTable tabla2){
        ListSelectionModel lsmod ;
        lsmod = tabla1.getSelectionModel();
        lsmod.addListSelectionListener(new MyListSelectionListener2(tabla1,tabla2));
        tabla1.setSelectionModel(lsmod);
    }
    
    /**
     * Clase que permite crear un objeto de tipo ListSelectionListener para agregar luego implementar evento a tabla, y poder saber cuando es seleccionada una fila.
     */
    class MyListSelectionListener2 implements ListSelectionListener{
        JTable tabla1;
        JTable tabla2;

        public MyListSelectionListener2(JTable tabla1, JTable tabla2) {
            this.tabla1 = tabla1;
            this.tabla2 = tabla2;
        }
        @Override
        public void valueChanged(ListSelectionEvent e) {   
            if (tabla1.getSelectedRow()!=-1) {
                panelComprasFactura.setVisible(true);
                ArrayListToTable(tabla2, new Compra().getComprasForFactura(Integer.parseInt(tabla1.getValueAt(tabla1.getSelectedRow(), 0).toString())));
            }else{
                panelComprasFactura.setVisible(false);
            }        
        }
    }
    
    public void turnRightImage(){
            Icon icon=lblPortadaLibro.getIcon();
        Image img;
        if (icon instanceof ImageIcon) {
            img=((ImageIcon)icon).getImage();
        } else {
            int w = icon.getIconWidth();
            int h = icon.getIconHeight();
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice gd = ge.getDefaultScreenDevice();
            GraphicsConfiguration gc = gd.getDefaultConfiguration();
            BufferedImage image = gc.createCompatibleImage(w, h);
            Graphics2D g = image.createGraphics();
            icon.paintIcon(null, g, 0, 0);
            g.dispose();
            img= image;
        }
        rotacion=rotacion+1.5708;
        AffineTransform tx = AffineTransform.getRotateInstance(rotacion, icon.getIconWidth()/2, icon.getIconHeight()/2);
        // dibujado con la AffineTransform de rotacion
        Graphics2D g2=(Graphics2D)lblPortadaLibro.getGraphics();
        g2.drawImage( img, tx, this);
    }
    
    public void turnLeftImage(){
        Icon icon=lblPortadaLibro.getIcon();
        Image img;
        if (icon instanceof ImageIcon) {
            img=((ImageIcon)icon).getImage();
        } else {
            int w = icon.getIconWidth();
            int h = icon.getIconHeight();
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice gd = ge.getDefaultScreenDevice();
            GraphicsConfiguration gc = gd.getDefaultConfiguration();
            BufferedImage image = gc.createCompatibleImage(w, h);
            Graphics2D g = image.createGraphics();
            icon.paintIcon(null, g, 0, 0);
            g.dispose();
            img= image;
        }
        rotacion=rotacion-1.5708;
        AffineTransform tx = AffineTransform.getRotateInstance(rotacion, icon.getIconWidth()/2, icon.getIconHeight()/2);
        // dibujado con la AffineTransform de rotacion
        Graphics2D g2=(Graphics2D)lblPortadaLibro.getGraphics();
        g2.drawImage( img, tx, this);
        lblPortadaLibro.setIcon(icon);
    
    }
    
    /**
     * Método que permite convertir un objeto Icon a Blob.
     * @param icon Icon que se desea convertir.
     * @return Blob con imagen.
     */
    public Blob IconToBlob(Icon icon){
        Blob blob=null;
        Image image=((ImageIcon)icon).getImage();
        BufferedImage img = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = img.createGraphics();
        g2d.drawImage(image, 0, 0, null);
        g2d.dispose();
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(img, "jpg", baos);
            baos.flush();
            byte[] imageInByte = baos.toByteArray();
            baos.close();
            blob=new SerialBlob(imageInByte);
            return blob;
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return blob;
    }
    
    /**
     * Método que permite convertir un objeto Blob a un Icon.
     * @param blob Blob que se desea convertir.
     * @return Icon resultado de la conversión.
     */
    public Icon BlobToIcon(Blob blob){
        Icon icon=null;
        try {
            byte[] imageInByte = blob.getBytes(1, (int) blob.length());
            ByteArrayInputStream bis = new ByteArrayInputStream(imageInByte);
            BufferedImage bImage2 = ImageIO.read(bis);
            icon=(Icon)new ImageIcon((Image)bImage2);
            return icon;
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return icon;
    }
    
    /**
     * Método que permite obtener el código (pk) de un item seleccionado en un JComboBox. Para esto el código (pk) debe ser agregado con anterioridad, a la hora de listar los items dentro del JComboBox. 
     * @param cbx JComboBox de donde se obtendrá el código del item seleccionado.
     * @return int con el código.
     */
    public int codForComboSelected(JComboBox cbx){
        String selected=cbx.getSelectedItem().toString();
        int cod=Integer.parseInt(selected.substring(selected.indexOf("-")+2,selected.length()));
        return cod;
    }
    
    /**
     * Método que permite introducir informacion de un ArrayList en un JComboBox.
     * @param cbx JComboBox donde queremos listar la infromación.
     * @param lista ArrayList de Vectores de donde se extrae la infromación.
     * @param poscColumn Posicion en el Vector del valor importante a colocar en el JComboBox. Empieza en cero(0).
     */
    public void vectorsToComboBox(JComboBox cbx, ArrayList<Vector> lista, int poscColumn){
        cbx.removeAllItems();
        if (lista.size()>0) {
            cbx.addItem("Seleccione...");
            for (Vector v : lista) {
                cbx.addItem(v.get(poscColumn).toString()+" - "+v.get(0).toString());
            }
        }else{
            cbx.addItem("(Sin elementos)");
        }   
    }
        
    
/* ----------------------------------------------------------------------------------------------------- FIN METODOS GENERALES --------- */

    

/* ------------------------------------------------------------- -------------------------------------INICIO METODOS DISTRIBUIDOR ------ */

    /**
     * Este método se encarga de realizar la consulta de Distribuidor según
     * especificaciones del usuario en panel de Consultas.
     */
    public void consultaDistribuidor() {
        switch (radioButtonSelected(buttonGroupDist).getText()) {
            case "Todo":
                    ArrayListToTable(tablaDistCons, Dist.getAllDist());
                break;
            case "Código:":
                if (!txtCodConsDis.getText().isEmpty()) { //Se evalua si el campo tiene contenido.
                    ArrayList<Vector> ar=new ArrayList<>();
                    Vector row = new Vector();
                    if (Dist.getDist(Integer.parseInt(txtCodConsDis.getText()))!=null) {
                        Distribuidor d= Dist.getDist(Integer.parseInt(txtCodConsDis.getText()));
                        row.add(d.getCodigo());
                        row.add(d.getRut());
                        row.add(d.getNombre());
                        row.add(d.getAno());
                        row.add(d.getTelefono());
                        row.add(d.getDireccion());
                        ar.add(row);
                        ArrayListToTable(tablaDistCons, ar);
                    }else{
                        ArrayListToTable(tablaDistCons, Dist.getDistForRut(" "));
                    }
                    
                }
                break;
            case "Nombre:":
                if (!txtNomConsDis.getText().isEmpty()) { //Se evalua si el campo tiene contenido.
                    ArrayListToTable(tablaDistCons, Dist.getDistForName(txtNomConsDis.getText()));
                }
                break;                
            case "Rut:":
                if (!txtRutConsDis.getText().isEmpty()) { //Se evalua si el campo tiene contenido.
                    ArrayListToTable(tablaDistCons, Dist.getDistForRut(txtRutConsDis.getText()));
                }
                break;
            default:
                throw new AssertionError();
        }   
    }
    
    /**
     * Este método prepara la ventana dialDistribuidor para realizar un nuevo
     * ingreso de Distribuidor.
     */
    public void preNuevoDist() {
        //Se asigna encabezado al dial.
        lblModDist.setBorder(BorderFactory.createTitledBorder(null, "Nuevo Distribuidor", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14), java.awt.Color.darkGray));
        //Se hace disponible el campo de texto para ingresar el RUT.
        txtNuevoDistRut.setEnabled(true);
        txtNuevoDistDVrut.setEnabled(true);       
        btnLimpCampNuevDis.setText("Limpiar");
        // Se asigna nombre al boton de Registro.
        btnRegNuevDis.setText("Registrar");
        // Se ejecuta método para limpiar los campos de texto de dialDistribuidor.
        txtNuevoDistNom.setText("");
        txtNuevoDistRut.setText("");
        txtNuevoDisNroT.setText("");
        txtNuevoDisDir.setText("");
        txtNuevoDistDVrut.setText("");
        lblNuevoDistRutexiste.setText("");
        yearChooserNuevoDist.setYear(2018);
        txtNuevoDistNom.setBorder(g);
        txtNuevoDistRut.setBorder(g);
        txtNuevoDisNroT.setBorder(g);
        txtNuevoDisDir.setBorder(g);
        txtNuevoDistDVrut.setBorder(g);
        
    }

    /**
     * Este método vérifica que los campos introducidos en dialDistribuidor
     * cumplan con las validaciones correspondientes.
     *
     * @return Distribuidor - En caso de cumplir con todas las validaciones
     * retorna un objeto de tipo Distribuidor con los valores asignados. En caso
     * de no cumpliar con alguna validación retorna un null.
     */
    public Distribuidor verifyDistribuidor() {
        Distribuidor dis = new Distribuidor();
        //SE OBTIENEN LOS VALORES DE LOS CAMPOS DE TEXTOS
        String nom = quitaEspacios(txtNuevoDistNom.getText());
        String dir = quitaEspacios(txtNuevoDisDir.getText());
        String tel = txtNuevoDisNroT.getText();
        int ano = yearChooserNuevoDist.getYear();
        String rut = txtNuevoDistRut.getText() + txtNuevoDistDVrut.getText();
        //ASIGNANDO BORDES INICIALES A LOS CAMPOS
        txtNuevoDistNom.setBorder(g);
        txtNuevoDistRut.setBorder(g);
        txtNuevoDisDir.setBorder(g);
        txtNuevoDisNroT.setBorder(g);
        yearChooserNuevoDist.setBorder(g);
        //VALIDACIONES (Campo que no cumpla con la validacion se le asignará borde ROJO para ser identificado por el usuario).
        if(txtNuevoDistRut.isEnabled() && (lblNuevoDistRutexiste.getText().equalsIgnoreCase("Inválido") || lblNuevoDistRutexiste.getText().isEmpty() || lblNuevoDistRutexiste.getText().equalsIgnoreCase("Ya existe"))) {
            txtNuevoDistRut.setBorder(r);
        }else if (nom.isEmpty()) {
            txtNuevoDistNom.setBorder(r);
        } else if (tel.length() < 9) {
            txtNuevoDisNroT.setBorder(r);
        } else if (dir.length() < 5) {
            txtNuevoDisDir.setBorder(r);
        } else if (ano < 1970 || ano > 2018) {
            yearChooserNuevoDist.setBorder(r);
        } else { //SI PASA TODAS LAS VALIDACIONES ENTONCES SE ALMACENAN LOS DATOS EN UN OBJETO "DISTRIBUIDOR".
            dis.setDireccion(dir);
            dis.setNombre(nom);
            dis.setTelefono(tel);
            dis.setRut(rut);
            dis.setAno(ano);
            return dis;  // Se retorna el objeto Distribuidor con los valores asignados.
        }
        return null; // Se retorna null porque algun campo no cumplió la validación.
    }

    /**
     * Este método prepara la ventana dialDistribuidor para realizar una
     * modificación de Distribuidor seleccionado en JTable previamente.
     *
     * @param dis Distribuidor seleccionado de la JTable, con valores
     * recuperados de la base de datos.
     */
    public void preModifyDist(Distribuidor dis) {
        //Se asigna borde con titulo de Modificacion al panel.
        lblModDist.setBorder(BorderFactory.createTitledBorder(null, "Modificación Distribuidor", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14), java.awt.Color.darkGray));
        
        //Se asigna el rut y se hace NO disponible, debido a que no será editable por el usuario.
        txtNuevoDistRut.setText(dis.getRut().substring(0, dis.getRut().length() - 1));
        txtNuevoDistRut.setEnabled(false);
        txtNuevoDistRut.setBorder(g);
        txtNuevoDistDVrut.setText(dis.getRut().substring(dis.getRut().length() - 1, dis.getRut().length()));
        txtNuevoDistDVrut.setEnabled(false);
        txtNuevoDistDVrut.setBorder(g);
        //Se asigna el nombre.
        txtNuevoDistNom.setText(dis.getNombre());
        txtNuevoDistNom.setBorder(g);
        //Se asigna el año.
        yearChooserNuevoDist.setYear(dis.getAno());
        yearChooserNuevoDist.setBorder(g);
        //Se asigna el teléfono.
        txtNuevoDisNroT.setText(dis.getTelefono());
        txtNuevoDisNroT.setBorder(g);
        //Se asigna la dirección.
        txtNuevoDisDir.setText(dis.getDireccion());
        txtNuevoDisDir.setBorder(g);
        //Se hace NO visible el boton "Limpiar Campos".
        btnLimpCampNuevDis.setText("Cancelar");
        // Se asigna texto al boton Confirmar.
        btnRegNuevDis.setText("Confirmar");        
    }

    /**
     * Este método modifica un Distribuidor.
     *
     * @param dis - Hace referencia al objeto Distribuidor que ya trae las
     * modificaciones realizadas por el usuario.
     */
    public void modifyDist(Distribuidor dis) {
        
    }
    
    /**
     *Este método se ejecuta cuando el usuario presiona el boton de Eliminar, teniendo selecionado un Distribuidor en la tabla. 
     */
    public void deleteDistribuidor(){
        if (Dist.deleteDistribuidor(Integer.parseInt(tablaDistCons.getValueAt(tablaDistCons.getSelectedRow(),0).toString()))) {
            preNuevoDist();
            deleteRowSelectedToTable(tablaDistCons);
        }      
    }
    
/* ------------------------------------------------------------------------------------------------- FIN METODOS DISTRIBUIDOR ------ */
    
    
/*----------------------------------------------------------------------------------------------------- INICIO METODOS AUTOR ------ */  

    /**
     * Este método se ejecuta cuando el usuario elige algun RadioButton para consultar Autores.
     */
    public void radiosAutor(){
        switch (radioButtonSelected(buttonGroupAut).getText()) {
            case "Todo":
                txtAutorNombreCons.setEnabled(false);
                txtAutorApesCons.setEnabled(false);
                txtAutorCodCons.setEnabled(false);
                ArrayListToTable(tablaAutCons,Aut.getAllAutor());
                break;
            case "Código:":
                txtAutorNombreCons.setEnabled(false);
                txtAutorNombreCons.setText("");
                txtAutorApesCons.setEnabled(false);
                txtAutorApesCons.setText("");
                txtAutorCodCons.setEnabled(true);
                break;
            case "Nombre:":
                txtAutorNombreCons.setEnabled(true);
                txtAutorApesCons.setEnabled(false);
                txtAutorApesCons.setText("");
                txtAutorCodCons.setEnabled(false);
                txtAutorCodCons.setText("");
                break;                
            case "Apellidos:":
                txtAutorNombreCons.setEnabled(false);
                txtAutorNombreCons.setText("");
                txtAutorApesCons.setEnabled(true);
                txtAutorCodCons.setEnabled(false);
                txtAutorCodCons.setText("");
                break;
            default:
                throw new AssertionError();
        }   
    }
    
    /**
     * Este método se ejecuta cuando el usuario utiliza el boton para Registrar un nuevo Autor o confirmar los cambios de uno ya existente.
     */
    public void buttonAutor(){
        Autor a = verifyAutor();
        if (btnRegAutor.getText().equals("Registrar")) {
            if (a!=null) {
                if (!Aut.existeAutor(a)) {
                    if (Aut.insertAutor(a)) {
                        ArrayListToTable(tableAutorAñadir, Aut.getAllAutor());
                        limpiarTabla(tableAutorAñadidos);
                        preNuevoAutor();
                        consultaAutor();
                    }                    
                }else{
                    JOptionPane.showMessageDialog(null, "El Autor que intenta ingresar ya existe", "Error", 0,iconError);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Hay campos vacios!", "Error", 0,iconError);     
            }
        }else{
            if (a!=null) {
                if (!Aut.existeAutor(a)) {
                    if (Aut.updateAutor(a)) {
                        ArrayListToTable(tableAutorAñadir, Aut.getAllAutor());
                        limpiarTabla(tableAutorAñadidos);
                        preNuevoAutor();
                        consultaAutor();
                    }  
                }else{
                    JOptionPane.showMessageDialog(null, "El Autor que intenta ingresar ya existe", "Error", 0,iconError);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Hay campos vacios!", "Error", 0,iconError);     
            }  
        }
    }
    
    /**
     * Este método se encarga de identificar el tipo de consulta segun el RadioButton seleccionado por el usuario.
     */
    public void consultaAutor(){
        switch (radioButtonSelected(buttonGroupAut).getText()) {
            case "Todo":
                    ArrayListToTable(tablaAutCons, Aut.getAllAutor());
                break;
            case "Código:":
                if (!txtAutorCodCons.getText().isEmpty()) { //Se evalua si el campo tiene contenido.
                    ArrayListToTable(tablaAutCons, Aut.getAutorForId(Integer.parseInt(txtAutorCodCons.getText())));
                }
                break;
            case "Nombre:":
                if (!txtAutorNombreCons.getText().isEmpty()) { //Se evalua si el campo tiene contenido.
                    ArrayListToTable(tablaAutCons, Aut.getAutorForName(txtAutorNombreCons.getText()));
                }
                break;                
            case "Apellidos:":
                if (!txtAutorApesCons.getText().isEmpty()) { //Se evalua si el campo tiene contenido.
                    ArrayListToTable(tablaAutCons, Aut.getAutorForLastName(txtAutorApesCons.getText()));
                }
                break;
            default:
                throw new AssertionError();
        }   
    }
    
    /**
     * Este método se encarga de pintar o preparar el escenario antes de modificar un Autor.
     */
    public void preModifyAutor(){
        lblCuadroAutor.setBorder(BorderFactory.createTitledBorder(null, "Modificación Autor", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP, new Font("Tahoma", 1, 16), Color.darkGray));        
        lblCodigoAutor1.setText(tablaAutCons.getValueAt(tablaAutCons.getSelectedRow(),0).toString());
        txtAutorNombre.setText(tablaAutCons.getValueAt(tablaAutCons.getSelectedRow(),1).toString());
        txtAutorNombre.setBorder(g);
        txtAutorApeP.setText(tablaAutCons.getValueAt(tablaAutCons.getSelectedRow(),2).toString());
        txtAutorApeP.setBorder(g);
        txtAutorApeM.setText(tablaAutCons.getValueAt(tablaAutCons.getSelectedRow(),3).toString());
        txtAutorApeM.setBorder(g);
        btnRegAutor.setText("Modificar");
        btnLimpAutor.setText("Cancelar");
        lblCodigoAutor.setVisible(true);
        lblCodigoAutor1.setVisible(true);
                
        
    }
    
    /**
     * Este método se encarga de preparar el escenario para ingresar un nuevo Autor.
     */
    public void preNuevoAutor(){
        lblCuadroAutor.setBorder(BorderFactory.createTitledBorder(null, "Nuevo Autor", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP, new Font("Tahoma", 1, 16), Color.darkGray));
        txtAutorNombre.setText("");
        txtAutorApeP.setText("");
        txtAutorApeM.setText("");
        btnRegAutor.setText("Registrar");
        btnLimpAutor.setText("Limpiar");
        lblCodigoAutor.setVisible(false);
        lblCodigoAutor1.setVisible(false);
    }
    
    /**
     * Este método se encarga de verificar que el Autor que se ingresa o intenta modificar (sus campos) cumpla con los parametros.
     * @return Un objeto Autor si la verificación fue exitosa. Retorna null si algún campo no cumple.
     */
    public Autor verifyAutor(){
        Autor autor=new Autor();
        valida=true;
        if(txtAutorNombre.getText().isEmpty()){
            txtAutorNombre.setBorder(r);
            valida=false;
        }
        if (txtAutorApeP.getText().isEmpty()) {
            txtAutorApeP.setBorder(r);
            valida=false;
        }
        if (valida) {
            if (btnRegAutor.getText().equals("Modificar")) {
                autor.setCodigo(Integer.parseInt(lblCodigoAutor1.getText()));
            }
            autor.setNombre(txtAutorNombre.getText());
            autor.setApellidoP(txtAutorApeP.getText());
            autor.setApellidoM(txtAutorApeM.getText());
            return autor;
        }
        return null;
    }
    
    /**
     *Este método se ejecuta cuando el usuario presiona el boton Eliminar con un Autor seleccionado en la tabla. 
     */
    public void deleteAutor(){
        int id = Integer.parseInt(tablaAutCons.getValueAt(tablaAutCons.getSelectedRow(),0).toString());
        if (Aut.deleteAutor(id)) {
            preNuevoAutor();
            deleteRowSelectedToTable(tablaAutCons);
        }
    }
    
/*-------------------------------------------------------------------------------------------------------------------- FIN METODOS AUTOR --------*/
    
    
/*----------------------------------------------------------------------------------------------------------------- INICIO METODOS CATEGORIA --------*/
    
    /**
     * Este método se ejecuta cuando el usuario elige algun RadioButton para consultar Categorias.
     */
    public void radiosCategoria(){
        switch (radioButtonSelected(buttonGroupCat).getText()) {
            case "Todo":
                txtCatCodCons.setEnabled(false);
                txtCatCodCons.setText("");
                txtCategoriaCons.setEnabled(false);
                txtCategoriaCons.setText("");
                ArrayListToTable(tablaCategoriaCons, Cat.getAllCategorias());
                break;
            case "Código:":
                txtCatCodCons.setEnabled(true);
                txtCategoriaCons.setEnabled(false);
                txtCategoriaCons.setText("");
                break;
            case "Categoría:":
                txtCatCodCons.setEnabled(false);
                txtCatCodCons.setText("");
                txtCategoriaCons.setEnabled(true);
                break;                
            default:
                throw new AssertionError();
        }   
    }
   
    /**
     * Este método se encarga de identificar el tipo de consulta segun el RadioButton seleccionado por el usuario.
     */
    public void consultaCategoria(){
        switch (radioButtonSelected(buttonGroupCat).getText()) {
            case "Todo":
                txtCatCodCons.setEnabled(false);
                txtCatCodCons.setText("");
                txtCategoriaCons.setEnabled(false);
                txtCategoriaCons.setText("");
                ArrayListToTable(tablaCategoriaCons, Cat.getAllCategorias());
                break;
            case "Código:":
                if (!txtCatCodCons.getText().isEmpty()) {
                    ArrayListToTable(tablaCategoriaCons, Cat.getCategoriaForId(Integer.parseInt(txtCatCodCons.getText())));
                }else{
                    ArrayListToTable(tablaCategoriaCons, Cat.getCategoriaForId(0));
                }
                break;
            case "Categoría:":
                ArrayListToTable(tablaCategoriaCons, Cat.getCategoriasForName(txtCategoriaCons.getText()));
                break;                
            default:
                throw new AssertionError();
        }
    }
    
    /**
     * Este método se encarga de preparar el escenario para ingresar una nueva Categoría.
     */
    public void preNuevaCategoria(){
        txtCategoria.setText("");
        subPanelCategoria.setBorder(BorderFactory.createTitledBorder(null, "Categoría", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP, new Font("Lora", 1, 18)));
        btnRegCategoria.setText("Registrar");
        lblCodigoCategoria.setVisible(false);
        lblCodigoCategoria1.setVisible(false);
        btnCancelCategoria.setVisible(false);
    }
    
    /**
     * Este método se encarga de pintar o preparar el escenario antes de modificar una Categoría.
     */
    public void preModifyCategoria(){
        txtCategoria.setText(tablaCategoriaCons.getValueAt(tablaCategoriaCons.getSelectedRow(),1).toString());
        txtCategoria.setBorder(g);
        lblCodigoCategoria1.setText(tablaCategoriaCons.getValueAt(tablaCategoriaCons.getSelectedRow(),0).toString());
        subPanelCategoria.setBorder(BorderFactory.createTitledBorder(null, "Categoría (Modificación)", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP, new Font("Lora", 1, 18)));
        btnRegCategoria.setText("Modificar");
        btnCancelCategoria.setVisible(true);
        lblCodigoCategoria.setVisible(true);
        lblCodigoCategoria1.setVisible(true);
    }
    
    /**
     * Este método se ejecuta cuando el usuario utiliza el boton para Registrar una nueva Categoría o confirmar los cambios de una ya existente.
     */
    public void buttonCategoria(){
        if (btnRegCategoria.getText().equals("Registrar")) {
            if (!txtCategoria.getText().isEmpty() && txtCategoria.getText().length()>2) { //SE EVALUA QUE EL CAMPO CONTENGA ALGO
                if (Cat.existeCategoria(txtCategoria.getText())) {//YA EXISTE LA CATEGORIA
                    JOptionPane.showMessageDialog(null, "La Categoría que deseas ingresar ya existe!", "Error", 0,iconError);
                }else{//NO EXISTE LA CATEGORIA
                    if (Cat.insertCategoria(txtCategoria.getText())) {//SE INTENTA REALIZAR EL INSERT A LA BASE DE DATOS
                        preNuevaCategoria();
                        consultaCategoria();
                        ArrayListToTable(tableCategoriaAñadir, Cat.getAllCategorias());
                        limpiarTabla(tableCategoriaAñadidas);
                    }
                }
            }else{ //SI EL CAMPO DE TEXTO NO CONTIENE NADA
                txtCategoria.setBorder(r); //SE ASIGNA BORDE ROJO
                JOptionPane.showMessageDialog(null, "Debes ingresar una Categoría válida!", "Error", 0,iconError);
            }
        }else{
            if (!txtCategoria.getText().isEmpty() && txtCategoria.getText().length()>2) { //SE EVALUA QUE EL CAMPO CONTENGA ALGO
                if (Cat.existeCategoria(txtCategoria.getText())) {//YA EXISTE LA CATEGORIA
                    JOptionPane.showMessageDialog(null, "La Categoría que deseas ingresar ya existe!", "Error", 0,iconError);
                }else{//NO EXISTE LA CATEGORIA
                    if (Cat.updateCategoria(Integer.parseInt(lblCodigoCategoria1.getText()),txtCategoria.getText())) { //SE INTENTA REALIZAR EL INSERT A LA BASE DE DATOS
                        preNuevaCategoria();
                        consultaCategoria();
                        ArrayListToTable(tableCategoriaAñadir, Cat.getAllCategorias());
                        limpiarTabla(tableCategoriaAñadidas);
                    }
                }
            }else{ //SI EL CAMPO DE TEXTO NO CONTIENE NADA
                txtCategoria.setBorder(r); //SE ASIGNA BORDE ROJO
                JOptionPane.showMessageDialog(null, "Debes ingresar una Categoría válida!", "Error", 0,iconError);
            } 
        }
    }
    
    /**
     *Este método se ejecuta cuando el usuario presiona el boton Eliminar con una Categoría seleccionada en la tabla. 
     */
    public void deleteCategoria(){
        if (Cat.deleteCategoria(Integer.parseInt(tablaCategoriaCons.getValueAt(tablaCategoriaCons.getSelectedRow(),0).toString()))) {
            preNuevaCategoria();
            deleteRowSelectedToTable(tablaCategoriaCons);
        }      
    }
/*-
    -------------------------------------------------------------------------------------------------------------- FIN METODOS CATEGORIA --------*/
    
    
/*---------------------------------------------------------------------------------------------------------------- INICIO METODOS IDIOMA --------*/
    
    /**
     * Este método se ejecuta cuando el usuario elige algun RadioButton para consultar Idiomas.
     */
    public void radiosIdioma(){
        switch (radioButtonSelected(buttonGroupIdi).getText()) {
            case "Todo":
                txtIdioCodCons.setEnabled(false);
                txtIdioCodCons.setText("");
                txtIdiomaCons.setEnabled(false);
                txtIdiomaCons.setText("");
                ArrayListToTable(tablaIdiomaCons, Idi.getAllIdiomas());
                break;
            case "Código:":
                txtIdioCodCons.setEnabled(true);
                txtIdiomaCons.setEnabled(false);
                txtIdiomaCons.setText("");
                break;
            case "Idioma:":
                txtIdioCodCons.setEnabled(false);
                txtIdioCodCons.setText("");
                txtIdiomaCons.setEnabled(true);
                break;                
            default:
                throw new AssertionError();
        }   
    }
   
    /**
     * Este método se encarga de identificar el tipo de consulta segun el RadioButton seleccionado por el usuario.
     */ 
    public void consultaIdioma(){
        switch (radioButtonSelected(buttonGroupIdi).getText()) {
            case "Todo":
                txtIdioCodCons.setEnabled(false);
                txtIdioCodCons.setText("");
                txtIdiomaCons.setEnabled(false);
                txtIdiomaCons.setText("");
                ArrayListToTable(tablaIdiomaCons, Idi.getAllIdiomas());
                break;
            case "Código:":
                if (!txtIdioCodCons.getText().isEmpty()) {
                    ArrayListToTable(tablaIdiomaCons, Idi.getIdiomaForId(Integer.parseInt(txtIdioCodCons.getText())));
                }else{
                    ArrayListToTable(tablaIdiomaCons, Idi.getIdiomaForId(0));
                }
                break;
            case "Idioma:":
                ArrayListToTable(tablaIdiomaCons, Idi.getIdiomasForName(txtIdiomaCons.getText()));
                break;                
            default:
                throw new AssertionError();
        }
    }
    
    /**
     * Este método se encarga de preparar el escenario para ingresar un nuevo Idioma.
     */
    public void preNuevoIdioma(){
        txtIdioma.setText("");
        subPanelIdioma.setBorder(BorderFactory.createTitledBorder(null, "Idioma", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP, new Font("Lora", 1, 18)));
        btnRegIdioma.setText("Registrar");
        lblCodigoIdioma.setVisible(false);
        lblCodigoIdioma1.setVisible(false);
        btnCancelIdioma.setVisible(false);
    }
    
    /**
     * Este método se encarga de pintar o preparar el escenario antes de modificar un Idioma.
     */
    public void preModifyIdioma(){
        txtIdioma.setText(tablaIdiomaCons.getValueAt(tablaIdiomaCons.getSelectedRow(),1).toString());
        txtIdioma.setBorder(g);
        lblCodigoIdioma1.setText(tablaIdiomaCons.getValueAt(tablaIdiomaCons.getSelectedRow(),0).toString());
        subPanelIdioma.setBorder(BorderFactory.createTitledBorder(null, "Idioma (Modificación)", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP, new Font("Lora", 1, 18)));
        btnRegIdioma.setText("Modificar");
        btnCancelIdioma.setVisible(true);
        lblCodigoIdioma.setVisible(true);
        lblCodigoIdioma1.setVisible(true);
    }
    
    /**
     * Este método se ejecuta cuando el usuario utiliza el boton para Registrar un nuevo Idioma o confirmar los cambios de uno ya existente.
     */
    public void buttonIdioma(){
        if (btnRegIdioma.getText().equals("Registrar")) {
            if (!txtIdioma.getText().isEmpty() && txtIdioma.getText().length()>2 ) { //SE EVALUA QUE EL CAMPO CONTENGA ALGO
                if (Idi.existIdioma(txtIdioma.getText())) {//YA EXISTE EL IDIOMA
                    JOptionPane.showMessageDialog(null, "El Idioma que deseas ingresar ya existe!", "Error", 0,iconError);
                }else{//NO EXISTE EL IDIOMA
                    if (Idi.insertIdioma(txtIdioma.getText())) {//SE INTENTA REALIZAR EL INSERT A LA BASE DE DATOS
                        rdConsIdioTodo.setSelected(true);
                        radiosIdioma();
                        ArrayListToTable(tablaIdiomaCons, Idi.getAllIdiomas());
                        txtIdioma.setText("");
                        ArrayListToTable(tableIdiomaAñadir, Idi.getAllIdiomas());
                        limpiarTabla(tableIdiomaAñadidos);
                    } 
                }
            }else{ //SI EL CAMPO DE TEXTO NO CONTIENE NADA
                txtIdioma.setBorder(r); //SE ASIGNA BORDE ROJO
                JOptionPane.showMessageDialog(null, "Debes ingresar un Idioma válido!", "Error", 0,iconError);
            }
        }else{
            if (!txtIdioma.getText().isEmpty() && txtIdioma.getText().length()>2) { //SE EVALUA QUE EL CAMPO CONTENGA ALGO
                if (Idi.existIdioma(txtIdioma.getText())) {//YA EXISTE EL IDIOMA
                    JOptionPane.showMessageDialog(null, "El Idioma que deseas ingresar ya existe!", "Error", 0,iconError);
                }else{//NO EXISTE EL IDIOMA
                    if(Idi.updateIdioma(Integer.parseInt(lblCodigoIdioma1.getText()),txtIdioma.getText())){//SE INTENTA REALIZAR EL INSERT A LA BASE DE DATOS
                        rdConsIdioTodo.setSelected(true);
                        radiosIdioma();
                        ArrayListToTable(tablaIdiomaCons, Idi.getAllIdiomas());
                        preNuevoIdioma();
                        ArrayListToTable(tableIdiomaAñadir, Idi.getAllIdiomas());
                        limpiarTabla(tableIdiomaAñadidos);
                    }
                }
            }else{ //SI EL CAMPO DE TEXTO NO CONTIENE NADA
                txtIdioma.setBorder(r); //SE ASIGNA BORDE ROJO
                JOptionPane.showMessageDialog(null, "Debes ingresar un Idioma válido!", "Error", 0,iconError);
            }
        }
    }
    
    /**
     *Este método se ejecuta cuando el usuario presiona el boton Eliminar con un Idioma seleccionado en la tabla. 
     */
    public void deleteIdioma(){
        if (Idi.deleteIdioma(Integer.parseInt(tablaIdiomaCons.getValueAt(tablaIdiomaCons.getSelectedRow(),0).toString()))) {
            preNuevoIdioma();
            deleteRowSelectedToTable(tablaIdiomaCons);
        }      
    }
    
/*------------------------------------------------------------------------------------------------------------------- FIN METODOS IDIOMA --------*/
     
/*---------------------------------------------------------------------------------------------------------------- INICIO METODOS EDITORIAL --------*/
    
    /**
     * Este método se ejecuta cuando el usuario elige algun RadioButton para consultar Editoriales.
     */
    public void radiosEditorial(){
        switch (radioButtonSelected(buttonGroupEdi).getText()) {
            case "Todo":
                txtEdiCodCons.setEnabled(false);
                txtEdiCodCons.setText("");
                txtEditorialCons.setEnabled(false);
                txtEditorialCons.setText("");
                ArrayListToTable(tablaEditorialCons, Edit.getAllEditoriales());
                break;
            case "Código:":
                txtEdiCodCons.setEnabled(true);
                txtEditorialCons.setEnabled(false);
                txtEditorialCons.setText("");
                break;
            case "Editorial:":
                txtEdiCodCons.setEnabled(false);
                txtEdiCodCons.setText("");
                txtEditorialCons.setEnabled(true);
                break;                
            default:
                throw new AssertionError();
        }   
    }
    
    /**
     * Este método se encarga de identificar el tipo de consulta segun el RadioButton seleccionado por el usuario.
     */
    public void consultaEditorial(){
        switch (radioButtonSelected(buttonGroupEdi).getText()) {
            case "Todo":
                txtEdiCodCons.setEnabled(false);
                txtEdiCodCons.setText("");
                txtEditorialCons.setEnabled(false);
                txtEditorialCons.setText("");
                ArrayListToTable(tablaEditorialCons, Edit.getAllEditoriales());
                break;
            case "Código:":
                if (!txtEdiCodCons.getText().isEmpty()) {
                    ArrayListToTable(tablaEditorialCons, Edit.getEditorialForId(Integer.parseInt(txtEdiCodCons.getText())));
                }else{
                    ArrayListToTable(tablaEditorialCons, Edit.getEditorialForId(0));
                }
                
                break;
            case "Editorial:":
                ArrayListToTable(tablaEditorialCons, Edit.getEditorialesForName(txtEditorialCons.getText()));
                break;                
            default:
                throw new AssertionError();
        }
    }
    
    /**
     * Este método se encarga de preparar el escenario para ingresar una nueva Editorial.
     */
    public void preNuevoEditorial(){
        txtEditorial.setText("");
        subPanelEditorial.setBorder(BorderFactory.createTitledBorder(null, "Editorial", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP, new Font("Lora", 1, 18))); 
        btnRegEditorial.setText("Registrar");
        lblCodigoEditorial.setVisible(false);
        lblCodigoEditorial1.setVisible(false);
        btnCancelEditorial.setVisible(false);
    }
    
    /**
     * Este método se encarga de pintar o preparar el escenario antes de modificar una Editorial.
     */
    public void preModifyEditorial(){
        txtEditorial.setText(tablaEditorialCons.getValueAt(tablaEditorialCons.getSelectedRow(),1).toString());
        txtEditorial.setBorder(g);
        lblCodigoEditorial1.setText(tablaEditorialCons.getValueAt(tablaEditorialCons.getSelectedRow(),0).toString());
        subPanelEditorial.setBorder(BorderFactory.createTitledBorder(null, "Editorial (Modificación)", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP, new Font("Lora", 1, 18))); 
        btnRegEditorial.setText("Modificar");
        btnCancelEditorial.setVisible(true);
        lblCodigoEditorial.setVisible(true);
        lblCodigoEditorial1.setVisible(true);
    }
    
    /**
     * Este método se ejecuta cuando el usuario utiliza el boton para Registrar una nueva Editorial o confirmar los cambios de una ya existente.
     */
    public void buttonEditorial(){
        if (btnRegEditorial.getText().equals("Registrar")) {
            if (!txtEditorial.getText().isEmpty() && txtEditorial.getText().length()>2) { //SE EVALUA QUE EL CAMPO CONTENGA ALGO
                if (Edit.existEditorial(txtEditorial.getText())!=null) {//YA EXISTE LA EDITORIAL
                    JOptionPane.showMessageDialog(null, "La Editorial que deseas ingresar ya existe!", "Error", 0,iconError);
                }else{//NO EXISTE LA EDITORIAL
                    if (Edit.insertEditorial(txtEditorial.getText())) {//SE INTENTA REALIZAR EL INSERT A LA BASE DE DATOS
                        vectorsToComboBox(cbxEditorialLibro, Edit.getAllEditoriales(), 1);
                        preNuevoEditorial();
                        consultaEditorial();
                    }
                }
            }else{ //SI EL CAMPO DE TEXTO NO CONTIENE NADA
                txtEditorial.setBorder(r); //SE ASIGNA BORDE ROJO
                JOptionPane.showMessageDialog(null, "Debes ingresar una Editorial válida!", "Error", 0,iconError);
            }
        }else{
            if (!txtEditorial.getText().isEmpty() && txtEditorial.getText().length()>2) { //SE EVALUA QUE EL CAMPO CONTENGA ALGO
                if (Edit.existEditorial(txtEditorial.getText())!=null) {//YA EXISTE LA EDITORIAL
                    JOptionPane.showMessageDialog(null, "La Editorial que deseas ingresar ya existe!", "Error", 0,iconError);
                }else{//NO EXISTE LA EDITORIAL
                    if (Edit.updateEditorial(Integer.parseInt(lblCodigoEditorial1.getText()),txtEditorial.getText())) {//SE INTENTA REALIZAR LA MODIFICACION EN LA BASE DE DATOS
                        vectorsToComboBox(cbxEditorialLibro, Edit.getAllEditoriales(), 1);
                        preNuevoEditorial();
                        consultaEditorial(); 
                    }
                }
            }else{ //SI EL CAMPO DE TEXTO NO CONTIENE NADA
                txtEditorial.setBorder(r); //SE ASIGNA BORDE ROJO
                JOptionPane.showMessageDialog(null, "Debes ingresar una Editorial válida!", "Error", 0,iconError);
            }
        }
    }
    
    /**
     *Este método se ejecuta cuando el usuario presiona el boton Eliminar con una Editorial seleccionada en la tabla. 
     */
    public void deleteEditorial(){
        if (Edit.deleteEditorial(Integer.parseInt(tablaEditorialCons.getValueAt(tablaEditorialCons.getSelectedRow(),0).toString()))) {
            preNuevoEditorial();
            deleteRowSelectedToTable(tablaEditorialCons);
        }      
    }  
    
/*---------------------------------------------------------------------------------------------------------------- FIN METODOS EDITORIAL --------*/
    
    
/*---------------------------------------------------------------------------------------------------------------- INICIO METODOS COMPRA ---------------------------------*/    
    
    /**
     * Método que se ejecuta cuando se presiona el boton btnProcesaFactura que se encuenta en el registro de una nueva compra.
     */
    public void buttonProcesaFactura(){
        //Se identifica el texto contenido en el boton. Para saber como proceder.
        if (btnProcesaFactura.getText().equals("Procesar")) {
            String error="";
            //Se evalua si el TextField de Nro. Factura se encuentra vacío.
            if (txtNroFactura.getText().isEmpty()) {
                error="- Debe ingresar un número de factura.\n";
            }else{
                //Se evalua si el TextField de Nro. Factura no sea cero.
                if (Integer.parseInt(txtNroFactura.getText())==0) {
                    error="- El número de factura no puede ser cero.\n";
                }
            }
            
            //Se evalua si el ComboBox de Distribuidor tiene algun elemento seleccionado.
            if (cbxDistribuidorNuevaFactura.getSelectedIndex()==0) {
                error=error+"- Debe seleccionar un distribuidor.\n";
            }
            
            //Se evalua si el String Error no contiene nada. Lo que quiere decir que tanto la factura como el Distribuidor cumplen validación.
            if (error.isEmpty()) {
                //Se evalua si la Factura ingresada ya existe con ese Distribuidor.
                if (Fac.existeFactura(txtNroFactura.getText(),codForComboSelected(cbxDistribuidorNuevaFactura))) {
                    error="- La factura ya existe con ese distribuidor.\n";
                }else{
                //PROCEDIMIENTO SI LA FACTURA NO EXISTE Y CUMPLE LAS VALIDACIONES.
                    Dist=Dist.getDist(codForComboSelected(cbxDistribuidorNuevaFactura));
                    lblNombreDistribuidorFactura.setText(Dist.getNombre());
                    lblRutDistribuidorFactura.setText(Dist.getRut());
                    lblNroFactura.setText(txtNroFactura.getText());
                    lblFechaFactura.setText(getActualDate());
                    lblHoraFactura.setText(getActualTime());
                    
                    btnProcesaFactura.setText("Volver");
                    panelDetalleLibro.setName("LibroC");
                    txtNroFactura.setEnabled(false);
                    cbxDistribuidorNuevaFactura.setEnabled(false);
                    btnNuevoDistribuidor.setEnabled(false);
                    preCompraLibro();
                    
                }
            } 
                
            if(!error.isEmpty()){
                //Procedimiento para cuando hubo algun error en el proceso de validación.
                JOptionPane.showMessageDialog(null, "No es posible continuar debido a lo siguiente:\n"+error, "Error en datos", 1 , iconError);               
            }
            
        }else if(btnProcesaFactura.getText().equals("Volver")){
            panelDetalleLibro.setVisible(false);
            panelFacturaResumen.setVisible(false);
            txtNroFactura.setEnabled(true);
            cbxDistribuidorNuevaFactura.setEnabled(true);
            btnNuevoDistribuidor.setEnabled(true);
            btnProcesaFactura.setText("Procesar");
        }

    
    }
    
    /**
     * Método que permite validar los campos de un LibroIsbn, tanto a la hora de solo registrarlo, como a la hora de comprarlo.
     * @return boolean true si cumple las validaciones. False si algun campo no cumple.
     */
    public boolean validaDetalleCompra(){
        String error="";
        if (panelDetalleLibro.getName().equals("LibroC") && isbnUsado(txtIsbnLibro.getText())) {
            error=error+"- El ISBN indicado ya se encuentra agregado a la factura.\n";
        }else{
            if (txtTituloLibro.getText().isEmpty()) {
                error=error+"- Debe ingresar el Título del libro.\n";
            }
            if (cbxEditorialLibro.getSelectedIndex()<1) {
                error=error+"- Debe seleccionar la Editorial del libro.\n";
            }
            if (lblCountAutorAñad.getText().equals("(0)")) {
                error=error+"- Debe añadir al menos 1 Autor al libro.\n";
            }
            if (lblCountCategoriaAñad.getText().equals("(0)")) {
                error=error+"- Debe añadir al menos 1 Categoría al libro.\n";
            }
            if (lblCountIdiomaAñad.getText().equals("(0)")) {
                error=error+"- Debe añadir al menos 1 Idioma al libro.\n";
            }
            if (yearChooserAnoLibro.getYear()<0 || yearChooserAnoLibro.getYear()>Integer.parseInt(getActualYear())) {
                error=error+"- Debe introducir un Año de Publicación vaĺido para el libro. Si se desconoce utilice el 0(cero).\n";
            }
            if (panelLibro.getName().equals("Compra") && (txtCantidadLibro.getText().isEmpty() || Integer.parseInt(txtCantidadLibro.getText())<1)) {
                error=error+"- La cantidad de libros comprados debe ser mayor a 0(cero).\n";
            }
            if (txtPaginasLibro.getText().isEmpty() || Integer.parseInt(txtPaginasLibro.getText())<2) {
                error=error+"- El libro debe tener al menos 2 páginas.\n";
            }
            if (panelLibro.getName().equals("Compra") && (txtPrecioLibro.getText().isEmpty() || Double.parseDouble(txtPrecioLibro.getText().replace(".", ""))<101)) {
                error=error+"- Debe proporcionar un Precio Unitario mayor a 100 pesos.\n";
            }
        }
        
        if (!error.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No es posible continuar debido a lo siguiente:\n"+error, "Error en datos", 1 , iconError); 
        }
        
        return error.isEmpty();
    }
    
    /**
     * Método que se ejecuta cuando presionamos el boton btn
     */
    public void buttonAñadirCompra(){
        boolean validalibro = validaDetalleCompra();
        if ( validalibro && panelLibro.getName().equals("Compra")) {
           Vector v = new Vector();
           v.add(txtIsbnLibro.getText());
           v.add(txtTituloLibro.getText());
           v.add(txtPrecioLibro.getText());
           v.add(txtCantidadLibro.getText());
           v.add(""+(Integer.parseInt(txtCantidadLibro.getText())*Integer.parseInt(txtPrecioLibro.getText().replace(".", ""))));
           dfmodel=(DefaultTableModel)tableDetallesFactura.getModel();
           dfmodel.addRow(v);
           tableDetallesFactura.setModel(dfmodel);
           preciosFactura();
           lblHoraFactura.setText(getActualTime());
           
            LibroIsbn l=new LibroIsbn();
            l.setIsbn(txtIsbnLibro.getText());
            l.setTitulo(txtTituloLibro.getText());
            l.setIdEdi(Integer.parseInt(cbxEditorialLibro.getSelectedItem().toString()
                   .substring(cbxEditorialLibro.getSelectedItem().toString()
                        .indexOf("-")+2,cbxEditorialLibro.getSelectedItem().toString().length())));
            l.setAnopubli(yearChooserAnoLibro.getYear());
            l.setNropaginas(Integer.parseInt(txtPaginasLibro.getText()));
            l.setPrecio(Double.parseDouble(txtPrecioLibro.getText().replace(".", "")));
            if (lblPortadaLibro.getIcon()!=null) {
               l.setPortada(IconToBlob(lblPortadaLibro.getIcon()));
            }
            libros.add(l);
           
            
            for (int i = 0; i < tableAutorAñadidos.getRowCount(); i++) {
                AutoresLibro.add(new AutorLibro(l.getIsbn(), Integer.parseInt(tableAutorAñadidos.getValueAt(i, 0).toString())));
            }
            for (int i = 0; i < tableCategoriaAñadidas.getRowCount(); i++) {
                CategoriasLibro.add(new CategoriaLibro(l.getIsbn(),Integer.parseInt(tableCategoriaAñadidas.getValueAt(i, 0).toString())));
            }
            for (int i = 0; i < tableIdiomaAñadidos.getRowCount(); i++) {
                IdiomasLibro.add(new IdiomaLibro(l.getIsbn(), Integer.parseInt(tableIdiomaAñadidos.getValueAt(i, 0).toString())));
            }
            txtTituloLibro.setEnabled(false);
            cbxEditorialLibro.setEnabled(false);
            btnNuevaEditorial.setEnabled(false);
            //CARGAR LA PORTADA AL LBL
            btnCargarPortada.setVisible(false);
            yearChooserAnoLibro.setEnabled(false);
            txtPaginasLibro.setEnabled(false);
            txtCantidadLibro.setText("");
            txtCantidadLibro.setEnabled(false);
            txtPrecioLibro.setText("");
            txtPrecioLibro.setEnabled(false);
            btnAñadeAutor.setEnabled(false);
            btnAñadeCategoria.setEnabled(false);
            btnAñadeIdioma.setEnabled(false);
            btnLimpiarLibro.setEnabled(false);
            limpiarDetalleCompra();
            btnConfirmarLibro.setEnabled(false);
           
        } else if (validalibro && panelLibro.getName().equals("Libro") && panelDetalleLibro.getName().equals("LibroN")) {
            AutoresLibro.clear();
            CategoriasLibro.clear();
            IdiomasLibro.clear();
            LibroIsbn l=new LibroIsbn();
            l.setIsbn(txtIsbnLibro.getText());
            l.setTitulo(txtTituloLibro.getText());
            l.setIdEdi(Integer.parseInt(cbxEditorialLibro.getSelectedItem().toString()
                   .substring(cbxEditorialLibro.getSelectedItem().toString()
                        .indexOf("-")+2,cbxEditorialLibro.getSelectedItem().toString().length())));
            l.setAnopubli(yearChooserAnoLibro.getYear());
            l.setNropaginas(Integer.parseInt(txtPaginasLibro.getText()));
            if (lblPortadaLibro.getIcon()!=null) {
               l.setPortada(IconToBlob(lblPortadaLibro.getIcon()));
            }
            
            for (int i = 0; i < tableAutorAñadidos.getRowCount(); i++) {
                AutoresLibro.add(new AutorLibro(l.getIsbn(), Integer.parseInt(tableAutorAñadidos.getValueAt(i, 0).toString())));
            }
            for (int i = 0; i < tableCategoriaAñadidas.getRowCount(); i++) {
                CategoriasLibro.add(new CategoriaLibro(l.getIsbn(),Integer.parseInt(tableCategoriaAñadidas.getValueAt(i, 0).toString())));
            }
            for (int i = 0; i < tableIdiomaAñadidos.getRowCount(); i++) {
                IdiomasLibro.add(new IdiomaLibro(l.getIsbn(), Integer.parseInt(tableIdiomaAñadidos.getValueAt(i, 0).toString())));
            }
            if (l.insertLibroIsbn(l)) {//SE HARA UN INSERT
                // SE HACE INSERT DE LOS AUTORES ASOCIADOS AL ISBN EN TABLA LIBRO_AUTOR
                    for (AutorLibro a : AutoresLibro) {
                        if (a.getCodigoIsbn().equals(l.getIsbn())) {
                            a.insertAutorLibro(a.getCodigoAutor(),a.getCodigoIsbn());
                        }
                    }
                    
                    // SE HACE INSERT DE LOS IDIOMAS ASOCIADOS AL ISBN EN TABLA LIBRO_IDIOMA
                    for (IdiomaLibro i : IdiomasLibro) {
                        if (i.getIsbn().equals(l.getIsbn())) {
                            i.insertIdiomaLibro(i.getCodigo(), l.getIsbn());
                        }
                    }
                    
                    // SE HACE INSERT DE LAS CATEGORIAS ASOCIADAS AL ISBN EN TABLA LIBRO_CATEGORIA
                    for (CategoriaLibro c : CategoriasLibro) {
                        if (c.getCodigoIsbn().equals(l.getIsbn())) {
                            c.insertCategoriaLibro(c.getCodigoCategoria(), c.getCodigoIsbn());
                        }
                    }
                
                    limpiarDetalleCompra();
                    rdConsultaLibroTodo.doClick();
                    AutoresLibro.clear();
                    CategoriasLibro.clear();
                    IdiomasLibro.clear();
                    JOptionPane.showMessageDialog(null, "Libro registrado con éxito!", "Exito", 0,iconSucces);
            }
            
        }else if (validalibro && panelLibro.getName().equals("Libro") && panelDetalleLibro.getName().equals("LibroM")){
            AutoresLibro.clear();
            CategoriasLibro.clear();
            IdiomasLibro.clear();
            LibroIsbn l=new LibroIsbn();
            l.setIsbn(txtIsbnLibro.getText());
            l.setTitulo(txtTituloLibro.getText());
            l.setIdEdi(Integer.parseInt(cbxEditorialLibro.getSelectedItem().toString()
                   .substring(cbxEditorialLibro.getSelectedItem().toString()
                        .indexOf("-")+2,cbxEditorialLibro.getSelectedItem().toString().length())));
            l.setAnopubli(yearChooserAnoLibro.getYear());
            l.setNropaginas(Integer.parseInt(txtPaginasLibro.getText()));
            if (lblPortadaLibro.getIcon()!=null) {
                l.setPortada(IconToBlob(lblPortadaLibro.getIcon()));
            }
            for (int i = 0; i < tableAutorAñadidos.getRowCount(); i++) {
                AutoresLibro.add(new AutorLibro(l.getIsbn(), Integer.parseInt(tableAutorAñadidos.getValueAt(i, 0).toString())));
            }
            for (int i = 0; i < tableCategoriaAñadidas.getRowCount(); i++) {
                CategoriasLibro.add(new CategoriaLibro(l.getIsbn(),Integer.parseInt(tableCategoriaAñadidas.getValueAt(i, 0).toString())));
            }
            for (int i = 0; i < tableIdiomaAñadidos.getRowCount(); i++) {
                IdiomasLibro.add(new IdiomaLibro(l.getIsbn(), Integer.parseInt(tableIdiomaAñadidos.getValueAt(i, 0).toString())));
            }
            
            if (new LibroIsbn().updateLibroIsbn(l)) {
                new AutorLibro().deleteAutorLibro(l.getIsbn());
                new CategoriaLibro().deleteCategoriaLibro(l.getIsbn());
                new IdiomaLibro().deleteIdiomaLibro(l.getIsbn());
                
                
                for (AutorLibro a : AutoresLibro) {
                    if (a.getCodigoIsbn().equals(l.getIsbn())) {
                        a.insertAutorLibro(a.getCodigoAutor(),a.getCodigoIsbn());
                    }
                }
                    
                // SE HACE INSERT DE LOS IDIOMAS ASOCIADOS AL ISBN EN TABLA LIBRO_IDIOMA
                for (IdiomaLibro i : IdiomasLibro) {
                    if (i.getIsbn().equals(l.getIsbn())) {
                        i.insertIdiomaLibro(i.getCodigo(), l.getIsbn());
                    }
                }
                    
                // SE HACE INSERT DE LAS CATEGORIAS ASOCIADAS AL ISBN EN TABLA LIBRO_CATEGORIA
                for (CategoriaLibro c : CategoriasLibro) {
                    if (c.getCodigoIsbn().equals(l.getIsbn())) {
                        c.insertCategoriaLibro(c.getCodigoCategoria(), c.getCodigoIsbn());
                    }
                }
                AutoresLibro.clear();
                CategoriasLibro.clear();
                IdiomasLibro.clear();
                limpiarDetalleCompra();
                rdConsultaLibroTodo.doClick();
                txtIsbnLibro.setEnabled(true);
                panelDetalleLibro.setBorder(BorderFactory.createTitledBorder(null, "Nuevo Libro", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP, new Font("Lora", 1, 18)));
                panelDetalleLibro.setName("LibroN");
                JOptionPane.showMessageDialog(null, "Modificación realizada con éxito", "Exito", 0,iconSucces);
            }
        }
        
        
        
    }
    
    /**
     * Este método asegura que el ISBN que intenta ingresar el usario en el
     * DetalleCompra ya no se encuentre en el panel de facturación.
     *
     * @param isbn isbn
     * @return true si ya fue ingresado, false si no.
     */
    public boolean isbnUsado(String isbn) {
        dfmodel = (DefaultTableModel) tableDetallesFactura.getModel();
        for (int i = 0; i < dfmodel.getRowCount(); i++) {
            if (isbn.equals(dfmodel.getValueAt(i, 0))) {
                return true;
            }
        }
        return false;
    }
    
    public void procesaIsbn(LibroIsbn lib){
        if (lib!=null && panelLibro.getName().equals("Compra")) {
            txtTituloLibro.setText(lib.getTitulo());
            txtTituloLibro.setEnabled(false);
            objectToCombo(cbxEditorialLibro, ""+lib.getIdEdi());
            cbxEditorialLibro.setEnabled(false);
            btnNuevaEditorial.setEnabled(false);
            if(lib.getPortada()!=null){
                lblPortadaLibro.setText("");
                lblPortadaLibro.setIcon(BlobToIcon(lib.getPortada()));
            }else{
                lblPortadaLibro.setText("Sin Portada");
            }
            btnCargarPortada.setVisible(false);
            yearChooserAnoLibro.setYear(lib.getAnopubli());
            yearChooserAnoLibro.setEnabled(false);
            txtPaginasLibro.setText(""+lib.getNropaginas());
            txtPaginasLibro.setEnabled(false);
            txtCantidadLibro.setText("");
            txtCantidadLibro.setEnabled(true);
            txtCantidadLibro.requestFocus();
            txtPrecioLibro.setText("");
            txtPrecioLibro.setEnabled(true);
            itemsAñadLibroToTable(new AutorLibro().getAutoresForIsbn(lib.getIsbn()), tableAutorAñadir,btnAutorToRightAñadAut);
            btnAñadeAutor.setEnabled(false);
            lblCountAutorAñad.setText("("+tableAutorAñadidos.getRowCount()+")");
            itemsAñadLibroToTable(new CategoriaLibro().getCategoriasForIsbn(lib.getIsbn()), tableCategoriaAñadir, btnCategoriaToRightAñadCat);
            btnAñadeCategoria.setEnabled(false);
            lblCountCategoriaAñad.setText("("+tableCategoriaAñadidas.getRowCount()+")");
            itemsAñadLibroToTable(new IdiomaLibro().getIdiomasForIsbn(lib.getIsbn()), tableIdiomaAñadir, btnIdiomaToRightAñadIdi);
            btnAñadeIdioma.setEnabled(false);
            lblCountIdiomaAñad.setText("("+tableIdiomaAñadidos.getRowCount()+")");
            btnLimpiarLibro.setEnabled(false);
        }else if(lib!=null && panelLibro.getName().equals("Libro") && panelDetalleLibro.getName().equals("LibroN")){
            JOptionPane.showMessageDialog(null, "El ISBN que intentá ingresar ya existe.","Advertencia", 0,iconWarning);
            txtIsbnLibro.setText("");
            txtIsbnLibro.requestFocus();
        }else if(lib!=null && panelLibro.getName().equals("Libro") && panelDetalleLibro.getName().equals("LibroM")){
            preModifyLibro(lib);
        }else{
            txtTituloLibro.setEnabled(true);
            txtTituloLibro.requestFocus();
            cbxEditorialLibro.setEnabled(true);
            btnNuevaEditorial.setEnabled(true);
            btnAñadeAutor.setEnabled(true);
            btnAñadeCategoria.setEnabled(true);
            btnAñadeIdioma.setEnabled(true);
            yearChooserAnoLibro.setEnabled(true);
            txtPaginasLibro.setEnabled(true);
            txtCantidadLibro.setText("");
            txtCantidadLibro.setEnabled(true);
            txtPrecioLibro.setText("");
            txtPrecioLibro.setEnabled(true);
            btnCargarPortada.setVisible(true);
            btnCargarPortada.setEnabled(true);
            btnLimpiarLibro.setEnabled(true);
            String isbn=txtIsbnLibro.getText();
            btnLimpiarLibro.doClick();
            txtIsbnLibro.setText(isbn);
        }
        btnConfirmarLibro.setEnabled(true);
    }
    
    public void itemsAñadLibroToTable(ArrayList<Vector> lista, JTable tabla, JButton btn){
        for (Vector v : lista) {
            for (int i = 0; i < tabla.getRowCount(); i++) {
                if (tabla.getValueAt(i, 0).toString().equals(v.get(1).toString())) {
                    tabla.getSelectionModel().setSelectionInterval(i, i);
                    btn.doClick();
                }
            }
        }
    }
      
  
    /**
     * Este método limpia los campos del sector DetalleCompra de la ventana
     * Nueva Compra.
     */
   private void limpiarDetalleCompra() {
        txtIsbnLibro.setText("");
        txtTituloLibro.setText("");
        txtPaginasLibro.setText("");
        yearChooserAnoLibro.setYear(2018);
        txtCantidadLibro.setText("");
        txtPrecioLibro.setText("");
        cbxEditorialLibro.setSelectedIndex(0);
        btnLimpiarAñadAut.doClick();
        btnLimpiarAñadCat.doClick();
        btnLimpiarAñadIdi.doClick();
        lblCountAutorAñad.setText("(0)");
        lblCountIdiomaAñad.setText("(0)");
        lblCountCategoriaAñad.setText("(0)");
        lblPortadaLibro.setIcon(null);
        lblPortadaLibro.setText("PORTADA");
    }

    /**
     * Este método plasma en el panel de Facturación los precios. Neto, Iva y
     * Total.
     */
    public void preciosFactura() {
        if (tableDetallesFactura.getRowCount() > 0) {
            DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
            simbolos.setGroupingSeparator('.');
            simbolos.setDecimalSeparator(',');
            simbolos.setCurrencySymbol("$");
            DecimalFormat formato = new DecimalFormat("$ ###,###.##");
            double neto = 0;
            double p = 0;
            double iva = 0;
            double total = 0;
            int filas = tableDetallesFactura.getRowCount();
            for (int i = 0; i < tableDetallesFactura.getRowCount(); i++) {
                p = Double.parseDouble(tableDetallesFactura.getValueAt(i, tableDetallesFactura.getColumnCount() - 1).toString());
                neto = neto + p;
            }
            iva = neto * 0.19;
            total = neto + iva;

            lblNetoFactura.setText(formato.format(neto));
            lblIvaFactura.setText(formato.format(iva));
            lblTotalFactura.setText(formato.format(total));
        } else {
            lblNetoFactura.setText("$ 0,00");
            lblIvaFactura.setText("$ 0,00");
            lblTotalFactura.setText("$ 0,00");
        }
    } //PROCESA VISUALMENTE LOS PRECIOS DE LAS FACTURAS.

    /**
     * Este método valida los ultimos detalles en sector Facturación y realiza los inserts respectivos que involucran al proceso de compras a distribuidores.
     */
    public void confirmaFactura() {
       String error="";
        //AQUI SE CREA LA FACTURA
        String seleccionado = cbxDistribuidorNuevaFactura.getSelectedItem().toString();
        int guion = seleccionado.lastIndexOf("-");
        Factura fac = new Factura();
        fac.setFolio(lblNroFactura.getText());
        fac.setIdDis(Integer.parseInt(seleccionado.substring(guion + 2, seleccionado.length())));
        seleccionado = cbxMetodoPagoNuevaCompra.getSelectedItem().toString();
        guion = seleccionado.lastIndexOf("-");
        fac.setMetodoPago(Integer.parseInt(seleccionado.substring(guion + 2, seleccionado.length())));
        double neto = Double.parseDouble(lblNetoFactura.getText().replace(".", "").replace("$", "").replace(" ", ""));
        double iva = Double.parseDouble(lblIvaFactura.getText().replace(".", "").replace("$", "").replace(" ", "").replace(",", "."));
        double total = Double.parseDouble(lblTotalFactura.getText().replace(".", "").replace("$", "").replace(" ", "").replace(",", "."));
        fac.setPrecioN(neto);
        fac.setIva(iva);
        fac.setPrecioT(total);
        if (fac.insertFactura(fac)) {//HACEMOS INSERT CON EL OBJETO FACTURA Y SU METODO
        
         
// AQUI SE HACE INSERT SI EL LIBRO NO EXISTE O MODIFICACION SUMATORIA SI EL LIBROISBN YA EXISTE RECORRIENDO EL ARRAYLIST LIBROS
            for (LibroIsbn l : libros) {
                if (l.existLibroIsbn(l.getIsbn())!=null) {
                    
                } else {
                    if (!l.insertLibroIsbn(l)) {
                        error="X";
                    }

                    // SE HACE INSERT DE LOS AUTORES ASOCIADOS AL ISBN EN TABLA LIBRO_AUTOR
                    for (AutorLibro a : AutoresLibro) {
                        if (a.getCodigoIsbn().equals(l.getIsbn())) {
                            if(!a.insertAutorLibro(a.getCodigoAutor(),a.getCodigoIsbn())){
                                error="X";
                            }
                        }
                    }
                    
                    // SE HACE INSERT DE LOS IDIOMAS ASOCIADOS AL ISBN EN TABLA LIBRO_IDIOMA
                    for (IdiomaLibro i : IdiomasLibro) {
                        if (i.getIsbn().equals(l.getIsbn())) {
                            if(!i.insertIdiomaLibro(i.getCodigo(), l.getIsbn())){
                                error="X";
                            }
                        }
                    }
                    
                    // SE HACE INSERT DE LAS CATEGORIAS ASOCIADAS AL ISBN EN TABLA LIBRO_CATEGORIA
                    for (CategoriaLibro c : CategoriasLibro) {
                        if (c.getCodigoIsbn().equals(l.getIsbn())) {
                            if(!c.insertCategoriaLibro(c.getCodigoCategoria(), c.getCodigoIsbn())){
                                error="X";
                            }
                        }
                    }
                }
            }

        //SE RECORRE EL ARRAYLIST COMPRAS Y SE HACEN LOS INSERT RESPECTIVOS
        for (int i = 0; i < tableDetallesFactura.getRowCount(); i++) {
            Compra c = new Compra();
            c.setIsbn(tableDetallesFactura.getValueAt(i, 0).toString());
            c.setCantidad(Integer.parseInt(tableDetallesFactura.getValueAt(i, 3).toString()));
            c.setPrecio(Double.parseDouble(tableDetallesFactura.getValueAt(i, 4).toString()));
            compras.add(c);
        }
        for (Compra c : compras) {
            c.setFactura(fac.consultaFactura(fac.getIdDis(), fac.getFolio()).getFacId());
            if (!c.insertCompra(c)) {
               error="X"; 
            }
        }
        
        //SE HACE INSERT DE CADA LIBRO CON CÓDIGO ÚNICO
        for (Compra c : compras) {
            for (int j = 0; j < c.getCantidad(); j++) { //SE HACE INSERT DE CADA LIBRO POR INDIVIDUAL, CON SU CODIGO UNICO. EN LA TABLA LIBRO DE LA BASE DE DATOS.
                Libro lib = new Libro();
                lib.setIsbn(c.getIsbn());
                lib.setEstado(1); //ESTADO 1 ES DISPONIBLE.
                if(!lib.insertLibro(lib)){
                    error="X";
                }
            }
        }

        AutoresLibro.clear();
        IdiomasLibro.clear();
        CategoriasLibro.clear();
        libros.clear();
        compras.clear();
            if (error.isEmpty()) {
                limpiarTabla(tableDetallesFactura);
                limpiarDetalleCompra();
                preciosFactura();
                btnProcesaFactura.doClick();
                txtNroFactura.setText("");
                txtNroFactura.requestFocus();
                cbxDistribuidorNuevaFactura.setSelectedIndex(0);
                JOptionPane.showMessageDialog(null, "Los datos fueron procesados con Exito!", "Exito", JOptionPane.INFORMATION_MESSAGE ,iconSucces);
            }else{
                JOptionPane.showMessageDialog(null, "Ha ocurrido algun error al registrar los datos en la BD!", "Error", JOptionPane.ERROR_MESSAGE ,iconError);
            }
        
        
        }else{
            
        }
    } 
    
    /*---------------------------------------------------------------------------------------------------- INICIO METODOS LIBRO ---------*/
    
    public void panelLibro(JButton btn){
        if (quitaEspacios(btn.getText()).equalsIgnoreCase("Compra")) {
            if (!panelDetalleLibro.getName().equalsIgnoreCase("LibroC")) {
                preCompraLibro();
            }
            
            
        }else if (quitaEspacios(btn.getText()).equalsIgnoreCase("Libro")){
            if(panelDetalleLibro.getName().equals("LibroC")){
                preNewLibro();
            }
            panelFacturaNueva.setVisible(false);
            panelFacturaResumen.setVisible(false);
            panelDetalleLibro.setVisible(true);
            panelBusquedaLibro.setVisible(true);
            txtCantidadLibro.setVisible(false);
            lblPrecioLibro.setVisible(false);
            lblCantidadLibro.setVisible(false);
            txtPrecioLibro.setVisible(false);
            
        }
    }
    
    public void filtroLibro(JComboBox cbx){
        if (filtroLibro.size()==0) {
            filtroLibro.add(new String("Seleccione..."));
            filtroLibro.add(new String("ISBN"));
            filtroLibro.add(new String("Autor"));
            filtroLibro.add(new String("Idioma"));
            filtroLibro.add(new String("Categoría"));
        }
        cbx.removeAllItems();
        for (String s : filtroLibro) {
            cbx.addItem(s);
        }
    }
    
    public void consultaLibro(){
        
    }
    
    public boolean validaLibro(){
        String error="";
        
            if (txtIsbnLibro.getText().isEmpty()) {
                error=error+"- Debe ingresar un número de ISBN.\n";
            }
            if (txtTituloLibro.getText().isEmpty()) {
                error=error+"- Debe ingresar el Título del libro.\n";
            }
            if (cbxEditorialLibro.getSelectedIndex()<1) {
                error=error+"- Debe seleccionar la Editorial del libro.\n";
            }
            if (lblCountAutorAñad.getText().equals("(0)")) {
                error=error+"- Debe añadir al menos 1 Autor al libro.\n";
            }
            if (lblCountCategoriaAñad.getText().equals("(0)")) {
                error=error+"- Debe añadir al menos 1 Categoría al libro.\n";
            }
            if (lblCountIdiomaAñad.getText().equals("(0)")) {
                error=error+"- Debe añadir al menos 1 Idioma al libro.\n";
            }
            if (yearChooserAnoLibro.getYear()<0 || yearChooserAnoLibro.getYear()>Integer.parseInt(getActualYear())) {
                error=error+"- Debe introducir un Año de Publicación vaĺido para el libro. Si se desconoce utilice el 0(cero).\n";
            }
            if (txtPaginasLibro.getText().isEmpty() || Integer.parseInt(txtPaginasLibro.getText())<2) {
                error=error+"- El libro debe tener al menos 2 páginas.\n";
            }
        
        if (!error.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No es posible continuar debido a lo siguiente:\n"+error, "Error en datos", 1 , iconError); 
        }else{
            LibroIsbn libro=new LibroIsbn();
            libro.setIsbn(txtIsbnLibro.getText());
            libro.setTitulo(txtTituloLibro.getText());
            libro.setIdEdi(Integer.parseInt(cbxEditorialLibro.getSelectedItem().toString()
                   .substring(cbxEditorialLibro.getSelectedItem().toString()
                        .indexOf("-")+2,cbxEditorialLibro.getSelectedItem().toString().length())));
            libro.setAnopubli(yearChooserAnoLibro.getYear());
            libro.setNropaginas(Integer.parseInt(txtPaginasLibro.getText()));
            
            if(libro.insertLibroIsbn(libro)) {
                for (int i = 0; i < tableAutorAñadidos.getRowCount(); i++) {
                    new AutorLibro().insertAutorLibro(Integer.parseInt(tableAutorAñadidos.getValueAt(i, 0).toString()),libro.getIsbn());
                }
                for (int i = 0; i < tableCategoriaAñadidas.getRowCount(); i++) {
                    new CategoriaLibro().insertCategoriaLibro(Integer.parseInt(tableCategoriaAñadidas.getValueAt(i, 0).toString()), libro.getIsbn());
                }
                for (int i = 0; i < tableIdiomaAñadidos.getRowCount(); i++) {
                    new IdiomaLibro().insertIdiomaLibro(Integer.parseInt(tableIdiomaAñadidos.getValueAt(i, 0).toString()),libro.getIsbn());
                }
                txtIsbnLibro.setText("");
                txtTituloLibro.setText("");
                cbxEditorialLibro.setSelectedIndex(0);
                yearChooserAnoLibro.setYear(2018);
                txtPaginasLibro.setText("");
                tableAutorAñadidos.selectAll();
                btnLimpiarAñadAut.doClick();
                lblCountAutorAñad.setText("(0)");
                tableCategoriaAñadidas.selectAll();
                btnLimpiarAñadCat.doClick();
                lblCountCategoriaAñad.setText("(0)");
                tableIdiomaAñadidos.selectAll();
                btnLimpiarAñadIdi.doClick();
                lblCountIdiomaAñad.setText("(0)");        
            }
            
        }
        return error.isEmpty();
    }
    
    public void pintaResumenLibro(int rowHovered, JTable tabla){
        String isbn=tabla.getValueAt(rowHovered,0).toString();
        LibIsbn = new LibroIsbn().existLibroIsbn(isbn);
        if (LibIsbn!=null) {
            lblIsbnResumenLibro.setText(LibIsbn.getIsbn());
            lblTituloResumenLibro.setText(LibIsbn.getTitulo());
            lblPaginasResumenLibro.setText(""+LibIsbn.getNropaginas());
            lblAnoResumenLibro.setText(""+LibIsbn.getAnopubli());
            if((""+LibIsbn.getPrecio()).isEmpty()){
                lblPrecioResumenLibro.setText("-");
            }else{
                lblPrecioResumenLibro.setText(""+LibIsbn.getPrecio());
            }
            
            if (LibIsbn.getPortada()!=null) {
                lblPortadaLibroResumen.setText("");
                lblPortadaLibroResumen.setIcon(BlobToIcon(LibIsbn.getPortada()));
            }else{
                lblPortadaLibroResumen.setText("PORTADA");
                lblPortadaLibroResumen.setIcon(null);
            }
            
            lblEditorialResumenLibro.setText(Edit.existEditorial(LibIsbn.getIdEdi()).getNombre());
            jListAutores.setListData(new AutorLibro().getAutoresNombreForIsbn(isbn));
            jListCategorias.setListData(new CategoriaLibro().getCategoriasNombreForIsbn(isbn));
            jListIdiomas.setListData(new IdiomaLibro().getIdiomasNombreForIsbn(isbn));
            jDialogResumenLibro.setTitle(LibIsbn.getTitulo());
        }
        
    }
    
    public void preNewLibro(){
        panelDetalleLibro.setBorder(BorderFactory.createTitledBorder(null, "Nuevo Libro", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP, new Font("Lora", 1, 18)));
        panelDetalleLibro.setName("LibroN");
        limpiarDetalleCompra();
        txtIsbnLibro.setEnabled(true);
        
        txtTituloLibro.setEnabled(true);
        cbxEditorialLibro.setEnabled(true);
        yearChooserAnoLibro.setEnabled(true);
        txtPaginasLibro.setEnabled(true);
        btnAñadeAutor.setEnabled(true);
        btnAñadeCategoria.setEnabled(true);
        btnAñadeIdioma.setEnabled(true);
        btnCargarPortada.setEnabled(true);
        txtIsbnLibro.requestFocus();
        btnLimpiarLibro.setText("Limpiar");
        btnLimpiarLibro.setEnabled(true);
    }
    
    public void preModifyLibro(LibroIsbn lib){
        panelDetalleLibro.setBorder(BorderFactory.createTitledBorder(null, "Modificación Libro", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP, new Font("Lora", 1, 18)));
        txtIsbnLibro.setEnabled(false);
        txtTituloLibro.setText(lib.getTitulo());
        txtTituloLibro.setEnabled(true);
        objectToCombo(cbxEditorialLibro, ""+lib.getIdEdi());
        cbxEditorialLibro.setEnabled(true);
        btnNuevaEditorial.setEnabled(true);
        if(lib.getPortada()!=null){
            lblPortadaLibro.setText("");
            lblPortadaLibro.setIcon(BlobToIcon(lib.getPortada()));
        }else{
            lblPortadaLibro.setText("Sin Portada");
        }
        btnCargarPortada.setVisible(true);
        btnCargarPortada.setEnabled(true);
        yearChooserAnoLibro.setYear(lib.getAnopubli());
        yearChooserAnoLibro.setEnabled(true);
        txtPaginasLibro.setText(""+lib.getNropaginas());
        txtPaginasLibro.setEnabled(true);
        txtCantidadLibro.setText("");
        txtCantidadLibro.setEnabled(false);
        txtPrecioLibro.setText("");
        txtPrecioLibro.setEnabled(false);
        itemsAñadLibroToTable(new AutorLibro().getAutoresForIsbn(lib.getIsbn()), tableAutorAñadir,btnAutorToRightAñadAut);
        btnAñadeAutor.setEnabled(true);
        lblCountAutorAñad.setText("("+tableAutorAñadidos.getRowCount()+")");
        itemsAñadLibroToTable(new CategoriaLibro().getCategoriasForIsbn(lib.getIsbn()), tableCategoriaAñadir, btnCategoriaToRightAñadCat);
        btnAñadeCategoria.setEnabled(true);
        lblCountCategoriaAñad.setText("("+tableCategoriaAñadidas.getRowCount()+")");
        itemsAñadLibroToTable(new IdiomaLibro().getIdiomasForIsbn(lib.getIsbn()), tableIdiomaAñadir, btnIdiomaToRightAñadIdi);
        btnAñadeIdioma.setEnabled(true);
        lblCountIdiomaAñad.setText("("+tableIdiomaAñadidos.getRowCount()+")");
        btnLimpiarLibro.setText("Cancelar");
        btnLimpiarLibro.setEnabled(true);
        
    }
    
    public void preCompraLibro(){
        limpiarDetalleCompra();
        panelDetalleLibro.setBorder(BorderFactory.createTitledBorder(null, "Detalle Compra", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP, new Font("Lora", 1, 18)));
        panelFacturaNueva.setVisible(true);
        txtIsbnLibro.setEnabled(true);
        txtIsbnLibro.requestFocus();
        txtCantidadLibro.setVisible(true);
        lblCantidadLibro.setVisible(true);
        txtPrecioLibro.setVisible(true);
        lblPrecioLibro.setVisible(true);
        txtCantidadLibro.setEnabled(false);
        txtPrecioLibro.setEnabled(false);
        txtTituloLibro.setEnabled(false);
        cbxEditorialLibro.setEnabled(false);
        btnNuevaEditorial.setEnabled(false);
        yearChooserAnoLibro.setEnabled(false);
        txtPaginasLibro.setEnabled(false);
        btnAñadeAutor.setEnabled(false);
        btnAñadeCategoria.setEnabled(false);
        btnAñadeIdioma.setEnabled(false);
        btnCargarPortada.setEnabled(false);
        btnLimpiarLibro.setText("Limpiar");
        btnLimpiarLibro.setEnabled(true);
        
        if(btnProcesaFactura.getText().equals("Volver")){
            panelDetalleLibro.setVisible(true);
            panelFacturaResumen.setVisible(true);
        }else{
            panelDetalleLibro.setVisible(false);
        }
        panelBusquedaLibro.setVisible(false);
    }
    
    public void deleteLibroIsbn(String isbn){
        // Se evalua si ya existe algun registro de Compra, Venta o Arriendo relacionado a ese ISBN.
        if(new Compra().existCompraForIsbn(isbn)  ){
            JOptionPane.showMessageDialog(null, "El libro no puede ser eliminado porque ya tiene alguna Compra, Venta o Arriendo asociado.", "Error", 0,iconError);
        }else{
            new AutorLibro().deleteAutorLibro(isbn);
            new CategoriaLibro().deleteCategoriaLibro(isbn);
            new IdiomaLibro().deleteIdiomaLibro(isbn);
            new LibroIsbn().deleteLibroIsbn(isbn);
            rdConsultaLibroTodo.doClick();
            limpiarDetalleCompra();
            txtIsbnLibro.setEnabled(true);
            
        }
    }
    
    //----------------------------------------------------------------------------------------------- FIN METODOS LIBRO -----------*/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminCompras;
    private javax.swing.JButton btnAutEditar;
    private javax.swing.JButton btnAutEditar4;
    private javax.swing.JButton btnAutEliminar;
    private javax.swing.JButton btnAutor;
    private javax.swing.JButton btnAutorToLeftAñadAut;
    private javax.swing.JButton btnAutorToRightAñadAut;
    private javax.swing.JButton btnAñadeAutor;
    private javax.swing.JButton btnAñadeCategoria;
    private javax.swing.JButton btnAñadeIdioma;
    private javax.swing.JButton btnCancelCategoria;
    private javax.swing.JButton btnCancelEditorial;
    private javax.swing.JButton btnCancelIdioma;
    private javax.swing.JButton btnCargarPortada;
    private javax.swing.JButton btnCatEditar;
    private javax.swing.JButton btnCatEliminar;
    private javax.swing.JButton btnCategoriaToLeftAñadCat;
    private javax.swing.JButton btnCategoriaToRightAñadCat;
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnConfirmAñadAut;
    private javax.swing.JButton btnConfirmAñadCat;
    private javax.swing.JButton btnConfirmAñadIdi;
    private javax.swing.JButton btnConfirmarLibro;
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnDistribuidor;
    private javax.swing.JButton btnEditarDist;
    private javax.swing.JButton btnEditarLibro;
    private javax.swing.JButton btnEditorialEditar;
    private javax.swing.JButton btnEditorialEliminar;
    private javax.swing.JButton btnEliminarCompraFac;
    private javax.swing.JButton btnEliminarDist;
    private javax.swing.JButton btnEliminarFactura;
    private javax.swing.JButton btnEliminarLibro;
    private javax.swing.ButtonGroup btnGrpConsAñadAut;
    private javax.swing.ButtonGroup btnGrpConsAñadCat;
    private javax.swing.ButtonGroup btnGrpConsAñadIdi;
    private javax.swing.ButtonGroup btnGrpConsFacturas;
    private javax.swing.JButton btnIdiomaEditar;
    private javax.swing.JButton btnIdiomaEliminar;
    private javax.swing.JButton btnIdiomaToLeftAñadIdi;
    private javax.swing.JButton btnIdiomaToRightAñadIdi;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLibro;
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnLimpAutor;
    private javax.swing.JButton btnLimpCampNuevDis;
    private javax.swing.JButton btnLimpiarAñadAut;
    private javax.swing.JButton btnLimpiarAñadCat;
    private javax.swing.JButton btnLimpiarAñadIdi;
    private javax.swing.JButton btnLimpiarComprasFactura;
    private javax.swing.JButton btnLimpiarLibro;
    private javax.swing.JButton btnNuevaCategoriaAñadCat;
    private javax.swing.JButton btnNuevaEditorial;
    private javax.swing.JButton btnNuevoAutorAñadAut;
    private javax.swing.JButton btnNuevoDistribuidor;
    private javax.swing.JButton btnNuevoIdiomaAñadIdi;
    private javax.swing.JButton btnProcesaFactura;
    private javax.swing.JButton btnRegAutor;
    private javax.swing.JButton btnRegCategoria;
    private javax.swing.JButton btnRegEditorial;
    private javax.swing.JButton btnRegIdioma;
    private javax.swing.JButton btnRegNuevDis;
    private javax.swing.ButtonGroup buttonGroupAut;
    private javax.swing.ButtonGroup buttonGroupCat;
    private javax.swing.ButtonGroup buttonGroupDist;
    private javax.swing.ButtonGroup buttonGroupEdi;
    private javax.swing.ButtonGroup buttonGroupIdi;
    private javax.swing.ButtonGroup buttonGroupLibro;
    private javax.swing.JComboBox<String> cbxConsFacMetodo;
    private javax.swing.JComboBox<String> cbxDistribuidorNuevaFactura;
    private javax.swing.JComboBox<String> cbxEditorialLibro;
    private javax.swing.JComboBox<String> cbxFiltroLibro;
    private javax.swing.JComboBox<String> cbxMetodoPagoNuevaCompra;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialogAñadeAutor;
    private javax.swing.JDialog jDialogAñadeCategoria;
    private javax.swing.JDialog jDialogAñadeIdioma;
    private javax.swing.JDialog jDialogCamara;
    private javax.swing.JDialog jDialogFilePortada;
    private javax.swing.JDialog jDialogResumenLibro;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JList<String> jListAutores;
    private javax.swing.JList<String> jListCategorias;
    private javax.swing.JList<String> jListIdiomas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblAnoResumenLibro;
    private javax.swing.JLabel lblCantidadLibro;
    private javax.swing.JLabel lblCodigoAutor;
    private javax.swing.JLabel lblCodigoAutor1;
    private javax.swing.JLabel lblCodigoCategoria;
    private javax.swing.JLabel lblCodigoCategoria1;
    private javax.swing.JLabel lblCodigoEditorial;
    private javax.swing.JLabel lblCodigoEditorial1;
    private javax.swing.JLabel lblCodigoIdioma;
    private javax.swing.JLabel lblCodigoIdioma1;
    private javax.swing.JLabel lblCountAutorAñad;
    private javax.swing.JLabel lblCountCategoriaAñad;
    private javax.swing.JLabel lblCountIdiomaAñad;
    private javax.swing.JLabel lblCuadroAutor;
    private javax.swing.JLabel lblEditorialResumenLibro;
    private javax.swing.JLabel lblFechaFactura;
    private javax.swing.JLabel lblHoraFactura;
    private javax.swing.JLabel lblIsbnResumenLibro;
    private javax.swing.JLabel lblIvaFactura;
    private javax.swing.JLabel lblModDist;
    private javax.swing.JLabel lblNetoFactura;
    private javax.swing.JLabel lblNombreDistribuidorFactura;
    private javax.swing.JLabel lblNombreDistribuidorFactura1;
    private javax.swing.JLabel lblNombreDistribuidorFactura2;
    private javax.swing.JLabel lblNroFactura;
    private javax.swing.JLabel lblNuevoDistRutexiste;
    private javax.swing.JLabel lblPaginasResumenLibro;
    private javax.swing.JLabel lblPortadaLibro;
    private javax.swing.JLabel lblPortadaLibroResumen;
    private javax.swing.JLabel lblPrecioLibro;
    private javax.swing.JLabel lblPrecioResumenLibro;
    private javax.swing.JLabel lblRutDistribuidorFactura;
    private javax.swing.JLabel lblRutDistribuidorFactura1;
    private javax.swing.JLabel lblTituloResumenLibro;
    private javax.swing.JLabel lblTotalFactura;
    private javax.swing.JPanel panelAdminCompra;
    private javax.swing.JPanel panelAutor;
    private javax.swing.JPanel panelBarraNavegacionLat;
    private javax.swing.JPanel panelBotonesCompra;
    private javax.swing.JPanel panelBotonesLibro;
    private javax.swing.JPanel panelBusquedaLibro;
    private javax.swing.JPanel panelComprasFactura;
    private javax.swing.JPanel panelDetalleLibro;
    private javax.swing.JPanel panelDetallesLibro;
    private javax.swing.JPanel panelDistribuidor;
    private javax.swing.JPanel panelFacturaNueva;
    private javax.swing.JPanel panelFacturaResumen;
    private javax.swing.JPanel panelLibro;
    private javax.swing.JPanel panelOtro;
    private javax.swing.JRadioButton rdBtnConsultaAutorAñadAut;
    private javax.swing.JRadioButton rdBtnConsultaCategoriaAñadCat;
    private javax.swing.JRadioButton rdBtnConsultaIdiomaAñadIdi;
    private javax.swing.JRadioButton rdBtnConsultaTodoAñadAut;
    private javax.swing.JRadioButton rdBtnConsultaTodoAñadCat;
    private javax.swing.JRadioButton rdBtnConsultaTodoAñadIdi;
    private javax.swing.JRadioButton rdConsAutApes;
    private javax.swing.JRadioButton rdConsAutCod;
    private javax.swing.JRadioButton rdConsAutNom;
    private javax.swing.JRadioButton rdConsAutTodo;
    private javax.swing.JRadioButton rdConsCatCod;
    private javax.swing.JRadioButton rdConsCatTodo;
    private javax.swing.JRadioButton rdConsCategoria;
    private javax.swing.JRadioButton rdConsDisCod;
    private javax.swing.JRadioButton rdConsDisNom;
    private javax.swing.JRadioButton rdConsDisRut;
    private javax.swing.JRadioButton rdConsDisTodo;
    private javax.swing.JRadioButton rdConsEdiCod;
    private javax.swing.JRadioButton rdConsEdiTodo;
    private javax.swing.JRadioButton rdConsEditorial;
    private javax.swing.JRadioButton rdConsFacTodo;
    private javax.swing.JRadioButton rdConsIdioCod;
    private javax.swing.JRadioButton rdConsIdioTodo;
    private javax.swing.JRadioButton rdConsIdioma;
    private javax.swing.JRadioButton rdConsultaLibroFiltro;
    private javax.swing.JRadioButton rdConsultaLibroIsbn;
    private javax.swing.JRadioButton rdConsultaLibroTodo;
    private javax.swing.JPanel subPanelCategoria;
    private javax.swing.JPanel subPanelEditorial;
    private javax.swing.JPanel subPanelIdioma;
    private javax.swing.JTable tablaAutCons;
    private javax.swing.JTable tablaCategoriaCons;
    private javax.swing.JTable tablaDistCons;
    private javax.swing.JTable tablaEditorialCons;
    private javax.swing.JTable tablaIdiomaCons;
    private javax.swing.JTable tableAutorAñadidos;
    private javax.swing.JTable tableAutorAñadir;
    private javax.swing.JTable tableCategoriaAñadidas;
    private javax.swing.JTable tableCategoriaAñadir;
    private javax.swing.JTable tableCompras;
    private javax.swing.JTable tableDetallesFactura;
    private javax.swing.JTable tableFacturas;
    private javax.swing.JTable tableIdiomaAñadidos;
    private javax.swing.JTable tableIdiomaAñadir;
    private javax.swing.JTable tableLibroConsulta;
    private javax.swing.JTextField txtAutorApeM;
    private javax.swing.JTextField txtAutorApeP;
    private javax.swing.JTextField txtAutorApesCons;
    private javax.swing.JTextField txtAutorCodCons;
    private javax.swing.JTextField txtAutorNombre;
    private javax.swing.JTextField txtAutorNombreCons;
    private javax.swing.JTextField txtCantidadLibro;
    private javax.swing.JTextField txtCatCodCons;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCategoriaCons;
    private javax.swing.JTextField txtCodConsDis;
    private javax.swing.JTextField txtConsFacDistribuidor;
    private javax.swing.JTextField txtConsultaAñadeAutor;
    private javax.swing.JTextField txtConsultaAñadeCategoria;
    private javax.swing.JTextField txtConsultaAñadeIdioma;
    private javax.swing.JTextField txtEdiCodCons;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtEditorialCons;
    private javax.swing.JTextField txtFiltroLibro;
    private javax.swing.JTextField txtIdioCodCons;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextField txtIdiomaCons;
    private javax.swing.JTextField txtIsbnLibro;
    private javax.swing.JTextField txtIsbnLibroConsulta;
    private javax.swing.JTextField txtNomConsDis;
    private javax.swing.JTextField txtNroFactura;
    private javax.swing.JTextField txtNuevoDisDir;
    private javax.swing.JTextField txtNuevoDisNroT;
    private javax.swing.JTextField txtNuevoDistDVrut;
    private javax.swing.JTextField txtNuevoDistNom;
    private javax.swing.JTextField txtNuevoDistRut;
    private javax.swing.JTextField txtPaginasLibro;
    private javax.swing.JTextField txtPrecioLibro;
    private javax.swing.JTextField txtRutConsDis;
    private javax.swing.JTextField txtTituloLibro;
    private com.toedter.calendar.JYearChooser yearChooserAnoLibro;
    private com.toedter.calendar.JYearChooser yearChooserNuevoDist;
    // End of variables declaration//GEN-END:variables
    
    Border r = BorderFactory.createLineBorder(Color.red); //BORDE PARA CAMPO VALIDO
    Border g = BorderFactory.createLineBorder(Color.gray); //BORDE PARA CAMPO INVALIDO        
    DefaultTableModel dfmodel;
    boolean valida;
    Autor Aut=new Autor();
    Categoria Cat = new Categoria();
    Distribuidor Dist=new Distribuidor();
    Editorial Edit=new Editorial();
    Idioma Idi=new Idioma();
    Factura Fac = new Factura();
    MetodoPago Met= new MetodoPago();
    LibroIsbn LibIsbn= new LibroIsbn();
    ArrayList<LibroIsbn> libros = new ArrayList<>();
    ArrayList<AutorLibro> AutoresLibro = new ArrayList<>();
    ArrayList<CategoriaLibro> CategoriasLibro = new ArrayList<>();
    ArrayList<IdiomaLibro> IdiomasLibro = new ArrayList<>();
    ArrayList<Compra> compras = new ArrayList<>();
    ArrayList<JPanel> paneles=new ArrayList<JPanel>();
    ArrayList<String> filtroLibro = new ArrayList<String>();
    int hoveredRow;
    int hoveredColumn;
           
    JDialog dialogAtras;
    Icon iconSucces = new ImageIcon(getClass().getResource("../img/iconSucces.png"));
    Icon iconError = new ImageIcon(getClass().getResource("../img/iconError.png"));
    Icon iconQuestion = new ImageIcon(getClass().getResource("../img/iconQuestion.png"));
    Icon iconWarning = new ImageIcon(getClass().getResource("../img/iconWarning.png"));
    JSpinner spinner;
 
    double rotacion=0;
    Webcam webcam;
    WebcamPanel webcamPanel;
    JButton btnTomaFoto = new JButton("Capturar");
    JLabel lblMarco= new JLabel();
    
}