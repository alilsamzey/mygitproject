package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class collections04 {

	public static void main(String[] args) {
		 
		 List<Integer> liste = new ArrayList<>();
	        liste.add(12);
	        liste.add(9);
	        liste.add(13);
	        liste.add(4);
	        liste.add(9);
	        liste.add(2);
	        liste.add(-2);
	        liste.add(4);
	        liste.add(12);
	        liste.add(-1);
	        liste.add(15);
	        liste.add(500);
	        liste.add(-15);

	        String buyuk="En buyuk deger ; "+buyukbul(liste);
	        System.out.println(buyuk);
	        
	        String kucuk="En kucuk sayi "+ kucuk(liste);
	        System.out.println(kucuk);
	        
	        String carpim="carpimlar" + carpim(liste);
	        System.out.println(carpim);
	         String negatif= "negatif sayilar" + negatif(liste);
	         System.out.println(negatif);
	
}
		private static List<Integer> negatif(List<Integer> liste) {
		
		 return liste.stream().filter(x-> x<0).collect(Collectors.toList());
	}
		private static int carpim(List<Integer> liste) {
		
		return liste.stream().reduce(1
				, (x,y) -> x*y);
	}
		private static Integer kucuk(List<Integer> liste) {
		
		return liste.stream().reduce(0, (x,y)-> x<y? x:y);
	}
		public static int buyukbul(List<Integer> liste) {
			return liste.stream().reduce(0, (x,y)-> x>y? x:y);
		}
		
		
	
}
	
	
	
	
	