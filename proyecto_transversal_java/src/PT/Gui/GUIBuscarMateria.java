/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PT.Gui;

import PT.Control.DataMateria;
import PT.Modelo.Materia;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moon
 */
public class GUIBuscarMateria extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo; //Creamos el modelo de la tabla

    /**
     * Creates new form GUIBuscarMaterias
     */
    public GUIBuscarMateria() {
        initComponents();
        jBBuscar.setEnabled(false); //Deshabilitamos el botón buscar por default
        jTFBuscarID.setEnabled(false); //Deshabilitamos por default el campo de buscar ID
        modelo = new DefaultTableModel();
        armarCabecera(); //Llamámos al método para asignarle nombres a las cabeceras de la tabla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFBuscarID = new javax.swing.JTextField();
        jRBMostrarTodos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMateria = new javax.swing.JTable();
        jBBuscar = new javax.swing.JButton();
        jBVolver = new javax.swing.JButton();
        jRBBuscar = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLTitulo2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(729, 435));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTFBuscarID.setBackground(new java.awt.Color(255, 255, 255));
        jTFBuscarID.setForeground(new java.awt.Color(204, 204, 204));
        jTFBuscarID.setText("Ingrese el número de legajo aquí");
        jTFBuscarID.setBorder(null);
        jTFBuscarID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFBuscarIDMousePressed(evt);
            }
        });
        jTFBuscarID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscarIDKeyTyped(evt);
            }
        });
        getContentPane().add(jTFBuscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 280, 30));

        jRBMostrarTodos.setBackground(new java.awt.Color(255, 255, 255));
        jRBMostrarTodos.setForeground(new java.awt.Color(51, 51, 51));
        jRBMostrarTodos.setText("Mostrar todas");
        jRBMostrarTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRBMostrarTodosMousePressed(evt);
            }
        });
        getContentPane().add(jRBMostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jTMateria.setBackground(new java.awt.Color(255, 255, 255));
        jTMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane1.setViewportView(jTMateria);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 420, 140));

        jBBuscar.setForeground(new java.awt.Color(51, 51, 51));
        jBBuscar.setText("Buscar");
        jBBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 90, 30));

        jBVolver.setForeground(new java.awt.Color(51, 51, 51));
        jBVolver.setText("Volver");
        jBVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jBVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 90, 30));

        jRBBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jRBBuscar.setForeground(new java.awt.Color(51, 51, 51));
        jRBBuscar.setText("Buscar por legajo");
        jRBBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRBBuscarMousePressed(evt);
            }
        });
        jRBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jRBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jPanel1.setBackground(new java.awt.Color(38, 79, 135));

        jLTitulo2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo2.setText("Buscar Materia");

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(435, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 500));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 280, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBMostrarTodosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBMostrarTodosMousePressed
        jTFBuscarID.setText(""); //Reseteamos el campo de buscar ID
        jTFBuscarID.setEnabled(false); //y lo deshabilitamos
        jRBBuscar.setSelected(false); //Des-seleccionamos el botón de buscar por ID
        borrarFilasTabla(); //Reseteamos la tabla (si no se vuelven a poner las materias abajo si volvés a presionar)
        //Condicional para que solo muestre las mats cuando esté seleccionado y no cuando sea un click para des-seleccionar
        if (!jRBMostrarTodos.isSelected()) { 
            DataMateria DM = new DataMateria();
            for (Materia materia : DM.readAllMateria()) {
                modelo.addRow(new Object[]{materia.getNombre(), materia.getAnio()});
            }
        }
    }//GEN-LAST:event_jRBMostrarTodosMousePressed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        borrarFilasTabla(); //Reseteamos la tabla
        DataMateria DM = new DataMateria();
        Materia auxiliar = new Materia(); //Creamos una materia auxiliar y le cargamos la materia seleccionada
        auxiliar = DM.readMateria(Integer.parseInt(jTFBuscarID.getText())); //a través del ID
        modelo.addRow(new Object[]{auxiliar.getNombre(), auxiliar.getAnio()}); //la añadimos a la tabla
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jRBBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBBuscarMousePressed
        jTFBuscarID.setEnabled(true); //Habilita el text field del ID
        jBBuscar.setEnabled(true); //Habilita el botón buscar
        jRBMostrarTodos.setSelected(false); //Des-selecciona el Mostrar Todas
        borrarFilasTabla(); // Limpia la tabla

        if (jRBBuscar.isSelected()) {
            jTFBuscarID.setEnabled(false); //Deshabilita el text field si no está seleccionado el Buscar
            jBBuscar.setEnabled(false);
        }

    }//GEN-LAST:event_jRBBuscarMousePressed

    private void armarCabecera() {
        ArrayList<Object> columnas = new ArrayList();
        columnas.add("Nombre");
        columnas.add("Año");

        for (Object columna : columnas) {
            modelo.addColumn(columna);
        }

        jTMateria.setModel(modelo);
    }

    private void borrarFilasTabla() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;

            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
        }

    }


    private void jRBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBBuscarActionPerformed

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jBVolverActionPerformed

    private void jTFBuscarIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscarIDKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");
        }
        if (jTFBuscarID.getText().length() > 3) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFBuscarIDKeyTyped

    private void jTFBuscarIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBuscarIDMousePressed
        jTFBuscarID.setText("");
        jTFBuscarID.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_jTFBuscarIDMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBVolver;
    private javax.swing.JLabel jLTitulo2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBBuscar;
    private javax.swing.JRadioButton jRBMostrarTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTFBuscarID;
    private javax.swing.JTable jTMateria;
    // End of variables declaration//GEN-END:variables
}
