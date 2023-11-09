package bdaduana.vista;

public class PantallaEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form PantallaEmpleados
     */
    public PantallaEmpleados() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleados");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(153, 153, 153));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPrincipal.setForeground(new java.awt.Color(51, 51, 51));

        scrollPane.setBackground(new java.awt.Color(153, 153, 153));
        scrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        scrollPane.setForeground(new java.awt.Color(102, 102, 102));

        tableRegistros.setBackground(new java.awt.Color(204, 204, 204));
        tableRegistros.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tableRegistros.setForeground(new java.awt.Color(102, 102, 102));
        tableRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Correo", "Usuario", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableRegistros.setName(""); // NOI18N
        tableRegistros.setRowHeight(30);
        tableRegistros.setShowGrid(true);
        scrollPane.setViewportView(tableRegistros);

        buttonRegistrar.setBackground(new java.awt.Color(204, 204, 204));
        buttonRegistrar.setForeground(new java.awt.Color(102, 102, 102));
        buttonRegistrar.setText("Registrar");
        buttonRegistrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Empleados");

        buttonActualizar.setBackground(new java.awt.Color(204, 204, 204));
        buttonActualizar.setForeground(new java.awt.Color(102, 102, 102));
        buttonActualizar.setText("Guardar");
        buttonActualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonEliminar.setBackground(new java.awt.Color(204, 204, 204));
        buttonEliminar.setForeground(new java.awt.Color(102, 102, 102));
        buttonEliminar.setText("Eliminar");
        buttonEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonRegistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(buttonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public final javax.swing.JButton buttonActualizar = new javax.swing.JButton();
    public final javax.swing.JButton buttonEliminar = new javax.swing.JButton();
    public final javax.swing.JButton buttonRegistrar = new javax.swing.JButton();
    public final javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    public final javax.swing.JPanel panelPrincipal = new javax.swing.JPanel();
    public final javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane();
    public final javax.swing.JTable tableRegistros = new javax.swing.JTable();
    // End of variables declaration//GEN-END:variables
}
