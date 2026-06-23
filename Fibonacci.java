package PracticeQuestion;
public class Fibonacci {
	public static void main(String[] args) {
		int N = 5;
		int first = 0;
		int second = 1;
		if(N>=1) {
			System.out.println(first);
		}
		if(N>=2) {
			System.out.println(second);
		}
		for(int i = 3; i<=N; i++) {
			int calculate = first + second;
			System.out.println(calculate);
			first = second;
			second = calculate;
		}
			
	}
	
}
