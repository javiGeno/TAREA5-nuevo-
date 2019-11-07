
package VIsta;

import Controlador.*;
import Modelo.Pedidos;
import com.aeat.valida.Validador;
import java.awt.Image;
import java.awt.MediaTracker;
import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class VisualizarPedidos extends javax.swing.JPanel {

   private VentanaPrincipal venP;
   private Pedidos pedidoActual;
   private GestionarPedidos gestionPedidos;
   private boolean fechaActualizada=false;
   private boolean imagenActualizada=false;
    
    public VisualizarPedidos(VentanaPrincipal p) {
        initComponents();
        
        adaptacionFileChooser();
        venP=p;
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserImagen = new javax.swing.JFileChooser();
        jTextFieldNumeroPedido = new javax.swing.JTextField();
        jTextFieldCodigoPostal = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldCodigoCliente = new javax.swing.JTextField();
        jLabelNumeroPedido = new javax.swing.JLabel();
        jLabelCodigoPostal = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelFechaIncor = new javax.swing.JLabel();
        jLabelCodigoCliente = new javax.swing.JLabel();
        jDatePickerFechaPedido = new org.jdatepicker.JDatePicker();
        jLabelImagen = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jButtonSig = new javax.swing.JButton();
        jButtonAñadirProducto = new javax.swing.JButton();
        jButtonComposicion = new javax.swing.JButton();
        jButtonCambioImagen = new javax.swing.JButton();
        jButtonGuardarCambios = new javax.swing.JButton();
        jButtonValidarDNI = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));

        jTextFieldNumeroPedido.setEditable(false);
        jTextFieldNumeroPedido.setText("jTextField1");

        jTextFieldCodigoPostal.setEditable(false);
        jTextFieldCodigoPostal.setText("jTextField2");

        jTextFieldDireccion.setEditable(false);
        jTextFieldDireccion.setText("jTextField3");

        jTextFieldCodigoCliente.setEditable(false);
        jTextFieldCodigoCliente.setText("jTextField5");

        jLabelNumeroPedido.setText("NÚMERO PEDIDO");

        jLabelCodigoPostal.setText("CÓDIGO POSTAL");

        jLabelDireccion.setText("DIRECCIÓN");

        jLabelFechaIncor.setText("FECHA PEDIDO");

        jLabelCodigoCliente.setText("CÓDIGO CLIENTE");

        jDatePickerFechaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDatePickerFechaPedidodatePickerActionPerformed(evt);
            }
        });

        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen.setText("IMAGEN");
        jLabelImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonAtras.setText("<");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButtonSig.setText(">");
        jButtonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSigActionPerformed(evt);
            }
        });

        jButtonAñadirProducto.setText("Añadir producto");
        jButtonAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirProductoActionPerformed(evt);
            }
        });

        jButtonComposicion.setText("Composicion del pedido");
        jButtonComposicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComposicionActionPerformed(evt);
            }
        });

        jButtonCambioImagen.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButtonCambioImagen.setText("Cambiar Imagen");
        jButtonCambioImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambioImagenActionPerformed(evt);
            }
        });

        jButtonGuardarCambios.setText("Guardar cambios");
        jButtonGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarCambiosActionPerformed(evt);
            }
        });

        jButtonValidarDNI.setText("check NIF");
        jButtonValidarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarDNIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButtonAñadirProducto)
                        .addGap(59, 59, 59)
                        .addComponent(jButtonComposicion)
                        .addGap(49, 49, 49)
                        .addComponent(jButtonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jButtonGuardarCambios)))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCambioImagen))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonValidarDNI)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelNumeroPedido)
                        .addComponent(jLabelCodigoPostal)
                        .addComponent(jLabelDireccion)
                        .addComponent(jLabelCodigoCliente)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelFechaIncor)
                            .addGap(80, 80, 80)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldCodigoPostal, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(jTextFieldNumeroPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(jTextFieldCodigoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(jDatePickerFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addContainerGap(438, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCambioImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonGuardarCambios)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAñadirProducto)
                            .addComponent(jButtonComposicion))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addComponent(jButtonValidarDNI)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNumeroPedido)
                        .addComponent(jTextFieldNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCodigoPostal))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDireccion))
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelFechaIncor)
                        .addComponent(jDatePickerFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCodigoCliente))
                    .addContainerGap(262, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jDatePickerFechaPedidodatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDatePickerFechaPedidodatePickerActionPerformed
        
        pedidoActual.setFechaPedido(obtenerFechaGregorian());
        fechaActualizada=true; 
        
        
    }//GEN-LAST:event_jDatePickerFechaPedidodatePickerActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed

        
       try {
           pedidoActual=gestionPedidos.obtenerAnteriorPed();
        
        actualizarCampos();
        actualizarBotones();
        actualizar_imagen();
        resetComposiciones();
       }
       catch (Errores ex) {
          
           JOptionPane.showMessageDialog(null, ex.mostrarError(), "ERROR", JOptionPane.WARNING_MESSAGE);

       }
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSigActionPerformed

        try
        {
            pedidoActual=gestionPedidos.obtenerSigPed();
            actualizarCampos();
            actualizarBotones();
            actualizar_imagen();
            resetComposiciones();
        }
        catch(Errores e)
        {
           JOptionPane.showMessageDialog(null, e.mostrarError(), "ERROR", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_jButtonSigActionPerformed

    private void jButtonAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirProductoActionPerformed

       /*las tengo en un metodo, porque tambien vy a llamarlo, en el caso de que el pedido
        no tenga composiciones y el usuario acepte en la ventana emergente el querer insertar alguno
        */
        instruccionesParaInsertarProducto();
    }//GEN-LAST:event_jButtonAñadirProductoActionPerformed

    private void jButtonComposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComposicionActionPerformed
        
        
        venP.cambioDePanel(venP.getjPanelVerComposicion());
        
       
    }//GEN-LAST:event_jButtonComposicionActionPerformed

    private void jButtonCambioImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambioImagenActionPerformed
       
        
        
        int seleccion= jFileChooserImagen.showDialog(this,"Obtener Imagen");
        
        if(seleccion==JFileChooser.APPROVE_OPTION)
        {
            //se coloca la imagen en el label pero sin guardarla en la carpeta aun
           String rutaOriginalImagen= jFileChooserImagen.getSelectedFile().getPath();
           ImageIcon imagenProvisional=new ImageIcon(rutaOriginalImagen);
           imagenProvisional=readaptarImagen(imagenProvisional);
           jLabelImagen.setText("");
           jLabelImagen.setIcon(imagenProvisional);
           imagenActualizada=true;
        }
       
    }//GEN-LAST:event_jButtonCambioImagenActionPerformed

    private void jButtonGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarCambiosActionPerformed
        
        if(fechaActualizada==true || imagenActualizada==true)
        {
            //copiamos la imagen
            guardarEnCarpetaImagenes();
            
            try
            {
                //afecta a la base de datos
                gestionPedidos.modificarPedido(pedidoActual);
                camposSinActualizar();
                JOptionPane.showMessageDialog(null, "Pedido actualizado", "GUARDAR CAMBIOS", JOptionPane.WARNING_MESSAGE);
            }
            catch(Errores e)
            {
                JOptionPane.showMessageDialog(null, e.mostrarError(), "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Los datos no han sido modificados", "GUARDAR CAMBIOS", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonGuardarCambiosActionPerformed

    private void jButtonValidarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarDNIActionPerformed
       try 
       {
           validarDNI();
           
           JOptionPane.showMessageDialog(null, "El dni se ha validado correctamente" , "DNI", JOptionPane.INFORMATION_MESSAGE);

           
       } catch (Errores e)
       {
           JOptionPane.showMessageDialog(null, e.mostrarError(), "ERROR", JOptionPane.WARNING_MESSAGE);

       }
    }//GEN-LAST:event_jButtonValidarDNIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonAñadirProducto;
    private javax.swing.JButton jButtonCambioImagen;
    private javax.swing.JButton jButtonComposicion;
    private javax.swing.JButton jButtonGuardarCambios;
    private javax.swing.JButton jButtonSig;
    private javax.swing.JButton jButtonValidarDNI;
    private org.jdatepicker.JDatePicker jDatePickerFechaPedido;
    private javax.swing.JFileChooser jFileChooserImagen;
    private javax.swing.JLabel jLabelCodigoCliente;
    private javax.swing.JLabel jLabelCodigoPostal;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFechaIncor;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelNumeroPedido;
    private javax.swing.JTextField jTextFieldCodigoCliente;
    private javax.swing.JTextField jTextFieldCodigoPostal;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNumeroPedido;
    // End of variables declaration//GEN-END:variables

    public void instanciarGestionPedidos ()
    {
        try
        {
            gestionPedidos=new GestionarPedidos(venP.getNombreUsuario());
        }
        catch(Errores e)
        {
           JOptionPane.showMessageDialog(null, e.mostrarError(), "ERROR", JOptionPane.WARNING_MESSAGE);

        }
    }
        
    public void resetComposiciones()
    {
        if(pedidoActual!=null)
        {
            venP.getjPanelVerComposicion().resetTable();
            venP.getjPanelVerComposicion().cargaComposiciones(pedidoActual.getNumeroPedido());
            venP.getjPanelVerComposicion().mostrarDatosTabla();
        }
    }
    
    public void reset() throws Errores
    {
        pedidoActual=gestionPedidos.obtenerPrimero();
        actualizarCampos();
        actualizarBotones();
        actualizar_imagen();
        //jPane que informa que no tiene pedidos este usuario
        if(pedidoActual==null)
        {
            //si el primer pedido es nulo no hay pedidos
            JOptionPane.showMessageDialog(null, "Pedidos no encontrado", "No tiene pedidos registrados", JOptionPane.WARNING_MESSAGE);
        }
       
        //resetea el panel de las composiciones del pedido
        resetComposiciones();
        
    }

    
    private void actualizarCampos() 
    {
         if(pedidoActual==null)
         {
            jTextFieldCodigoCliente.setText("");
            jTextFieldCodigoPostal.setText("");
            jTextFieldDireccion.setText("");
            jTextFieldNumeroPedido.setText("");
            jDatePickerFechaPedido.getFormattedTextField().setText("");
         }
         else
         {
            jTextFieldCodigoCliente.setText(pedidoActual.getUsuPedidos());
            jTextFieldCodigoPostal.setText(pedidoActual.getCodigoPostal());
            jTextFieldDireccion.setText(pedidoActual.getDireccion());
            jTextFieldNumeroPedido.setText(""+pedidoActual.getNumeroPedido());
            
            jDatePickerFechaPedido.getFormattedTextField().setText(pedidoActual.getFechaPedido().get(Calendar.DAY_OF_MONTH)+"/"+
                                                                   (pedidoActual.getFechaPedido().get(Calendar.MONTH)+1)+"/"+
                                                                   pedidoActual.getFechaPedido().get(Calendar.YEAR));                                             
         }
    }                           
    
    
    
    private void actualizarBotones() throws Errores
    {
        
        
        if(gestionPedidos.getNumFilas()==0)
        {
            jButtonAtras.setEnabled(false);
            jButtonAñadirProducto.setEnabled(false);
            jButtonCambioImagen.setEnabled(false);
            jButtonComposicion.setEnabled(false);
            jButtonGuardarCambios.setEnabled(false);
            jButtonSig.setEnabled(false);
            jButtonValidarDNI.setEnabled(false);
        }
        else
        {
            if(gestionPedidos.getNumFilas()==1)
            {
                jButtonAtras.setEnabled(false);
                jButtonAñadirProducto.setEnabled(true);
                jButtonCambioImagen.setEnabled(true);
                jButtonComposicion.setEnabled(true);
                jButtonGuardarCambios.setEnabled(true);
                jButtonValidarDNI.setEnabled(true);
                jButtonSig.setEnabled(false);
                
            }
            else
            {
                if(gestionPedidos.esElPrimero())
                {
                    jButtonAtras.setEnabled(false);
                    jButtonAñadirProducto.setEnabled(true);
                    jButtonCambioImagen.setEnabled(true);
                    jButtonComposicion.setEnabled(true);
                    jButtonGuardarCambios.setEnabled(true);
                    jButtonSig.setEnabled(true);
                    jButtonValidarDNI.setEnabled(true);
                }
                else
                {
                    if(gestionPedidos.esElUltimo())
                    {
                        jButtonAtras.setEnabled(true);
                        jButtonAñadirProducto.setEnabled(true);
                        jButtonCambioImagen.setEnabled(true);
                        jButtonComposicion.setEnabled(true);
                        jButtonGuardarCambios.setEnabled(true);
                        jButtonValidarDNI.setEnabled(true);
                        jButtonSig.setEnabled(false);
                    }
                    else
                    {
                        jButtonAtras.setEnabled(true);
                        jButtonAñadirProducto.setEnabled(true);
                        jButtonCambioImagen.setEnabled(true);
                        jButtonComposicion.setEnabled(true);
                        jButtonGuardarCambios.setEnabled(true);
                        jButtonValidarDNI.setEnabled(true);
                        jButtonSig.setEnabled(true);
                        
                    }
                    
                }
            }
        
        
        }

    
    }

    public Pedidos getPedidoActual() {
        return pedidoActual;
    }

    private GregorianCalendar obtenerFechaGregorian() 
    {
        return new GregorianCalendar(
               jDatePickerFechaPedido.getModel().getYear(),
               jDatePickerFechaPedido.getModel().getMonth(),
               jDatePickerFechaPedido.getModel().getDay()
        );
                
    }

    private void adaptacionFileChooser()
    {
        String [] fil={"jpeg","jpg","gif","png"};
         FileNameExtensionFilter filtro= new FileNameExtensionFilter("Imagenes", fil);
         
        jFileChooserImagen.setFileFilter(filtro);
        jFileChooserImagen.setAcceptAllFileFilterUsed(false);
        
        
        
    }

    private void guardarEnCarpetaImagenes() 
    {
        File copia=jFileChooserImagen.getSelectedFile();
        
        
        if(copia!=null)
        {
            try
            {
                //definimos el destino del fichero y le ponemos de nombre el numero del pedido
                String destino="src/imagenes/"+pedidoActual.getNumeroPedido();
                Path dest=Paths.get(destino);
                //definimos el origen
                String origen=copia.getPath();
                Path orig=Paths.get(origen);
                //copiamos//constante que hace que machaca la imagen de un usuario si ya existe
                Files.copy(orig, dest, REPLACE_EXISTING);
                //guardamos la ruta en el objeto existente
                pedidoActual.setRutaFoto(destino);
            }
            catch(IOException e)
            {
                System.out.println("Ha ocurrido algun error");
            }
            
            
            
            
        }
    }
        
    private void actualizar_imagen()
    {
        //si hay pedidos se actualiza la imagen si no no se hace la comprobacion
        if(pedidoActual!=null)
        {
            if(pedidoActual.getRutaFoto().equals("") || pedidoActual.getRutaFoto()==null)
            {
                jLabelImagen.setText("no tiene foto");
                jLabelImagen.setIcon(null);
            }
            else
            {
                //creamos una imagen icon a partir de la ruta que tiene el objeto 
                ImageIcon imagenCarpeta=new ImageIcon(pedidoActual.getRutaFoto());
                
                
                //si no hay imagenes en esa ruta, colocamos texto
                if(imagenCarpeta.getImageLoadStatus()== MediaTracker.ERRORED)
                {
                    //volvemos a poner el texto
                    jLabelImagen.setIcon(null);
                    jLabelImagen.setText("no tiene foto");
                   

               }
               else//si hay imagenes en esa ruta, actualizamos
               {
                    //borramos texto
                    jLabelImagen.setText("");
                    //readaptamos imagen
                    imagenCarpeta=readaptarImagen(imagenCarpeta);
                    //colocamos imagen
                    jLabelImagen.setIcon(imagenCarpeta);
                    
               }

            }
        }


    }

    private void camposSinActualizar()
    {
        fechaActualizada=false;
        imagenActualizada=false;
    }

    private ImageIcon readaptarImagen(ImageIcon i)
    {
        Image imagen=i.getImage();
        
        imagen=imagen.getScaledInstance(267, 181, Image.SCALE_SMOOTH);
        
        return new ImageIcon(imagen);
    }

    public GestionarPedidos getGestionPedidos() {
        return gestionPedidos;
    }

    public void instruccionesParaInsertarProducto() 
    {
        venP.cambioDePanel(venP.getjPanelComponerPedido());
        int numPed=pedidoActual.getNumeroPedido();
        //obtenemos el numero de composiciones que tiene el pedido y sumamos uno
        int cantidadPedido=venP.getjPanelVerComposicion().getCantidadComposiciones()+1;
        //pasamos el numero de pedido y la cantidad para escribirla en los textField correspondientes
        venP.getjPanelComponerPedido().actualizarDatosPedido(numPed, cantidadPedido);
        venP.getjPanelComponerPedido().montarListaProductos();
    }
        
    private void validarDNI() throws Errores      
    {
        Validador checkeoDNI;
        checkeoDNI=new Validador();
        int resultado;
        String nif=pedidoActual.getNif();
        nif=nif.toUpperCase();
        resultado=checkeoDNI.checkNif(nif);
        
        System.out.println(resultado);
        
        if(resultado<0)
        {
            throw new Errores(Errores.NIF_NO_REGISTRADO);
        }
        
        
    }  
    
}

    



