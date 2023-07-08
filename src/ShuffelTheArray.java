
import java.util.Arrays;
//https://leetcode.com/problems/shuffle-the-array/
public class ShuffelTheArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(a,a.length/2)));
    }
    static int[] shuffle(int[] nums, int n) {
        //we are using 2 pointer approach
        int[] ans = new int[2*n];
        int p1 = 0,i=0;
        int p2 = n;
        while(p1<n || p2<n*2 ){
            if(i%2==0){
                ans[i] = nums[p1];
                i++;p1++;
            }else{
                ans[i] = nums[p2];
                i++;
                p2++;
            }
        }
        return ans;

    }
}