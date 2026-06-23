package PracticeQuestion;

public class pgrm15 {
	//Print alternating series: +1 -2 +3 -4 +5 
	public static void main(String[] args) {
		int n = 7;
		for(int i =1;i<=n; i++) {
			if(i%2==0) {
				System.out.println(-i);
			}else {
				System.out.println("+"+ i);
			} 		
		}
	}
}
