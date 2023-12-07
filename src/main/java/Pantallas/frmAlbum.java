package Pantallas;

import Clases.Album;
import Clases.Genero;
import Logica.Utilitario;
import static Logica.Utilitario.listaGeneros;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author eefre
 */
public class frmAlbum extends javax.swing.JFrame {

    ArrayList<Album> listaAlbumes = Logica.Utilitario.listaAlbum;

    DefaultListModel modelo = new DefaultListModel();
    DefaultListModel modeloGenero = new DefaultListModel();

    /**
     * Creates new form frmAlbum
     */
    public frmAlbum(frmPrincipal aThis, boolean par) {
        initComponents();
        lstAlbumes.setModel(modelo);
        lstGeneros.setModel(modeloGenero);
        //Linea para que no se salga
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        cargarCombos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoOpcs = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        op4 = new javax.swing.JRadioButton();
        cmbGeneros = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnGuardarArtista = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rbtnEstudio = new javax.swing.JRadioButton();
        rbtnEnVivo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAlbumes = new javax.swing.JList<>();
        txtNombreAlbum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbtnEp = new javax.swing.JRadioButton();
        rbtnRecopilatorio = new javax.swing.JRadioButton();
        rbtnSencillo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroAlbum = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDiscografia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNumeroCanciones = new javax.swing.JTextField();
        btnGuardarAlbum = new javax.swing.JButton();
        btnEditarAlbum = new javax.swing.JButton();
        btnEliminarAlbum = new javax.swing.JButton();
        btnMostrarAlbum = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtPubDate = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstGeneros = new javax.swing.JList<>();

        jLabel2.setText("Mantenimiento de Artistas");

        grupoOpcs.add(op4);
        op4.setText("EP");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        jLabel9.setText("Géneros");

        btnGuardarArtista.setText("Guardar Registro");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Mantenimiento de Álbum");

        jLabel1.setText("Registro Álbumes");

        grupoOpcs.add(rbtnEstudio);
        rbtnEstudio.setText("Estudio");
        rbtnEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEstudioActionPerformed(evt);
            }
        });

        grupoOpcs.add(rbtnEnVivo);
        rbtnEnVivo.setText("En Vivo");
        rbtnEnVivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEnVivoActionPerformed(evt);
            }
        });

        lstAlbumes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstAlbumes);

        txtNombreAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAlbumActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        jLabel5.setText("Álbumes");

        grupoOpcs.add(rbtnEp);
        rbtnEp.setText("EP");
        rbtnEp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEpActionPerformed(evt);
            }
        });

        grupoOpcs.add(rbtnRecopilatorio);
        rbtnRecopilatorio.setText("Recopilatorio");
        rbtnRecopilatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRecopilatorioActionPerformed(evt);
            }
        });

        grupoOpcs.add(rbtnSencillo);
        rbtnSencillo.setText("Sencillo");
        rbtnSencillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSencilloActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo");

        jLabel7.setText("Fechas de Publicación");

        txtNumeroAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroAlbumActionPerformed(evt);
            }
        });

        jLabel8.setText("Número");

        jLabel10.setText("Géneros");

        txtDiscografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscografiaActionPerformed(evt);
            }
        });

        jLabel11.setText("Discografia");

        jLabel12.setText("N. Canciones");

        txtNumeroCanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCancionesActionPerformed(evt);
            }
        });

        btnGuardarAlbum.setText("Guardar Registro");

        btnEditarAlbum.setText("Editar");
        btnEditarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAlbumActionPerformed(evt);
            }
        });

        btnEliminarAlbum.setText("Eliminar");
        btnEliminarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAlbumActionPerformed(evt);
            }
        });

        btnMostrarAlbum.setText("Mostrar");
        btnMostrarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAlbumActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar Registro");

        lstGeneros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstGeneros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMostrarAlbum)
                                .addGap(27, 27, 27)
                                .addComponent(btnEditarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnEliminarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPubDate))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(rbtnSencillo)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(rbtnRecopilatorio))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(rbtnEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(rbtnEp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(rbtnEnVivo))
                                                .addComponent(txtNombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(txtNumeroAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDiscografia, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                        .addComponent(txtNumeroCanciones)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnActualizar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnGuardarAlbum))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(275, 275, 275))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEliminarAlbum)
                                .addComponent(btnActualizar)
                                .addComponent(btnGuardarAlbum))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnMostrarAlbum)
                                .addComponent(btnEditarAlbum))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNumeroAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rbtnEstudio)
                            .addComponent(rbtnEp)
                            .addComponent(rbtnEnVivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnSencillo)
                            .addComponent(rbtnRecopilatorio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPubDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtDiscografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtNumeroCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEstudioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnEstudioActionPerformed

    private void txtNombreAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAlbumActionPerformed

    private void rbtnEpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnEpActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op4ActionPerformed

    private void rbtnRecopilatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRecopilatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnRecopilatorioActionPerformed

    private void rbtnSencilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSencilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSencilloActionPerformed

    private void rbtnEnVivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEnVivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnEnVivoActionPerformed

    private void txtNumeroAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroAlbumActionPerformed

    private void txtDiscografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscografiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiscografiaActionPerformed

    private void txtNumeroCancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCancionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCancionesActionPerformed

    private void btnMostrarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAlbumActionPerformed
        cargarListaAlbumes();
    }//GEN-LAST:event_btnMostrarAlbumActionPerformed

    private void btnEliminarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlbumActionPerformed
        eliminarAlbumSeleccionado();
        cargarListaAlbumes(); // Actualiza la interfaz después de eliminar
        JOptionPane.showMessageDialog(null, "Álbum Eliminado");
    }//GEN-LAST:event_btnEliminarAlbumActionPerformed

    private void btnEditarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAlbumActionPerformed
        editarAlbumSeleccionado();
    }//GEN-LAST:event_btnEditarAlbumActionPerformed

    public void cargarListaAlbumes() {
        // Limpiar el modelo antes de agregar elementos
        modelo.clear();

        // Iterar sobre la lista de almbumes y agregar los nombres al modelo
        for (Album album : listaAlbumes) {
            String nombre = album.getNombre();
            modelo.addElement(nombre);
        }
    }

    public void cargarCombos() {
        modeloGenero.clear();

        for (Genero genero : listaGeneros) {
            String nombre = genero.getNomGenero();
            modeloGenero.addElement(nombre);
        }
    }

    public void eliminarAlbumSeleccionado() {

        int indiceSeleccionado = lstAlbumes.getSelectedIndex();

        if (indiceSeleccionado != -1) {
            Utilitario.eliminarAlbum(listaAlbumes, indiceSeleccionado);
        }
    }

    public void editarAlbumSeleccionado() {
        int indiceSeleccionado = lstAlbumes.getSelectedIndex();

        if (indiceSeleccionado != -1) {
            Utilitario.editarAlbum(listaAlbumes, indiceSeleccionado, txtNumeroAlbum, txtNombreAlbum, rbtnEstudio, rbtnEp, rbtnEnVivo, rbtnSencillo, rbtnRecopilatorio, txtPubDate, lstGeneros, txtDiscografia, txtNumeroCanciones);
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
            java.util.logging.Logger.getLogger(frmAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditarAlbum;
    private javax.swing.JButton btnEliminarAlbum;
    private javax.swing.JButton btnGuardarAlbum;
    private javax.swing.JButton btnGuardarArtista;
    private javax.swing.JButton btnMostrarAlbum;
    private javax.swing.JComboBox<String> cmbGeneros;
    private javax.swing.ButtonGroup grupoOpcs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstAlbumes;
    private javax.swing.JList<String> lstGeneros;
    private javax.swing.JRadioButton op4;
    private javax.swing.JRadioButton rbtnEnVivo;
    private javax.swing.JRadioButton rbtnEp;
    private javax.swing.JRadioButton rbtnEstudio;
    private javax.swing.JRadioButton rbtnRecopilatorio;
    private javax.swing.JRadioButton rbtnSencillo;
    private javax.swing.JTextField txtDiscografia;
    private javax.swing.JTextField txtNombreAlbum;
    private javax.swing.JTextField txtNumeroAlbum;
    private javax.swing.JTextField txtNumeroCanciones;
    private javax.swing.JTextField txtPubDate;
    // End of variables declaration//GEN-END:variables
}
