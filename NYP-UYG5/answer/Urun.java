
package lab1_2021_v3;


public class Urun {
	
	private final int id;
	private String ad;
	private double fiyat;
	private static int zamSayisi;
	
	public Urun(int id, String ad, double fiyat) {
		
		this.id = id;
		this.ad = ad;
		this.fiyat = fiyat;
	}

	public int getId() {
		return id;
	}
	

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public double getFiyat() {
		return fiyat;
	}


        public void zamYap(double zamOrani){
		fiyat += fiyat*zamOrani;
		zamSayisi++;            
        }

	@Override
	public String toString() {
		return "Urun [id=" + id + ", ad=" + ad + ", fiyat=" + fiyat + "]";
	}



	public static int getZamSayisi() {
		return zamSayisi;
	}
	
	


}
