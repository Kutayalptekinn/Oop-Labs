/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zatona.test;

/**
 *
 * @author Zatona
 */

public class Siparis {
    private Urun[] urunler;
   
    public Siparis(){
	urunler = new Urun[5];	
    }
    
    public Urun[] getUrunler() {
        return urunler;
    }
    
    
    public void urunEkle(Urun urun){
        int i = 0;
        while(urunler[i] != null && i<5){
           i++;
        }    
        if(i==5){
            System.out.println("bir siparistaki maksimum urun sayiya ulastiniz...!");
            return;
        }
        urunler[i] = urun;
    }
    
    public void urunleriGoster(){
        int i;
        for(i=0;i<5;i++){
            if(urunler[i] != null)
                System.out.println(urunler[i].toString());
            else
                System.out.println("null");

        }
    }
    
    public void urunCikar(Urun urun){
        for(int i=0;i<urunler.length;i++){
            if(urunler[i] == urun){
                urunler[i] = null;
            }
        }
    }
    
    public double getToplamTutar(){
        double toplam = 0;
        for (Urun urun : urunler) {
            if (urun != null) {
                toplam += urun.getFiyat();
            }
        }
        
//        for(int i=0;i<urunler.length;i++){
//            if(urunler[i] != null){
//                toplam += urunler[i].getFiyat();
//            }
//        }
        
        return toplam;
    }
    
    
}
