/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import Stock.*;
import login.*;
import conexion.Conectar;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.Icon;

/**
 *
 * @author argue
 */
public class AddCliente extends javax.swing.JFrame {

    int coor_x;
    int coor_y;

    PreparedStatement ps;
    ResultSet rs;

    /**
     * Creates new form NewJFrame
     */
    public AddCliente() {

        initComponents();
        setLocationRelativeTo(null);
        jPanel1.setBackground(new Color(0, 0, 0, 1));
        jRadioButtonEmpresa.setBackground(new Color(0, 0, 0, 1));
        jRadioButtonParticular.setBackground(new Color(0, 0, 0, 1));

        //jLabelCesta.setOpaque(true);
//        jLabelClientes.setOpaque(true);
//        jLabelProovedores.setOpaque(true);
//        jLabelStock.setOpaque(true);
//        jLabelPedidos.setOpaque(true);
//        jLabelGestion.setOpaque(true);
        Login login = new Login();
        jLabelUusuario.setText("Usuario conectado: " + login.getUser());

        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonEmpresa);
        bg.add(jRadioButtonParticular);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelUusuario = new javax.swing.JLabel();
        jLabelSalir = new javax.swing.JLabel();
        jLabelBack = new javax.swing.JLabel();
        jLabelInicio = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelDescripcion = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jLabelDescripcion1 = new javax.swing.JLabel();
        jButtonList = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonAdd2 = new javax.swing.JButton();
        jRadioButtonEmpresa = new javax.swing.JRadioButton();
        jRadioButtonParticular = new javax.swing.JRadioButton();
        jLabelImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actividad4/imagenes/cocheee.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 70));

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

        jLabelUusuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUusuario.setForeground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(396, Short.MAX_VALUE)
                .addComponent(jLabelUusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSalir)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 40));

        jLabelInicio.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(189, 0, 0));
        jLabelInicio.setText("Nuevo cliente");
        getContentPane().add(jLabelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(139, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(139, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 1500));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 700, 40));

        jLabelDescripcion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion.setText("Categoría:");
        getContentPane().add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, 20));

        jTextFieldDireccion.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDireccion.setForeground(new java.awt.Color(189, 0, 0));
        getContentPane().add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 360, -1));

        jTextFieldTelefono.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTelefono.setForeground(new java.awt.Color(189, 0, 0));
        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 360, -1));

        jTextFieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setForeground(new java.awt.Color(189, 0, 0));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 360, -1));

        jTextFieldCorreo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCorreo.setForeground(new java.awt.Color(189, 0, 0));
        jTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 360, -1));

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabelCategoria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategoria.setText("Dirección:");
        getContentPane().add(jLabelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabelCantidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCantidad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidad.setText("Correo electrónico:");
        getContentPane().add(jLabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabelDescripcion1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelDescripcion1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion1.setText("Teléfono:");
        getContentPane().add(jLabelDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, 20));

        jButtonList.setBackground(new java.awt.Color(139, 0, 0));
        jButtonList.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonList.setForeground(new java.awt.Color(255, 255, 255));
        jButtonList.setText("Ir a lista clientes");
        jButtonList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonListMouseExited(evt);
            }
        });
        jButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonList, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

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
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        jButtonAdd2.setBackground(new java.awt.Color(139, 0, 0));
        jButtonAdd2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonAdd2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd2.setText("Añadir");
        jButtonAdd2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAdd2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAdd2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAdd2MouseExited(evt);
            }
        });
        jButtonAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        jRadioButtonEmpresa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButtonEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonEmpresa.setText("Empresa");
        jRadioButtonEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jRadioButtonEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        jRadioButtonParticular.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonParticular.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRadioButtonParticular.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonParticular.setText("Particular");
        jRadioButtonParticular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jRadioButtonParticular, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

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

    private void jButtonListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonListMouseClicked
        // TODO add your handling code here:
        dispose();
        ListarCliente licli=new ListarCliente();
        licli.setVisible(true);
    }//GEN-LAST:event_jButtonListMouseClicked

    private void jButtonListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonListMouseEntered
        // TODO add your handling code here:
        jButtonList.setBackground(Color.white);
        jButtonList.setForeground(new Color(139, 0, 0));
    }//GEN-LAST:event_jButtonListMouseEntered

    private void jButtonListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonListMouseExited
        // TODO add your handling code here:
        jButtonList.setBackground(new Color(139, 0, 0));
        jButtonList.setForeground(Color.white);
    }//GEN-LAST:event_jButtonListMouseExited

    private void jButtonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonListActionPerformed

    private void jButtonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVolverMouseClicked
        // TODO add your handling code here:
        dispose();
        Clientes cli=new Clientes();
        cli.setVisible(true);
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

    private void jButtonAdd2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdd2MouseClicked
        // TODO add your handling code here:
        registrsmosProducto();
    }//GEN-LAST:event_jButtonAdd2MouseClicked

    public static boolean isPhoneNumberValid(String phoneNumber) {
        boolean isValid = false;

        String regex = "(\\+34|0034|34)?[ -]*(6|7)[ -]*([0-9][ -]*){8}";
        if (phoneNumber.matches(regex)) {
            isValid=true;
        } else {
            isValid=false;
        }
        return isValid;
    }
    
    public static boolean correo(String correo) {
        boolean isValid = false;

        String regex = "([A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}(;|$))";
        if (correo.matches(regex)) {
            isValid=true;
        } else {
            isValid=false;
        }
        return isValid;
    }

    public void registrsmosProducto() {
        Conectar con = new Conectar();
        Connection conexion = con.getConexion();

        try {
            ps = conexion.prepareStatement("INSERT INTO cliente(nombre, direccion, email, telefono, categoria) VALUES (?,?,?,?,?)");
            ps.setString(1, jTextFieldNombre.getText());
            ps.setString(2, jTextFieldDireccion.getText());
            if(correo(jTextFieldCorreo.getText())==true){
                ps.setString(3, jTextFieldCorreo.getText());
            }else {
                JOptionPane.showMessageDialog(this, "Correo erroneo", "Registro cliente", 0);
                jTextFieldCorreo.setText("");
            }
            if (isPhoneNumberValid(jTextFieldTelefono.getText()) == true) {
                ps.setString(4, jTextFieldTelefono.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Número de teléfono erroneo", "Registro cliente", 0);
                jTextFieldTelefono.setText("");
            }
            if (jRadioButtonEmpresa.isSelected() || jRadioButtonParticular.isSelected()) {
                if (jRadioButtonEmpresa.isSelected()) {
                    ps.setString(5, "Empresa");
                } else {
                    ps.setString(5, "Particular");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar el cliente en BBDD. Seleciona una opción", "Registro cliente", 0);
            }
            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(this, "El cliente se ha creado correctamente.", "Registro cliente", 1);
                jTextFieldNombre.setText("");
                jTextFieldDireccion.setText("");
                jTextFieldCorreo.setText("");
                jTextFieldTelefono.setText("");
                jRadioButtonEmpresa.setSelected(false);
                jRadioButtonParticular.setSelected(false);

            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar el cliente en BBDD.", "Registro cliente", 0);
                jTextFieldDireccion.setText("Inserte nombre");

            }

            conexion.close();

        } catch (Exception e) {
            System.err.print(e);
        }
    }

    private void jButtonAdd2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdd2MouseEntered
        // TODO add your handling code here:
        jButtonAdd2.setBackground(Color.white);
        jButtonAdd2.setForeground(new Color(139, 0, 0));
    }//GEN-LAST:event_jButtonAdd2MouseEntered

    private void jButtonAdd2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdd2MouseExited
        // TODO add your handling code here:
        jButtonAdd2.setBackground(new Color(139, 0, 0));
        jButtonAdd2.setForeground(Color.white);
    }//GEN-LAST:event_jButtonAdd2MouseExited

    private void jButtonAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAdd2ActionPerformed

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked
        // TODO add your handling code here:
        jLabelSalir.setBackground(new Color(0, 0, 0, 1));
        dispose();
        Login login = new Login();
        login.setVisible(true);

    }//GEN-LAST:event_jLabelSalirMouseClicked

    private void jLabelSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseEntered
        // TODO add your handling code here:
        
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

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd2;
    private javax.swing.JButton jButtonList;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelDescripcion1;
    private javax.swing.JLabel jLabelImagenFondo;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JLabel jLabelUusuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonEmpresa;
    private javax.swing.JRadioButton jRadioButtonParticular;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}