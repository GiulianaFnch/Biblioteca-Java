/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestaohorsed;

/**
 *
 * @author giuli
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class fInserir extends javax.swing.JFrame {

    /**
     * Creates new form fInserir
     */
    public fInserir() {
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

        jLabel1 = new javax.swing.JLabel();
        txt_isbn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_autor = new javax.swing.JTextField();
        txt_paginas = new javax.swing.JTextField();
        txt_editora = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_tamanho = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Inserir livros");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        txt_isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_isbnActionPerformed(evt);
            }
        });
        getContentPane().add(txt_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 180, -1));

        jLabel2.setText("ISBN:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel3.setText("Título");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txt_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tituloActionPerformed(evt);
            }
        });
        getContentPane().add(txt_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 180, -1));

        jLabel4.setText("Autor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel5.setText("Nº de Páginas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel6.setText("Editora");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));
        getContentPane().add(txt_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 180, -1));
        getContentPane().add(txt_paginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 180, -1));

        txt_editora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_editoraActionPerformed(evt);
            }
        });
        getContentPane().add(txt_editora, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 180, -1));

        jLabel7.setText("Tamanho");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        txt_tamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tamanhoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tamanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 180, -1));

        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_isbnActionPerformed

    private void txt_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tituloActionPerformed

    private void txt_tamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tamanhoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PreparedStatement pstmt = null;
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/horsed", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(fInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (con != null) {
            //JOptionPane.showMessageDialog(null, "Ligação realizada com sucesso!");
            String isbn = this.txt_isbn.getText();
            String titulo = this.txt_titulo.getText();
            String autor = this.txt_autor.getText();
            int n_paginas = Integer.parseInt(this.txt_paginas.getText());
            String editora = this.txt_editora.getText();
            String tamanho = this.txt_tamanho.getText();

            String sql = "INSERT INTO livro(isbn, titulo, autor, n_paginas, editora, tamanho) VALUES (?, ?, ?, ?, ?, ?)";
            try {
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, isbn);
                pstmt.setString(2, titulo);
                pstmt.setString(3, autor);
                pstmt.setInt(4, n_paginas);
                pstmt.setString(5, editora);
                pstmt.setString(6, tamanho);
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Registo inserido com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao inserir o registo!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(fInserir.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (pstmt != null) {
                        pstmt.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ligação realizada sem sucesso!");
        }
        txt_isbn.setText("");
        txt_titulo.setText("");
        txt_autor.setText("");
        txt_paginas.setText("");
        txt_editora.setText("");
        txt_tamanho.setText("");


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       setVisible (false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_editoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_editoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_editoraActionPerformed

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
            java.util.logging.Logger.getLogger(fInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fInserir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JTextField txt_autor;
    public javax.swing.JTextField txt_editora;
    public javax.swing.JTextField txt_isbn;
    public javax.swing.JTextField txt_paginas;
    public javax.swing.JTextField txt_tamanho;
    public javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
