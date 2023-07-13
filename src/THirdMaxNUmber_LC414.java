import java.util.*;
public class THirdMaxNUmber_LC414 {
    public static void main(String[] args) {
        int[] a ={3,2,1};
        System.out.println(thirdMax(a));
    }

        public static int thirdMax(int[] nums) {

            //     Arrays.sort(nums);
            //     Set<Integer> ans = new HashSet<Integer>();
            //     for(int i=0;i<nums.length;i++){
            //         ans.add(nums[i]);
            //     }

            //    int[] arr = new int[ans.size()];
            //    int i=0;
            //    for(int a:list){
            //        arr[i] = a;
            //        i++;
            //    }
            //     if(arr.length>3){
            //         return arr[arr.length-4];
            //     }else if(arr.length==3){
            //         return arr[0];
            //     }
            //     return nums[arr.length-1];


            Arrays.sort(nums);
            // if(nums.length<3) return nums[nums.length-1];

            HashSet<Integer> s = new HashSet<>();

            for(int i=nums.length-1;i>=0;i--){
                s.add(nums[i]);
                if(s.size()==3) return nums[i];

            }
            return nums[nums.length-1];


        }
    }


