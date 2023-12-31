/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;


import static Interfaces.CRUDVotantesAdmin.tabla;
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
import javax.swing.table.TableRowSorter;

/**
 *
 * @author chris
 */
public class CRUDVotantesSupervisor extends javax.swing.JFrame {
    int xMouse, yMouse;
    
    public JTable getTabla() {
        return tabla1;
    }
    /**
     * Creates new form CRUDVotantes
     */
    public CRUDVotantesSupervisor() {
        initComponents();
        
        Object[] datos1 = {"77056013", "Christian", "Rivera", "Morales", "Lima", "Av. Principal", "962625185"};
        Object[] datos2 = {"12345678", "Juan", "Pérez", "Gómez", "Lima", "Calle 123", "987654321"};
        Object[] datos3 = {"87654321", "María", "López", "García", "Arequipa", "Av. Principal", "123456789"};
        Object[] datos4 = {"27654321", "Lucia", "Paredes", "Celtic", "Cuzco", "Av. Siempre Viva", "987754321"};
        Object[] datos5 = {"47654321", "Jose", "Huni", "Londres", "Apurimac", "Calle Jose", "988654321"};
        Object[] datos6 = {"57654321", "Pedro", "Quispe", "Guzman", "Tacna", "Jiron Chile", "345128746"};
        Object[] datos7 = {"67654321", "Aron", "Caceres", "Mata", "Cajamarca", "Av. Belaunde", "238509817"};

        DefaultTableModel model = (DefaultTableModel) tabla1.getModel();
        model.addRow(datos1);
        model.addRow(datos2);
        model.addRow(datos3);
        model.addRow(datos4);
        model.addRow(datos5);
        model.addRow(datos6);
        model.addRow(datos7);
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
        btnAdd = new javax.swing.JPanel();
        jAdd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        btnVolver = new javax.swing.JPanel();
        jVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        btnAdd.add(jAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        tabla1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre", "Apellido P.", "Apellido M.", "Departamento", "Domicilio", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla1.getTableHeader().setReorderingAllowed(false);
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

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
        btnVolver.add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title)
                    .addComponent(BuscarUs, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(BuscarUs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarUsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarUsMousePressed
    }//GEN-LAST:event_BuscarUsMousePressed

    private void BuscarUsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarUsMouseReleased
        //nothing
    }//GEN-LAST:event_BuscarUsMouseReleased

    private void jAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAddMousePressed

    }//GEN-LAST:event_jAddMousePressed

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        btnAdd.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        btnAdd.setBackground(new Color(18, 90, 173));
    }//GEN-LAST:event_btnAddMouseExited

    private void btnAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMousePressed
        AddEdit add = new AddEdit(null, this);
        add.setVisible(true);
        add.pack();
        add.setLocationRelativeTo(null);
        add.setDefaultCloseOperation(AddEdit.DISPOSE_ON_CLOSE);
        
        add.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
            // Enfoca el JFrame principal
            CRUDVotantesSupervisor.this.toFront();
        }
    });
    }//GEN-LAST:event_btnAddMousePressed

    private void tabla1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MousePressed
 
    }//GEN-LAST:event_tabla1MousePressed

    private void jVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVolverMousePressed
        Supervisor superv = new Supervisor();
        superv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jVolverMousePressed

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new Color(18, 90, 173));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMousePressed
        Supervisor superv = new Supervisor();
        superv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverMousePressed

    private void BuscarUsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarUsKeyReleased
        DefaultTableModel model = (DefaultTableModel)tabla1.getModel();
        TableRowSorter<DefaultTableModel> model1 = new TableRowSorter<>(model);
        tabla1.setRowSorter(model1);
        model1.setRowFilter(RowFilter.regexFilter(BuscarUs.getText()));
    }//GEN-LAST:event_BuscarUsKeyReleased
                           
public void Agregar1(Object[] dataRow) {
    DefaultTableModel model = (DefaultTableModel) tabla1.getModel();
    
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
            java.util.logging.Logger.getLogger(CRUDVotantesSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDVotantesSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDVotantesSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDVotantesSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDVotantesSupervisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarUs;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel btnAdd;
    private javax.swing.JPanel btnVolver;
    private javax.swing.JLabel jAdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jVolver;
    public static javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
