/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zatona.test;

/**
 *
 * @author Zatona
 */

public class Urun {
    private int ID;
    private String ad;
    private double fiyat;
    static int zam = 0;

//    public Urun(){
//        this.ID = -1;
//        this.ad = null;
//        this.fiyat = -1;
//    }

    public Urun(int ID, String ad, double fiyat) {
        this.ID = ID;
        this.ad = ad;
        this.fiyat = fiyat;
    }

    // getter methods
    public int getID() {
        return ID;
    }

    public String getAd() {
        return ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    public static int getZamSayisi() {
        return zam;
    }
    
    
    // Setter methods

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void zamYap(double zamOrani){
        fiyat += fiyat*zamOrani;
        zam++;
    }

    @Override
    public String toString() {
        return "Urun{" + "ID=" + ID + ", ad=" + ad + ", fiyat=" + fiyat + '}';
    }
    
    
    
}
