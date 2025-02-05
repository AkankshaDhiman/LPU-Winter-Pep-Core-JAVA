import java.util.Scanner;
import java.util.*;
class Solution {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            int j=i+indexDiff;
            if(j<=nums.length-1){
                if(Math.abs(nums[i]-nums[j])<=valueDiff && Math.abs(i-j)<=indexDiff ) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int[] nums= new int[6];
        for(int i=0;i<nums.length;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(containsNearbyAlmostDuplicate(nums,3,0));
    }

}