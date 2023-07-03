import java.util.Arrays;
//https://leetcode.com/problems/set-mismatch/description/
public class SetMIsmatch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5,2};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        cSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans[0]= nums[i];
                ans[1]= i+1;
            }
        }
        return ans;
    }
    static void cSort(int [] arr){
        int i=0;
        while(i<arr.length){
            int crt = arr[i]-1;
            if(arr[crt] != arr[i]){
                swap(arr,crt,i);
            }else{
                i++;
            }
        }
    }

    static void swap (int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
