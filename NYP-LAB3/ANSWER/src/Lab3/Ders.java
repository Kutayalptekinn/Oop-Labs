package Lab3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;

public class Ders{
	
	
	private String dersAdi;
	private LinkedList<Ogrenci> ogrenciler;

	private int ogrenciSayisi;
	
	private int subeASayisi;
	private int subeBSayisi;
	
	public Ders(String dersAdi)
	{
		ogrenciler = new LinkedList<Ogrenci>();
		this.dersAdi=dersAdi;
		subeASayisi=0;
		subeBSayisi=0;
		ogrenciSayisi=0;
		
		
	}
	
	public String getDersAdi() {
		return dersAdi;
	}
	
	public LinkedList<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}
	
	public void dosyaOku(String dosyaAdi) throws IOException, ClassNotFoundException {
		
            FileInputStream file = new FileInputStream(dosyaAdi);
            ObjectInputStream obj = new ObjectInputStream(file);
            
            ogrenciler = (LinkedList<Ogrenci>) obj.readObject();
            
            obj.close();
            file.close();
        
	}
	
	public void gruplaraAyir()
	{
		subeBSayisi=ogrenciler.size()/2;
		subeASayisi=(ogrenciler.size()+1)/2;
		ogrenciSayisi=ogrenciler.size();
	}
	public void hesapla() throws InterruptedException 
	{
		LinkedList<Ogrenci> ogr1 = new LinkedList<>();
		LinkedList<Ogrenci> ogr2 = new LinkedList<>();
		
		int m=0;
		for(Ogrenci ogrenci : ogrenciler)
		{
			if(m<subeASayisi)
			{
				ogr1.add(ogrenci);
			}
			else
			{
				ogr2.add(ogrenci);
			}
			m++;
		}
		Thread th1= new Thread(new Hesapla(ogr1));
		Thread th2= new Thread(new Hesapla(ogr2));
		th1.start();
		th2.start();
		
		
			th1.join();
			th2.join();

		
		
	}
	public int getSubeBSayisi()
	{
		return subeBSayisi;
	}
	public int getOgrenciSayisi()
	{
		return ogrenciSayisi;
	}
	
	public synchronized void ekranaYazdir() {
		for(Ogrenci i: ogrenciler) {
			System.out.println(i);
		}
	}
	
	public class Hesapla implements Runnable
	{
		private LinkedList<Ogrenci> ogr1;
		public Hesapla(LinkedList<Ogrenci> ogr1)
		{
			this.ogr1=ogr1;
		}
		public void run()
		{
			for(int i=0;i<ogr1.size();i++)
			{
				ogr1.get(i).genelNotHesapla();
			}
		}
	}
	
}