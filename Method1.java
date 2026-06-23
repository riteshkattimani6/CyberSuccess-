package MethodPrgmz;

import java.util.Arrays;

public class Method1 {

    // 16 Reverse String
    String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // 17 Count Vowels
    void countVowels(String str) {
        int count = 0;

        for(char ch : str.toLowerCase().toCharArray()) {
            if("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println("Vowels Count: " + count);
    }

    // 18 & 25 Check Anagram
    void checkAnagram(String s1, String s2) {

        char a[] = s1.toLowerCase().toCharArray();
        char b[] = s2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    // 19 Remove Spaces
    String removeSpaces(String str) {
        return str.replace(" ", "");
    }

    // 20 Count Words
    void countWords(String str) {
        String words[] = str.split(" ");
        System.out.println("Word Count: " + words.length);
    }

    // 21 Find Second Largest
    void secondLargest(int arr[]) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr) {

            if(num > first) {
                second = first;
                first = num;
            }
            else if(num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Second Largest: " + second);
    }

    // 22 Merge Arrays
    void mergeArrays(int a[], int b[]) {

        int merge[] = new int[a.length + b.length];

        for(int i=0; i<a.length; i++) {
            merge[i] = a[i];
        }

        for(int i=0; i<b.length; i++) {
            merge[a.length + i] = b[i];
        }

        System.out.println("Merged Array:");

        for(int num : merge) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    // 23 Rotate Array
    void rotateArray(int arr[]) {

        int last = arr[arr.length - 1];

        for(int i=arr.length-1; i>0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = last;

        System.out.println("Rotated Array:");

        for(int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    // 24 Reverse String Without Inbuilt
    void reverseWithoutInbuilt(String str) {

        String rev = "";

        for(int i=str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reverse: " + rev);
    }

    // 26 First Non-Repeating Character
    void firstNonRepeating(String str) {

        for(int i=0; i<str.length(); i++) {

            char ch = str.charAt(i);

            if(str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First Non-Repeating: " + ch);
                return;
            }
        }
    }

    // 27 Count Vowels Consonants Digits
    void countVCDA(String str) {

        int vowels = 0;
        int consonants = 0;
        int digits = 0;

        str = str.toLowerCase();

        for(char ch : str.toCharArray()) {

            if(ch >= '0' && ch <= '9') {
                digits++;
            }
            else if("aeiou".indexOf(ch) != -1) {
                vowels++;
            }
            else if(ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
    }

    // 28 Remove Duplicate Characters
    void removeDuplicates(String str) {

        String result = "";

        for(int i=0; i<str.length(); i++) {

            char ch = str.charAt(i);

            if(result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        System.out.println("Without Duplicates: " + result);
    }

    // 29 Longest Substring Without Repeating Characters
    void longestSubstring(String str) {

        String longest = "";

        for(int i=0; i<str.length(); i++) {

            String temp = "";

            for(int j=i; j<str.length(); j++) {

                char ch = str.charAt(j);

                if(temp.indexOf(ch) != -1) {
                    break;
                }

                temp = temp + ch;

                if(temp.length() > longest.length()) {
                    longest = temp;
                }
            }
        }

        System.out.println("Longest Substring: " + longest);
    }

    // 30 String Compression
    void stringCompression(String str) {

        String result = "";
        int count = 1;

        for(int i=0; i<str.length(); i++) {

            if(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
            }
            else {
                result = result + str.charAt(i) + count;
                count = 1;
            }
        }

        System.out.println("Compressed String: " + result);
    }

}
