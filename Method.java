package MethodPrgmz;

public class Method {
	//add
	int add(int a , int b) {
		return a+b;
	}
	//max
	int max(int a,int b) {
		if(a > b)
			return a;
		else {
			return b;
		}
	}
	//even odd
	void evenodd(int a) {
		if(a%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("odd Number");
		}
	}
	//Fact
	int factorial(int n) {

	    int fact = 1;

	    for(int i = 1; i <= n; i++) {
	        fact = fact * i;
	    }
	    return fact;
	}
	//Reverse
	String reverse(String s) {
	    String rev = "";
	    for(int i = s.length()-1; i >= 0; i--) {
	        rev = rev + s.charAt(i);
	    }
	    return rev;
	}
	//Palindrome
	void palindrome(int n) {

	    int original = n;

	    int rev = 0;

	    while(n > 0) {

	        int rem = n % 10;

	        rev = rev * 10 + rem;

	        n = n / 10;
	    }
	    if(original == rev)
	        System.out.println("Palindrome");
	    else
	        System.out.println("Not Palindrome");
	}
	//prime
	
	
	//Fibonacci
	
	void fibonacci(int n) {
	    int a = 0;
	    int b = 1;

	    System.out.print(a + " " + b + " ");

	    for(int i = 3; i <= n; i++) {

	        int c = a + b;

	        System.out.print(c + " ");

	        a = b;
	        b = c;
	    }
	}
	//calculate power
	int power(int base, int exponent) {

	    int result = 1;

	    for(int i = 1; i <= exponent; i++) {

	        result = result * base;
	    }

	    return result;
	}
	//count digit
	int countDigits(int n) {

	    int count = 0;

	    while(n > 0) {

	        n = n / 10;

	        count++;
	    }

	    return count;
	}
	
	//largest element in the array
	int largest(int arr[]) {

	    int max = arr[0];

	    for(int i = 1; i < arr.length; i++) {

	        if(arr[i] > max) {

	            max = arr[i];
	        }
	    }

	    return max;
	}
	//smallest element in the array
	int smallest(int arr[]) {

	    int min = arr[0];

	    for(int i = 1; i < arr.length; i++) {

	        if(arr[i] < min) {

	            min = arr[i];
	        }
	    }

	    return min;
	}
	//sort array
	
	void sortArray(int arr[]) {

	    for(int i = 0; i < arr.length; i++) {

	        for(int j = i + 1; j < arr.length; j++) {

	            if(arr[i] > arr[j]) {

	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }

	    System.out.println("Sorted Array:");

	    for(int i = 0; i < arr.length; i++) {

	        System.out.print(arr[i] + " ");
	    }
	}
	//search element in array
	void searchElement(int arr[], int key) {
	    int found = 0;
	    for(int i = 0; i < arr.length; i++) {
	        if(arr[i] == key) {
	            found = 1;

	            System.out.println("Element Found");

	            break;
	        }
	    }

	    if(found == 0) {

	        System.out.println("Element Not Found");
	    }
	}
	
}
