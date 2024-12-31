/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public final class Sistema extends javax.swing.JFrame {
    Date fechaVenta = new Date();
    String fechaActual = new SimpleDateFormat("dd/MM/yyyy").format(fechaVenta);

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel tmp = new DefaultTableModel();
    int item;
    double Totalpagar = 0.00;
    

    public Sistema() {
        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH);//mostrar a pantalla complet
        this.setLocationRelativeTo(null);
    }
    //public Sistema (login priv){
        /*initComponents();
        this.setLocationRelativeTo(null);
        Midate.setDate(fechaVenta);
        txtIdCliente.setVisible(false);
        txtIdVenta.setVisible(false);
        txtIdPro.setVisible(false);
        txtIdproducto.setVisible(false);
        txtIdProveedor.setVisible(false);
        txtIdConfig.setVisible(false);
        txtIdCV.setVisible(false);
        ListarConfig();
        if (priv.getRol().equals("Asistente")) {
            btnProductos.setEnabled(false);
            btnProveedor.setEnabled(false);
            LabelVendedor.setText(priv.getNombre());
        }else{
            LabelVendedor.setText(priv.getNombre());
        }*/
    //}
    //public void ListarCliente() {
        /*List<Cliente> ListarCl = client.ListarCliente();
        modelo = (DefaultTableModel) TableCliente.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarCl.size(); i++) {
            ob[0] = ListarCl.get(i).getId();
            ob[1] = ListarCl.get(i).getDni();
            ob[2] = ListarCl.get(i).getNombre();
            ob[3] = ListarCl.get(i).getTelefono();
            ob[4] = ListarCl.get(i).getDireccion();
            modelo.addRow(ob);
        }
        TableCliente.setModel(modelo);
        */

    //}

    //public void ListarProveedor() {
        /*List<Proveedor> ListarPr = PrDao.ListarProveedor();
        modelo = (DefaultTableModel) TableProveedor.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < ListarPr.size(); i++) {
            ob[0] = ListarPr.get(i).getId();
            ob[1] = ListarPr.get(i).getRuc();
            ob[2] = ListarPr.get(i).getNombre();
            ob[3] = ListarPr.get(i).getTelefono();
            ob[4] = ListarPr.get(i).getDireccion();
            modelo.addRow(ob);
        }
        TableProveedor.setModel(modelo);
        */
   // }
    public void ListarUsuarios() {
        /*List<login> Listar = login.ListarUsuarios();
        modelo = (DefaultTableModel) TableUsuarios.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getNombre();
            ob[2] = Listar.get(i).getCorreo();
            ob[3] = Listar.get(i).getRol();
            modelo.addRow(ob);
        }
        TableUsuarios.setModel(modelo);
        */
    }
    public void ListarProductos() {
        /*List<Productos> ListarPro = proDao.ListarProductos();
        modelo = (DefaultTableModel) TableProducto.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarPro.size(); i++) {
            ob[0] = ListarPro.get(i).getId();
            ob[1] = ListarPro.get(i).getCodigo();
            ob[2] = ListarPro.get(i).getNombre();
            ob[3] = ListarPro.get(i).getProveedorPro();
            ob[4] = ListarPro.get(i).getStock();
            ob[5] = ListarPro.get(i).getPrecio();
            modelo.addRow(ob);
        }
        TableProducto.setModel(modelo);
        */
    }

    public void ListarConfig() {
        /*conf = proDao.BuscarDatos();
        txtIdConfig.setText("" + conf.getId());
        txtRucConfig.setText("" + conf.getRuc());
        txtNombreConfig.setText("" + conf.getNombre());
        txtTelefonoConfig.setText("" + conf.getTelefono());
        txtDireccionConfig.setText("" + conf.getDireccion());
        txtMensaje.setText("" + conf.getMensaje());
        */
    }

    public void ListarVentas() {
        /*List<Venta> ListarVenta = Vdao.Listarventas();
        modelo = (DefaultTableModel) TableVentas.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < ListarVenta.size(); i++) {
            ob[0] = ListarVenta.get(i).getId();
            ob[1] = ListarVenta.get(i).getNombre_cli();
            ob[2] = ListarVenta.get(i).getVendedor();
            ob[3] = ListarVenta.get(i).getTotal();
            modelo.addRow(ob);
        }
        TableVentas.setModel(modelo);
        */

    }

    public void LimpiarTable() {
       /* for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnArticulo = new javax.swing.JButton();
        tipo = new javax.swing.JLabel();
        btnAutor = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnNuevoPrestamo = new javax.swing.JButton();
        btnSocio = new javax.swing.JButton();
        tabla_panel = new javax.swing.JTabbedPane();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1130, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 198, 141));

        btnArticulo.setBackground(new java.awt.Color(55, 71, 79));
        btnArticulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnArticulo.setForeground(new java.awt.Color(255, 255, 255));
        btnArticulo.setText("Articulo");
        btnArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnArticulo.setFocusable(false);
        btnArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticuloActionPerformed(evt);
            }
        });

        tipo.setForeground(new java.awt.Color(255, 255, 255));

        btnAutor.setBackground(new java.awt.Color(55, 71, 79));
        btnAutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnAutor.setText("Autor");
        btnAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAutor.setFocusable(false);
        btnAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(211, 47, 47));
        btnClose.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("Cerrar");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClose.setFocusable(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnNuevoPrestamo.setBackground(new java.awt.Color(55, 71, 79));
        btnNuevoPrestamo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevoPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoPrestamo.setText("Prestamo");
        btnNuevoPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoPrestamo.setFocusable(false);
        btnNuevoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPrestamoActionPerformed(evt);
            }
        });

        btnSocio.setBackground(new java.awt.Color(55, 71, 79));
        btnSocio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSocio.setForeground(new java.awt.Color(255, 255, 255));
        btnSocio.setText("Socio");
        btnSocio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSocio.setFocusable(false);
        btnSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSocioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addComponent(tipo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnNuevoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(tipo)
                .addGap(43, 43, 43)
                .addComponent(btnSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 740));

        tabla_panel.setBackground(new java.awt.Color(255, 255, 255));
        tabla_panel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabla_panel.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        getContentPane().add(tabla_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 930, 550));

        jLabel38.setFont(new java.awt.Font("Consolas", 0, 55)); // NOI18N
        jLabel38.setText("Sistema Bibliotecario");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticuloActionPerformed
        // TODO add your handling code here:
        //tabla_panel.setSelectedIndex(0);
    }//GEN-LAST:event_btnArticuloActionPerformed

    private void btnAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAutorActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnNuevoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoPrestamoActionPerformed

    private void btnSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSocioActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnArticulo;
    public javax.swing.JButton btnAutor;
    public javax.swing.JButton btnClose;
    public javax.swing.JButton btnNuevoPrestamo;
    public javax.swing.JButton btnSocio;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTabbedPane tabla_panel;
    private javax.swing.JLabel tipo;
    // End of variables declaration//GEN-END:variables
    private void LimpiarCliente() {
        /*txtIdCliente.setText("");
        txtDniCliente.setText("");
        txtNombreCliente.setText("");
        txtTelefonoCliente.setText("");
        txtDirecionCliente.setText("");
                */
    }

    private void LimpiarProveedor() {
        /*txtIdProveedor.setText("");
        txtRucProveedor.setText("");
        txtNombreproveedor.setText("");
        txtTelefonoProveedor.setText("");
        txtDireccionProveedor.setText("");*/
    }

    private void LimpiarProductos() {
        /*txtIdPro.setText("");
        txtCodigoPro.setText("");
        cbxProveedorPro.setSelectedItem(null);
        txtDesPro.setText("");
        txtCantPro.setText("");
        txtPrecioPro.setText("");*/
    }

    private void TotalPagar() {
        /*Totalpagar = 0.00;
        int numFila = TableVenta.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(TableVenta.getModel().getValueAt(i, 4)));
            Totalpagar = Totalpagar + cal;
        }
        LabelTotal.setText(String.format("%.2f", Totalpagar));*/
    }

    private void LimparVenta() {
        /*txtCodigoVenta.setText("");
        txtDescripcionVenta.setText("");
        txtCantidadVenta.setText("");
        txtStockDisponible.setText("");
        txtPrecioVenta.setText("");
        txtIdVenta.setText("");*/
    }

    private void RegistrarVenta() {
        /*int cliente = Integer.parseInt(txtIdCV.getText());
        String vendedor = LabelVendedor.getText();
        double monto = Totalpagar;
        v.setCliente(cliente);
        v.setVendedor(vendedor);
        v.setTotal(monto);
        v.setFecha(fechaActual);
        Vdao.RegistrarVenta(v);*/
    }

    private void RegistrarDetalle() {
        /*int id = Vdao.IdVenta();
        for (int i = 0; i < TableVenta.getRowCount(); i++) {
            int id_pro = Integer.parseInt(TableVenta.getValueAt(i, 0).toString());
            int cant = Integer.parseInt(TableVenta.getValueAt(i, 2).toString());
            double precio = Double.parseDouble(TableVenta.getValueAt(i, 3).toString());
            Dv.setId_pro(id_pro);
            Dv.setCantidad(cant);
            Dv.setPrecio(precio);
            Dv.setId(id);
            Vdao.RegistrarDetalle(Dv);

        }
        int cliente = Integer.parseInt(txtIdCV.getText());
        Vdao.pdfV(id, cliente, Totalpagar, LabelVendedor.getText());*/
    }

    private void ActualizarStock() {
        /*for (int i = 0; i < TableVenta.getRowCount(); i++) {
            int id = Integer.parseInt(TableVenta.getValueAt(i, 0).toString());
            int cant = Integer.parseInt(TableVenta.getValueAt(i, 2).toString());
            pro = proDao.BuscarId(id);
            int StockActual = pro.getStock() - cant;
            Vdao.ActualizarStock(StockActual, id);

        }*/
    }

    private void LimpiarTableVenta() {
        /*tmp = (DefaultTableModel) TableVenta.getModel();
        int fila = TableVenta.getRowCount();
        for (int i = 0; i < fila; i++) {
            tmp.removeRow(0);
        }*/
    }

    private void LimpiarClienteventa() {
        /*txtRucVenta.setText("");
        txtNombreClienteventa.setText("");
        txtIdCV.setText("");*/
    }
    private void nuevoUsuario(){
        /*txtNombre.setText("");
        txtCorreo.setText("");
        txtPass.setText("");*/
    }
    private void llenarProveedor(){
        /*List<Proveedor> lista = PrDao.ListarProveedor();
        for (int i = 0; i < lista.size(); i++) {
            int id = lista.get(i).getId();
            String nombre = lista.get(i).getNombre();
            cbxProveedorPro.addItem(new Combo(id, nombre));
        }*/
    }
}
