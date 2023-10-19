package bdaduana.vista;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class PantallaLogin extends JFrame {
    public PantallaLogin() {
        initComponents();
        scaleImage();
    }
    
    private void scaleImage() {
        ImageIcon icono = new ImageIcon(this.getClass().getResource("/imagenes/logo.jpg"));
        
        Image imagen = icono.getImage();
        Image escala = imagen.getScaledInstance(this.VER2.getWidth(), this.VER2.getHeight(), Image.SCALE_SMOOTH);
        
        this.VER2.setIcon(new ImageIcon(escala));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        VER = new javax.swing.JLabel();
        OCULTAR = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        VER1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        VER2 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("ADUANAS");
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INICIO DE SESIÓN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setForeground(new java.awt.Color(102, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setBackground(new java.awt.Color(51, 153, 255));
        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(null);
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 280, 50));

        btnRegistrar.setBackground(new java.awt.Color(255, 0, 51));
        btnRegistrar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrate");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 120, 40));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿No tienes una cuenta?");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 210, 20));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 310, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 310, 10));

        jTextField3.setBackground(new java.awt.Color(51, 153, 255));
        jTextField3.setFont(new java.awt.Font("Sitka Text", 1, 45)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("INICIAR SESIÓN");
        jTextField3.setBorder(null);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 380, 90));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 80, 20));

        btnEntrar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnEntrar.setText("ENTRAR");
        btnEntrar.setBorder(null);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 170, 60));

        VER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver_32px.png"))); // NOI18N
        VER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VERMouseClicked(evt);
            }
        });
        jPanel2.add(VER, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 40, 30));

        OCULTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ocultar_32px.png"))); // NOI18N
        OCULTAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OCULTARMouseClicked(evt);
            }
        });
        jPanel2.add(OCULTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 40, 30));

        txtPass.setBackground(new java.awt.Color(51, 153, 255));
        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(null);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 290, 50));

        VER1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver_32px.png"))); // NOI18N
        VER1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VER1MouseClicked(evt);
            }
        });
        jPanel2.add(VER1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 40, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 440, 580));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jTextField4.setText("COMERCIO INTEGRAL S.A.C");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 460, 90));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        VER2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.jpg"))); // NOI18N
        VER2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VER2MouseClicked(evt);
            }
        });
        jPanel1.add(VER2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 280, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void OCULTARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OCULTARMouseClicked

    }//GEN-LAST:event_OCULTARMouseClicked

    private void VERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VERMouseClicked

    }//GEN-LAST:event_VERMouseClicked

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed

    }//GEN-LAST:event_txtPassActionPerformed

    private void VER1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VER1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_VER1MouseClicked

    private void VER2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VER2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_VER2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel OCULTAR;
    public javax.swing.JLabel VER;
    public javax.swing.JLabel VER1;
    public javax.swing.JLabel VER2;
    public javax.swing.JButton btnEntrar;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JPasswordField txtPass;
    public javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
