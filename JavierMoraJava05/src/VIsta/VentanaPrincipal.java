
package VIsta;

import Controlador.ConexionValidacion;
import Controlador.Errores;
import Controlador.FileModif;
import java.awt.Color;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class VentanaPrincipal extends javax.swing.JFrame {

    private VisualizarPedidos jPanelVerPedidos;
    private VisualizarComposiciones jPanelVerComposicion;
    private InsertarPedido jPanelInserccionPedido;
    private Conexion  jPanelConexion;
    private ComponerPedido jPanelComponerPedido;
    private AcercaDe JDialogAcerca;
    private String NombreUsuario;//se guardará la cadena del nombre del usuario que ha entrado en la bd
    
    
    
    
    public VentanaPrincipal() {
        initComponents();
        
    jPanelVerPedidos=new VisualizarPedidos(this);
    jPanelVerComposicion=new VisualizarComposiciones(this);
    jPanelInserccionPedido=new InsertarPedido(this);
    jPanelConexion=new Conexion(this);
    jPanelComponerPedido=new ComponerPedido(this);
    
    
    
    
    reset();
    
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuConexion = new javax.swing.JMenu();
        mainMenu = new javax.swing.JMenu();
        jMenuItemVerPedidos = new javax.swing.JMenuItem();
        jMenuItemInsertarPedido = new javax.swing.JMenuItem();
        acercaMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jMenuConexion.setText("Conexion ");
        jMenuConexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuConexionMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuConexion);

        mainMenu.setText("Menú principal");

        jMenuItemVerPedidos.setText("Pedidos");
        jMenuItemVerPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVerPedidosActionPerformed(evt);
            }
        });
        mainMenu.add(jMenuItemVerPedidos);

        jMenuItemInsertarPedido.setText("Insertar nuevo pedido");
        jMenuItemInsertarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInsertarPedidoActionPerformed(evt);
            }
        });
        mainMenu.add(jMenuItemInsertarPedido);

        acercaMenuItem.setText("Acerca de");
        acercaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaMenuItemActionPerformed(evt);
            }
        });
        mainMenu.add(acercaMenuItem);

        jMenuBar1.add(mainMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuConexionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConexionMouseClicked
            
        if(jMenuConexion.getForeground()==Color.GREEN)
        {
            int yes=JOptionPane.showConfirmDialog(null, "¿Desea desconectarse?");
            if(yes==0)
            {
                
                reset();
                try {
                    ConexionValidacion.cerrarConexion();
                } catch (Errores ex) {
                    
                    JOptionPane.showMessageDialog(null, ex.mostrarError(), "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                
            }
        }
       
    }//GEN-LAST:event_jMenuConexionMouseClicked

    private void acercaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaMenuItemActionPerformed
        
        if(mainMenu.isEnabled())
        {
            JDialogAcerca=new AcercaDe(this, true);
        }
    }//GEN-LAST:event_acercaMenuItemActionPerformed

    private void jMenuItemVerPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVerPedidosActionPerformed
        
        
        jPanelVerPedidos.setVisible(true);
        jPanelVerComposicion.setVisible(false);
        jPanelInserccionPedido.setVisible(false);
        jPanelConexion.setVisible(false);
        jPanelComponerPedido.setVisible(false);
        this.setContentPane(jPanelVerPedidos);
        
        
    }//GEN-LAST:event_jMenuItemVerPedidosActionPerformed

    private void jMenuItemInsertarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInsertarPedidoActionPerformed
        
        jPanelVerPedidos.setVisible(false);
        jPanelVerComposicion.setVisible(false);
        jPanelInserccionPedido.setVisible(true);
        jPanelConexion.setVisible(false);
        jPanelComponerPedido.setVisible(false);
        this.setContentPane(jPanelInserccionPedido);
        //cuando cambiamos al panel de insertar pedidos reseteamos campos
        jPanelInserccionPedido.reset();
        
    }//GEN-LAST:event_jMenuItemInsertarPedidoActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acercaMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConexion;
    private javax.swing.JMenuItem jMenuItemInsertarPedido;
    private javax.swing.JMenuItem jMenuItemVerPedidos;
    private javax.swing.JMenu mainMenu;
    // End of variables declaration//GEN-END:variables

    public void  conexionBaseDato() 
    {
        try
        {
            if(ConexionValidacion.realizarConexionPostgres() && ConexionValidacion.realizarConexionMysql())
            {
                System.out.println("La conexion ha sido correcta");
            }
        }
        catch(Errores e)
        {
            JOptionPane.showMessageDialog(null, e.mostrarError(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    public void cambioDePanel(JPanel nuevo)
    {
        
        jPanelVerPedidos.setVisible(false);
        jPanelVerComposicion.setVisible(false);
        jPanelInserccionPedido.setVisible(false);
        jPanelConexion.setVisible(false);
        jPanelComponerPedido.setVisible(false);
        
        setContentPane(nuevo);
        nuevo.setVisible(true);
        
        
    }
    
    public VisualizarPedidos getjPanelVerPedidos() {
        return jPanelVerPedidos;
    }

    public VisualizarComposiciones getjPanelVerComposicion() {
        return jPanelVerComposicion;
    }

    public InsertarPedido getjPanelInserccionPedido() {
        return jPanelInserccionPedido;
    }

    public Conexion getjPanelConexion() {
        return jPanelConexion;
    }

    public ComponerPedido getjPanelComponerPedido() {
        return jPanelComponerPedido;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }
    
    public void reset()
    {
        jMenuConexion.setForeground(Color.RED);
        mainMenu.setEnabled(false);
        this.cambioDePanel(jPanelConexion);
        jPanelConexion.reset();
        
    }

    public JMenu getjMenuConexion() {
        return jMenuConexion;
    }

    public void setjMenuConexion(Color color) {
        this.jMenuConexion.setForeground(color);
    }

    public JMenu getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(JMenu mainMenu) {
        this.mainMenu = mainMenu;
    }
    
    public String getNombreUsuario() 
    {
        return NombreUsuario;
    }
    
}
