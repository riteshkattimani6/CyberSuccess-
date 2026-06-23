package MethodPrgmz;

public class Main1 {
	
	public static void main(String[] args) {

        Method1 obj = new Method1();

        // 16 Reverse String
        System.out.println("Reverse String: " + obj.reverseString("Ritesh"));

        // 17 Count Vowels
        obj.countVowels("education");

        // 18 Check Anagram
        obj.checkAnagram("listen", "silent");

        // 19 Remove Spaces
        System.out.println("Without Spaces: " + obj.removeSpaces("Java Programming"));

        // 20 Count Words
        obj.countWords("Ritesh Kattimani");

        // 21 Second Largest
        int arr1[] = {10, 50, 30, 80, 60};
        obj.secondLargest(arr1);

        // 22 Merge Arrays
        int a[] = {1,2,3};
        int b[] = {4,5,6};
        obj.mergeArrays(a, b);

        // 23 Rotate Array
        int arr2[] = {1,2,3,4,5};
        obj.rotateArray(arr2);

        // 24 Reverse String Without Inbuilt
        obj.reverseWithoutInbuilt("Ritesh");

        // 25 Check Anagram
        obj.checkAnagram("race", "care");

        // 26 First Non-Repeating Character
        obj.firstNonRepeating("aabbcdde");

        // 27 Count Vowels Consonants Digits
        obj.countVCDA("Kattimani");

        // 28 Remove Duplicate Characters
        obj.removeDuplicates("programming");

        // 29 Longest Substring Without Repeating
        obj.longestSubstring("abcabcbb");

        // 30 String Compression
        obj.stringCompression("aaabbcc");
    }

}
