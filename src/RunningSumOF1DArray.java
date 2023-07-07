import java.util.Arrays;
//https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumOF1DArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = sum(0,i,nums);
        }
        return ans;
    }
    static int sum (int start,int end ,int[] arr){
        int s = 0;
        for(int i=start;i<=end;i++){
            s += arr[i];
        }
        return s;
    }
}
