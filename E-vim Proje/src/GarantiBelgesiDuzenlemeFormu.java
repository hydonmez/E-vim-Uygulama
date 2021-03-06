
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hydon
 */
public class GarantiBelgesiDuzenlemeFormu extends javax.swing.JFrame {

    private static DefaultTableModel GarantiBelgesiModel = new DefaultTableModel();
    private static Object[] garantiBelgesiSutun = {"Garanti Belge No", "Urunun Turu", "Urunun Markasi", "Urunun Modeli", "Urunun Adi", "Urunun Seri Numarasi",
        "Urunun Garanti Bitis Tarihi", "Urunun Faturasi"};//sutunlarimizi ismini yazmak icin bir object olusturuyoruz

    static Object[] garantiBelgesiSatir = new Object[8];
    GarantiBelgesiIslemleri garantiBelgesiIslemleri = new GarantiBelgesiIslemleri();
    GarantiBelgesi garantiBelgesi = new GarantiBelgesi();

    public GarantiBelgesiDuzenlemeFormu() {
        initComponents();
        ListeGuncelle();
        FormunIconunuAyarla();
        dc_garantiBitisTarihi.getDateEditor().setEnabled(false);
        txt_fatura.setEditable(false);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_belgeNo = new javax.swing.JTextField();
        cmbx_urunTuru = new javax.swing.JComboBox<>();
        txt_marka = new javax.swing.JTextField();
        txt_model = new javax.swing.JTextField();
        txt_urunAdi = new javax.swing.JTextField();
        txt_seriNo = new javax.swing.JTextField();
        dc_garantiBitisTarihi = new com.toedter.calendar.JDateChooser();
        txt_fatura = new javax.swing.JTextField();
        BtnListele = new javax.swing.JButton();
        BtnSil = new javax.swing.JButton();
        BtnGuncelle = new javax.swing.JButton();
        BtnTemizle = new javax.swing.JButton();
        PanelMevcutOlanBelge = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        BtnGoster = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Garanti Belgesi Duzenleme Formu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(116, 212, 192));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Garanti Belge No:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Urunun Turu:");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Urunun Markasi:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Urunun Modeli:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 110, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Urunun Adi:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Urunun Seri No:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 120, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Garanti Bitis Tarihi");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 10));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Urunun Faturasi");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 120, -1));
        jPanel1.add(txt_belgeNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 140, -1));

        cmbx_urunTuru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Telefon", "Bilgisayar", "Bilgisayar Birimleri", "Televizyon", "Beyaz Esya", "Ev Aletleri", "Mobilya", "Aksesuar", "Diger" }));
        jPanel1.add(cmbx_urunTuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 140, -1));
        jPanel1.add(txt_marka, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 140, -1));
        jPanel1.add(txt_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 140, -1));
        jPanel1.add(txt_urunAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 140, -1));
        jPanel1.add(txt_seriNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 140, -1));
        jPanel1.add(dc_garantiBitisTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 140, -1));

        txt_fatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_faturaMouseClicked(evt);
            }
        });
        jPanel1.add(txt_fatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 140, -1));

        BtnListele.setBackground(new java.awt.Color(255, 216, 166));
        BtnListele.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnListele.setText("Garanti Belgesini Listele");
        BtnListele.setMaximumSize(new java.awt.Dimension(187, 23));
        BtnListele.setMinimumSize(new java.awt.Dimension(187, 23));
        BtnListele.setPreferredSize(new java.awt.Dimension(187, 23));
        BtnListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListeleActionPerformed(evt);
            }
        });
        jPanel1.add(BtnListele, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 188, 30));

        BtnSil.setBackground(new java.awt.Color(255, 216, 166));
        BtnSil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSil.setText("Garanti Belgesini Sil");
        BtnSil.setEnabled(false);
        BtnSil.setMaximumSize(new java.awt.Dimension(187, 23));
        BtnSil.setMinimumSize(new java.awt.Dimension(187, 23));
        BtnSil.setPreferredSize(new java.awt.Dimension(187, 23));
        BtnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSilActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 170, 30));

        BtnGuncelle.setBackground(new java.awt.Color(255, 216, 166));
        BtnGuncelle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnGuncelle.setText("Garanti Belgesini Guncelle");
        BtnGuncelle.setEnabled(false);
        BtnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuncelleActionPerformed(evt);
            }
        });
        jPanel1.add(BtnGuncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 188, 30));

        BtnTemizle.setBackground(new java.awt.Color(255, 216, 166));
        BtnTemizle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnTemizle.setText("Temizle");
        BtnTemizle.setMaximumSize(new java.awt.Dimension(187, 23));
        BtnTemizle.setMinimumSize(new java.awt.Dimension(187, 23));
        BtnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTemizleActionPerformed(evt);
            }
        });
        jPanel1.add(BtnTemizle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 170, 30));

        jTable1.setModel(GarantiBelgesiModel);
        jTable1.setEnabled(false);
        PanelMevcutOlanBelge.setViewportView(jTable1);

        jPanel1.add(PanelMevcutOlanBelge, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 620, 130));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Mevcut Olan Belgeleriniz(Garanti S??resi Azalan Urunler Basta)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        BtnGoster.setBackground(new java.awt.Color(255, 216, 166));
        BtnGoster.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnGoster.setText("Faturay?? Goster");
        BtnGoster.setEnabled(false);
        BtnGoster.setMaximumSize(new java.awt.Dimension(187, 23));
        BtnGoster.setMinimumSize(new java.awt.Dimension(187, 23));
        BtnGoster.setPreferredSize(new java.awt.Dimension(187, 23));
        BtnGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGosterActionPerformed(evt);
            }
        });
        jPanel1.add(BtnGoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 188, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 920, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListeleActionPerformed

        try {
            ResultSet sonuc = garantiBelgesiIslemleri.GarantiBelgesiListele(Integer.parseInt(txt_belgeNo.getText()));
            if (!sonuc.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "??stedi??iniz Kay??t Numaras??nda Fatura Bulunamam????t??r!");
            } else {
                while (sonuc.next()) {
                    txt_belgeNo.setText(sonuc.getString("GarantiBelge_KayitNo"));
                    txt_marka.setText(sonuc.getString("GarantiBelge_Markasi"));
                    txt_model.setText(sonuc.getString("GarantiBelge_Modeli"));
                    txt_urunAdi.setText(sonuc.getString("GarantiBelge_Adi"));
                    txt_fatura.setText(sonuc.getString("GarantiBelge_Faturasi"));
                    txt_seriNo.setText(sonuc.getString("GarantiBelge_SeriNo"));
                    cmbx_urunTuru.setSelectedItem(sonuc.getString("GarantiBelge_Turu"));
                    String tarih = sonuc.getString("GarantiBelge_GarantiBitisTarihi");//tarihi jchoosera ??ekmek i??in ilk bir stringe ??ekiyoruz sonra alttarafta pars edip ekliyoruz
                    Date date = new SimpleDateFormat("yyyy-MM-dd").parse(tarih);///yukarda devam??
                    dc_garantiBitisTarihi.setDate(date);
                    JOptionPane.showMessageDialog(null, "Kayd??n??z Ba??ar??yla Listelenmistir!");
                    txt_belgeNo.setEnabled(false);
                    BtnSil.setEnabled(true);
                    BtnGuncelle.setEnabled(true);
                    BtnTemizle.setEnabled(true);
                    BtnGoster.setEnabled(true);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "L??tfen Kay??t Numaras?? Giriniz!");
        }
        ////listeleme yap??lacak 
    }//GEN-LAST:event_BtnListeleActionPerformed

    private void BtnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuncelleActionPerformed
        try {
            garantiBelgesi.setGarantiBelge_KayitNo(Integer.parseInt(txt_belgeNo.getText()));
            garantiBelgesi.setGarantiBelge_Markasi(txt_marka.getText());
            garantiBelgesi.setGarantiBelge_Turu(cmbx_urunTuru.getSelectedItem().toString());
            garantiBelgesi.setGarantiBelge_Modeli(txt_model.getText());
            garantiBelgesi.setGarantiBelge_Adi(txt_urunAdi.getText());
            garantiBelgesi.setGarantiBelge_Faturasi(txt_fatura.getText().replace("\\", "/"));//yolu al??rken bu satir yaz??lmazsa java kac??c olarak goruyor slash?? siliyor o y??zden gerekli
            garantiBelgesi.setGarantiBelge_SeriNo(txt_seriNo.getText());
            garantiBelgesi.setGarantiBelge_GarantiBitisTarihi(TarihDonustur(dc_garantiBitisTarihi.getDate()));
            garantiBelgesiIslemleri.GarantiBelgesiGuncelle(garantiBelgesi);
            JOptionPane.showMessageDialog(null, "Kayd??n??z?? Ba??ar??yla G??ncellediniz !");
            ListeGuncelle();
            Temizle();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Garanti Belgesi G??ncelleme ????lemi Ger??ekle??tirilemedi! ");
        }

    }//GEN-LAST:event_BtnGuncelleActionPerformed

    private void BtnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTemizleActionPerformed

        Temizle();
    }//GEN-LAST:event_BtnTemizleActionPerformed

    private void BtnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSilActionPerformed
        try {
            GarantiBelgesiModel.setRowCount(0);
            garantiBelgesiIslemleri.GarantiBelgesiSil(Integer.parseInt(txt_belgeNo.getText()));
            JOptionPane.showMessageDialog(null, "Kayd??n??z?? Ba??ar??yla Sildiniz !");
            ListeGuncelle();//sildikten sonra tabloyu g??ncellemek i??in
            Temizle();//icini temizlesin diye
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Garanti Belgesi Silme ????lemi Ger??ekle??tirilemedi! ");
        }


    }//GEN-LAST:event_BtnSilActionPerformed

    private void txt_faturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_faturaMouseClicked

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "png", "gif");//Fitreliyoruz
        fileChooser.setFileFilter(filter);
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));//Gecerli projenin dosya yolu
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            txt_fatura.setText(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_txt_faturaMouseClicked

    private void BtnGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGosterActionPerformed

        try {
            //acilacak dosyan??n yolu verilir 
            File file = new File(txt_fatura.getText());
            if (!Desktop.isDesktopSupported()) //dosya destkleniyor mu desteklenmiyor mu kontrolu yapilir
            {
                System.out.println("Dosya Turu Deklenemiyor");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) //dosyanin olup olmadigi kontrol edilir
            {
                desktop.open(file); //dosya varsa acilir  
            } else//Dosya yolu yoksa bulunamadi uyarisi verilir
            {
                JOptionPane.showMessageDialog(null, "Dosya Yolu Bulunamadi! ");
            }
        } catch (Exception e) {
            e.printStackTrace();//Bu yontem, ayn?? e nesnesinin mesajini ve ayrica istisnanin olustugu satir numarasini yazdirir.
        }

    }//GEN-LAST:event_BtnGosterActionPerformed

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
            java.util.logging.Logger.getLogger(GarantiBelgesiDuzenlemeFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GarantiBelgesiDuzenlemeFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GarantiBelgesiDuzenlemeFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GarantiBelgesiDuzenlemeFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GarantiBelgesiDuzenlemeFormu().setVisible(true);
            }
        });
    }

    private void ListeGuncelle() {
        VeritabaniBaglanti baglanti = new VeritabaniBaglanti();
        try {
            ResultSet azalanUrunlerSonuc = baglanti.GarantiSuresiAzalanUrunler();
            GarantiBelgesiModel.setRowCount(0);//mevcut tablonun icini sifirliyoruz herseferinde digerinin ustune eklenmesin diye
            GarantiBelgesiModel.setColumnIdentifiers(garantiBelgesiSutun);
            while (azalanUrunlerSonuc.next()) {
                garantiBelgesiSatir[0] = azalanUrunlerSonuc.getString("GarantiBelge_KayitNo");
                garantiBelgesiSatir[1] = azalanUrunlerSonuc.getString("GarantiBelge_Turu");
                garantiBelgesiSatir[2] = azalanUrunlerSonuc.getString("GarantiBelge_Markasi");
                garantiBelgesiSatir[3] = azalanUrunlerSonuc.getString("GarantiBelge_Modeli");
                garantiBelgesiSatir[4] = azalanUrunlerSonuc.getString("GarantiBelge_Adi");
                garantiBelgesiSatir[5] = azalanUrunlerSonuc.getString("GarantiBelge_SeriNo");
                garantiBelgesiSatir[6] = azalanUrunlerSonuc.getString("GarantiBelge_GarantiBitisTarihi");
                garantiBelgesiSatir[7] = azalanUrunlerSonuc.getString("GarantiBelge_Faturasi");
                GarantiBelgesiModel.addRow(garantiBelgesiSatir);//yukarida tanimladigimiz satirlari rowsa ekledik 
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Garanti Belgesi G??ncelleme  ????lemi Ger??ekle??tirilemedi! ");
        }
    }

    private void Temizle() {
        try {
            txt_belgeNo.setText("");
            txt_fatura.setText("");
            txt_marka.setText("");
            txt_model.setText("");
            txt_seriNo.setText("");
            txt_urunAdi.setText("");
            cmbx_urunTuru.setSelectedIndex(0);
            txt_belgeNo.setEnabled(true);
            BtnSil.setEnabled(false);
            BtnGuncelle.setEnabled(false);
            BtnSil.setEnabled(false);
            BtnGuncelle.setEnabled(false);
            BtnGoster.setEnabled(false);
            JTextFieldDateEditor editor = (JTextFieldDateEditor) dc_garantiBitisTarihi.getDateEditor();
            editor.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Tablo Temizlenemedi! ");
        }

    }

    private void FormunIconunuAyarla() {
        //resmi cektik burada classin ismi yazilacak burada ilk ilgili class icin 
        Image Evim = new ImageIcon(GarantiBelgesiDuzenlemeFormu.class.getResource("Evim.jpg")).getImage();
        setIconImage(Evim);
    }

    private String TarihDonustur(Date tarih) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");//tarih format??n?? veritaban??na eklemek i??in gerekli kodlar
        String faturaTarihi = format.format(tarih);
        return faturaTarihi;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGoster;
    private javax.swing.JButton BtnGuncelle;
    private javax.swing.JButton BtnListele;
    private javax.swing.JButton BtnSil;
    private javax.swing.JButton BtnTemizle;
    private javax.swing.JScrollPane PanelMevcutOlanBelge;
    private javax.swing.JComboBox<String> cmbx_urunTuru;
    private com.toedter.calendar.JDateChooser dc_garantiBitisTarihi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_belgeNo;
    private javax.swing.JTextField txt_fatura;
    private javax.swing.JTextField txt_marka;
    private javax.swing.JTextField txt_model;
    private javax.swing.JTextField txt_seriNo;
    private javax.swing.JTextField txt_urunAdi;
    // End of variables declaration//GEN-END:variables

}
