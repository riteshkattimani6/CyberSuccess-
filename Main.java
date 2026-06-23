package MethodPrgmz;

public class Main {
	public static void main(String[] args) {
		Method m1 = new Method();
		
		//add two number
		int sum = m1.add(10, 20);
		System.out.println(sum);
		//max number
		int maxi = m1.max(2, 3);
		System.out.println(maxi);
		//even  odd
		m1.evenodd(5);
		//fact
		int Facto = m1.factorial(5);
		System.out.println("Factorial "+Facto);
		//5)reverse String
		String r = m1.reverse ("ritesh");
		System.out.println("Reverse:- "+r);
		//Palindrome	
		m1.palindrome(121);
		//prime----not able to do 
		//Fibonacci
		m1.fibonacci(5);
		//Calculate power
		int cal = m1.power(5, 2);
		System.out.println("Power"+cal);
		//count digit
		int count = m1.countDigits(123);
		System.out.println("Total Digit "+count);
		//largest element in  the array
		int arr[] = {10, 50, 20, 80, 30};
		int largest = m1.largest(arr);
		System.out.println("Largest : " + largest);
		//smallest element in the array
		int arr2[] = {10, 50, 20, 80, 5};
		int smallest = m1.smallest(arr2);
		System.out.println("Smallest : " + smallest);
		//sort an array
		m1.sortArray(arr2);
		//Search element
		m1.searchElement(arr2, largest);
	}
}
