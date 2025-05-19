package defaultPackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream3 {

	public static void main(String[] args) {
		List<Integer> mylist = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 7, 8, 9, 10, 11, 19, 12, 
															13, 99, 14, 15, 15, 16, 16, 17);

		List<String> mylist2 = Arrays.asList("one", "two", "three", "four", "five");

		Set<Integer> set = new HashSet();

		Stream<Integer> s1 = mylist.stream();
		Stream<String> s2 = mylist2.stream();
		Stream<Integer> s3 = null;
		
		
		  mylist.stream().limit(12).forEach(System.out::println);
		  System.out.println(mylist); 
		  System.out.println("\n---------------\n");
		  mylist.stream().limit(10).filter(num->num%2!=0).map(num->num*num).forEach(System.out::println);
		 

		 mylist.stream().skip(4).limit(9).forEach(System.out::print);

		 System.out.println("\n-----------\n");
		// mylist.stream().skip(4).limit(9).filter(num->num%2!=0).map(num->num*num).forEach(System.out::println);

		/*
		 * mylist.stream().skip(3).limit(10).peek(System.out::println).filter(num->num%2
		 * !=0) .map(num->num*num).forEach(System.out::println);
		 */

		mylist.stream().limit(19).filter(num -> num % 2 != 0).sorted().distinct().forEach(System.out::println);

		System.out.println(s1.anyMatch(input -> input % 2 == 0));

		// System.out.println(s1.map(i1->i1*2).allMatch(i2->i2%2==0));

		 System.out.println(s2.filter(e->e.length()>3).peek(e->System.out.println("Filteredvalues: "+e))
				 					.map(String::toUpperCase)
				 						.peek(e->System.out.println("Mapped values:"+e))
				 							.collect(Collectors.toList()));

		// System.out.println(mylist2);

		// mylist.stream().filter(n-> n%2 ==0).forEach(System.out::println);
		// mylist.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);

		// mylist.stream().filter(n -> !set.add(n)).forEach(System.out::println); // to
		// find duplicate numbers

		// mylist.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
	}
}
