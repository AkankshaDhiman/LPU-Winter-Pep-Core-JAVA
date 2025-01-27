//○ Read a string from the console and:
//■ Convert it to uppercase/lowercase.
//■ Reverse the string.
//■ Check if it is a palindrome

import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.nextLine();
//        System.out.println(s.toUpperCase());
//        System.out.println(s.toLowerCase());
//        String rev="";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            rev+=s.charAt(i);
//        }
//        System.out.println("reversed string "+rev);
//    if(rev.equalsIgnoreCase(s)){
//        System.out.println("String is a Palindrome");
//    }else{
//        System.out.println("String is not a Palindrome");
//    }


        //ques2:check string is palindrome
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        if (s.equalsIgnoreCase(reversed)) {
            System.out.println(s + " is a palindrome ");
        } else {
            System.out.println(s + " is not a palindrome");
        }

        //ques3: Write a program to count the number of vowels and consonants in a string.
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                v++;
            } else {
                c++;
            }
        }
        System.out.println(" total number of vowels are " + v + " and  consonants are " + c);

        // ques4: reverse a string in Java without using StringBuilder or StringBuffer
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println("reversed string " + rev);

        //ques5: Write a program that removes all duplicate characters from a string.
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            char currchar = s.charAt(i);
            if (s2.contains(Character.toString(currchar))) {
                continue;
            } else {
                s2 += s.charAt(i);
            }
        }
        System.out.println(s2);

        //ques6 Write a program to find the longest substring without repeating characters in a string
        int maxLength = 0;
        int start = 0;
        String longest = "";
        boolean[] charSet = new boolean[256];

        for (int end = 0; end < s.length(); end++) {
            while (charSet[s.charAt(end)]) {
                charSet[s.charAt(start)] = false;
                start++;
            }
            charSet[s.charAt(end)] = true;
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longest = s.substring(start, end + 1);
            }
        }
        System.out.println("longest substring without repeat "+longest);


    //ques7 Write a program that finds all the anagrams of a string from a list of strings.


        //ques8 Write a program to implement a case-insensitive comparison of two strings
        String s3 = "AkanKsha";
        System.out.println("String is " + s3);
        String s4 = "aKankSHa";
        System.out.println("String is " + s4);
        if (s3.equalsIgnoreCase(s4)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

// ques9


        //ques 10 Write a program to check if one string is a rotation of another string.
        String s5 = in.nextLine();
        String rot = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rot += s.charAt(i);
        }
        System.out.println("rotated string " + rot);
        if (rot.equalsIgnoreCase(s5)) {
            System.out.println("String is rotation of another String");
        } else {
            System.out.println("String is not rotation of another String");
        }
//////
    }
}

