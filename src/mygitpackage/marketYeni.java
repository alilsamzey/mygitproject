package market;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class marketYeni {

	static int urunNo;
	String urunAdi;
	int miktar;
	double urunFiyati;
	double fiyat;
	double toplamFiyat=0;
	static double sonToplamFiyat=0;
	
	
	public static void main(String[] args) {
		sepet();
		
	}

	static Map<Integer, Double> urunlist = new HashMap<>();
	private static void urunList() {
		urunlist.put(00, 1.20);
		urunlist.put(01, 3.20);
		urunlist.put(02, 1.50);
		urunlist.put(03, 2.30);
		urunlist.put(04, 3.10);
		urunlist.put(05, 1.20);
		urunlist.put(06, 1.90);
		urunlist.put(07, 6.10);
		}
static Map<Integer, String> urunListCins = new HashMap<>();
	
	private void urunListCins() {
		urunListCins.put(00, "Domates");
		urunListCins.put(01, "Patates");
		urunListCins.put(02, "Biber");
		urunListCins.put(03, "Sogan");
		urunListCins.put(04, "Havuc");
		urunListCins.put(05, "Elma");
		urunListCins.put(06, "Muz");
		urunListCins.put(07, "Cilek");
		
	}


	static Map<Integer, String> list = new HashMap<>();
	static List<Double> toplamfiyat= new ArrayList<>();
	
	public static void toplamFiyat() {
	
		
		
	for (int i = 0; i < toplamfiyat.size(); i++) {
	sonToplamFiyat=sonToplamFiyat+ toplamfiyat.get(i);
	}
	System.out.println("Alisverisinizi sona erdirdiniz "+"\nSepetinizdeki urunlerin listesi : " +sonList);

	System.out.println("Odemeniz gereken toplam tutar = " +sonToplamFiyat+ "TL");
	}
	static List<String> sonList=new ArrayList<>();
	
	
	private static void sepet() {
		marketYeni urun=new marketYeni();
		
		list.put(urun.urunNo, urun.toString());
		sonList.add(urun.toString());
		
		System.out.println(list.get(urun.urunNo));
		toplamfiyat.add(urunlist.get(urunNo)*urun.miktar);
		System.out.println();
		urun.devam();
		
	}

	public marketYeni() {
		
		System.out.println("\n URUN FIYAT LISTESI \n 00 Domates 2.10 \n 01 Patates 3.20 \n 02 Biber 1.50 \n 03 Sogan 2.30"
				+ "\n 04 Havuc 3.10 \n 05 Elma 1.20 \n 06 Muz 1.90 Tl \n 07 Cilek 6.10" );
		
		Scanner scan=new Scanner(System.in);
		System.out.println("urun numarasini giriniz :");
		this.urunNo=scan.nextInt();
		if (this.urunNo<-1||this.urunNo>7) {
			System.out.println("lutfen gecerli bir urun no giriniz ; ");
			sepet();
		}
		
		System.out.println("Almak istediginiz miktari giriniz : ");
		do {
			
		this.miktar=scan.nextInt();
		if (this.miktar>0.0 && this.miktar<100) {
			break;
		}else 
			System.out.println("lutfen gecerli miktar giriniz ; ");
			continue;
		
		}while(true);
		urunList();
		urunListCins();
			
	}
	

	public String toString() {
		
		return 
				"\n urun no : " + urunNo +
				"\n urun cinsi : " + urunListCins.get(urunNo) +
				"\n urun birim fiyati : " + urunlist.get(urunNo) + "TL"+
				"\n Almak istediginiz miktar : " + miktar + " kg"+
				"\n Toplam fiyat : " + urunlist.get(urunNo)*miktar+ "TL"+
				"\n ====================================================== : " ;
				//"\n Toplam fiyat = "+ (toplamFiyat=toplamFiyat+urunlist.get(urunNo)*miktar);
	}
	
	public static void devam() {
		char devam=0;
		do {
		Scanner scan=new Scanner(System.in);
		System.out.println("Alisverise devam etmek istiyorsaniz E, alisverisi bitirmek istiyorsaniz H harfina basiniz;");
		 devam=scan.next().toUpperCase().charAt(0);
		if (devam=='E') {
			sepet();
		}else if (devam=='H') {
			toplamFiyat();
			
		}else System.out.println("lutfen E veya H harfini giriniz.");
		}while(devam!='E'&& devam!='H');
	}
	

}
