package mygitpackage;

import java.util.Scanner;

public class JavaOfficeHaurs {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Tersi alinacak cumleyi giriniz");
		String strr=scan.nextLine();
		
		System.out.println(reverses(strr));

	}

	private static boolean reverses(String strr) {
		StringBuilder Str=new StringBuilder(strr);
		Str.reverse();
		
			boolean flag=false;
		if (Str.toString().equals(strr)) {
			flag=true;
		}
		return flag;
		
	}

}
