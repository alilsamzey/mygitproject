import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class test2 {
	
	public static Map<String, String> soru=new HashMap<>();
	
	public String toString() {
		return "a";
	}
	
	
	public static void soruSor(){
		int correctNumber=0;
		String S1= "Who invented the telephone?\n a: thomas edison \n b: michael faraday\n c:james wattson \n d: alexander bell";
		String S2= "where is the capital of japan?\n a; ankara \n b: washington \n c : tokyo ";
		String S3= " where does the sun rise?\n a: nort \n b: south \n c : east \n d : west ";
		List<String> slist=new ArrayList<>();
		slist.add(S1);
		slist.add(S2);
		slist.add(S3);
		int soruCounter=0;
		List<String> cevap= new ArrayList<>();
		cevap.add("d");
		cevap.add("c");
		cevap.add("c");
		
		do {
		//soru.put("S"+soruCounter+1, cevap.get(soruCounter));
		
		Scanner scan=new Scanner(System.in);
		int c=generateRandomIntIntRange(0,3);
		System.out.println(slist.get(c));
		String elCevap=scan.nextLine();
		
		if(cevap.get(c).equals(elCevap)) {
			soruCounter++;
			correctNumber++;
			System.out.println("dogru");
		}else {
			soruCounter++;
			//correctNumber++;
			System.out.println("yanlis");
			}
		if (c+1==4){
			break;
		}
		
		}while(true);
	
		
		System.out.println("dogru cevap sayiniz : "+ correctNumber );
	}
		
		
	
	public static int generateRandomIntIntRange(int min, int max) {
	    Random r = new Random();
	    return r.nextInt((max - min) + 1) + min;
	}

	public static void main(String[] args) {
		
		
		//System.out.println(generateRandomIntIntRange(0,3));
	soruSor();
		//System.out.println(soru.get(0));

	}

}
