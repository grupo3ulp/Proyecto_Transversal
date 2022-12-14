/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package PT.Gui;

import PT.Control.DataAlumno;
import PT.Modelo.Alumno;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author dante
 */
public class GUIModificarAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUIModificarAlumno
     */
    public GUIModificarAlumno() {
        initComponents();
        JTextFieldDateEditor editor = (JTextFieldDateEditor) DateChooserMod.getDateEditor();
        editor.setEditable(false);
        DataAlumno DA = new DataAlumno();
        for (Alumno alumno : DA.readAllAlumno()) {
            JComboModAlum.addItem(alumno);
            JComboDelAlum.addItem(alumno);
        }
        Date date1 = new GregorianCalendar(2004, Calendar.NOVEMBER, 13).getTime();
        DateChooserMod.getJCalendar().setMaxSelectableDate(date1);
        Date date2 = new GregorianCalendar(1930, Calendar.JANUARY, 1).getTime();
        DateChooserMod.getJCalendar().setMinSelectableDate(date2);
        DateChooserMod.setDate(java.sql.Date.valueOf(((Alumno) JComboModAlum.getSelectedItem()).getFecha_nacimiento()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        JComboModAlum = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTFModApellidoAlum = new javax.swing.JTextField();
        JTFModNombreAlum = new javax.swing.JTextField();
        JTFDNIModAlum = new javax.swing.JTextField();
        DateChooserMod = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        JComboDelAlum = new javax.swing.JComboBox<>();
        JBLimpiarModA = new javax.swing.JButton();
        JBGuardarModA = new javax.swing.JButton();
        JBCancelarDelA = new javax.swing.JButton();
        JBBorrarDelA = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLTitulo2 = new javax.swing.JLabel();
        jLTitulo3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(832, 531));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Elija el alumno que desea modificar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        JComboModAlum.setBackground(new java.awt.Color(255, 255, 255));
        JComboModAlum.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboModAlumItemStateChanged(evt);
            }
        });
        getContentPane().add(JComboModAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 316, -1));

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("DNI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 50, -1));

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Apellido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fecha de nacimiento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        JTFModApellidoAlum.setBackground(new java.awt.Color(255, 255, 255));
        JTFModApellidoAlum.setForeground(new java.awt.Color(204, 204, 204));
        JTFModApellidoAlum.setText("Ingrese el apellido aqu??");
        JTFModApellidoAlum.setBorder(null);
        JTFModApellidoAlum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTFModApellidoAlumMousePressed(evt);
            }
        });
        JTFModApellidoAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFModApellidoAlumActionPerformed(evt);
            }
        });
        JTFModApellidoAlum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFModApellidoAlumKeyTyped(evt);
            }
        });
        getContentPane().add(JTFModApellidoAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 176, 394, 20));

        JTFModNombreAlum.setBackground(new java.awt.Color(255, 255, 255));
        JTFModNombreAlum.setForeground(new java.awt.Color(204, 204, 204));
        JTFModNombreAlum.setText("Ingrese el nombre aqu??");
        JTFModNombreAlum.setBorder(null);
        JTFModNombreAlum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTFModNombreAlumMousePressed(evt);
            }
        });
        JTFModNombreAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFModNombreAlumActionPerformed(evt);
            }
        });
        JTFModNombreAlum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFModNombreAlumKeyTyped(evt);
            }
        });
        getContentPane().add(JTFModNombreAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 394, -1));

        JTFDNIModAlum.setBackground(new java.awt.Color(255, 255, 255));
        JTFDNIModAlum.setForeground(new java.awt.Color(204, 204, 204));
        JTFDNIModAlum.setText("Ingrese el DNI aqu?? (sin puntos)");
        JTFDNIModAlum.setBorder(null);
        JTFDNIModAlum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTFDNIModAlumMousePressed(evt);
            }
        });
        JTFDNIModAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDNIModAlumActionPerformed(evt);
            }
        });
        JTFDNIModAlum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFDNIModAlumKeyTyped(evt);
            }
        });
        getContentPane().add(JTFDNIModAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 394, 20));

        DateChooserMod.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DateChooserMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 394, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 830, 10));

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Elija el alumno que desea dar de baja");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        JComboDelAlum.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(JComboDelAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 316, -1));

        JBLimpiarModA.setForeground(new java.awt.Color(51, 51, 51));
        JBLimpiarModA.setText("Limpiar");
        JBLimpiarModA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBLimpiarModA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarModAActionPerformed(evt);
            }
        });
        getContentPane().add(JBLimpiarModA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 90, 30));

        JBGuardarModA.setForeground(new java.awt.Color(51, 51, 51));
        JBGuardarModA.setText("Guardar");
        JBGuardarModA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBGuardarModA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarModAActionPerformed(evt);
            }
        });
        getContentPane().add(JBGuardarModA, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 90, 30));

        JBCancelarDelA.setForeground(new java.awt.Color(51, 51, 51));
        JBCancelarDelA.setText("Cancelar");
        JBCancelarDelA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBCancelarDelA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarDelAActionPerformed(evt);
            }
        });
        getContentPane().add(JBCancelarDelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 90, 30));

        JBBorrarDelA.setForeground(new java.awt.Color(51, 51, 51));
        JBBorrarDelA.setText("Borrar");
        JBBorrarDelA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBBorrarDelA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBorrarDelAActionPerformed(evt);
            }
        });
        getContentPane().add(JBBorrarDelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 90, 30));

        jPanel1.setBackground(new java.awt.Color(38, 79, 135));

        jLTitulo2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo2.setText("Modificar Alumno");

        jLTitulo3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo3.setText("Borrar Alumno");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addComponent(jLTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 510));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 400, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 400, 20));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 400, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFModNombreAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFModNombreAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFModNombreAlumActionPerformed

    private void JTFDNIModAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDNIModAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDNIModAlumActionPerformed

    private void JTFModApellidoAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFModApellidoAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFModApellidoAlumActionPerformed

    private void JBLimpiarModAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarModAActionPerformed
        JTFDNIModAlum.setText("");
        JTFModNombreAlum.setText("");
        JTFModApellidoAlum.setText("");
        ((JTextField) DateChooserMod.getDateEditor().getUiComponent()).setText("");
    }//GEN-LAST:event_JBLimpiarModAActionPerformed

    private void JBCancelarDelAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarDelAActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_JBCancelarDelAActionPerformed

    private void JBGuardarModAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarModAActionPerformed
        int cont = 0;
        DataAlumno DA = new DataAlumno();
        int d = DateChooserMod.getCalendar().get(Calendar.DAY_OF_MONTH);
        int m = DateChooserMod.getCalendar().getTime().getMonth() + 1;
        int an = DateChooserMod.getCalendar().getTime().getYear() + 1900;
        DataAlumno DA2 = new DataAlumno();

        for (Alumno alumno : DA.readAllAlumno()) {
            if (alumno.getDni().equals(JTFDNIModAlum.getText())) {
                cont++;
            }
        }

        if (cont == 1) {
            JOptionPane.showMessageDialog(null, "El dni ya existe en la base de datos");
        } else {
            DA2.updateAlumno(((Alumno) JComboModAlum.getSelectedItem()), JTFDNIModAlum.getText(), JTFModNombreAlum.getText(), JTFModApellidoAlum.getText(), java.sql.Date.valueOf(LocalDate.of(an, m, d)));
        }

        cont = 0;
    }//GEN-LAST:event_JBGuardarModAActionPerformed

    private void JBBorrarDelAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBorrarDelAActionPerformed
        DataAlumno DA = new DataAlumno();
        DA.deleteAlumno(((Alumno) JComboDelAlum.getSelectedItem()).getId_alumno());
    }//GEN-LAST:event_JBBorrarDelAActionPerformed

    private void JComboModAlumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboModAlumItemStateChanged
        
            JTFDNIModAlum.setText(String.valueOf(((Alumno) JComboModAlum.getSelectedItem()).getDni()));
            JTFModNombreAlum.setText(String.valueOf(((Alumno) JComboModAlum.getSelectedItem()).getNombre()));
            JTFModApellidoAlum.setText(String.valueOf(((Alumno) JComboModAlum.getSelectedItem()).getApellido()));
            //((JTextField) DateChooserMod.getDateEditor().getUiComponent()).setText(String.valueOf(((Alumno) JComboModAlum.getSelectedItem()).getFecha_nacimiento()));

            DateChooserMod.setDate(java.sql.Date.valueOf(((Alumno) JComboModAlum.getSelectedItem()).getFecha_nacimiento()));
        
    }//GEN-LAST:event_JComboModAlumItemStateChanged

    private void JTFDNIModAlumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFDNIModAlumKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c) && !c.equals('\b') && !c.equals('\t') && !c.equals('\n')) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar numeros en "
                    + "este campo");
        }
    }//GEN-LAST:event_JTFDNIModAlumKeyTyped

    private void JTFModNombreAlumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFModNombreAlumKeyTyped
        Character c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar letras en "
                    + "este campo");
        }
    }//GEN-LAST:event_JTFModNombreAlumKeyTyped

    private void JTFModApellidoAlumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFModApellidoAlumKeyTyped
        Character c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se pueden ingresar letras en "
                    + "este campo");
        }
    }//GEN-LAST:event_JTFModApellidoAlumKeyTyped

    private void JTFDNIModAlumMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFDNIModAlumMousePressed
        JTFDNIModAlum.setText("");
        JTFDNIModAlum.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_JTFDNIModAlumMousePressed

    private void JTFModNombreAlumMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFModNombreAlumMousePressed
        JTFModNombreAlum.setText("");
        JTFModNombreAlum.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_JTFModNombreAlumMousePressed

    private void JTFModApellidoAlumMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFModApellidoAlumMousePressed
        JTFModApellidoAlum.setText("");
        JTFModApellidoAlum.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_JTFModApellidoAlumMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooserMod;
    private javax.swing.JButton JBBorrarDelA;
    private javax.swing.JButton JBCancelarDelA;
    private javax.swing.JButton JBGuardarModA;
    private javax.swing.JButton JBLimpiarModA;
    private javax.swing.JComboBox<Alumno> JComboDelAlum;
    private javax.swing.JComboBox<Alumno> JComboModAlum;
    private javax.swing.JTextField JTFDNIModAlum;
    private javax.swing.JTextField JTFModApellidoAlum;
    private javax.swing.JTextField JTFModNombreAlum;
    private javax.swing.JLabel jLTitulo2;
    private javax.swing.JLabel jLTitulo3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
