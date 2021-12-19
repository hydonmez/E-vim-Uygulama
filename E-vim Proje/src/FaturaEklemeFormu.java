
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import jdk.internal.org.jline.reader.Editor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hydon
 */ 
public final class FaturaEklemeFormu extends javax.swing.JFrame {

    public FaturaEklemeFormu() 
    {
        initComponents();
        SonKayitNoGetir();
        FormunIconunuAyarla();
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dc_faturaOdemeTarihi.getDateEditor();
        editor.setEnabled(false);//tarih kutusuna veri girişi engellenir
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) dc_faturaTarihi.getDateEditor();
        editor1.setEnabled(false);
        txt_faturaDekont.setEditable(false);//dekont textinin inputtu engeller       
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbx_faturaTuru = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dc_faturaOdemeTarihi = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        dc_faturaTarihi = new com.toedter.calendar.JDateChooser();
        BtnFaturaEkle = new javax.swing.JButton();
        txt_faturaNo = new javax.swing.JTextField();
        txt_faturaMiktari = new javax.swing.JTextField();
        txt_faturaDekont = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fatura Ekleme Formu");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(116, 212, 192));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Fatura Kayit No:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Fatura Turu:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 85, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Fatura Tarihi:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Fatura Odeme Tarihi:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        cmbx_faturaTuru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elektrik", "Telefon", "Su", "Dogal Gaz", "Digerleri" }));
        jPanel1.add(cmbx_faturaTuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 32, 132, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Fatura Miktari:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        dc_faturaOdemeTarihi.setBackground(new java.awt.Color(116, 212, 192));
        jPanel1.add(dc_faturaOdemeTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 132, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Fatura Ait Dekont:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        dc_faturaTarihi.setBackground(new java.awt.Color(116, 212, 192));
        jPanel1.add(dc_faturaTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 60, 132, -1));

        BtnFaturaEkle.setBackground(new java.awt.Color(255, 216, 166));
        BtnFaturaEkle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnFaturaEkle.setText("Fatura Ekle");
        BtnFaturaEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFaturaEkleActionPerformed(evt);
            }
        });
        jPanel1.add(BtnFaturaEkle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 132, 30));

        txt_faturaNo.setText("1");
        jPanel1.add(txt_faturaNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 6, 132, -1));

        txt_faturaMiktari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_faturaMiktariKeyTyped(evt);
            }
        });
        jPanel1.add(txt_faturaMiktari, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 132, -1));

        txt_faturaDekont.setToolTipText("");
        txt_faturaDekont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_faturaDekontMouseClicked(evt);
            }
        });
        jPanel1.add(txt_faturaDekont, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFaturaEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFaturaEkleActionPerformed
        
        
        try
        {
            //textin içi boş ise ve tarih seçili değilse ekrana yaz
            if(txt_faturaDekont.getText().isEmpty()||txt_faturaMiktari.getText().isEmpty()||txt_faturaNo.getText().isEmpty()||
               dc_faturaTarihi.getDate()==null||dc_faturaOdemeTarihi.getDate()==null)
            {
                JOptionPane.showMessageDialog(null,"Boş Geçilmez");
            }
            else
            {
                Fatura fatura=new Fatura();//fatura nesnesi olusturulur
                FaturaIslemleri faturaIslemleri=new FaturaIslemleri();//fatura islemleri nesnesi olusturur
                fatura.setFatura_KayitNo(Integer.parseInt(txt_faturaNo.getText()));
                fatura.setFatura_Turu(cmbx_faturaTuru.getSelectedItem().toString());
                fatura.setFatura_Miktari(Integer.parseInt(txt_faturaMiktari.getText()));
                fatura.setFatura_Dekont((txt_faturaDekont.getText().replace("\\", "/")));//java tersslahi kacis ifadesi olarak kullaniyor veritabanina eklemiyor o yuzden degisiriyoruz
                fatura.setFatura_OdemeTarihi(TarihDonustur(dc_faturaOdemeTarihi.getDate()));//tarih TarihDonustur fonksiyonunda uygun formata donusturulur
                fatura.setFatura_Tarihi(TarihDonustur(dc_faturaTarihi.getDate()));
                faturaIslemleri.FatureEkle(fatura);//fatura islemleri sınfındaki faturaEkleme kısmına fatura gonderilerek Kayit edilir

                SonKayitNoGetir();//en son kayitnosunu bulup bir artiriyor elle giriste olusacak hataları engellemek icin

                JOptionPane.showMessageDialog(null, "Kaydınız Başarıyla Tamamlanmıştır");
                Temizle();//fatura ekleme formun temizleniyor
            }
        }
          catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, "Fatura Ekleme İşlemi Gerçekleştirilemedi! ");
        }
        
        
        
    }//GEN-LAST:event_BtnFaturaEkleActionPerformed

    private void txt_faturaMiktariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_faturaMiktariKeyTyped
     
        //sadece sayı girmeye izin verilir
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE))) 
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_faturaMiktariKeyTyped

    private void txt_faturaDekontMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_faturaDekontMouseClicked

        //fatura dekontunun yolu alinir
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "png", "gif");//Fitreliyoruz
        fileChooser.setFileFilter(filter);
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));//Gecerli projenin dosya yolu
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) 
        {
            File selectedFile = fileChooser.getSelectedFile();
            try 
            {
                txt_faturaDekont.setText(selectedFile.getCanonicalPath());
            } 
            catch (IOException ex) 
            {
                 JOptionPane.showMessageDialog(null, "Dekont Seçme  İşlemi Gerçekleştirilemedi! ");
                Logger.getLogger(FaturaEklemeFormu.class.getName()).log(Level.SEVERE, null, ex);// loglama islemininde ornegi olsun diye loglama yapildi
            }
        }
    }//GEN-LAST:event_txt_faturaDekontMouseClicked

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
            java.util.logging.Logger.getLogger(FaturaEklemeFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaturaEklemeFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaturaEklemeFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaturaEklemeFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new FaturaEklemeFormu().setVisible(true);

            }
        });
    }

    private void Temizle() 
    {
        txt_faturaDekont.setText("");
        txt_faturaMiktari.setText("");
        cmbx_faturaTuru.setSelectedIndex(0);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dc_faturaOdemeTarihi.getDateEditor();
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) dc_faturaTarihi.getDateEditor();
        editor1.setText("");
        editor.setText("");
    }
    
   private void SonKayitNoGetir() 
    {
        try 
        {
            VeritabaniBaglanti baglanti = new VeritabaniBaglanti();
            ResultSet res = baglanti.FaturaSonKayit();
            while (res.next()) 
            {
                txt_faturaNo.setText(String.valueOf(res.getInt("Fatura_KayitNo") + 1));//en son kayitnosunu bulup bir artiriyor
            }
        } 
        catch (SQLException e) 
        {
          JOptionPane.showMessageDialog(null, "Son Kayit Getirilemedi Lütfen Yöneticinize Başvurun.");

        }
        txt_faturaNo.setEnabled(false);
    }

    private void FormunIconunuAyarla() 
    {
        Image Evim = new ImageIcon(FaturaEklemeFormu.class.getResource("Evim.jpg")).getImage();//resmi çektik burada classin ismi yazılacak burada ilk ilgili class için 
        setIconImage(Evim);
    }
    
    private String TarihDonustur(Date tarih)
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");//tarih formatını veritabanına eklemek için gerekli kodlar
        String faturaTarihi = format.format(tarih);
        return faturaTarihi;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFaturaEkle;
    private javax.swing.JComboBox<String> cmbx_faturaTuru;
    private com.toedter.calendar.JDateChooser dc_faturaOdemeTarihi;
    private com.toedter.calendar.JDateChooser dc_faturaTarihi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_faturaDekont;
    private javax.swing.JTextField txt_faturaMiktari;
    private javax.swing.JTextField txt_faturaNo;
    // End of variables declaration//GEN-END:variables
   
}
