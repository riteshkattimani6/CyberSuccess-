/**
user : RITESH
date : 21-Apr-2026
time : 10:29:42 pm
 */
package PracticeQuestion;

/**
 * 
 */

import java.util.Scanner;

public class threefiveseven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0) {
            System.out.println("Divisible by 3, 5 and 7");
        } else {
            System.out.println("Not divisible by 3, 5 and 7");
        }
    }
}
