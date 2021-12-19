
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class FaturaIslemleri {

    private VeritabaniBaglanti baglanti = new VeritabaniBaglanti();

    public void FaturaGuncelle(Fatura fatura) //gelen fatura nesnesinin bilgilerine gore ilgili fatura guncellenir 
    {
        String sqlSorgu = "UPDATE fatura_tbl SET Fatura_KayitNo=" + fatura.getFatura_KayitNo() + "," + "Fatura_Miktari=" + fatura.getFatura_Miktari() + ",Fatura_Dekont='"
                + fatura.getFatura_Dekont() + "',Fatura_Turu='" + fatura.getFatura_Turu() + "',Fatura_Tarihi='" + fatura.getFatura_Tarihi()
                + "',Fatura_OdemeTarihi='" + fatura.getFatura_OdemeTarihi() + "'WHERE Fatura_KayitNo=" + fatura.getFatura_KayitNo();
        baglanti.Guncelleme(sqlSorgu);
        JOptionPane.showMessageDialog(null, "Kaydınızı Başarıyla Güncellediniz !");
    }

    public void FatureEkle(Fatura fatura)//gelen fatura nesnesinin bilgilerine gore ilgili fatura eklenir 
    {
        String sqlSorgu = "INSERT INTO fatura_tbl (Fatura_KayitNo,Fatura_Turu, Fatura_Tarihi, Fatura_OdemeTarihi,"
                + "Fatura_Miktari, Fatura_Dekont)  VALUES (" + fatura.getFatura_KayitNo() + ",'" + fatura.getFatura_Turu()
                + "','" + fatura.getFatura_Tarihi() + "','" + fatura.getFatura_OdemeTarihi() + "'," + fatura.getFatura_Miktari() + ",'" + fatura.getFatura_Dekont() + "')";
        baglanti.SqlIslemler(sqlSorgu);

    }

    public void FaturaSil(int faturaNo)//formdan gelen fatura numarasina gore ilgili fatura silinir
    {
        String sqlSorgu = "DELETE FROM fatura_tbl WHERE Fatura_KayitNo=" + faturaNo;
        baglanti.SqlIslemler(sqlSorgu);
        JOptionPane.showMessageDialog(null, "Kaydınızı Başarıyla Sildiniz !");

    }

    public ResultSet FaturaListele(int faturaNo)//formdan gelen fatura numarasina gore ilgili fatura result set olarak geri donderilir
    {
        String sqlSorgu = "SELECT * FROM  fatura_tbl WHERE Fatura_KayitNo=" + faturaNo;
        ResultSet sonuc;
        sonuc = baglanti.VeriListeleme(sqlSorgu);
        return sonuc;
    }
}
