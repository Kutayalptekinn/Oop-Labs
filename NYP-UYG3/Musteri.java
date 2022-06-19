/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zatona.test;

/**
 *
 * @author Zatona
 */

public class Musteri {
    private String ad;
    private String soyad;
    private Siparis[] siparisler;

    public Musteri(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        siparisler = new Siparis[3];
		for(int i=0;i<siparisler.length;i++)
			siparisler[i]=new Siparis();
    }
    
    
    
    // getter methods
    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public Siparis[] getSiparisler() {
        return siparisler;
    }
    
    // setter methods
    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    
    
    // siparis methods
    public void siparisVer(int siparisNo,Urun urun){
        siparisler[siparisNo].urunEkle(urun);
    }
    
    public void siparisBilgisi(int siparisNo){
        System.out.printf("%d nolu siparişe ait ürün bilgileri:\n", siparisNo);
        siparisler[siparisNo].urunleriGoster();
    }
    
    public void tumSiparisler(){
        System.out.printf("%s %s isimli müşteriye ait sipariş bilgileri:\n", ad, soyad);    
        
        for(int i=0;i<siparisler.length;i++){
            System.out.printf("%d nolu siparişe ait ürün bilgileri:\n", i);
            siparisler[i].urunleriGoster();
        }
    }
    
    public void kacSiparis(String urunAdi){
        int siparisSayac = 0;
        int sayac = 0;
        boolean tmp;
        
        for (Siparis siparis : siparisler) {
            tmp = false;
            for (Urun urun : siparis.getUrunler()) {
                if(urun != null && urun.getAd().equals(urunAdi)){
                    sayac++;
                    tmp = true;
                }
            }
            if(tmp)
                siparisSayac++;
        }
        System.out.printf("%d tane sipariş içinde toplam %d adet su sipariş edilmiş.\n", siparisSayac, sayac);
    }
    
    public void tumSiparislerdenUrunCikar(Urun urun){
        for(int i=0;i<siparisler.length;i++){
            urunCikar(i,urun);
        }
    }
    
    public void urunCikar(int siparisNo,Urun urun){
        siparisler[siparisNo].urunCikar(urun);
    }
    
    public double getSiparisTutari(int siparisNo){
        return siparisler[siparisNo].getToplamTutar();
    }
}
