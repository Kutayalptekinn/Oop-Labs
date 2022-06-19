package Lab3;

import java.io.Serializable;

public class Ogrenci implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String ogrenciAdi;
	private String ogrenciNo;
	private int vize;
	private int final_;
	private double genelNot;
	
	public Ogrenci(String ogrNo,String orgAdi,int vize,int final_) {
		
		this.ogrenciAdi=orgAdi;
		this.ogrenciNo=ogrNo;
		this.vize=vize;
		this.final_=final_;
		genelNot=0;
	}

	public String getOgrenciAdi() {
		return ogrenciAdi;
	}

	public String getOgrenciNo() {
		return ogrenciNo;
	}

	public int getVize() {
		return vize;
	}

	public int getFinal_() {
		return final_;
	}

	public double getGenelNot() {
		return genelNot;
	}
	
	public void genelNotHesapla()
	{
		
		genelNot = ((vize)*4 + (final_)*6)/10;
	}
	
	public String toString()
	{
		String s;
		s=ogrenciNo +" numarali"+ ogrenciAdi +"adindaki ogrencinin genel notu="+genelNot+"dur";
		return s;
	}

}
