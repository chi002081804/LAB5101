package view;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author OKC
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        view.FormPanel formPanel = new view.FormPanel(bottomPanel);
        this.bottomPanel.add(formPanel);
        CardLayout layout = (CardLayout) this.bottomPanel.getLayout();
        layout.next(bottomPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        topPanel = new javax.swing.JPanel();
        form = new javax.swing.JButton();
        view = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(442, 609));

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setMaximumSize(new java.awt.Dimension(442, 609));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(442, 609));

        topPanel.setMaximumSize(new java.awt.Dimension(442, 609));
        topPanel.setPreferredSize(new java.awt.Dimension(442, 609));

        form.setText("Form");
        form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formActionPerformed(evt);
            }
        });

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view)
                    .addComponent(form))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(topPanel);

        bottomPanel.setMaximumSize(new java.awt.Dimension(442, 609));
        bottomPanel.setPreferredSize(new java.awt.Dimension(442, 609));
        bottomPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(bottomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        view.ViewPanel viewPanel = new view.ViewPanel();
        this.bottomPanel.add(viewPanel);
        CardLayout layout = (CardLayout) this.bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_viewActionPerformed

    private void formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formActionPerformed
        // TODO add your handling code here:
        view.FormPanel formPanel = new view.FormPanel(bottomPanel);
        this.bottomPanel.add(formPanel);
        CardLayout layout = (CardLayout) this.bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_formActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JButton form;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}

