package okulYonetimprojesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ogrenci {
	//		3.	Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.
	//
//		============= İŞLEMLER =============
//			 1-EKLEME
//			 2-ARAMA
//			 3-LİSTELEME
//			 4-SİLME
//			 5-ANA MENÜ
//			 Q-ÇIKIŞ
	//
//		SEÇİMİNİZ:
	//
//		4.	İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
//		    ekleme, kimlik no ile silme ve arama, var olan tüm kişileri listeleme gibi işlemler yapılabilmelidir.
//			Bunun yanında bir üst menüye dönme veya çıkış işlemleri de yapılabilmelidir.
	
	static String AdSoyad="";
	static String kimlikNo="";
	static String yaş="";
	static String numara="";
	static String sınıf="";
	public static Map<String, String> ogrList= new HashMap<>();
	
	public static void ogrenciIslemleri() {
		Scanner scan=new Scanner(System.in);
		System.out.println("============= İŞLEMLER =============\r\n" + 
				"	1-EKLEME\r\n" + 
				"	2-ARAMA\r\n" + 
				"	3-LİSTELEME\r\n" + 
				"	4-SİLME\r\n" + 
				"	5-ANA MENÜ\r\n" + 
				"	Q-ÇIKIŞ");
		String islem=scan.nextLine().toUpperCase();
		switch (islem) {
		case "1":
			ekleme();
			break;
		case "2":
			arama();
			break;
		case "3":
			listeleme();
			break;
		case "4":
			silme();
			break;
		case "5":
			Runner.anamenu();
			break;
		case "Q":
			System.out.println("Islemleri bitirdiniz. Iyi gunler dileriz.");
			break;

		}
		
	}
	
	
	public String toString() {
		return "\nAd-Soyad : " + AdSoyad +
				"\n Kimlik No : "+ kimlikNo+
				"\n Yas : "+ yaş+
				"\n Numara : "+ numara+
				"\n Sinif : " + sınıf;
	}
	
	Ogrenci() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen ogrencinin ADINI SOYADINI giriniz : ");
		this.AdSoyad=scan.nextLine();
		System.out.println("Lutfen ogrencinin kimlik numarasini giriniz : ");
		this.kimlikNo=scan.nextLine();
		System.out.println("Lutfen ogrencinin yasini giriniz : ");
		this.yaş=scan.next();
		System.out.println("Lutfen ogrencinin numarasini giriniz : ");
		this.numara=scan.next();
		System.out.println("Lutfen ogrencinin sinifini giriniz : ");
		this.sınıf=scan.next();
		toString();
	}
	
   
	private static void ekleme() {
		
		Ogrenci ogrenci=new Ogrenci();
		ogrList.put(ogrenci.numara, ogrenci.toString());
		System.out.println("Eklenen ogrenci bilgileri :");
		System.out.println(ogrList.get(ogrenci.numara));
		
		ogrenciIslemleri();
		
		
	}
	private static void arama() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Arama icin Ogrenci numarasini giriniz, veya cikis icin  Q harfina basiniz : ");
		numara=scan.next();
		if (numara.equalsIgnoreCase("q")) {
			Runner.anamenu();}
		else if (!ogrList.containsKey(numara)) {
			System.out.println(numara+ "numarali ogrenci mevcut degildir."
					+ " ");
			arama();
		} else {
		System.out.println(ogrList.get(numara));
		}
		ogrenciIslemleri();
	}
	private static void listeleme() {
		
		System.out.println(ogrList);
		ogrenciIslemleri();
		
	}
	private static void silme() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Bilgileri silinecek Ogrencinin numarasini giriniz : ");
		numara=scan.next();
		ogrList.remove(numara);
		System.out.println(numara+ " numarali ogrencinin kaydi silinmistir.");
		ogrenciIslemleri();
	}
	
}
