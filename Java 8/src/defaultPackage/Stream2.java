package defaultPackage;

import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {

	public static void main(String[] args) {
		
		List<String> names = List.of("Ram", "Laksman","Hanuman", "Ravan");
		System.out.println(names);
		
		List<String> names1 = names.stream().filter(e->e.startsWith("R")).collect(Collectors.toList());
		System.out.println(names1);
		
		List<Integer> numbers = List.of(23,12,43,4,65,6,8);
		
		List<Integer> SquareNo = numbers.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(SquareNo);
		
		Integer minNumber = numbers.stream().min((x,y)-> x.compareTo(y)).get();
		System.out.println(numbers);
		System.out.println("smallest numbers : "+minNumber);
	
	}
}
