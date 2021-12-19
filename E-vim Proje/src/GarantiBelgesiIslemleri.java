
import com.mysql.cj.xdevapi.Result;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hydon
 */
public class GarantiBelgesiIslemleri 
{
    VeritabaniBaglanti baglanti = new VeritabaniBaglanti();//veritabın sınıfından bir nesne yaratıldı
    
    public void GarantiBelgesiGuncelle(GarantiBelgesi garantiBelgesi) //guncelleme fonksiyonu garantibelgesi sınıfının tipinde bir paratme aldı
    {
        //güncelme işlemi için gerekli sql sorgusu yazıldı
        String sqlSorgu = "UPDATE GarantiBelge_tbl SET GarantiBelge_KayitNo=" + garantiBelgesi.getGarantiBelge_KayitNo() + ","
                        + "GarantiBelge_Turu='" + garantiBelgesi.getGarantiBelge_Turu() + "',GarantiBelge_Markasi='" + garantiBelgesi.getGarantiBelge_Markasi() 
                        + "',GarantiBelge_Modeli='" + garantiBelgesi.getGarantiBelge_Modeli()
                        + "',GarantiBelge_Adi='" + garantiBelgesi.getGarantiBelge_Adi() + "',GarantiBelge_SeriNo='" + garantiBelgesi.getGarantiBelge_SeriNo()
                        + "',GarantiBelge_GarantiBitisTarihi='" + garantiBelgesi.getGarantiBelge_GarantiBitisTarihi()
                        + "',GarantiBelge_Faturasi='" + garantiBelgesi.getGarantiBelge_Faturasi() + "'WHERE GarantiBelge_KayitNo=" + garantiBelgesi.getGarantiBelge_KayitNo();
        baglanti.SqlIslemler(sqlSorgu);//veritabanı sınıfının nesnesi aracılığıyla SqlIslemler fonksiyonuna sorgu parametre olarak gonderildi
    }
    
    public void GarantiBelgesiEkle(GarantiBelgesi garantiBelgesi) //Ekleme fonksiyonu garantibelgesi sınıfının tipinde bir parametre aldı
    {
        //ekleme işlemi için gerekli sql sorgusu yazıldı
        String sqlSorgu = "INSERT INTO garantibelge_tbl (GarantiBelge_KayitNo,GarantiBelge_Turu, GarantiBelge_Markasi, GarantiBelge_Modeli,"
                        + " GarantiBelge_Adi, GarantiBelge_SeriNo, GarantiBelge_GarantiBitisTarihi, GarantiBelge_Faturasi) "
                        + "VALUES (" + garantiBelgesi.getGarantiBelge_KayitNo() + ",'" + garantiBelgesi.getGarantiBelge_Turu()
                        + "','" + garantiBelgesi.getGarantiBelge_Markasi() + "','" + garantiBelgesi.getGarantiBelge_Modeli()
                        + "','" + garantiBelgesi.getGarantiBelge_Adi() + "','" + garantiBelgesi.getGarantiBelge_SeriNo() 
                        + "','" + garantiBelgesi.getGarantiBelge_GarantiBitisTarihi() + "','" + garantiBelgesi.getGarantiBelge_Faturasi() + "')";
        baglanti.SqlIslemler(sqlSorgu);//veritabanı sınıfında bulunan sqlislemler fonksiyonuna sql ifadesi parametre olarak gonderildi
    }

    public void GarantiBelgesiSil(int GarantiBelgeKayitNo)//Garanti belgesi silme fonksiyonu kayıt numarasını paramtere olarak aldi
    {  
        //silme islemi icin gerekli sql sorgusu yazildi
        String sqlSorgu = "DELETE FROM garantibelge_tbl WHERE GarantiBelge_KayitNo=" + GarantiBelgeKayitNo;
        baglanti.SqlIslemler(sqlSorgu);//bu sorgu sqlIslemler fonksiyonuna parametre olarak gonderildi
    }

    public ResultSet GarantiBelgesiListele(int garantiBelgeKayitNo) //garanti belgesi listeleme fonksiyonu kayit numarasini parametre olarak aldi
    {
        //listeleme islem icin gerekli sql sorgusu yazildi
        String sqlSorgu = "SELECT * FROM garantibelge_tbl where GarantiBelge_KayitNo=" + garantiBelgeKayitNo;
        ResultSet sonuc;
        sonuc = baglanti.VeriListeleme(sqlSorgu);//veritabaninda bulunan verilisteleme fonksiyonuna parametre olarak sorgu gonderildi ve sonuc a atandi
        return sonuc;//sonuc return edildi.
    }
}
