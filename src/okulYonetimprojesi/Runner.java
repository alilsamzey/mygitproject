package okulYonetimprojesi;

import java.util.Scanner;

public class Runner {
	//BİR OKUL YÖNETİM PLATFORMU KODALYINIZ.
	//
//		1.	Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir.
//			Kayıtlarda şu bilgiler olabilmelidir.
	//
//			Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
//			Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
	//
//		2.	Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
//			Aşağıdaki gibi bir menü gösterilsin.
	//
//		====================================
//		 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
//		====================================
//		 1- ÖĞRENCİ İŞLEMLERİ
//		 2- ÖĞRETMEN İŞLEMLERİ
//		 Q- ÇIKIŞ
	//
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
	public static void main(String[] args) {
		
		anamenu();
		

	}

	public static void anamenu() {
		Scanner scan=new Scanner(System.in);
		System.out.println( "\n ====================================\r\n" + 
				"\n ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\r\n" + 
				"\n ====================================\r\n" + 
				"\n	 1- ÖĞRENCİ İŞLEMLERİ\r\n" + 
				"\n	 2- ÖĞRETMEN İŞLEMLERİ\r\n" + 
				"\n	 Q- ÇIKIŞ");
		String islem=scan.nextLine().toUpperCase();
		switch (islem) {
		case "1":
			Ogrenci.ogrenciIslemleri();
			break;
		case "2":
			ogretmen.ogretmenIslemleri();
			break;
		case "Q":
	System.out.println("islemlere son verdiniz. Iyi ginler dileriz");
	break;

		}
		
	}
	

}
