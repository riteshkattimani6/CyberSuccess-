package PracticeQuestion;

public class sumofdigit {
	public static void main(String[] args) {
		int n = 123;
		int sum = 1;
		int digit = 0;
		for(int i =0; i<=n;i++) {
			digit = n%10;
			sum = sum +digit;
			n = n /10;
		}
		System.out.println(sum); 
	}
}
