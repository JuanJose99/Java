/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto5ciclo2v3.vista;

import com.mycompany.reto5ciclo2v3.modelo.DAO.SegundaConsulta;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juan.rojas
 */
public class frmSegundoInforme extends javax.swing.JFrame {

    /**
     * Creates new form frmSegundoInforme
     */
    //-----------------codigo---------------
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    public frmSegundoInforme() {
        initComponents();
        
        modelo.addColumn("ID_PROYECTO");
        modelo.addColumn("Constructora");
        modelo.addColumn("Numero Habitaciones");
        modelo.addColumn("Ciudad");        
        tblDatos.setModel(modelo);
        
        SegundaConsulta segunda_consulta = new SegundaConsulta();
        
        segunda_consulta.segundaconsulta(modelo);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel1.setText("Segundo Informe: Proyectos Casa Campestre");

        tblDatos.setModel(modelo);
        jScrollPane1.setViewportView(tblDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}
