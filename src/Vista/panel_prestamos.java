/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


public class panel_prestamos extends javax.swing.JPanel {

    
    public panel_prestamos() {
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

        panel_de_productos = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBucarArticulo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSocioCodigo = new javax.swing.JTextField();
        jLabelXD = new javax.swing.JLabel();
        txtSocioApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnregistrarPrestamo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSocioDni = new javax.swing.JTextField();
        txtCodigoArticulo = new javax.swing.JTextField();
        btnBuscarSocio = new javax.swing.JButton();
        txtSocioNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDiaPrestamo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtIdPrestamo = new javax.swing.JTextField();
        btnRegistrarDevolucion = new javax.swing.JButton();
        btnBuscarPrestamo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtDevolucionCodigoSocio = new javax.swing.JTextField();
        txtDevolucionArticuloNombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDevolucionCodigoArticulo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDevolucionSocioNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();

        panel_de_productos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Prestamo"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Socio Dni:");

        btnBucarArticulo.setBackground(new java.awt.Color(255, 153, 0));
        btnBucarArticulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBucarArticulo.setText("BUSCAR");
        btnBucarArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBucarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBucarArticuloActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Socio Nombre:");

        txtSocioCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabelXD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelXD.setText("Socio Apellidos:");

        txtSocioApellidos.setEditable(false);
        txtSocioApellidos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSocioApellidos.setText("No se encontro");
        txtSocioApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSocioApellidosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Codigo Articulo");

        btnregistrarPrestamo.setBackground(new java.awt.Color(255, 153, 0));
        btnregistrarPrestamo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnregistrarPrestamo.setText("REGISTRAR");
        btnregistrarPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Socio Codigo:");

        txtSocioDni.setEditable(false);
        txtSocioDni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSocioDni.setText("No se encontro");
        txtSocioDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSocioDniActionPerformed(evt);
            }
        });

        txtCodigoArticulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnBuscarSocio.setBackground(new java.awt.Color(255, 153, 0));
        btnBuscarSocio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarSocio.setText("BUSCAR");
        btnBuscarSocio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSocioActionPerformed(evt);
            }
        });

        txtSocioNombre.setEditable(false);
        txtSocioNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSocioNombre.setText("No se encontro");
        txtSocioNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSocioNombreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Dias plazo:");

        txtDiaPrestamo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(txtSocioDni, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtSocioCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarSocio)))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtDiaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addComponent(jLabelXD, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSocioApellidos))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtCodigoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBucarArticulo)
                                .addGap(0, 13, Short.MAX_VALUE)))))
                .addGap(32, 32, 32))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(665, Short.MAX_VALUE)
                    .addComponent(btnregistrarPrestamo)
                    .addGap(43, 43, 43)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(181, 181, 181)
                    .addComponent(txtSocioNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(424, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSocioCodigo)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 20, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSocioDni))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelXD)
                    .addComponent(txtSocioApellidos))
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodigoArticulo)
                    .addComponent(btnBucarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDiaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(356, Short.MAX_VALUE)
                    .addComponent(btnregistrarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(txtSocioNombre)
                    .addGap(240, 240, 240)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_de_productos.addTab("Registrar Prestamo", jPanel1);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar Devolucion"));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("id_Devolucion:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Nombre Articulo:");

        txtIdPrestamo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIdPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPrestamoActionPerformed(evt);
            }
        });

        btnRegistrarDevolucion.setBackground(new java.awt.Color(255, 153, 0));
        btnRegistrarDevolucion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegistrarDevolucion.setText("REGISTRAR DEVOLUCION");
        btnRegistrarDevolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDevolucionActionPerformed(evt);
            }
        });

        btnBuscarPrestamo.setBackground(new java.awt.Color(255, 153, 0));
        btnBuscarPrestamo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarPrestamo.setText("BUSCAR");
        btnBuscarPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPrestamoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Codigo Socio:");

        txtDevolucionCodigoSocio.setEditable(false);
        txtDevolucionCodigoSocio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDevolucionCodigoSocio.setText("No se encontro");
        txtDevolucionCodigoSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDevolucionCodigoSocioActionPerformed(evt);
            }
        });

        txtDevolucionArticuloNombre.setEditable(false);
        txtDevolucionArticuloNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDevolucionArticuloNombre.setText("No se encontro");
        txtDevolucionArticuloNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDevolucionArticuloNombreActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Codigo Articulo:");

        txtDevolucionCodigoArticulo.setEditable(false);
        txtDevolucionCodigoArticulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDevolucionCodigoArticulo.setText("No se encontro");
        txtDevolucionCodigoArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDevolucionCodigoArticuloActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Nombre socio:");

        txtDevolucionSocioNombre.setEditable(false);
        txtDevolucionSocioNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDevolucionSocioNombre.setText("No se encontro");
        txtDevolucionSocioNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDevolucionSocioNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(txtDevolucionCodigoSocio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnBuscarPrestamo)
                                .addGap(51, 51, 51))
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(11, 11, 11)
                        .addComponent(txtDevolucionSocioNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistrarDevolucion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(txtDevolucionCodigoArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(44, 44, 44)
                        .addComponent(txtDevolucionArticuloNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtIdPrestamo)
                    .addComponent(btnBuscarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtDevolucionCodigoSocio)
                    .addComponent(jLabel17)
                    .addComponent(txtDevolucionSocioNombre))
                .addGap(51, 51, 51)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtDevolucionCodigoArticulo)
                    .addComponent(jLabel16)
                    .addComponent(txtDevolucionArticuloNombre))
                .addGap(65, 65, 65)
                .addComponent(btnRegistrarDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_de_productos.addTab("Registrar Devolucion", jPanel3);

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo Socio", "Codigo Articulo", "Fecha incio", "Fecha Tope", "Fecha Devolucion"
            }
        ));
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaProductos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        panel_de_productos.addTab("Reporte", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panel_de_productos)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panel_de_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
        
       
        int fila = TablaProductos.rowAtPoint(evt.getPoint());
     
    }//GEN-LAST:event_TablaProductosMouseClicked

    private void txtIdPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPrestamoActionPerformed

    private void btnRegistrarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDevolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarDevolucionActionPerformed

    private void btnBucarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBucarArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBucarArticuloActionPerformed

    private void txtSocioApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSocioApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSocioApellidosActionPerformed

    private void txtSocioDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSocioDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSocioDniActionPerformed

    private void btnBuscarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarSocioActionPerformed

    private void txtSocioNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSocioNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSocioNombreActionPerformed

    private void btnBuscarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarPrestamoActionPerformed

    private void txtDevolucionCodigoSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDevolucionCodigoSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDevolucionCodigoSocioActionPerformed

    private void txtDevolucionArticuloNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDevolucionArticuloNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDevolucionArticuloNombreActionPerformed

    private void txtDevolucionCodigoArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDevolucionCodigoArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDevolucionCodigoArticuloActionPerformed

    private void txtDevolucionSocioNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDevolucionSocioNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDevolucionSocioNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaProductos;
    public javax.swing.JButton btnBucarArticulo;
    public javax.swing.JButton btnBuscarPrestamo;
    public javax.swing.JButton btnBuscarSocio;
    public javax.swing.JButton btnRegistrarDevolucion;
    public javax.swing.JButton btnregistrarPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelXD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane panel_de_productos;
    public javax.swing.JTextField txtCodigoArticulo;
    public javax.swing.JTextField txtDevolucionArticuloNombre;
    public javax.swing.JTextField txtDevolucionCodigoArticulo;
    public javax.swing.JTextField txtDevolucionCodigoSocio;
    public javax.swing.JTextField txtDevolucionSocioNombre;
    public javax.swing.JTextField txtDiaPrestamo;
    public javax.swing.JTextField txtIdPrestamo;
    public javax.swing.JTextField txtSocioApellidos;
    public javax.swing.JTextField txtSocioCodigo;
    public javax.swing.JTextField txtSocioDni;
    public javax.swing.JTextField txtSocioNombre;
    // End of variables declaration//GEN-END:variables
}