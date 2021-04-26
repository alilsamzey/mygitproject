package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C1_LinkedList01 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList();
		List<String> list2=new ArrayList<>();
		list2.add("l1");
		list2.add("l2");
		list2.add("l3");
		
			list.add("A");
			list.add("B");
			
			list.add(0,"C");
			list.addAll(2,list2);
			System.out.println(list);
			list.addFirst("F");
			list.clone().toString();
			list.hashCode();
			
			
	}

}
