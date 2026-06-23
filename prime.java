/**
user : RITESH
date : 21-Apr-2026
time : 10:26:26 pm
 */
package PracticeQuestion;

/**
 * 
 */
public class prime {
	 public static void main(String[] args) {

	        for (int i = 2; i <= 100; i++) { 
	            boolean isPrime = true;

	            for (int j = 2; j <= i / 2; j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) {
	                System.out.print(i + " ");
	            }
	        }
	    }

}
