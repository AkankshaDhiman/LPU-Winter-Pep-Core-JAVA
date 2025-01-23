import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int year=in.nextInt();
//
//        if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0)){
//            System.out.println(year+" is a leap year ");
//        }
//        else{
//            System.out.println(year+" is not a leap year" );
//        }
//        System.out.print("Enter number 1 : ");
//        int a=in.nextInt();
//        System.out.print("Enter number 2 : ");
//        int b=in.nextInt();
//        char x=in.next().charAt(0);
//        switch(x){
//            case '+':
//                System.out.println((a+b)+" Addition");
//                break;
//            case '-':
//                System.out.println((a-b)+" subtraction ");
//                break;
//            case '*':
//                System.out.println((a*b)+" Multiplication");
//                break;
//            case'/':
//                if(b!=0){
//                System.out.println((a/b)+" division");}
//                else{
//                    System.out.println("cannot divide by zero");
//                }
//                break;
//            case '%':
//                System.out.println((a%b)+" remainder");
//                break;
//            default:
//                System.out.println("Enter valid character");
//        }


        int n = in.nextInt();
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        System.out.println();
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k <=i; k++) {
//                System.out.print(k+1);
//
//            }
//            System.out.println();


        //    }

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            for (int j = i - 1; j >= 1; j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
       // Hourglass
        for (int i = n; i > 0; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=(2 * i)-1; k++) {
                if (k == 0 || k == (2 * i)-1 || i == n ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            //
        }

            for (int i = 0; i < n; i++) {
                for (int j = n; j > i + 1; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= (2 * i); k++) {
                    if (k == 0 || k == 2 * i || i == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }