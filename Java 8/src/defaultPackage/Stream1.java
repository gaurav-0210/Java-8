package defaultPackage;

import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {

		// From a list print new list of even numbers. 
		
		List<Integer> list1 = List.of(32,43,1,3,6,78,90,13,2);
		
//		List<Integer> listEven  = new ArrayList<>() ;
//		
//		for(Integer i: list1) {
//			if(i%2==0) 
//				listEven.add(i);
//		}
//		System.out.println(list1);
//		
//		Collections.sort(listEven);
//		System.out.println(listEven);
		
		
		List<Integer> newlist = list1.stream().filter(i->i%2==0).sorted().collect(Collectors.toList());
		System.out.println(newlist);
		
	}
}
