/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author Dyah Ayu Shafitri
 */
public class Latihan4 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan4
     */
    public Latihan4() {
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
        jTextArea1 = new javax.swing.JTextArea();
        btnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        rdb1 = new javax.swing.JRadioButton();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        btnsubmit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rdb2 = new javax.swing.JRadioButton();
        btnexit = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Nama");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(67, 36, 60, 14);

        jLabel2.setText("Absen");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(67, 80, 60, 14);

        jLabel3.setText("Biodata Siswa");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(171, 11, 130, 14);

        jLabel4.setText("Jurusan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 130, 80, 14);

        jLabel5.setText("Hobi");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(67, 173, 60, 14);
        getContentPane().add(Nama);
        Nama.setBounds(171, 33, 110, 30);
        getContentPane().add(Absen);
        Absen.setBounds(171, 77, 110, 30);

        btnGroup.add(rdb1);
        rdb1.setText("RPL");
        getContentPane().add(rdb1);
        rdb1.setBounds(160, 130, 90, 23);

        cb1.setText("Programing");
        getContentPane().add(cb1);
        cb1.setBounds(171, 164, 100, 23);

        cb2.setText("Animator");
        getContentPane().add(cb2);
        cb2.setBounds(171, 189, 100, 23);

        cb3.setText("Teknisi");
        getContentPane().add(cb3);
        cb3.setBounds(282, 164, 80, 23);

        cb4.setText("Designer");
        getContentPane().add(cb4);
        cb4.setBounds(282, 189, 80, 23);

        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnsubmit);
        btnsubmit.setBounds(100, 230, 90, 23);

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus);
        btnhapus.setBounds(200, 230, 80, 23);

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane2.setViewportView(hasil);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 290, 317, 80);

        jLabel6.setText("Hasil");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 260, 60, 14);

        jPanel1.setBackground(new java.awt.Color(102, 204, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 51));
        jPanel1.setLayout(null);

        btnGroup.add(rdb2);
        rdb2.setText("TKJ");
        rdb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb2ActionPerformed(evt);
            }
        });
        jPanel1.add(rdb2);
        rdb2.setBounds(260, 140, 93, 23);

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit);
        btnexit.setBounds(300, 240, 80, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 410, 400);

        setSize(new java.awt.Dimension(416, 426));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
        String nama= Nama.getText();
        String absen = Absen.getText();
        String jurusan;
        String hobi="";
        //untuk rd
        if (rdb1.isSelected())
            jurusan="RPL";
        else if(rdb2.isSelected())
            jurusan="TKJ";
        else 
            jurusan=" ";
        //untuk checkbox
        if(cb1.isSelected())
            hobi+=cb1.getText()+", ";
        if(cb2.isSelected())
            hobi+=cb2.getText()+", ";
        if(cb3.isSelected())
            hobi+=cb3.getText()+", ";
        if(cb4.isSelected())
            hobi+=cb4.getText()+", ";
        hasil.setText("Nama siswa : "+nama+"\nAbsen siswa : "+absen+
                "\nJurusan anda : "+jurusan+
                "\nHobi anda : "+hobi);
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        hasil.setText("");
        Nama.setText("");
        Absen.setText("");
        btnGroup.clearSelection();
        cb1.setSelected(false);
        cb2.setSelected(false);
        cb3.setSelected(false);
        cb4.setSelected(false);
    }//GEN-LAST:event_btnhapusActionPerformed

    private void rdb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb2ActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        dispose();
// TODO add your handling code here:
        
    }//GEN-LAST:event_btnexitActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JTextField Nama;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JTextArea hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton rdb1;
    private javax.swing.JRadioButton rdb2;
    // End of variables declaration//GEN-END:variables
}
