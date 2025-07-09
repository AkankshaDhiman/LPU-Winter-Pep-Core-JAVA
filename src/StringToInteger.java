
//Write a program to convert a number given in string form to its corresponding integer.
//Hint: Convert characters to equivalent integers and multiply by an appropriate power of 10.
import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args ) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int result = 0;
        boolean isNegative = false;
        int startIndex = 0;
        if (str.charAt(0) == '-') {
            isNegative = true;
            startIndex = 1;
        }
        for (int i = startIndex; i < str.length(); i++) {
            int digit = str.charAt(i)-'0' ;
            result = result * 10 + digit;
        }
        System.out.println(isNegative ? -result:result);
    }
}