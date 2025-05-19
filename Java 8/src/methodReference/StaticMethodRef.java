package methodReference;

@FunctionalInterface
interface I1 {
	int test(int a, int b);
}

class Client {
	static int findSum(int a, int b) {
		System.out.println("Sum of a and b : ");
		return a + b;
	}
}

public class StaticMethodRef {
	public static void main(String[] args) {
		System.out.println("Main method");
		
		// method reference 
		I1 i1 = Client::findSum;
		int a = i1.test(12, 34);
			System.out.println(a);
		 
	}
}
