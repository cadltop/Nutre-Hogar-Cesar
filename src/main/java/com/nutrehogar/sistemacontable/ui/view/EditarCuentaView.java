package com.nutrehogar.sistemacontable.ui.view;

import com.nutrehogar.sistemacontable.domain.model.Cuenta;
import com.nutrehogar.sistemacontable.domain.model.SubTipoCuenta;
import com.nutrehogar.sistemacontable.domain.repository.CuentaRepo;
import com.nutrehogar.sistemacontable.domain.repository.SubTipoCuentaRepo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditarCuentaView extends javax.swing.JFrame {
    private String cuentaId;
    private DefaultTableModel tblCuentaModel;
    private int selectedRow;
    private java.util.List<SubTipoCuenta> listaSubTipo = SubTipoCuentaRepo.findAll();

    public EditarCuentaView(String id, String nombre, String subTipoCuenta, DefaultTableModel tblCuenta, int row) {
        initComponents();
        
        this.cuentaId = id;
        this.tblCuentaModel = tblCuenta;
        this.selectedRow = row;
        
        estilizarBoton(btnGuardar, 120,50);
        estilizarBoton(btnCancelar, 120,50);
        
        this.getContentPane().setBackground(Color.decode("#F1F8FF"));
        // Prellenar los campos con los datos actuales
        txtNombre.setText(nombre);
        listaSubTipo.forEach(subTipo -> cboSubTipoCuenta.addItem(subTipo.getNombre()));
        cboSubTipoCuenta.setSelectedItem(subTipoCuenta); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        cboSubTipoCuenta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(241, 248, 255));

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cboSubTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Subtipo Cuenta");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("EDITAR CUENTA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(cboSubTipoCuenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24)))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboSubTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        editarCuenta();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    private void estilizarBoton(JButton boton, int ancho, int alto) {
        boton.setPreferredSize(new Dimension(ancho, alto));
        boton.setContentAreaFilled(false); 
        boton.setFocusPainted(false);      
        boton.setBorderPainted(false);    
        boton.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(Color.decode("#1E88E5")); 
                g2d.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 25, 25); 
                g2d.setColor(new Color(30, 144, 255)); 
                g2d.drawRoundRect(0, 0, c.getWidth() - 1, c.getHeight() - 1, 25, 25);
                g2d.dispose();
                super.paint(g, c);
            }
        });
    }
    private void editarCuenta() {
        // Validar datos
        String nombre = txtNombre.getText().trim();
        if (nombre.isBlank()) {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.");
            return;
        }

        try{
            int nu = Integer.parseInt(nombre);
            JOptionPane.showMessageDialog(this, "El nombre no puede ser un numero");
            return;
        } catch (NumberFormatException e){
            System.out.println("CuentaView.btnGuardarActionPerformed");
        }


        String subtipoSeleccionado = cboSubTipoCuenta.getSelectedItem().toString();
        SubTipoCuenta subTipoCuenta = listaSubTipo.stream()
            .filter(subTipo -> subTipo.getNombre().equals(subtipoSeleccionado))
            .findFirst()
            .orElse(null);

        if (subTipoCuenta == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un subtipo de cuenta válido.");
            return;
        }

        try {
            // Actualizar en la base de datos
            var cuenta = Cuenta.builder().id(cuentaId).nombre(nombre).subTipoCuenta(subTipoCuenta).build();
            CuentaRepo.update(cuenta);

            // Actualizar en la tabla
            tblCuentaModel.setValueAt(nombre, selectedRow, 1);
            tblCuentaModel.setValueAt(subTipoCuenta.getTipoCuenta().getNombre(), selectedRow, 2);
            tblCuentaModel.setValueAt(subtipoSeleccionado, selectedRow, 3);

            JOptionPane.showMessageDialog(this, "Cuenta actualizada correctamente.");
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar la cuenta: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cboSubTipoCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
