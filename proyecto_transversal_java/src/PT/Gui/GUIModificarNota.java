package PT.Gui;

import PT.Control.DataAlumno;
import PT.Control.DataInscripcion;
import PT.Control.DataMateria;
import PT.Modelo.Alumno;
import PT.Modelo.Inscripcion;
import PT.Modelo.Materia;
import java.awt.Color;
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

        jLAlumno = new javax.swing.JLabel();
        jBCancelar1 = new javax.swing.JButton();
        jCBAlumno = new javax.swing.JComboBox<>();
        jBModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLNota = new javax.swing.JLabel();
        jTFNota = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLTitulo2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(742, 458));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLAlumno.setForeground(new java.awt.Color(51, 51, 51));
        jLAlumno.setText("Elija al alumnoal que le quiere modificar la nota");
        getContentPane().add(jLAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jBCancelar1.setForeground(new java.awt.Color(51, 51, 51));
        jBCancelar1.setText("Cancelar");
        jBCancelar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 100, 30));

        jCBAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(jCBAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 350, -1));

        jBModificar.setForeground(new java.awt.Color(51, 51, 51));
        jBModificar.setText("Modificar");
        jBModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jBModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 100, 30));

        jTable.setBackground(new java.awt.Color(255, 255, 255));
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 461, 131));

        jLNota.setForeground(new java.awt.Color(51, 51, 51));
        jLNota.setText("Ingrese la nueva nota");
        getContentPane().add(jLNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jTFNota.setBackground(new java.awt.Color(255, 255, 255));
        jTFNota.setForeground(new java.awt.Color(204, 204, 204));
        jTFNota.setText("Su nota aquí");
        jTFNota.setBorder(null);
        jTFNota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFNotaMousePressed(evt);
            }
        });
        jTFNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFNotaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNotaKeyTyped(evt);
            }
        });
        getContentPane().add(jTFNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 130, 29));

        jPanel1.setBackground(new java.awt.Color(38, 79, 135));

        jLTitulo2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo2.setText("Modificar Nota");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 440));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 130, 30));

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
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");
        }
        if (jTFNota.getText().length() > 3) {
            evt.consume();
        }
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

    private void jTFNotaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFNotaMousePressed
        jTFNota.setText("");
        jTFNota.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_jTFNotaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar1;
    private javax.swing.JButton jBModificar;
    private javax.swing.JComboBox<Object> jCBAlumno;
    private javax.swing.JLabel jLAlumno;
    private javax.swing.JLabel jLNota;
    private javax.swing.JLabel jLTitulo2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFNota;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
