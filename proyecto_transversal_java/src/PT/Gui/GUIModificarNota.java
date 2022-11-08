package PT.Gui;

import PT.Control.DataAlumno;
import PT.Control.DataInscripcion;
import PT.Control.DataMateria;
import PT.Modelo.Alumno;
import PT.Modelo.Inscripcion;
import PT.Modelo.Materia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUIModificarNota extends javax.swing.JInternalFrame {
    
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public GUIModificarNota() {
        initComponents();
        DataMateria dataMateria = new DataMateria();
        DataAlumno dataAlumno = new DataAlumno();
        initComponents();
        jBModificar.setEnabled(false);
        
        
        setResizable(false);
        
        for (Alumno alumno : dataAlumno.readAllAlumno()) {
            
            jCBAlumno.addItem(alumno);
            
        }
        for (Materia materia : dataMateria.readAllMateria()) {
            
        }
//colocando cabezera
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("Cod");
        columnas.add("Materia");
        columnas.add("Año");
        columnas.add("Nota");
        
        for (Object it : columnas) {
            modeloTabla.addColumn(it);
        }
//setieando el modelo a la tabla
        jTable.setModel(modeloTabla);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jLAlumno = new javax.swing.JLabel();
        jBCancelar1 = new javax.swing.JButton();
        jCBAlumno = new javax.swing.JComboBox<>();
        jBModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLNota = new javax.swing.JLabel();
        jTFNota = new javax.swing.JTextField();

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo.setText("MODIFICAR NOTA");

        jLAlumno.setText("Ingrese el alumno del cual quiere modificar la nota");

        jBCancelar1.setText("Cancelar");
        jBCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelar1ActionPerformed(evt);
            }
        });

        jCBAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAlumnoActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

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
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLNota.setText("Nota");

        jTFNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFNotaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNotaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jTFNota, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLNota)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBModificar)
                        .addGap(235, 235, 235)
                        .addComponent(jBCancelar1)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLAlumno)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jCBAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLTitulo)
                        .addGap(174, 174, 174))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLAlumno)
                .addGap(18, 18, 18)
                .addComponent(jCBAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNota, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBModificar)
                    .addComponent(jBCancelar1))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelar1ActionPerformed
        dispose();
    }//GEN-LAST:event_jBCancelar1ActionPerformed

    private void jCBAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAlumnoActionPerformed
        
        
        DataInscripcion dataInscripcion = new DataInscripcion();
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        inscripciones.addAll(dataInscripcion.obtenerTodasInscripciones());
        modeloTabla.setNumRows(0);
        int id_alumno = ((Alumno) jCBAlumno.getSelectedItem()).getId_alumno(), c;
        ArrayList<Materia> auxArray = new ArrayList<>();
        auxArray.addAll(dataInscripcion.obtenerMateriasInscriptas(id_alumno));
        
        for (Inscripcion aux : inscripciones) {
            for (Materia materia : auxArray) {
                
                if (aux.getId_alumno() == id_alumno && aux.getId_materia() == materia.getId_materia()) {
                    modeloTabla.addRow(new Object[]{materia.getId_materia(), materia.getNombre(),
                        materia.getAnio(), (float) aux.getNota()});
                }
                
            }
            
        }
        
        int fila = jTable.getSelectedRow();
        boolean flag=false;
        try {
            boolean aux=modeloTabla.getValueAt(0, fila).equals("");
            flag=true;
        } catch (Exception e) {
            flag=false;
        }
        if (!jTFNota.getText().equals("")&&flag) {
            jBModificar.setEnabled(true);
        }else{
        jBModificar.setEnabled(false);
        }

    }//GEN-LAST:event_jCBAlumnoActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        DataInscripcion dataInscripcion = new DataInscripcion();
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        inscripciones.addAll(dataInscripcion.obtenerTodasInscripciones());
        int fila = jTable.getSelectedRow();
        int id_materia = (int) modeloTabla.getValueAt(fila, 0);
        int id_alumno = ((Alumno) jCBAlumno.getSelectedItem()).getId_alumno();
        float notaNueva = Float.parseFloat(jTFNota.getText());
        for (Inscripcion aux : inscripciones) {
            if (aux.getId_alumno() == id_alumno && aux.getId_materia() == id_materia) {
                dataInscripcion.actualizarNota(aux.getId_inscripcion(), notaNueva);
            }
        }
        jTFNota.setText("");
        modeloTabla.setNumRows(0);

    }//GEN-LAST:event_jBModificarActionPerformed

    private void jTFNotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNotaKeyReleased
        int fila = jTable.getSelectedRow();
        boolean flag=false;
        try {
            boolean aux=modeloTabla.getValueAt(0, fila).equals("");
            flag=true;
        } catch (Exception e) {
            flag=false;
        }
        if (!jTFNota.getText().equals("")&&flag) {
            jBModificar.setEnabled(true);
        }else{
        jBModificar.setEnabled(false);
        }
    }//GEN-LAST:event_jTFNotaKeyReleased

    private void jTFNotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNotaKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n') && !c.equals('.')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");           
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNotaKeyTyped

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
  int fila = jTable.getSelectedRow();
        boolean flag=false;
        try {
            boolean aux=modeloTabla.getValueAt(0, fila).equals("");
            flag=true;
        } catch (Exception e) {
            flag=false;
        }
        if (!jTFNota.getText().equals("")&&flag) {
            jBModificar.setEnabled(true);
        }else{
        jBModificar.setEnabled(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar1;
    private javax.swing.JButton jBModificar;
    private javax.swing.JComboBox<Object> jCBAlumno;
    private javax.swing.JLabel jLAlumno;
    private javax.swing.JLabel jLNota;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFNota;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
