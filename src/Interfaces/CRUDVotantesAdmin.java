/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import static java.awt.AWTEventMulticaster.add;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author chris
 */
public class CRUDVotantesAdmin extends javax.swing.JFrame{

    int xMouse, yMouse;

    /**
     * Creates new form CRUDVotantes
     */
    public CRUDVotantesAdmin() {
        initComponents();
        
        Object[] datos1 = {"12345678", "Juan", "Pérez", "Gómez", "Lima", "Calle 123", "987654321"};
        Object[] datos2 = {"87654321", "María", "López", "García", "Arequipa", "Av. Principal", "123456789"};
        Object[] datos3 = {"27654321", "Lucia", "Paredes", "Celtic", "Cuzco", "Av. Siempre Viva", "987754321"};
        Object[] datos4 = {"47654321", "Jose", "Huni", "Londres", "Apurimac", "Calle Jose", "988654321"};
        Object[] datos5 = {"57654321", "Pedro", "Quispe", "Guzman", "Tacna", "Jiron Chile", "345128746"};
        Object[] datos6 = {"67654321", "Aron", "Caceres", "Mata", "Cajamarca", "Av. Belaunde", "238509817"};

        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.addRow(datos1);
        model.addRow(datos2);
        model.addRow(datos3);
        model.addRow(datos4);
        model.addRow(datos5);
        model.addRow(datos6);
        
    }
    public JTable getTabla() {
        return tabla;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        BuscarUs = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JPanel();
        jBorrar = new javax.swing.JLabel();
        btnAdd = new javax.swing.JPanel();
        jAdd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnVolver = new javax.swing.JPanel();
        jVolver = new javax.swing.JLabel();
        btnEdit = new javax.swing.JPanel();
        jEdit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        Title.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Title.setText("Tabla de datos");

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));

        BuscarUs.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        BuscarUs.setForeground(new java.awt.Color(102, 102, 102));
        BuscarUs.setBorder(null);
        BuscarUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BuscarUsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BuscarUsMouseReleased(evt);
            }
        });
        BuscarUs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarUsKeyReleased(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(18, 90, 173));
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBorrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBorrarMousePressed(evt);
            }
        });
        btnBorrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBorrar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jBorrar.setForeground(new java.awt.Color(255, 255, 255));
        jBorrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/book-open-page-variant.png"))); // NOI18N
        jBorrar.setText("Eliminar");
        btnBorrar.add(jBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, -1));

        btnAdd.setBackground(new java.awt.Color(18, 90, 173));
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddMousePressed(evt);
            }
        });
        btnAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jAdd.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jAdd.setForeground(new java.awt.Color(255, 255, 255));
        jAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendar-plus.png"))); // NOI18N
        jAdd.setText("Nuevo");
        jAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jAddMousePressed(evt);
            }
        });
        btnAdd.add(jAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, -1));

        tabla.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Apellido P.", "Apellido M.", "Departamento", "Domicilio", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        btnVolver.setBackground(new java.awt.Color(18, 90, 173));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVolverMousePressed(evt);
            }
        });
        btnVolver.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jVolver.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jVolver.setForeground(new java.awt.Color(255, 255, 255));
        jVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home-outline.png"))); // NOI18N
        jVolver.setText("Volver");
        jVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jVolverMousePressed(evt);
            }
        });
        btnVolver.add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        btnEdit.setBackground(new java.awt.Color(18, 90, 173));
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditMousePressed(evt);
            }
        });
        btnEdit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEdit.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jEdit.setForeground(new java.awt.Color(255, 255, 255));
        jEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendar-multiple-check.png"))); // NOI18N
        jEdit.setText("Editar");
        btnEdit.add(jEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title)
                    .addComponent(BuscarUs, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(BuscarUs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarUsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarUsMousePressed
    }//GEN-LAST:event_BuscarUsMousePressed

    private void BuscarUsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarUsMouseReleased
        //nothing
    }//GEN-LAST:event_BuscarUsMouseReleased

    private void btnBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseEntered
        btnBorrar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnBorrarMouseEntered

    private void btnBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseExited
        btnBorrar.setBackground(new Color(18, 90, 173));
    }//GEN-LAST:event_btnBorrarMouseExited

    private void btnBorrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMousePressed
    DefaultTableModel model = (DefaultTableModel) tabla.getModel();

    try {
        int selected = tabla.getSelectedRow();

        if (selected != -1) {
            int confirmDialogResult = JOptionPane.showConfirmDialog(
                    this,
                    "¿Estás seguro de que quieres eliminar esta fila?",
                    "Confirmar Eliminación",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirmDialogResult == JOptionPane.YES_OPTION) {
                // Eliminar la fila si el usuario hace clic en "Sí"
                model.removeRow(selected);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para eliminar.");
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
    }//GEN-LAST:event_btnBorrarMousePressed

    private void jAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAddMousePressed

    }//GEN-LAST:event_jAddMousePressed

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        btnAdd.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        btnAdd.setBackground(new Color(18, 90, 173));
    }//GEN-LAST:event_btnAddMouseExited

    private void btnAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMousePressed
    AddEdit add = new AddEdit(this, null);
    add.setVisible(true);
    add.pack();
    add.setLocationRelativeTo(null);
    add.setDefaultCloseOperation(AddEdit.DISPOSE_ON_CLOSE);

    add.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
            // Enfoca el JFrame principal
            CRUDVotantesAdmin.this.toFront();
        }
    });
    }//GEN-LAST:event_btnAddMousePressed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
 
    }//GEN-LAST:event_tablaMousePressed

    private void jVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVolverMousePressed
        Administrador admin = new Administrador();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jVolverMousePressed

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new Color(18, 90, 173));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMousePressed
        Administrador admin = new Administrador();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverMousePressed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

    }//GEN-LAST:event_tablaMouseClicked

    private void BuscarUsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarUsKeyReleased
        DefaultTableModel model = (DefaultTableModel)tabla.getModel();
        TableRowSorter<DefaultTableModel> model1 = new TableRowSorter<>(model);
        tabla.setRowSorter(model1);
        model1.setRowFilter(RowFilter.regexFilter(BuscarUs.getText()));
        
    }//GEN-LAST:event_BuscarUsKeyReleased

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        btnEdit.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        btnEdit.setBackground(new Color(18, 90, 173));
    }//GEN-LAST:event_btnEditMouseExited

    private void btnEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMousePressed
        AddEdit1 edit = new AddEdit1(this);
        edit.setVisible(true);
        edit.pack();
        edit.setLocationRelativeTo(null);
        edit.setDefaultCloseOperation(AddEdit.DISPOSE_ON_CLOSE);
        
        edit.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
            // Enfoca el JFrame principal
            CRUDVotantesAdmin.this.toFront();
        }
    });
        
        TableModel model = tabla.getModel();
        int selected = tabla.getSelectedRow();
        
        if(selected == -1){
            JOptionPane.showMessageDialog(null, "No se ha seleccionado nada");
        } else {
            
            String tblDNI = model.getValueAt(selected,0).toString();
            String tblNom = model.getValueAt(selected,1).toString();
            String tblPat = model.getValueAt(selected,2).toString();
            String tblMat = model.getValueAt(selected,3).toString();
            String tblDep = model.getValueAt(selected,4).toString();
            String tblDom = model.getValueAt(selected,5).toString();
            String tblTel = model.getValueAt(selected,6).toString();
            
            edit.txtDNI.setText(tblDNI);
            edit.txtNom.setText(tblNom);
            edit.txtPat.setText(tblPat);
            edit.txtMat.setText(tblMat);
            edit.txtDep.setText(tblDep);
            edit.txtDom.setText(tblDom);
            edit.txtTel.setText(tblTel);
            
        }
    }//GEN-LAST:event_btnEditMousePressed
                           
public void Agregar(Object[] dataRow) {
    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
    
    // Verificar si la fila ya existe antes de agregarla
    if (!existeFila(model, dataRow)) {
        model.addRow(dataRow);
    } else {
        JOptionPane.showMessageDialog(this, "Los datos ya existen en la tabla.");
    }
}                             

private boolean existeFila(DefaultTableModel model, Object[] rowData) {
    for (int i = 0; i < model.getRowCount(); i++) {
        boolean igual = true;
        for (int j = 0; j < model.getColumnCount(); j++) {
            Object valorTabla = model.getValueAt(i, j);
            Object valorNuevo = rowData[j];
            if (valorTabla == null && valorNuevo != null || !valorTabla.equals(valorNuevo)) {
                igual = false;
                break;
            }
        }
        if (igual) {
            // Ya existe una fila idéntica
            return true;
        }
    }
    return false;
}
    
    public void actualizarFila(int rowIndex, String nuevoDNI, String nuevoNom, String nuevoPat,
                               String nuevoMat, String nuevoDep, String nuevoDom, String nuevoTel) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();

        model.setValueAt(nuevoDNI, rowIndex, 0);
        model.setValueAt(nuevoNom, rowIndex, 1);
        model.setValueAt(nuevoPat, rowIndex, 2);
        model.setValueAt(nuevoMat, rowIndex, 3);
        model.setValueAt(nuevoDep, rowIndex, 4);
        model.setValueAt(nuevoDom, rowIndex, 5);
        model.setValueAt(nuevoTel, rowIndex, 6);
    }
    
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
            java.util.logging.Logger.getLogger(CRUDVotantesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDVotantesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDVotantesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDVotantesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDVotantesAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarUs;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel btnAdd;
    private javax.swing.JPanel btnBorrar;
    private javax.swing.JPanel btnEdit;
    private javax.swing.JPanel btnVolver;
    private javax.swing.JLabel jAdd;
    private javax.swing.JLabel jBorrar;
    private javax.swing.JLabel jEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jVolver;
    public static javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
