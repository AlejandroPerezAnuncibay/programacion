/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import javax.swing.JOptionPane;
import practicaeventos.PracticaEventos;

/**
 *
 * @author Alejandro
 */
public class Empresa extends javax.swing.JFrame {

    /** Creates new form Empresa */
    public Empresa() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        acontecimientos = new javax.swing.JMenu();
        añadir = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        modificar = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("Empresa de eventos");

        jButton3.setText("jButton3");

        acontecimientos.setText("Acontecimientos");
        acontecimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acontecimientosActionPerformed(evt);
            }
        });

        añadir.setText("Añadir evento");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        acontecimientos.add(añadir);

        eliminar.setText("Eliminar evento");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        acontecimientos.add(eliminar);

        modificar.setText("Modificar evento");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        acontecimientos.add(modificar);

        jMenuBar1.add(acontecimientos);

        salir.setText("Opciones");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        salir.add(jMenuItem1);

        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acontecimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acontecimientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acontecimientosActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        JOptionPane.showMessageDialog(this, "Gracias por usar el programa");
        
    }//GEN-LAST:event_salirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        PracticaEventos.mostrarAcontecimientos();
    }//GEN-LAST:event_añadirActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        PracticaEventos.ventanaEliminar();
    }//GEN-LAST:event_eliminarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        PracticaEventos.mostrarModificar();
        
        
    }//GEN-LAST:event_modificarActionPerformed

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
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu acontecimientos;
    private javax.swing.JMenuItem añadir;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JMenu salir;
    // End of variables declaration//GEN-END:variables

}
