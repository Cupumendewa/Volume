/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Frame2 extends javax.swing.JFrame {

    /**
     * Creates new form Frame2
     */
    public Frame2(String nama, String absen, String kelas, String jurusan, String alamat) {
        initComponents();
        
        Hasil1.setText(nama);
        Hasil2.setText(absen);
        Hasil3.setText(kelas);
        Hasil4.setText(jurusan);
        Hasil5.setText(alamat);
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
        Hasil5 = new javax.swing.JLabel();
        Hasil4 = new javax.swing.JLabel();
        Hasil3 = new javax.swing.JLabel();
        Hasil2 = new javax.swing.JLabel();
        Hasil1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Hasil Biodata");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(229, 22, 70, 20);

        Hasil5.setText("Hasil 5");
        getContentPane().add(Hasil5);
        Hasil5.setBounds(100, 280, 340, 60);

        Hasil4.setText("Hasil 4");
        getContentPane().add(Hasil4);
        Hasil4.setBounds(100, 230, 360, 50);

        Hasil3.setText("Hasil 3");
        getContentPane().add(Hasil3);
        Hasil3.setBounds(100, 180, 360, 50);

        Hasil2.setText("Hasil 2");
        getContentPane().add(Hasil2);
        Hasil2.setBounds(100, 130, 330, 50);

        Hasil1.setText("Hasil 1");
        getContentPane().add(Hasil1);
        Hasil1.setBounds(100, 80, 370, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Foto\\Background\\android-boot-logo_634639.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-30, 0, 590, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hasil1;
    private javax.swing.JLabel Hasil2;
    private javax.swing.JLabel Hasil3;
    private javax.swing.JLabel Hasil4;
    private javax.swing.JLabel Hasil5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
