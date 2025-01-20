//○ Read a string from the console and:
//■ Convert it to uppercase/lowercase.
//■ Reverse the string.
//■ Check if it is a palindrome

import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        String rev="";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev+=s.charAt(i);
        }
        System.out.println("reversed string "+rev);
    if(rev.equalsIgnoreCase(s)){
        System.out.println("String is a Palindrome");
    }else{
        System.out.println("String is not a Palindrome");
    }
    }

}
