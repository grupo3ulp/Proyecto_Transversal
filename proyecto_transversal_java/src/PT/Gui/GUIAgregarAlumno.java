/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package PT.Gui;

import PT.Control.DataAlumno;
import PT.Modelo.Alumno;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author dante
 */
public class GUIAgregarAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUIAgregarAlumno
     */
    public GUIAgregarAlumno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLAnio = new javax.swing.JLabel();
        jTFNombreAlumno = new javax.swing.JTextField();
        jTFApellidoAlumno = new javax.swing.JTextField();
        jBCancelar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jLNombre1 = new javax.swing.JLabel();
        jTFDNIAlumno = new javax.swing.JTextField();
        jLAnio1 = new javax.swing.JLabel();
        dateChoser = new com.toedter.calendar.JDateChooser();
        jTFFechaAlumno = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(508, 391));

        jLTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLTitulo.setText("AGREGAR ALUMNO");

        jLNombre.setText("Nombre");

        jLAnio.setText("Apellido");

        jTFNombreAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreAlumnoActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jLNombre1.setText("DNI");

        jTFDNIAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDNIAlumnoActionPerformed(evt);
            }
        });

        jLAnio1.setText("Fecha");

        dateChoser.setDateFormatString("yyyy MM dd");
        dateChoser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateChoserPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLNombre1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBCancelar)
                        .addGap(53, 53, 53)
                        .addComponent(jBLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBGuardar))
                    .addComponent(jLAnio)
                    .addComponent(jLNombre)
                    .addComponent(jTFNombreAlumno)
                    .addComponent(jTFApellidoAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(jTFDNIAlumno)
                    .addComponent(jLAnio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateChoser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFFechaAlumno)))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLNombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFDNIAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLAnio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFApellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLAnio1)
                        .addGap(27, 27, 27)
                        .addComponent(dateChoser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTFFechaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jBLimpiar)
                    .addComponent(jBGuardar))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>                        

    private void jTFNombreAlumnoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        dispose();
    }                                          

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jTFNombreAlumno.setText("");
        jTFApellidoAlumno.setText("");
    }                                         

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int aux = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea guardar esta materia?");
        if (aux == 0) {
            Alumno a = new Alumno();
            a.setDni(jTFDNIAlumno.getText());
            a.setNombre(jTFNombreAlumno.getText());
            a.setApellido(jTFApellidoAlumno.getText());
            a.setFecha_nacimiento(LocalDate.of(dateChoser.getDate().getTime());
            

            DataAlumno DA = new DataAlumno();
            DA.createAlumno(a);

            jTFNombreAlumno.setText("");
            jTFApellidoAlumno.setText("");
            jBGuardar.setEnabled(false);
        } else if (aux == 1) {
            jTFNombreAlumno.setText("");
            jTFApellidoAlumno.setText("");
            jBGuardar.setEnabled(false);
        }
    }                                         

    private void jTFDNIAlumnoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void dateChoserPropertyChange(java.beans.PropertyChangeEvent evt) {                                          


    }                                         


    // Variables declaration - do not modify                     
    private com.toedter.calendar.JDateChooser dateChoser;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JLabel jLAnio;
    private javax.swing.JLabel jLAnio1;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNombre1;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JTextField jTFApellidoAlumno;
    private javax.swing.JTextField jTFDNIAlumno;
    private javax.swing.JTextField jTFFechaAlumno;
    private javax.swing.JTextField jTFNombreAlumno;
    // End of variables declaration                   
}
