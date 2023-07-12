//https://leetcode.com/problems/move-zeroes/description/
import java.util.Arrays;
public class MoveZeroes_LC283 {
    public static void main(String[] args) {
        int[] arr = {1,0,3,0,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        // brute force method
        //    for(int i=0;i<nums.length;i++){
        //        for(int j=i;j<nums.length;j++){
        //            if(nums[i]==0 && nums[j]!=0){
        //                swap(nums,i,j);
        //            }
        //        }
        //    }

        //optimal meyhod
        int i = 0;
        for (int num:nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }

    }
    // static void swap(int[] arr,int p1, int p2){
    //     int temp = arr[p1];
    //     arr[p1] = arr[p2];
    //     arr[p2] = temp;
    // }
}
