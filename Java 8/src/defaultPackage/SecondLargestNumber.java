package defaultPackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 4, 3, 67, 45, 23, 98, 51); 
		
		int result = list.stream().sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst().get();
		
		System.out.println(result);
	}
}
