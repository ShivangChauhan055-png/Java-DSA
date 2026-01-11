package com.String;

/*
====================================================
            BASIC STRING PROBLEMS IN JAVA
====================================================

*/

public class StringProblems {

    // ------------------------------------------------
    // 1) Reverse a String (Method 1: Using loop)
    // ------------------------------------------------
    public static String reverseString(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    // ------------------------------------------------
    // 2) Reverse a String (Method 2: Using StringBuilder)
    // ------------------------------------------------
    public static String reverseUsingBuilder(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    // ------------------------------------------------
    // 3) Check Palindrome String
    // ------------------------------------------------
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    // ------------------------------------------------
    // 4) Count Vowels in a String
    // ------------------------------------------------
    public static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    // ------------------------------------------------
    // 5) Count Words in a String
    // ------------------------------------------------
    public static int countWords(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        return s.split("\\s+").length;
    }

    // ------------------------------------------------
    // 6) Find Frequency of a Character
    // ------------------------------------------------
    public static int charFrequency(String s, char target) {
        int freq = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target)
                freq++;
        }
        return freq;
    }

    // ------------------------------------------------
    // 7) Remove Duplicate Characters
    // ------------------------------------------------
    public static String removeDuplicates(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (!result.contains(String.valueOf(s.charAt(i)))) {
                result += s.charAt(i);
            }
        }
        return result;
    }

    // ------------------------------------------------
    // 8) Check Anagram
    // ------------------------------------------------
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int x : count) {
            if (x != 0) return false;
        }
        return true;
    }

    // ------------------------------------------------
    // 9) Find First Non-Repeating Character
    // ------------------------------------------------
    public static char firstNonRepeating(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1)
                return s.charAt(i);
        }
        return '_';
    }

    // ------------------------------------------------
    // 10) Check if String contains only Digits
    // ------------------------------------------------
    public static boolean onlyDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }

    // ------------------------------------------------
    // 11) Convert String to Uppercase (without method)
    // ------------------------------------------------
    public static String toUpper(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] - 32);
            }
        }
        return new String(arr);
    }

    // ------------------------------------------------
    // MAIN (Testing Area)
    // ------------------------------------------------
    public static void main(String[] args) {

        String s = "madam";

        System.out.println(reverseString("Java"));
        System.out.println(reverseUsingBuilder("Hello"));
        System.out.println(isPalindrome(s));
        System.out.println(countVowels("Education"));
        System.out.println(countWords("I love Java programming"));
        System.out.println(charFrequency("banana", 'a'));
        System.out.println(removeDuplicates("programming"));
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(firstNonRepeating("aabbccd"));
        System.out.println(onlyDigits("12345"));
        System.out.println(toUpper("java"));
    }
}

