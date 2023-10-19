package bdaduana.vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PantallaRegistro extends javax.swing.JFrame {

    public PantallaRegistro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField8 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        OCULTAR = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        VER1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextField8.setBackground(new java.awt.Color(51, 153, 255));
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jTextField8.setCaretColor(new java.awt.Color(255, 255, 255));

        jTextField2.setBackground(new java.awt.Color(51, 153, 255));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jTextField2.setCaretColor(new java.awt.Color(255, 255, 255));

        jTextField9.setBackground(new java.awt.Color(51, 153, 255));
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jTextField9.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField6.setBackground(new java.awt.Color(51, 153, 255));
        jTextField6.setFont(new java.awt.Font("Sylfaen", 1, 22)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("Correo Electrónico:");
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 200, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTextField1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jTextField1.setText("REGISTRARSE");
        jTextField1.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextField1)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 90));

        jTextField10.setBackground(new java.awt.Color(51, 153, 255));
        jTextField10.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setText("DNI:");
        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, 30));

        jTextField11.setBackground(new java.awt.Color(51, 153, 255));
        jTextField11.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setText("Contraseña:");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 140, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 210, 190));

        jTextField12.setBackground(new java.awt.Color(51, 153, 255));
        jTextField12.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setText("Nombre:");
        jTextField12.setBorder(null);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 30));

        btnVolver.setFont(new java.awt.Font("Sylfaen", 1, 30)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 260, 70));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 500, 180));

        txtNombre.setBackground(new java.awt.Color(51, 153, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 380, 50));

        txtDNI.setBackground(new java.awt.Color(51, 153, 255));
        txtDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(255, 255, 255));
        txtDNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        txtDNI.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 380, 50));

        txtCorreo.setBackground(new java.awt.Color(51, 153, 255));
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        txtCorreo.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 380, 50));

        btnRegistrar.setFont(new java.awt.Font("Sylfaen", 1, 30)); // NOI18N
        btnRegistrar.setText("¡Registrate!");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 260, 70));

        OCULTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ocultar_32px.png"))); // NOI18N
        jPanel1.add(OCULTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 50, 50));

        txtPass.setBackground(new java.awt.Color(51, 153, 255));
        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        txtPass.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 370, 40));

        VER1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver_32px.png"))); // NOI18N
        VER1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VER1MouseClicked(evt);
            }
        });
        jPanel1.add(VER1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 50, 50));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 886, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void VERMouseClicked(java.awt.event.MouseEvent evt) {                                 
      
    }   
    
    private void VER1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VER1MouseClicked

    }//GEN-LAST:event_VER1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel OCULTAR;
    public javax.swing.JLabel VER1;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JButton btnVolver;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField10;
    public javax.swing.JTextField jTextField11;
    public javax.swing.JTextField jTextField12;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField8;
    public javax.swing.JTextField jTextField9;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDNI;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
