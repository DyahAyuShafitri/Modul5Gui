/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author Dyah Ayu Shafitri
 */
public class Latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan1
     */
    public Latihan1() {
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

        EditNama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EditKelas = new javax.swing.JTextField();
        EditAlamat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        HasilNama = new javax.swing.JTextField();
        HasilKelas = new javax.swing.JTextField();
        HasilAlamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        EditNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditNamaActionPerformed(evt);
            }
        });
        getContentPane().add(EditNama);
        EditNama.setBounds(108, 78, 100, 30);

        jLabel1.setText("Data Isian");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(162, 37, 80, 14);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 80, 60, 14);

        jLabel3.setText("Kelas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 120, 50, 14);

        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 160, 60, 14);
        getContentPane().add(EditKelas);
        EditKelas.setBounds(110, 120, 100, 30);
        getContentPane().add(EditAlamat);
        EditAlamat.setBounds(110, 160, 100, 30);

        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 200, 100, 23);

        jLabel5.setText("Nama");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 250, 50, 14);
        getContentPane().add(HasilNama);
        HasilNama.setBounds(110, 240, 100, 30);
        getContentPane().add(HasilKelas);
        HasilKelas.setBounds(110, 280, 100, 30);
        getContentPane().add(HasilAlamat);
        HasilAlamat.setBounds(110, 320, 100, 30);

        jLabel6.setText("Kelas");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 290, 60, 14);

        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 330, 60, 14);

        setSize(new java.awt.Dimension(416, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EditNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditNamaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nama = EditNama.getText();
        HasilNama.setText(nama);
        String kelas = EditKelas.getText();
        HasilKelas.setText(kelas);
        String alamat = EditAlamat.getText();
        HasilAlamat.setText(alamat);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EditAlamat;
    private javax.swing.JTextField EditKelas;
    private javax.swing.JTextField EditNama;
    private javax.swing.JTextField HasilAlamat;
    private javax.swing.JTextField HasilKelas;
    private javax.swing.JTextField HasilNama;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
