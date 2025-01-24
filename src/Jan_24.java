import java.util.Scanner;

public class Jan_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = in.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            System.out.println("Add element no. " + (i + 1) + " in array");
//            arr[i] = in.nextInt();
//        }
//        //2nd largest element in an unsorted array
//        int max = arr[0];
//        int second_max=Integer.MIN_VALUE;
//        for (int i = 1; i < size; i++) {
//            if (arr[i] > max) {
//                second_max = max;
//                max = arr[i];
//            } else if (arr[i] > second_max && arr[i] != max) {
//                second_max = arr[i];
//            }
//        }
//        if (second_max == Integer.MIN_VALUE) {
//            System.out.println("no second maximum element found.");
//        } else {
//            System.out.println("second max element in the array is " + second_max);
//        }
//

//        for (int i = 0; i < size; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if ((arr[i]==0 && arr[i-1]!=arr[i])&& (arr[i] == arr[j])){
//                    System.out.println(arr[i] + " " + arr[j]);
//                }else if(arr[i]==arr[j]){
//                    System.out.println(arr[i]+" "+arr[j]);
//                    i++;
//                }
//            }
//        }

        //
        int[][] ar= new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                ar[i][j]=in.nextInt();
            }
        }
        int top=0,left=0,right=size-1,bottom=size-1;
        for(int i=0;i<size;i++){
            System.out.print(ar[top][i]+" ");
        }
        top++;
        for(int i=1;i<size;i++){
            System.out.print(ar[i][right]+" ");
        }
        right--;
        for(int i=right;i>=1;i--){
            System.out.print(ar[bottom][i]+" ");
        }
        bottom--;
        for(int i=bottom;i>=1;i--){
            System.out.print(ar[i][left]+" ");
        }
        left++;
        for(int i=1;i<size;i++){
            System.out.print(ar[top][i]+" ");
        }
        top++;
        for(int i=1;i<size;i++){
            System.out.print(ar[i][right]+" ");
        }
        right--;
    }
}
