
package VIsta;

import Controlador.Errores;
import Modelo.Composicion;
import Modelo.ConsultasComposicion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class VisualizarComposiciones extends javax.swing.JPanel {

    private VentanaPrincipal venP;
    private ArrayList<Composicion> composiciones;
    private Composicion composicion;
    private ConsultasComposicion resultadoComposiciones;
    private DefaultTableModel datosTabla;
    ////contara filas que tiene la composicion del pedido, para sumarle uno en una insercción de una composición
    private int cantidadComposiciones;
    
    public VisualizarComposiciones(VentanaPrincipal p) {
        initComponents();
        
        //obtiene el modelo de la tabla especificado en el asistente
        datosTabla=(DefaultTableModel) jTable1.getModel();
        venP=p;
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonVolverAPedidos = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NºPedido", "NºProducto", "Cantidad", "Precio IVA incl."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonVolverAPedidos.setText("<--Volver");
        jButtonVolverAPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jButtonVolverAPedidos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButtonVolverAPedidos)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverAPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAPedidosActionPerformed
        
        venP.cambioDePanel(venP.getjPanelVerPedidos());
    }//GEN-LAST:event_jButtonVolverAPedidosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVolverAPedidos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    /*CARGARA LAS COMPOSICIONES DEL PEDIDO, SI TIENE MÁS DE UNO LAS METERÁ EN EL ARRAYLIST, EN CASO CONTRARIO, EN EL 
    OBJETO SIMPLE*/
    public void cargaComposiciones(int numPedido)
    {
        resultadoComposiciones=new ConsultasComposicion(numPedido);
        
        
            try
            {
                Object composicionesPedido=resultadoComposiciones.obtenerResultadoSelectComposicion();
               
                //si hay composiciones en ese pedido se comprueba cuants y se hace el tratamiento
                
                if(composicionesPedido!=null)
                {
                        if(composicionesPedido instanceof ArrayList)
                        {   
                               composiciones=new ArrayList();
                               composiciones=(ArrayList<Composicion>) composicionesPedido;
                               cantidadComposiciones=composiciones.size();
                        }
                        else
                        {
                            
                               composicion=new Composicion();
                               composicion=(Composicion) composicionesPedido;
                               cantidadComposiciones=1;
                        }
                 }
                 
            }
            catch(Errores e)
            {
                
                  JOptionPane.showMessageDialog(null, e.mostrarError(), "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        
       
        
        
        
    }
    
    
    
    public void mostrarDatosTabla()
    {
        
        
        
        //si la lista es nula quiere decir que solo hay 1 fila o ninguna
        if(composiciones==null)
        {
            //si composicion tampoco es nula
            if(composicion!=null)
            {
                
                //se añade un array que equivaldria a una fila de datos de la tabla composicion
                datosTabla.addRow(obtenerFilaDatos(composicion));
                jTable1.setModel(datosTabla);
            }
            else//si no hay ninguna composicion
            {
                int afirmacion=JOptionPane.showConfirmDialog(venP, "No tiene articulos, ¿Quiere añadir alguno?", "COMPOSICIÓN PEDIDO", JOptionPane.WARNING_MESSAGE);
               
                
                    if(afirmacion==0)
                    {
                       venP.getjPanelVerPedidos().instruccionesParaInsertarProducto(1);
                    }
            }
        }
        else
        {
            //se añaden arrays equivalentes a las filas de la tabla composicion
            for(int i=0; i<composiciones.size(); i++)
            {
                datosTabla.addRow(obtenerFilaDatos(composiciones.get(i)));
                
            }
            
            jTable1.setModel(datosTabla);
        }
    }
    
    private Object[] obtenerFilaDatos(Composicion compo)
    {
        int numeroColumnas=jTable1.getColumnCount();
        Object[] fila=new Object[numeroColumnas];
        
        fila[0]=compo.getPedComposicion();
        fila[1]=compo.getProComposicion();
        fila[2]=compo.getCantidad();
        fila[3]=compo.getPrecioConIva();
        
        return fila;
    }
    
    //borra las filas de la tabla a la espera de volverla a llenar de datos segun el pedido
    public void resetTable()
    {
        //se resetean los dos objetos para que no se altere la muestra de datos
        composicion=null;
        composiciones=null;
        datosTabla.setRowCount(0);
    }
    
    //se utiliza para sumar la cantidad en la columna 3 de la tabla c
    public int getCantidadComposiciones() {
        return cantidadComposiciones;
    }

    public ConsultasComposicion getResultadoComposiciones() {
        return resultadoComposiciones;
    }
    
    
}
