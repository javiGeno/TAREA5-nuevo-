
package VIsta;


public class ComponerPedido extends javax.swing.JPanel {

    private VentanaPrincipal venP;
    
    public ComponerPedido(VentanaPrincipal p) {
        initComponents();
        
        venP=p;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCabecera = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextFieldNumeroPedido = new javax.swing.JTextField();
        jTextFieldNumeroProducto = new javax.swing.JTextField();
        jTextFieldCantidadArticulos = new javax.swing.JTextField();
        jTextFieldPrecioIva = new javax.swing.JTextField();
        jButtonEfectuar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabelCabecera.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCabecera.setText("PEDIDO: 0");

        jLabel1.setText("NºPedido");

        jLabel2.setText("NºProducto");

        jLabel3.setText("Cantidad de articulos");

        jLabel4.setText("Precio con IVA");

        jScrollPane1.setViewportView(jList1);

        jTextFieldNumeroPedido.setEditable(false);
        jTextFieldNumeroPedido.setText("jTextField1");

        jTextFieldNumeroProducto.setEditable(false);
        jTextFieldNumeroProducto.setText("jTextField2");

        jTextFieldCantidadArticulos.setEditable(false);
        jTextFieldCantidadArticulos.setText("jTextField3");

        jTextFieldPrecioIva.setEditable(false);
        jTextFieldPrecioIva.setText("jTextField4");

        jButtonEfectuar.setText("Efectuar");
        jButtonEfectuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEfectuarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jButtonCancelar)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldNumeroPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(jTextFieldNumeroProducto)
                                .addComponent(jTextFieldCantidadArticulos)
                                .addComponent(jTextFieldPrecioIva))
                            .addComponent(jButtonEfectuar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelCabecera)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNumeroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldCantidadArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldPrecioIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEfectuar)
                            .addComponent(jButtonCancelar))
                        .addContainerGap(177, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEfectuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEfectuarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEfectuarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
        venP.cambioDePanel(venP.getjPanelVerPedidos());
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEfectuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCabecera;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCantidadArticulos;
    private javax.swing.JTextField jTextFieldNumeroPedido;
    private javax.swing.JTextField jTextFieldNumeroProducto;
    private javax.swing.JTextField jTextFieldPrecioIva;
    // End of variables declaration//GEN-END:variables
}
