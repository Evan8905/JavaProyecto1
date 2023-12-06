package Pantallas;

import Clases.Genero;
import Logica.Utilitario;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author eefre
 */
public class frmGenero extends javax.swing.JFrame {

    ArrayList<Genero> ListaGeneros = Logica.Utilitario.listaGeneros;

    DefaultListModel modelo = new DefaultListModel();

    /**
     * Creates new form frmGenero
     */
    public frmGenero(frmPrincipal aThis, boolean par) {

        initComponents();
        // Con esta linea se le agregan los elementos a la lista de la interfaz
        lstGeneros.setModel(modelo);

        //Linea para que no se salga al dar clic en la X
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreGenero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextADescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstGeneros = new javax.swing.JList<>();
        lbGeneros = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Descripcion");

        jLabel2.setText("Nombre");

        txtNombreGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreGeneroActionPerformed(evt);
            }
        });

        jLabel3.setText("Mantenimiento de Genero");

        TextADescripcion.setColumns(20);
        TextADescripcion.setRows(5);
        jScrollPane2.setViewportView(TextADescripcion);

        jLabel4.setText("Nuevo Género");

        jScrollPane1.setViewportView(lstGeneros);

        lbGeneros.setText("Géneros");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lbGeneros))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMostrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(169, 169, 169))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnActualizar)
                                .addGap(54, 54, 54)
                                .addComponent(btnAgregar)
                                .addGap(81, 81, 81))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbGeneros))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnMostrar)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar)
                    .addComponent(btnActualizar))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreGeneroActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtNombreGenero.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Digite el Género", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (TextADescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Digite una Descripción", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Obtener la información del género desde los componentes de la interfaz
            String nombreGenero = txtNombreGenero.getText();
            String descripcionGenero = TextADescripcion.getText();

            // Crear un nuevo objeto Genero con la información capturada
            Genero nuevoGenero = new Genero(nombreGenero, descripcionGenero);

            // Agregar el nuevo objeto al ArrayList
            ListaGeneros.add(nuevoGenero);

            // Agregar el nombre del género al DefaultListModel (o al modelo que estés usando)
            modelo.addElement(nombreGenero);

            // Puedes limpiar los campos después de agregar el género si es necesario
            txtNombreGenero.setText("");
            TextADescripcion.setText("");
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        cargarListaGeneros();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarGeneroSeleccionado();
        cargarListaGeneros(); // Actualiza la interfaz después de eliminar
        JOptionPane.showMessageDialog(null, "Registro de Genero Eliminado");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editarGeneroSeleccionado();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarGeneroSeleccionado();
        cargarListaGeneros();//Actualiza la interfaz después de actualizar
        JOptionPane.showMessageDialog(null, "Datos de Genero Actualizados");
    }//GEN-LAST:event_btnActualizarActionPerformed

    public void cargarListaGeneros() {

        // Limpiar el modelo antes de agregar elementos
        modelo.clear();

        // Iterar sobre la lista de artistas y agregar los nombres al modelo
        for (Genero genero : ListaGeneros) {
            String nombre = genero.getNomGenero();
            modelo.addElement(nombre);
        }

    }

    //este metodo solo captura el selecciona y lo manda a utilitario para que pinte la info en el formulario
    public void editarGeneroSeleccionado() {

        int indiceSeleccionado = lstGeneros.getSelectedIndex();

        if (indiceSeleccionado != -1) {
            Utilitario.editarGenero(ListaGeneros, indiceSeleccionado, txtNombreGenero, TextADescripcion);
        }
    }

    public void actualizarGeneroSeleccionado() {

        int indiceSeleccionado = lstGeneros.getSelectedIndex();

        if (indiceSeleccionado != -1) {
            Utilitario.actualizarGenero(ListaGeneros, indiceSeleccionado, txtNombreGenero, TextADescripcion);
        }

    }

    public void eliminarGeneroSeleccionado() {

        int indiceSeleccionado = lstGeneros.getSelectedIndex();

        if (indiceSeleccionado != -1) {
            Utilitario.eliminarGenero(ListaGeneros, indiceSeleccionado);

        }

    }

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmArtista dialog = new frmArtista((frmPrincipal) new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextADescripcion;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbGeneros;
    private javax.swing.JList<String> lstGeneros;
    private javax.swing.JTextField txtNombreGenero;
    // End of variables declaration//GEN-END:variables
}
