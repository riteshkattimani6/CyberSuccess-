package PracticeQuestion;

public class pgrm16 {
	//Print series: 1, 11, 111, 1111… 
	public static void main(String[] args) {
		int n = 5;
		int sum = 0; 
		for(int i =1;i<=n; i++) {
			sum = sum * 10 +1;
			System.out.println(sum);
		}
	}
}
