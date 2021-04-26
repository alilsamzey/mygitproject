package collections;

import java.util.LinkedList;

public class C2_LinkedList02 {

	public static void main(String[] args) {
		LinkedList list=new LinkedList<>();
		
			
		
		list.add("A");
		list.add(20);
		list.add('d');
		
		System.out.println(System.currentTimeMillis());
		
		System.out.println(list.get(2)+"a");
		System.out.println(list.removeFirstOccurrence("A"));
		
	
		
		
		}

}
