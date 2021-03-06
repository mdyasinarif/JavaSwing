/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutrial.mouseLisner;

/**
 *
 * @author Md Yasin Arif
 */
public class MouseEvent extends javax.swing.JFrame {

    /**
     * Creates new form MouseEvent
     */
    public MouseEvent() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        TextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        TextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField.setText("Touch Me");
        TextField.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TextFieldMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TextFieldMouseMoved(evt);
            }
        });
        TextField.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                TextFieldMouseWheelMoved(evt);
            }
        });
        TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextFieldMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TextFieldMouseReleased(evt);
            }
        });
        TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldActionPerformed

    private void TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldMouseClicked
       TextArea.append("Mouse Clicked \n");
    }//GEN-LAST:event_TextFieldMouseClicked

    private void TextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldMouseEntered
       TextArea.append("Mouse Entered\n");
    }//GEN-LAST:event_TextFieldMouseEntered

    private void TextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldMouseExited
     TextArea.append("Mouse Exited");
    }//GEN-LAST:event_TextFieldMouseExited

    private void TextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldMousePressed
        TextArea.append("Mouse Pressed");
    }//GEN-LAST:event_TextFieldMousePressed

    private void TextFieldMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldMouseReleased
       TextArea.append("Mouse Released");
    }//GEN-LAST:event_TextFieldMouseReleased

    private void TextFieldMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldMouseDragged
        TextArea.append("Mouse Dragged"+evt.getX()+" "+evt.getY());
    }//GEN-LAST:event_TextFieldMouseDragged

    private void TextFieldMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldMouseMoved
        TextArea.append("Mouse Moved"+evt.getX()+" "+evt.getY());
    }//GEN-LAST:event_TextFieldMouseMoved

    private void TextFieldMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_TextFieldMouseWheelMoved
         TextArea.append("Mouse Wheel Moved\n");
    }//GEN-LAST:event_TextFieldMouseWheelMoved

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
            java.util.logging.Logger.getLogger(MouseEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MouseEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MouseEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MouseEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MouseEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JTextField TextField;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
