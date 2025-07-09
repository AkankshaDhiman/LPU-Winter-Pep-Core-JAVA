
import java.math.BigInteger;
import java.util.Scanner;

public class First_Program {
    public static void main(String[] args) {
//        System.out.println("Hello Java");
//
////swap two variables without using third variable
//        int p=10;
//        int q=20;
//        p=p*q;
//        q=p/q;
//        p=p/q;
//        System.out.println("p="+p);
//        System.out.println("q="+q);
//
//
//// find the ASCII value of a character
//           char c='a';
//           int x= c;
//        System.out.println("ASCII value of a is "+x);
//
//
////sum of digits in an integer
//        Scanner in=new Scanner(System.in);
//        int a=in.nextInt();
//        int temp=a;
//        int len=0;
//        while(temp!=0){
//            len++;
//            temp=temp/10;
//        }
//
//        int sum=0;
//        for(int i=0;i<len;i++){
//            int y=a%10;
//            a=a/10;
//            sum+=y;
//        }
//        System.out.println("sum = "+sum);
//
//
////To check whether number is Odd Even
//    if(a%2==0){
//        System.out.println("Even");
//    }else{
//        System.out.println("Odd");
//    }
//


//
//// to explain memory usage in java with the help of variables
//        int v1=2;
//        System.out.println(v1+" is of primitive data type which is  stored in stack");
//        char v2='a';
//        System.out.println(v2+" is of primitive data type which is  stored in stack");
//        boolean v3=true;
//        System.out.println(v3+" is of primitive data type which is  stored in stack");
//        double v4=10.5;
//        System.out.println(v4+" is of primitive data type which is  stored in stack");
//
//        int[] v5=new int[5];
//        System.out.println("array elements are stored in heap");


//factorial of a given number
        Scanner in = new Scanner(System.in);
//         int a = in.nextInt();
//        BigInteger fact = BigInteger.ONE;
//        for ( int i = 1; i <=a; i++) {
//            fact = fact .multiply(BigInteger.valueOf(i));
//        }
//        System.out.println("factorial of given number is " + fact);

        //Simple Interest
//        double am=in.nextDouble();
//        double r=in.nextDouble();
//        double t=in.nextDouble();
//
//        if(am>=0 && am<=100000 && r<=100 &&r >=0 && t<=30 && t>=0){
//            System.out.println("SI = "+(am*r*t)/100);
//
//    }

        //f to c
//        double tem= in.nextDouble();
//        if(tem>=-100 && tem<=300){
//            tem=(tem-32)*(5.0/9);
        //System.out.println("in celcius "+tem);
//        }


        //BMI calculator
//        double h = in.nextDouble();
//        double w = in.nextDouble();
//
//        if (0 < w && w < 500 && 0 < h && h < 3.0) {
//            double bmi = w / (h * h);
//            System.out.println(bmi);
//        }
//        int a= in.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.println(a+" * "+i+" = "+a*i);
//        }
// prime number check

//        int num = in.nextInt();
//        boolean flag= false;
//
//        if (num == 0 || num == 1) {
//            flag = true;
//        }
//
//        for (int i = 2; i <= num / 2; ++i) {
//            if (num % i == 0) {
//                flag = true;
//                break;
//            }
//        }
//if(!flag){
//    System.out.println(num+" is a prime number");
//}
//else{
//    System.out.println(num+" is not  prime number");
//}

        // Armstrong number
//    int start= in.nextInt();
//    int end=in.nextInt();
//        for (int i = start; i <= end; i++) {
//            if (isArmstrong(i)) {
//                System.out.println(i);
//            }
//        }

//    public static boolean isArmstrong(int n) {
//        int on = n, sum = 0;
//        int digits = String.valueOf(n).length();
//
//        while (n> 0) {
//            int digit = n % 10;
//            sum += Math.pow(digit, digits);
//            n /= 10;
//        }
//        return sum == on;
//    }

        //pattern
//        int n = in.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //
//        boolean a = in.nextBoolean();
//        boolean b = in.nextBoolean();
//        boolean logicalAnd = a && b;
//        boolean logicalOr = a || b;
//        boolean nota = !a;
//        boolean notb = !b;
//
//        if (a == true && b == true) {
//            System.out.println("Logicl And = " + logicalAnd);
//            System.out.println("Logicl Or = " + logicalOr);
//            System.out.println("Logicl not for a = " + nota);
//            System.out.println("Logicl not for b = " + notb);
//        } else if ((a == true && b == false)||(a == false && b == true)) {
//            System.out.println("Logicl And = " + logicalAnd);
//            System.out.println("Logicl Or = " + logicalOr);
//            System.out.println("Logicl not for a = " + nota);
//            System.out.println("Logicl not for b = " + notb);
//        }  else {
//            System.out.println("Logicl And = " + logicalAnd);
//            System.out.println("Logicl Or = " + logicalOr);
//            System.out.println("Logicl not for a = " + nota);
//            System.out.println("Logicl not for b = " + notb);
//
//        }

        //
//        int marks=in.nextInt();
//        switch(marks/10){
//            case 10:
//                System.out.println("A+");
//                break;
//            case 9:
//                System.out.println("A+");
//                break;
//            case 8:
//                System.out.println("A");
//                break;
//            case 7:
//                System.out.println("B+");
//                break;
//            case 6:
//                System.out.println("B");
//                break;
//            default:
//                System.out.println("C");
//                break;
//
//        }

        //
//        int n;
//        do {
//            n = in.nextInt();
//            if (n != 0) {
//                System.out.println(n);
//            }
//        }while (n != 0) ;


        //Write a simple console-based tic-tac-toe game
        // where two players take turns placing their marks ('X' and 'O')on a 3x3 grid.
        // Use nested loops and conditions to check for a win or draw.


        //check whether the matrix is a magic square or not
//        int[][]arr=new int[3][3];
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                arr[i][j]=in.nextInt();
//            }
//
//        }

        //Write a program to print the following pattern using nested loops:
        //++++
        //++++
        // ++++
        //++++

//        for(int i=0;i<4;i++){
//            if(i%2==0){
//                System.out.print(" ");
//            }
//            for(int j=0;j<4;j++){
//                System.out.print("+");
//            }
//
//                   }
//            int n=in.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//Write a program to count the number of digits, alphabets,
// and special characters in a string using a for loop and if-else conditions.
//        String a= in.nextLine();
//        int digit=0,Letter=0,special=0;
//        for(int i=0;i<a.length();i++){
//            char curr_char=a.charAt(i);
//            if(Character.isDigit(curr_char)){
//                digit++;
//            }
//            else if(Character.isLetter(curr_char)){
//                Letter++;
//            }
//            else{
//                special++;
//            }
//        }
//        System.out.println("number of digits = "+digit);
//        System.out.println("number of letters = "+Letter);
//        System.out.println("number of special characters= "+special);


        // Write a program to reverse a string using a for loop.
//        String  s=in.nextLine();
//        String rev="";
//        for(int i=s.length()-1;i>=0;i--){
//            rev+=s.charAt(i);
//        }
//        System.out.println(rev);

        //Write a program to count the occurrences of a specific digit in a number using a while loop.
//        int a=in.nextInt();
//        int b=in.nextInt();
//        int count=0;
//       int temp=a;
//        int len=0;
//        while(temp!=0){
//            if(temp%10==b){
//                count++;
//            }
//            temp=temp/10;
//
//       }
//
//        System.out.println(count);

        //Write a program to convert a decimal number to binary using a while loop.
        double n=in.nextDouble();
        if (n == 0) {
            System.out.println("0");
        }
        double binaryNumber = 0;
        while (n > 0) {
            n=n/2;
            binaryNumber = (n % 2) + binaryNumber;
        }

        System.out.println("binary number = "+binaryNumber);

        System.out.println("binary number"+binaryNumber);

    }
}
