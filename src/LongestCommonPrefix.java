import java.util.Scanner;

//Write a program to find the longest common prefix of two strings
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str1= in.nextLine();
        String str2=in.nextLine();
        int minLength = Math.min(str1.length(), str2.length());
        String prefix = "";
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                prefix += str1.charAt(i);
            } else {
                break;
            }
        }
        System.out.println(prefix);
    }
}
