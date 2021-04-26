package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		
		sett();
		
		
		
		
		
	}

	private static void sett() {
		Set<Integer> set=new HashSet<>();
		
		set.add(12);
		set.add(34);
		
		System.out.println(set);
		System.out.println(set.toString());
		
		System.out.println(Arrays.toString(set.toArray()));
		
	}

}
