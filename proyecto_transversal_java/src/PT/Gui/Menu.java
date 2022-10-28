/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PT.Gui;

/**
 *
 * @author Moon
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jDesktopPaneMain = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu_Materias = new javax.swing.JMenu();
        jmiAgregarMateria = new javax.swing.JMenuItem();
        jmiModificarMateria = new javax.swing.JMenuItem();
        jmiEliminarMateria = new javax.swing.JMenuItem();
        jMenu_Alumnos = new javax.swing.JMenu();
        jmiAgregarAlumno = new javax.swing.JMenuItem();
        jmiBajaAlumno = new javax.swing.JMenuItem();
        jmiModificarAlumno = new javax.swing.JMenuItem();
        jMenu_Inscripciones = new javax.swing.JMenu();
        jmiNuevaInscripcion = new javax.swing.JMenuItem();
        jmiEliminarInscripcion = new javax.swing.JMenuItem();
        jmiActualizarNota = new javax.swing.JMenuItem();
        jMenu_Consultas = new javax.swing.JMenu();
        jmiBuscarAlumno = new javax.swing.JMenuItem();
        jmiBuscarMateria = new javax.swing.JMenuItem();
        jmiBuscarInscripcion = new javax.swing.JMenuItem();
        jmiMostrarAlumnos = new javax.swing.JMenuItem();
        jmiMostrarMaterias = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPaneMainLayout = new javax.swing.GroupLayout(jDesktopPaneMain);
        jDesktopPaneMain.setLayout(jDesktopPaneMainLayout);
        jDesktopPaneMainLayout.setHorizontalGroup(
            jDesktopPaneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPaneMainLayout.setVerticalGroup(
            jDesktopPaneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu_Materias.setText("Materias");

        jmiAgregarMateria.setText("Agregar");
        jMenu_Materias.add(jmiAgregarMateria);

        jmiModificarMateria.setText("Modificar");
        jMenu_Materias.add(jmiModificarMateria);

        jmiEliminarMateria.setText("Eliminar");
        jMenu_Materias.add(jmiEliminarMateria);

        jMenuBar2.add(jMenu_Materias);

        jMenu_Alumnos.setText("Alumnos");

        jmiAgregarAlumno.setText("Agregar");
        jmiAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarAlumnoActionPerformed(evt);
            }
        });
        jMenu_Alumnos.add(jmiAgregarAlumno);

        jmiBajaAlumno.setText("Dar de baja");
        jmiBajaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBajaAlumnoActionPerformed(evt);
            }
        });
        jMenu_Alumnos.add(jmiBajaAlumno);

        jmiModificarAlumno.setText("Modificar");
        jMenu_Alumnos.add(jmiModificarAlumno);

        jMenuBar2.add(jMenu_Alumnos);

        jMenu_Inscripciones.setText("Inscripciones");

        jmiNuevaInscripcion.setText("Nueva inscripción");
        jMenu_Inscripciones.add(jmiNuevaInscripcion);

        jmiEliminarInscripcion.setText("Eliminar inscripción");
        jMenu_Inscripciones.add(jmiEliminarInscripcion);

        jmiActualizarNota.setText("Actualizar nota");
        jmiActualizarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiActualizarNotaActionPerformed(evt);
            }
        });
        jMenu_Inscripciones.add(jmiActualizarNota);

        jMenuBar2.add(jMenu_Inscripciones);

        jMenu_Consultas.setText("Consultas");

        jmiBuscarAlumno.setText("Buscar alumno");
        jMenu_Consultas.add(jmiBuscarAlumno);

        jmiBuscarMateria.setText("Buscar materia");
        jMenu_Consultas.add(jmiBuscarMateria);

        jmiBuscarInscripcion.setText("Buscar Inscripción");
        jMenu_Consultas.add(jmiBuscarInscripcion);

        jmiMostrarAlumnos.setText("Mostrar alumnos");
        jMenu_Consultas.add(jmiMostrarAlumnos);

        jmiMostrarMaterias.setText("Mostrar materias");
        jMenu_Consultas.add(jmiMostrarMaterias);

        jMenuBar2.add(jMenu_Consultas);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneMain)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiAgregarAlumnoActionPerformed

    private void jmiBajaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBajaAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiBajaAlumnoActionPerformed

    private void jmiActualizarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiActualizarNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiActualizarNotaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPaneMain;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenu_Alumnos;
    private javax.swing.JMenu jMenu_Consultas;
    private javax.swing.JMenu jMenu_Inscripciones;
    private javax.swing.JMenu jMenu_Materias;
    private javax.swing.JMenuItem jmiActualizarNota;
    private javax.swing.JMenuItem jmiAgregarAlumno;
    private javax.swing.JMenuItem jmiAgregarMateria;
    private javax.swing.JMenuItem jmiBajaAlumno;
    private javax.swing.JMenuItem jmiBuscarAlumno;
    private javax.swing.JMenuItem jmiBuscarInscripcion;
    private javax.swing.JMenuItem jmiBuscarMateria;
    private javax.swing.JMenuItem jmiEliminarInscripcion;
    private javax.swing.JMenuItem jmiEliminarMateria;
    private javax.swing.JMenuItem jmiModificarAlumno;
    private javax.swing.JMenuItem jmiModificarMateria;
    private javax.swing.JMenuItem jmiMostrarAlumnos;
    private javax.swing.JMenuItem jmiMostrarMaterias;
    private javax.swing.JMenuItem jmiNuevaInscripcion;
    // End of variables declaration//GEN-END:variables
}
