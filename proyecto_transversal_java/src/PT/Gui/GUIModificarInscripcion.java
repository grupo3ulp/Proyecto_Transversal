/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package PT.Gui;

import PT.Control.DataAlumno;
import PT.Control.DataInscripcion;
import PT.Control.DataMateria;
import PT.Modelo.Alumno;
import PT.Modelo.Inscripcion;
import PT.Modelo.Materia;
import PT.main.main;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;

/**
 *
 * @author Heisen
 */
public class GUIModificarInscripcion extends javax.swing.JInternalFrame {

    DataMateria dataMateria = new DataMateria();
    DataAlumno dataAlumno = new DataAlumno();
    DefaultTableModel modeloTabla;

    public GUIModificarInscripcion() {
        initComponents();
        setResizable(false);
        
        for (Alumno alumno : dataAlumno.readAllAlumno()) {

            jCBAlumno.addItem(alumno);

        }
        for (Materia materia : dataMateria.readAllMateria()) {

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jLMateria = new javax.swing.JLabel();
        jLAlumno = new javax.swing.JLabel();
        jBDesincribir = new javax.swing.JButton();
        jBCancelar1 = new javax.swing.JButton();
        jCBAlumno = new javax.swing.JComboBox<>();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jBCancelar2 = new javax.swing.JButton();
        jBGuardar1 = new javax.swing.JButton();
        jLTitulo2 = new javax.swing.JLabel();
        jLMateria1 = new javax.swing.JLabel();
        jLAlumno1 = new javax.swing.JLabel();
        jLTitulo3 = new javax.swing.JLabel();
        jLMateria4 = new javax.swing.JLabel();
        jCBMateria4 = new javax.swing.JComboBox<>();
        jBBorrar1 = new javax.swing.JButton();
        jBCancelar3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jCBAlumno1 = new javax.swing.JComboBox<>();
        jCBMateria1 = new javax.swing.JComboBox<>();
        jLMateria5 = new javax.swing.JLabel();
        jCBMateria5 = new javax.swing.JComboBox<>();
        jRBInscriptas = new javax.swing.JRadioButton();
        jRBNoInscriptas = new javax.swing.JRadioButton();
        jBInscribir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo.setText("MODIFICAR INSCRIPCION");

        jLMateria.setText("Materias");

        jLAlumno.setText("Ingrese el alumno del cual quiere modificar la inscripcion");

        jBDesincribir.setText("Desinscribir");
        jBDesincribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDesincribirActionPerformed(evt);
            }
        });

        jBCancelar1.setText("Cancelar");

        jCBAlumno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBAlumnoItemStateChanged(evt);
            }
        });
        jCBAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAlumnoActionPerformed(evt);
            }
        });

        jBCancelar2.setText("Cancelar");

        jBGuardar1.setText("Guardar");
        jBGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardar1ActionPerformed(evt);
            }
        });

        jLTitulo2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo2.setText("MODIFICAR INSCRIPCION");

        jLMateria1.setText("Materia");

        jLAlumno1.setText("Ingrese el alumno del cual quiere modificar la inscripcion");

        jLTitulo3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo3.setText("DAR DE BAJA EN MATERIA");

        jLMateria4.setText("Elija la materia que desea eliminar");

        jBBorrar1.setText("Borrar");

        jBCancelar3.setText("Cancelar");

        jCBAlumno1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBAlumno1ItemStateChanged(evt);
            }
        });
        jCBAlumno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAlumno1ActionPerformed(evt);
            }
        });

        jCBMateria1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBMateria1ItemStateChanged(evt);
            }
        });
        jCBMateria1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCBMateria1FocusGained(evt);
            }
        });
        jCBMateria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMateria1ActionPerformed(evt);
            }
        });

        jLMateria5.setText("Materia Nueva");

        jCBMateria5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMateria5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLMateria5)
                            .addComponent(jLMateria1)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLTitulo3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jBCancelar3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBBorrar1)
                                .addGap(31, 31, 31))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLMateria4)
                                    .addComponent(jCBMateria4, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jBCancelar2)
                                .addGap(154, 154, 154)
                                .addComponent(jBGuardar1))
                            .addComponent(jLAlumno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBAlumno1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBMateria1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBMateria5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67))))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLTitulo2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo2)
                .addGap(18, 18, 18)
                .addComponent(jLAlumno1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMateria1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLMateria5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBMateria5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar2)
                    .addComponent(jBGuardar1))
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLMateria4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBMateria4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBorrar1)
                    .addComponent(jBCancelar3))
                .addGap(17, 17, 17))
        );

        jRBInscriptas.setText("Inscriptas");
        jRBInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBInscriptasActionPerformed(evt);
            }
        });

        jRBNoInscriptas.setText("No Inscriptas");

        jBInscribir.setText("Inscribir");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Materia", "Año"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRBInscriptas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRBNoInscriptas))
                                .addComponent(jCBAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBInscribir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBDesincribir)
                                    .addGap(58, 58, 58)
                                    .addComponent(jBCancelar1))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLTitulo)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLMateria)
                        .addGap(242, 242, 242))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 267, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 266, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLAlumno)
                .addGap(24, 24, 24)
                .addComponent(jCBAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLMateria)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBInscriptas)
                    .addComponent(jRBNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribir)
                    .addComponent(jBDesincribir)
                    .addComponent(jBCancelar1))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAlumnoActionPerformed


    }//GEN-LAST:event_jCBAlumnoActionPerformed

    private void jCBAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBAlumnoItemStateChanged

    }//GEN-LAST:event_jCBAlumnoItemStateChanged

    private void jBGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBGuardar1ActionPerformed

    private void jCBAlumno1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBAlumno1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAlumno1ItemStateChanged

    private void jCBAlumno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAlumno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBAlumno1ActionPerformed

    private void jCBMateria1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBMateria1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBMateria1ItemStateChanged

    private void jCBMateria1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCBMateria1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBMateria1FocusGained

    private void jCBMateria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMateria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBMateria1ActionPerformed

    private void jCBMateria5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMateria5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBMateria5ActionPerformed

    private void jRBInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBInscriptasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBInscriptasActionPerformed

    private void jBDesincribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesincribirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBDesincribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBorrar1;
    private javax.swing.JButton jBCancelar1;
    private javax.swing.JButton jBCancelar2;
    private javax.swing.JButton jBCancelar3;
    private javax.swing.JButton jBDesincribir;
    private javax.swing.JButton jBGuardar1;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JComboBox<Object> jCBAlumno;
    private javax.swing.JComboBox<Object> jCBAlumno1;
    private javax.swing.JComboBox<Object> jCBMateria1;
    private javax.swing.JComboBox<Object> jCBMateria4;
    private javax.swing.JComboBox<Object> jCBMateria5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLAlumno;
    private javax.swing.JLabel jLAlumno1;
    private javax.swing.JLabel jLMateria;
    private javax.swing.JLabel jLMateria1;
    private javax.swing.JLabel jLMateria4;
    private javax.swing.JLabel jLMateria5;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLTitulo2;
    private javax.swing.JLabel jLTitulo3;
    private javax.swing.JRadioButton jRBInscriptas;
    private javax.swing.JRadioButton jRBNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
