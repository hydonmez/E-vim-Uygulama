
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hydon
 */
public class FaturaIslemleriFormu extends javax.swing.JFrame {
    
    public FaturaIslemleriFormu() 
    {
        initComponents();
        FormunIconunuAyarla();
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
        BtnYeniFaturaEkle = new javax.swing.JButton();
        BtnYeniFaturaDuzenle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fatura İslemleri Formu");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(116, 212, 192));

        BtnYeniFaturaEkle.setBackground(new java.awt.Color(255, 216, 166));
        BtnYeniFaturaEkle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnYeniFaturaEkle.setText("Yeni Fatura Ekle");
        BtnYeniFaturaEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnYeniFaturaEkleActionPerformed(evt);
            }
        });

        BtnYeniFaturaDuzenle.setBackground(new java.awt.Color(255, 216, 166));
        BtnYeniFaturaDuzenle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnYeniFaturaDuzenle.setText("Fatura Duzenle");
        BtnYeniFaturaDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnYeniFaturaDuzenleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnYeniFaturaEkle)
                    .addComponent(BtnYeniFaturaDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnYeniFaturaEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnYeniFaturaDuzenle)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnYeniFaturaEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnYeniFaturaEkleActionPerformed
 
        FaturaEklemeFormu faturaEklemeFormu = new FaturaEklemeFormu();
        faturaEklemeFormu.setVisible(true);
       
    }//GEN-LAST:event_BtnYeniFaturaEkleActionPerformed

    private void BtnYeniFaturaDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnYeniFaturaDuzenleActionPerformed
      
        FaturaDuzenlemeFormu faturaDuzenlemeFormu = new FaturaDuzenlemeFormu();
        faturaDuzenlemeFormu.setVisible(true);
       
    }//GEN-LAST:event_BtnYeniFaturaDuzenleActionPerformed

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
            java.util.logging.Logger.getLogger(FaturaIslemleriFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaturaIslemleriFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaturaIslemleriFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaturaIslemleriFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new FaturaIslemleriFormu().setVisible(true);
            }
        });
    }
    
    void FormunIconunuAyarla() 
    {
        Image Evim = new ImageIcon(FaturaIslemleriFormu.class.getResource("Evim.jpg")).getImage();//resmi çektik burada classin ismi yazılacak burada ilk ilgili class için 
        setIconImage(Evim);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnYeniFaturaDuzenle;
    private javax.swing.JButton BtnYeniFaturaEkle;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
