import java.util.Arrays;
//https://leetcode.com/problems/concatenation-of-array/
public class ConcatinationOfArray {
    public static void main(String[] args) {
            int[] a ={1,2,3};
        System.out.println(Arrays.toString(getConcatenation(a)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        for(int j=nums.length,i=0;j<arr.length&&i<nums.length;j++,i++){
            arr[j] = nums[i];
        }
        return arr;
    }
}
