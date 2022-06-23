/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import Pedidos.Pedidos;
import conexion.Conectar;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.List;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author argue
 */
public class NPedidos extends javax.swing.JFrame {

    int coor_x;
    int coor_y;

    PreparedStatement ps;
    ResultSet rs;

    static ArrayList<Pedidos> miLista = new ArrayList<Pedidos>();
    ;
    DefaultTableModel model = new DefaultTableModel();

    Pedidos pedidos;
    
    static String pedidosTodos;
    static int importe;
    static String cliente;
    
    
    /**
     * Creates new form NewJFrame
     */
    public NPedidos() {

        initComponents();
        setLocationRelativeTo(null);
        jPanel1.setBackground(new Color(0, 0, 0, 1));
        Login login = new Login();
        jLabelUsuario.setText("Bienvenido: " + login.getUser());
        cargarClientes();
        cargarProducto();
        jTextFieldPrecio.setEditable(false);
        jTextFieldPrecioTotal.setEditable(false);
        jScrollPane1.setViewportView(jTableProductos);
        model.addColumn("Producto");
        model.addColumn("Precio");
        model.addColumn("Cantidad");
        model.addColumn("Precio total");
        jTableProductos.setModel(model);
        

    }

    public void cargarClientes() {

        Conectar con = new Conectar();
        Connection conexion = con.getConexion();

        try {
            ps = conexion.prepareStatement("select nombre from cliente");
            rs = ps.executeQuery();

            while (rs.next()) {
                jComboBoxCliente.addItem(rs.getString(1));
            }

        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "Error al mostrar información");
        }
    }

    public void cargarProducto() {

        Conectar con = new Conectar();
        Connection conexion = con.getConexion();

        try {
            ps = conexion.prepareStatement("select nombre from producto");
            rs = ps.executeQuery();

            while (rs.next()) {
                jComboBoxProducto.addItem(rs.getString(1));
            }

        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "Error al mostrar información");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSalir = new javax.swing.JLabel();
        jLabelBack = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelInicio = new javax.swing.JLabel();
        jLabelCantidadTotal = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelProducto = new javax.swing.JLabel();
        jComboBoxProducto = new javax.swing.JComboBox<>();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jButtonRePe = new javax.swing.JButton();
        jTextFieldPrecioTotal = new javax.swing.JTextField();
        jLabelCantidad = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jButtonObtenerPre = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jButtonVolver = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jLabelImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actividad4/imagenes/cocheee.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 130, 70));

        jPanel1.setBackground(new java.awt.Color(0, 0, 1));
        jPanel1.setForeground(new java.awt.Color(0, 0, 1));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabelUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabelSalir.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelSalir.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/android-icon-36x36_1.png"))); // NOI18N
        jLabelSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseExited(evt);
            }
        });

        jLabelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/android-icon-36x36.png"))); // NOI18N
        jLabelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(449, Short.MAX_VALUE)
                .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSalir)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelBack, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

        jSeparator1.setBackground(new java.awt.Color(139, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(139, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 1500));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 720, 10));

        jLabelInicio.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(189, 0, 0));
        jLabelInicio.setText("Nuevos Pedidos");
        getContentPane().add(jLabelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabelCantidadTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCantidadTotal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidadTotal.setText("Importe total:");
        getContentPane().add(jLabelCantidadTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabelCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente.setText("Cliente:");
        getContentPane().add(jLabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabelProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelProducto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProducto.setText("Producto:");
        getContentPane().add(jLabelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jComboBoxProducto.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxProducto.setForeground(new java.awt.Color(189, 0, 0));
        jComboBoxProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxProductoMouseClicked(evt);
            }
        });
        getContentPane().add(jComboBoxProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 440, -1));

        jComboBoxCliente.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxCliente.setForeground(new java.awt.Color(189, 0, 0));
        jComboBoxCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxClienteMouseClicked(evt);
            }
        });
        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 440, -1));

        jSpinnerCantidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSpinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinnerCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jSpinnerCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 90, -1));

        jButtonRePe.setBackground(new java.awt.Color(139, 0, 0));
        jButtonRePe.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonRePe.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRePe.setText("Realizar pedido");
        jButtonRePe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRePe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRePeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRePeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRePeMouseExited(evt);
            }
        });
        jButtonRePe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRePeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRePe, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 340, 40));

        jTextFieldPrecioTotal.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPrecioTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldPrecioTotal.setForeground(new java.awt.Color(139, 0, 0));
        getContentPane().add(jTextFieldPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 130, 30));

        jLabelCantidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidad.setText("Cantidad:");
        getContentPane().add(jLabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jTextFieldPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPrecio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldPrecio.setForeground(new java.awt.Color(139, 0, 0));
        getContentPane().add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 90, 30));

        jButtonObtenerPre.setBackground(new java.awt.Color(139, 0, 0));
        jButtonObtenerPre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonObtenerPre.setForeground(new java.awt.Color(255, 255, 255));
        jButtonObtenerPre.setText("Obtener Precio");
        jButtonObtenerPre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonObtenerPre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonObtenerPreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonObtenerPreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonObtenerPreMouseExited(evt);
            }
        });
        jButtonObtenerPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonObtenerPreActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonObtenerPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 200, 30));

        jSeparator2.setBackground(new java.awt.Color(139, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(139, 0, 0));
        jSeparator2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 1500));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 720, 10));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 570, 130));

        jButtonVolver.setBackground(new java.awt.Color(139, 0, 0));
        jButtonVolver.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolver.setText("Volver");
        jButtonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonVolverMouseExited(evt);
            }
        });
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 120, 40));

        jButtonAdd.setBackground(new java.awt.Color(139, 0, 0));
        jButtonAdd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setText("Añadir");
        jButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAddMouseExited(evt);
            }
        });
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 120, 40));

        jLabelImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actividad4/imagenes/portada.png"))); // NOI18N
        getContentPane().add(jLabelImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        coor_x = evt.getX();
        coor_y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - coor_x, y - coor_y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked
        // TODO add your handling code here:
        jLabelSalir.setBackground(new Color(0, 0, 0, 1));
        dispose();
        Login login = new Login();
        login.setVisible(true);

    }//GEN-LAST:event_jLabelSalirMouseClicked

    private void jLabelSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseEntered

    }//GEN-LAST:event_jLabelSalirMouseEntered

    private void jLabelSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSalirMouseExited

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        // TODO add your handling code here:

        dispose();
        Principal prin = new Principal();
        prin.setVisible(true);
    }//GEN-LAST:event_jLabelBackMouseClicked

    private void jComboBoxProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxProductoMouseClicked
        jSpinnerCantidad.setValue(0);
    }//GEN-LAST:event_jComboBoxProductoMouseClicked

    private void jButtonRePeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRePeMouseClicked
        // TODO add your handling code here:
        Conectar con = new Conectar();
        Connection conexion = con.getConexion();
        String aux=pedidosTodos.substring(4, pedidosTodos.length()-2);
        try {
            ps = conexion.prepareStatement("INSERT INTO pedido(productos, importe, cliente) VALUES (?,?,?)");
            ps.setString(1, aux);
            ps.setInt(2, importe);
            ps.setString(3, cliente);
            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(this, "El pedido se ha creado correctamente.", "Registro producto", 1);
                
                
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar el pedido en BBDD.", "Registro producto", 0);
                jTextFieldPrecio.setText("Inserte nombre");
                
            }

            conexion.close();

        } catch (Exception e) {
            System.err.print(e);
        }
        
    }//GEN-LAST:event_jButtonRePeMouseClicked

    private void jButtonRePeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRePeMouseEntered
        // TODO add your handling code here:
        jButtonRePe.setBackground(Color.white);
        jButtonRePe.setForeground(new Color(139, 0, 0));
    }//GEN-LAST:event_jButtonRePeMouseEntered

    private void jButtonRePeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRePeMouseExited
        // TODO add your handling code here:
        jButtonRePe.setBackground(new Color(139, 0, 0));
        jButtonRePe.setForeground(Color.white);
    }//GEN-LAST:event_jButtonRePeMouseExited

    private void jButtonRePeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRePeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonRePeActionPerformed

    private void jButtonObtenerPreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonObtenerPreMouseClicked
        // TODO add your handling code here:
        Conectar con = new Conectar();
        Connection conexion = con.getConexion();

        try {
            ps = conexion.prepareStatement("select precio from producto "
                    + "where nombre = ?");
            ps.setString(1, jComboBoxProducto.getSelectedItem().toString());
            rs = ps.executeQuery();

            while (rs.next()) {
                jTextFieldPrecio.setText(rs.getString(1));
            }

        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "Error al mostrar información");
        }

    }//GEN-LAST:event_jButtonObtenerPreMouseClicked

    private void jButtonObtenerPreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonObtenerPreMouseEntered
        // TODO add your handling code here:
        jButtonObtenerPre.setBackground(Color.white);
        jButtonObtenerPre.setForeground(new Color(139, 0, 0));
    }//GEN-LAST:event_jButtonObtenerPreMouseEntered

    private void jButtonObtenerPreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonObtenerPreMouseExited
        // TODO add your handling code here:
        jButtonObtenerPre.setBackground(new Color(139, 0, 0));
        jButtonObtenerPre.setForeground(Color.white);
    }//GEN-LAST:event_jButtonObtenerPreMouseExited

    private void jButtonObtenerPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonObtenerPreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonObtenerPreActionPerformed

    private void jButtonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVolverMouseClicked
        // TODO add your handling code here:
        dispose();
        Principal prin=new Principal();
        prin.setVisible(true);
    }//GEN-LAST:event_jButtonVolverMouseClicked

    private void jButtonVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVolverMouseEntered
        // TODO add your handling code here:
        jButtonVolver.setBackground(Color.white);
        jButtonVolver.setForeground(new Color(139, 0, 0));
    }//GEN-LAST:event_jButtonVolverMouseEntered

    private void jButtonVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVolverMouseExited
        // TODO add your handling code here:
        jButtonVolver.setBackground(new Color(139, 0, 0));
        jButtonVolver.setForeground(Color.white);
    }//GEN-LAST:event_jButtonVolverMouseExited

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseClicked

        Conectar con = new Conectar();
        Connection conexion = con.getConexion();

        String producto = jComboBoxProducto.getSelectedItem().toString();
        int precio = 0;
        int cantidad = new Integer(jSpinnerCantidad.getValue().toString());
        double precioTotal = 0.0;
        double importTotal=0.0;
        try {
            ps = conexion.prepareStatement("select precio from producto "
                    + "where nombre = ?");
            ps.setString(1, jComboBoxProducto.getSelectedItem().toString());
            rs = ps.executeQuery();

            while (rs.next()) {
                jTextFieldPrecio.setText(rs.getString(1));
                precio = rs.getInt(1);
            }

        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "Error al mostrar información");
        }

        precioTotal = cantidad * precio;

        pedidos = new Pedidos(producto, precio, cantidad, precioTotal);
        miLista.add(pedidos);

        model.setRowCount(0);
        for(int i=0; i<miLista.size();i++){
            Object[] fila={
                miLista.get(i).getProducto(),
                miLista.get(i).getPrecio(),
                miLista.get(i).getCantidad(),
                miLista.get(i).getPrecioTotal()
            };
            model.addRow(fila);
            importTotal+=miLista.get(i).getPrecioTotal();
        }
        
        jTextFieldPrecioTotal.setText(importTotal+"");
       
        pedidosTodos+=producto+", ";
        importe=(int) importTotal;
        cliente=jComboBoxCliente.getSelectedItem().toString();
    }//GEN-LAST:event_jButtonAddMouseClicked

    private void jButtonAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseEntered
        // TODO add your handling code here:
        jButtonAdd.setBackground(Color.white);
        jButtonAdd.setForeground(new Color(139, 0, 0));
    }//GEN-LAST:event_jButtonAddMouseEntered

    private void jButtonAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseExited
        // TODO add your handling code here:
        jButtonAdd.setBackground(new Color(139, 0, 0));
        jButtonAdd.setForeground(Color.white);
    }//GEN-LAST:event_jButtonAddMouseExited

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jComboBoxClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxClienteMouseClicked
        // TODO add your handling code here:
        jComboBoxProducto.setSelectedIndex(1);
        jSpinnerCantidad.setValue(0);
        jTextFieldPrecio.setText("");
        jTextFieldPrecioTotal.setText("");
        ((DefaultTableModel)jTableProductos.getModel()).setNumRows(0);
    }//GEN-LAST:event_jComboBoxClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonObtenerPre;
    private javax.swing.JButton jButtonRePe;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxProducto;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCantidadTotal;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelImagenFondo;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelProducto;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldPrecioTotal;
    // End of variables declaration//GEN-END:variables
}
