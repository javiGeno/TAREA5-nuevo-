
package VIsta;

import Controlador.ConexionValidacion;
import Controlador.Errores;
import Controlador.FileModif;
import Modelo.Pedidos;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class InsertarPedido extends javax.swing.JPanel {

    
    private VentanaPrincipal venP;
    
    
    public InsertarPedido(VentanaPrincipal p) {
        initComponents();
        
        venP=p;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCabecera = new javax.swing.JLabel();
        jTextFieldNumeroPedido = new javax.swing.JTextField();
        jTextFieldCodigoPostal = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldCodigoCliente = new javax.swing.JTextField();
        jLabelNumeroPedido = new javax.swing.JLabel();
        jLabelCodigoPostal = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelFechaIncor = new javax.swing.JLabel();
        jLabelCodigoCliente = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldFechaPedido = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));

        jLabelCabecera.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCabecera.setText("CREAR NUEVO PEDIDO");

        jTextFieldNumeroPedido.setEditable(false);
        jTextFieldNumeroPedido.setText("jTextField1");

        jTextFieldCodigoPostal.setText("jTextField2");

        jTextFieldDireccion.setText("jTextField3");

        jTextFieldCodigoCliente.setEditable(false);
        jTextFieldCodigoCliente.setText("jTextField5");

        jLabelNumeroPedido.setText("PEDIDO NÚMERO");

        jLabelCodigoPostal.setText("CÓDIGO POSTAL");

        jLabelDireccion.setText("DIRECCIÓN");

        jLabelFechaIncor.setText("FECHA PEDIDO");

        jLabelCodigoCliente.setText("CÓDIGO CLIENTE");

        jButtonAceptar.setText("ACEPTAR");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextFieldFechaPedido.setEditable(false);
        jTextFieldFechaPedido.setText("jTextField1");

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
                        .addGap(238, 238, 238)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNumeroPedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(jTextFieldNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCodigoPostal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButtonCancelar)
                                        .addComponent(jLabelCodigoCliente))
                                    .addComponent(jLabelFechaIncor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCodigoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButtonAceptar)
                                        .addGap(37, 37, 37))
                                    .addComponent(jTextFieldFechaPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 220, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelCabecera)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroPedido)
                    .addComponent(jTextFieldNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoPostal)
                    .addComponent(jTextFieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaIncor)
                    .addComponent(jTextFieldFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jTextFieldCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCodigoCliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addGap(75, 75, 75))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        
        Pedidos ped=creacionNuevoPedido();
        
        if(ped!=null)
        {
            //insertamos sobre el resultSet
            int pediInsertado;
            try {
                
                pediInsertado = venP.getjPanelVerPedidos().getGestionPedidos().inserccionPedido(ped);
                JOptionPane.showMessageDialog(this, pediInsertado+" pedido creado", "INSERCCIÓN PEDIDO", JOptionPane.INFORMATION_MESSAGE);
                
                //mostramos pedidos
                venP.getjPanelVerPedidos().reset();
                venP.getjPanelVerPedidos().setPedidoActual(ped);
                venP.cambioDePanel(venP.getjPanelVerPedidos());
                reset();
            
            } catch (Errores e) {
                 JOptionPane.showMessageDialog(this, e.mostrarError(), "ERROR", JOptionPane.WARNING_MESSAGE);

            }
           
            
        }
        else
        {
            
            JOptionPane.showMessageDialog(this, "No se ha creado el pedido", "INSERCCIÓN PEDIDO", JOptionPane.WARNING_MESSAGE);
        }
       
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        venP.cambioDePanel(venP.getjPanelVerPedidos());
        reset();
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelCabecera;
    private javax.swing.JLabel jLabelCodigoCliente;
    private javax.swing.JLabel jLabelCodigoPostal;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFechaIncor;
    private javax.swing.JLabel jLabelNumeroPedido;
    private javax.swing.JTextField jTextFieldCodigoCliente;
    private javax.swing.JTextField jTextFieldCodigoPostal;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldFechaPedido;
    private javax.swing.JTextField jTextFieldNumeroPedido;
    // End of variables declaration//GEN-END:variables

    public void reset() 
    {
        actualizarCampos();
    }
   
    private void actualizarCampos() 
    {
         
            jTextFieldCodigoCliente.setText(venP.getNombreUsuario());
            jTextFieldCodigoPostal.setText("");
            jTextFieldDireccion.setText("");
            
            //Sera La fechaActual con la que se efactuara el pedido
            GregorianCalendar gC=new GregorianCalendar();
            jTextFieldFechaPedido.setText(gC.get(Calendar.DAY_OF_MONTH)+"/"+
                                          (gC.get(Calendar.MONTH)+1)+"/"+
                                           gC.get(Calendar.YEAR)); 
            
            
            
            //sumar uno a la cantidad de filas de pedidos del usuario
            jTextFieldNumeroPedido.setText(""+(venP.getjPanelVerPedidos().getGestionPedidos().getNumFilas()+1));
        
    }
    
    
    
    private Pedidos  creacionNuevoPedido()
    {
        
        Pedidos nuevoPedido = null;
           
            if(!jTextFieldCodigoPostal.getText().equals("") && !jTextFieldDireccion.getText().equals(""))
            {
                if(buenaEntradaDatos())
                {
                    /*el nif será el mismo que el pedido actual, pertenece al mismo usuario,
                    si no tiene ningun pedido se le pedirá el nif al usuario mediante un mensaje emeregente
                    en caso de que le de a cancelar y devuelva null, el pedido no se efectuara
                    */
                    String nif=obtenerDNI();

                    if(nif!=null)
                    {
                            nuevoPedido=nuevoObjeto( nif);
                           
                    }
                    else
                    {
                        //no se crea el pedido
                        return nuevoPedido;
                    }
                   
                
                
                }
                else
                {
                    Errores e;
                    e=new Errores(Errores.MUCHOS_CARACTERES);
                    JOptionPane.showMessageDialog(this, e.mostrarError(), "ERROR", JOptionPane.WARNING_MESSAGE);
                    FileModif.escribir(e.getError()+": "+e.mostrarError()); 
                }
            }
            else
            { 
                //no se crea el pedido
                return nuevoPedido;
            }
            
            return nuevoPedido;// no se crea el pedido
    }
    
    private String obtenerDNI()
    {
        Pedidos pedActual=venP.getjPanelVerPedidos().getPedidoActual();
        String nif;
        
        if(pedActual==null)
        {
            nif=JOptionPane.showInputDialog(this, "Introduce su dni", "NUEVO DNI", JOptionPane.INFORMATION_MESSAGE);
        
            if(nif==null)
            {
                System.out.println(nif);
            }
            else
            {
                System.out.println(nif);
            }
            
            return nif;
        }
        else
        {
            nif=pedActual.getNif();
            return nif;
        }
    }

    private boolean buenaEntradaDatos() 
    {
        if(jTextFieldCodigoPostal.getText().length()>5 || jTextFieldDireccion.getText().length()>30)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    private Pedidos nuevoObjeto(String nif) 
    {
        //obtenemos la primary key mas alta y sumamos 1
        int numPedido=0;
        Pedidos nuevoPedido = null;
        
        try
        {
            numPedido = ConexionValidacion.obtencionNumeroPedido()+1;
            
            String codPos=jTextFieldCodigoPostal.getText();
            String direccion=jTextFieldDireccion.getText();
            String rutaFoto="";
            GregorianCalendar fechaPedido=new GregorianCalendar();
            String usuPedido=jTextFieldCodigoCliente.getText();


            nuevoPedido=new Pedidos();

            nuevoPedido.setNumeroPedido(numPedido);
            nuevoPedido.setNif(nif);
            nuevoPedido.setCodigoPostal(codPos);
            nuevoPedido.setDireccion(direccion);
            nuevoPedido.setFechaPedido(fechaPedido);
            nuevoPedido.setUsuPedidos(usuPedido);
            nuevoPedido.setRutaFoto(rutaFoto);
            
            return nuevoPedido;
        
        } catch (Errores ex) {
            JOptionPane.showMessageDialog(this, ex.mostrarError(), "ERROR", JOptionPane.WARNING_MESSAGE); 
            return nuevoPedido;
        }
    }
    
}
