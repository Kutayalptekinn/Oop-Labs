package Lab3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	
	public static void main(String args[]) throws ClassNotFoundException, IOException, InterruptedException 
	{
		Ders ders=new Ders("MAT");
		ders.dosyaOku("ogrenci.ser");

		ders.hesapla();
		ders.ekranaYazdir();
	}

}
