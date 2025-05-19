package defaultPackage;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfElementsOfList {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,5,5,1,3,5,6,7,};
		
		OccurenceOfElements(arr);
	}
	
	static void OccurenceOfElements(int[] arr) {
		
		Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
			System.out.println("Occurrence of Elements  : ");
		map.forEach((key,value)-> System.out.println(key+" : "+value));	
	}
}
