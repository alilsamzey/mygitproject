package okulYonetimprojesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ogretmen {
	
	
		public static void main(String[] args) {
	        /*
	         * Print prime numbers which are less than the given number
	         * örnek : 
	         * input : 10
	         * output : 2 3 5 7
	         */
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Bir pozitif tamsayı giriniz");
	        int n = scan.nextInt();
	        
	        printPrime(n);
	        System.out.println("\n================================");
	        asalmi(n);
	        System.out.println("\n================================");
	        
	        bolenler(n);
	        
	        scan.close();
	        
	    }
		
	    public static void asalmi(int n) {
	    	if(isPrime(n)) {
	    		System.out.println(n+ "  sayisi asaldir.");
	    	}else System.out.println(n+ "  sayisi asal degildir.");
	    }
	    private static boolean isPrime(int n) {
	        if(n <= 1) {
	            return false;
	        }
	        for(int i = 2 ; i < n ; i++) {
	            if(n%i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    
	    public static void printPrime(int n) {
	        for(int i = 2 ; i <n ;i++) {
	            if(isPrime(i))
	                System.out.print(i + " " );
	        }
	        
	       
	    }
	    public static void bolenler(int n) {
	    	List<Integer> list=new ArrayList<>();
	    	for (int i = 2; i <n; i++) {
	    		if (n%i==0) {
					list.add(i);
				}
	    		
			}//System.out.print(list);
			if (list.isEmpty()&&n!=1) {
				System.out.println(n+ "sayisi asaldir");
			} else System.out.println(n+ " sayisi asal degildir");
	    	
	    }
}
		
		
	/*	
	}
	public static void ogretmenIslemleri() {
		//Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
		
		
	}
}
*/