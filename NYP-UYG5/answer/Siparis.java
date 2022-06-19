
package lab1_2021_v3;


public class Siparis {
	
	
	private Urun[] urunler;

	
	
	public Siparis() {
		urunler = new Urun[5];
		
		
	}


	public Urun[] getUrunler() {
		return urunler;
	}


	public void setUrunler(Urun[] urunler) {
		this.urunler = urunler;
	}


	public void urunEkle(Urun urun) {
		for(int i=0; i<urunler.length; i++)
			if(urunler[i]==null){
				urunler[i]=urun;
				break;
			}
	}



	public void urunleriGoster() {
		for(Urun iter:urunler)
			System.out.println(iter);
		
	}


	public void urunCikar(Urun urun) {
		for(int i=0;i<urunler.length;i++){
			if(urunler[i]==urun){
				urunler[i]=null;
				
			}
		}
		
	}
	
        public double getToplamTutar(){
            double toplamTutar = 0;
            for(Urun iter:urunler)
                if(iter != null)
                    toplamTutar += iter.getFiyat();
            return toplamTutar;
            
        }
	
	
	
	 
	
	

}
