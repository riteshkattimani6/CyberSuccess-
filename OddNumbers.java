package PracticeQuestion;

import java.util.Scanner;

class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}