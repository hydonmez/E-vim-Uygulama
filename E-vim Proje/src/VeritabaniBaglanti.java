import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.cj.protocol.Resultset;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VeritabaniBaglanti 
{
    private Connection baglanti;
    private Statement sorgu;
    ResultSet res = null;

    ResultSet SonEklenenFaturalar()  //veritabanından fatura tablosundaki fatura kayit numurasini büyükten kucuge dogru siralar
    {
        try 
        {
            //yararlanılan kaynaklar 
            //https://www.youtube.com/watch?v=kUApu7Ooes8&list=PLzIWkToFwqHSZuhkX5NEojR7ZMWE1XQu7&index=51
            //veritabanıyla baglantı kurma
             baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/evim?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "1234");
             sorgu = baglanti.createStatement(); //sql sorgusu icin yeni bir ifade nesnesi olusturuyoruz
            
            //sorgu bir icin bir tane sorgu cumlecigi yaziyoruz ve sonucunu res degerine atiyoruz
            res = sorgu.executeQuery("SELECT * FROM fatura_tbl  ORDER BY Fatura_KayitNo DESC ");
            
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();//hatayi otomatik yakala ve goster
        }
        
        return res;
        
    }

    ResultSet GarantiSuresiAzalanUrunler() //veritabanından garanti belgesi tablosunda bulunan garanti bitis tarihini kucukten buyuge dogru siralar
    {
        try 
        {
             baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/evim?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "1234");
             sorgu = baglanti.createStatement();//sql sorgusu icin yeni bir ifade nesnesi olusturuyoruz
            //kucukten buyuge silanan degerler res e atalır
            res = sorgu.executeQuery("SELECT * FROM garantibelge_tbl ORDER BY GarantiBelge_GarantiBitisTarihi ASC");
        } 
        catch (SQLException e) 
        {
            //hatayı yakala ve ekranda goster 
            JOptionPane.showMessageDialog(null, e);
        }
        return res; //sonuc return edilir.
    }

    ResultSet GarantiSonKayit() //veritabanindaki son eklenen kayit numarasini cekme
    {
        try 
        {
             baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/evim?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "1234");
             sorgu = baglanti.createStatement();
            //garanti belge tablosundan kayit numarasini secer ve bunu res e atar
            res = sorgu.executeQuery("SELECT GarantiBelge_KayitNo FROM garantibelge_tbl ");
        } 
        catch (SQLException e) 
        {
            //hatayı yakala ve ekranda goster 
            JOptionPane.showMessageDialog(null, e);
        }
        return res;//son kayit numarasini res e attigi için res i return eder.
    }

    ResultSet FaturaSonKayit() //veritabaninda fatura tablosundaki son kayit numarasini cekme
    { 
        try 
        {   
             baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/evim?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "1234");
            //sql sorgusu icin yeni bir tane nesne yaratildi
             sorgu = baglanti.createStatement();
           //fatura tablosunda bulunan kayit numarasini secer ve res e atar
            res = sorgu.executeQuery("SELECT Fatura_KayitNo FROM fatura_tbl ");
        } 
        catch (SQLException e) 
        {
            //hatayı yakala ve ekranda goster 
            JOptionPane.showMessageDialog(null, e);
        }
        return res;//res return edilir.
    }

    public void SqlIslemler(String sqlSorgu) //ekleme silme gibi islemlerde yazilan sql sorgusunu parametre olarak alir
    {
        try
        {
             baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/evim?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "1234");
             sorgu = baglanti.createStatement();
            sorgu.executeUpdate(sqlSorgu);//Statement nesnesi olan executeUpdate fonksiyonuna gelen sql ifadesi parametre olarak verildi
        } 
        catch (SQLException e) 
        {
            //hatayı yakala ve ekranda goster 
            JOptionPane.showMessageDialog(null, e);
        }
    }

   ResultSet VeriListeleme(String sqlSorgu) //veriyi listeleme islemi yapilir
   {
        try 
        {
             baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/evim?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "1234");
             sorgu = baglanti.createStatement();
            res = sorgu.executeQuery(sqlSorgu);//verilerin listelenmesi icin fonksiyona sql ifadesi parametre olarak verildi
        } 
        catch (SQLException e) 
        {
            //hatayı yakala ve ekranda goster 
            JOptionPane.showMessageDialog(null, e);
        }
        return res;
   }

    public void Guncelleme(String sqlSorgu)//veriler guncellenir
    {
        try 
        {
            //baglanti kuruldu
             baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/evim?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "1234");
             sorgu = baglanti.createStatement();//sql sorgusu icin yeni bir tane nesne yaratilir
            sorgu.executeUpdate(sqlSorgu);//veriyi guncellemek icin fonksiyona sql sorgusu verilir.
        } 
        catch (SQLException e) 
        {
            //hatayı yakala ve ekranda goster 
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
