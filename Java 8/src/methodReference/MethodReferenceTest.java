package methodReference;

@FunctionalInterface
interface Hai {
	void test(String str);
}

@FunctionalInterface
interface Hello {
	int test(int a, int b);
}

class MyInteger {
	public int findSum(int a, int b) {
		System.out.println("FindSum in MyInteger");
		return a + b;
	}
}

public class MethodReferenceTest {
	public static void main(String[] args) {
		MyInteger mi = new MyInteger();

		// lambda expression
		
		// Hai hai1 = (str) -> {
		//	 System.out.println("String str of test : " + str);
		// };
		// hai1.test("MSI\n");
		
		// instance method reference
		Hai hai2 = System.out :: println;
		hai2.test("Testing println in Hai\n");

		// lambda expression
		
		Hello h1 = (a, b) -> {
		 	int c = a * b;
		 	System.out.println("Sum of a and b : "+c);
		 	return c;
		 };
		 h1.test(111, 222);

		// instance method reference
		
		Hello h2 = mi::findSum;
			int i2 = h2.test(34, 56);
				System.out.println(i2);
				
			//	System.out.println(1+2+3+" Welcome "+5+6);
				// 6 Welcome 56
	}
}
