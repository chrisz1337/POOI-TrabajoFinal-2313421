/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import static Interfaces.CRUDVotantesAdmin.tabla;
import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Interfaces.CRUDVotantesSupervisor.*;
import Interfaces.CRUDVotantesAdmin.*;
import static Interfaces.CRUDVotantesAdmin.tabla;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTable;
import Interfaces.Grafico;



/**
 *
 * @author chris
 */
public class Recuento extends javax.swing.JFrame{
    private CRUDVotantesSupervisor supervisor;
    private CRUDVotantesAdmin admin;
    
    private JFrame framePadre;
    int xMouse, yMouse;

    /**
     * Creates new form Recuento
     */
    public Recuento(JFrame framePadre) {
        initComponents();
        this.framePadre = framePadre;
    }
    
    public Recuento(CRUDVotantesAdmin admin, CRUDVotantesSupervisor supervisor) {
        initComponents();
        this.admin = admin;
        this.supervisor = supervisor;    
    }
    public Recuento() {
        initComponents();
        
    }
    
    public JTable getTabla() {
        return tabla2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        btnGraf = new javax.swing.JPanel();
        jGraf = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JPanel();
        jActu = new javax.swing.JLabel();
        btnVolver = new javax.swing.JPanel();
        jVolver = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn1 = new javax.swing.JPanel();
        exitTxt1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Title.setText("Recuento de votos");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        tabla2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellido Paterno", "Apellido Materno", "Voto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla2.getTableHeader().setReorderingAllowed(false);
        tabla2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tabla2InputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tabla2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 750, 330));

        btnGraf.setBackground(new java.awt.Color(18, 90, 173));
        btnGraf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGraf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGrafMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGrafMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGrafMousePressed(evt);
            }
        });
        btnGraf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jGraf.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jGraf.setForeground(new java.awt.Color(255, 255, 255));
        jGraf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jGraf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/file-chart.png"))); // NOI18N
        jGraf.setText("Gráfico");
        jGraf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jGrafMousePressed(evt);
            }
        });
        btnGraf.add(jGraf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 30));

        jPanel1.add(btnGraf, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 140, 30));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setBackground(new java.awt.Color(204, 204, 204));
        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(18, 90, 173));
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnActualizarMousePressed(evt);
            }
        });
        btnActualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jActu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jActu.setForeground(new java.awt.Color(255, 255, 255));
        jActu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jActu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/book-open-page-variant.png"))); // NOI18N
        jActu.setText("Actualizar");
        jActu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jActuMousePressed(evt);
            }
        });
        btnActualizar.add(jActu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 30));

        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 130, 30));

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
        btnVolver.add(jVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 30));

        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 140, 30));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn1.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt1.setText("X");
        exitTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt1.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtn1Layout = new javax.swing.GroupLayout(exitBtn1);
        exitBtn1.setLayout(exitBtn1Layout);
        exitBtn1Layout.setHorizontalGroup(
            exitBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitBtn1Layout.setVerticalGroup(
            exitBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 788, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrafMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGrafMousePressed
            Grafico grafico = new Grafico();
            grafico.setVisible(true);
    }//GEN-LAST:event_btnGrafMousePressed

    private void btnGrafMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGrafMouseExited
        btnGraf.setBackground(new Color(0, 90, 200));
    }//GEN-LAST:event_btnGrafMouseExited

    private void btnGrafMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGrafMouseEntered
        btnGraf.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnGrafMouseEntered

    private void jGrafMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGrafMousePressed
            Grafico grafico = new Grafico();
            grafico.setVisible(true);
    }//GEN-LAST:event_jGrafMousePressed

    private void tabla2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tabla2InputMethodTextChanged
        //nothing
    }//GEN-LAST:event_tabla2InputMethodTextChanged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void jActuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jActuMousePressed

    }//GEN-LAST:event_jActuMousePressed

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
         btnActualizar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        btnActualizar.setBackground(new Color(0, 90, 200));
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMousePressed

        DefaultTableModel model = (DefaultTableModel) tabla2.getModel();

        // Eliminar todas las filas existentes
        model.setRowCount(0);

        // Agregar las nuevas filas
        
        Object[] datos1 = {"12345678", "Juan", "Pérez", "Gomez", "Fuerza Popular - Keiko Fujimori"};
        Object[] datos2 = {"87654321", "María", "López", "Garcia", "Avanza País - Hernando de Soto"};
        Object[] datos3 = {"27654321", "Lucia", "Paredes", "Celtic", "Avanza País - Hernando de Soto"};
        Object[] datos4 = {"47654321", "Jose", "Huni", "Londres", "Perú Libre - Pedro Castillo"};
        Object[] datos5 = {"57654321", "Pedro", "Quispe", "Guzman", "Avanza País - Hernando de Soto"};
        Object[] datos6 = {"67654321", "Aron", "Caceres", "Mata", "APRA - Alan Garcia"};
        Object[] datos7 = {"77056013", "Christian", "Rivera", "Morales", "Fuerza Popular - Keiko Fujimori"};

        model.addRow(datos1);
        model.addRow(datos2);
        model.addRow(datos3);
        model.addRow(datos4);
        model.addRow(datos5);
        model.addRow(datos6);
        model.addRow(datos7);
    }//GEN-LAST:event_btnActualizarMousePressed

    private void jVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVolverMousePressed
        if (framePadre instanceof Administrador) {
            Administrador admin = (Administrador) framePadre;
            admin.setVisible(true);
        } else if (framePadre instanceof Supervisor) {
            Supervisor supervisor = (Supervisor) framePadre;
            supervisor.setVisible(true);
        }

        this.dispose();
    }//GEN-LAST:event_jVolverMousePressed

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new Color(0, 90, 200));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMousePressed
        if (framePadre instanceof Administrador) {
            Administrador admin = (Administrador) framePadre;
            admin.setVisible(true);
        } else if (framePadre instanceof Supervisor) {
            Supervisor supervisor = (Supervisor) framePadre;
            supervisor.setVisible(true);
        }

        this.dispose();
    }//GEN-LAST:event_btnVolverMousePressed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt1MouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxt1MouseExited

    private void exitTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt1MouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxt1MouseEntered

    private void exitTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxt1MouseClicked

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
            java.util.logging.Logger.getLogger(Recuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            Recuento recuento = new Recuento();
            recuento.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JPanel btnActualizar;
    private javax.swing.JPanel btnGraf;
    private javax.swing.JPanel btnVolver;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JPanel exitBtn1;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel exitTxt1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jActu;
    private javax.swing.JLabel jGraf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jVolver;
    public static javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
