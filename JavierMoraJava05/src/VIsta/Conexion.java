
package VIsta;

import Controlador.ConexionValidacion;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion extends javax.swing.JPanel {

    private VentanaPrincipal venP;
    
    public Conexion(VentanaPrincipal p) {
        initComponents();
        
        venP=p;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelInicioSesion = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldContraseña = new javax.swing.JPasswordField();

        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabelInicioSesion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInicioSesion.setText("INICIAR SESIÓN");

        jTextFieldUsuario.setText("postgres");

        jLabelUsuario.setText("Usuario");

        jLabelContraseña.setText("Contraseña");

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextFieldContraseña.setText("jPasswordField1");
        jTextFieldContraseña.setPreferredSize(new java.awt.Dimension(167, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelContraseña))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUsuario)
                            .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(216, 216, 216))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addGap(76, 76, 76)
                        .addComponent(jButtonAceptar)
                        .addGap(262, 262, 262))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabelInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContraseña)
                    .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed

        String usuario=jTextFieldUsuario.getText();
        String contraseña=jTextFieldContraseña.getText();
        
        venP.conexionBaseDato();
        
        try 
        {
            //Marcamos el usuario
            venP.setNombreUsuario(usuario);
            ConexionValidacion.realizaStatementValidacion(contraseña, usuario);
            //indicamos que esta conectado
            venP.setjMenuConexion(Color.green);
            //habilitamos el menu
            venP.getMainMenu().setEnabled(true);
            //colocamos el panel de sus pedidos por defecto
            venP.cambioDePanel(venP.getjPanelVerPedidos());
            //reseteamos los campos de contraseña y usuario
            reset();
            //Instanciamos un objeto de gestionPedidos para ver los pedidos del usuario
            venP.getjPanelVerPedidos().instanciarGestionPedidos();
            //reseteamos el panel de pedidos una vez estamos dentro de un usuario
            venP.getjPanelVerPedidos().reset();
            
        }
        catch(SQLException e)
        {
            System.out.println("Error: "+e.getErrorCode()+", "+e.getMessage());
            JOptionPane.showMessageDialog(null, "Los datos introducidos no son correctos", "ACCESO DENEGADO", JOptionPane.WARNING_MESSAGE);
            reset();
        }
        
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        reset();
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelInicioSesion;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

    public void reset()
    {
        jTextFieldContraseña.setText("");
        jTextFieldUsuario.setText("");
    }


}
