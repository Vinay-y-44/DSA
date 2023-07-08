import java.util.*;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
public class KidsWithGreatNoofCandes_LC1431 {
    public static void main(String[] args) {
        int[] Candies = {2,3,5,1,3};
        int extra = 3;
        System.out.println(kidsWithCandies(Candies,extra));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m =max(candies);
        List<Boolean> ans = new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= m){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
    static int max(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
