//https://leetcode.com/problems/first-missing-positive/description/
public class FirstMIssingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,1,-1};
        System.out.println(firstMissingPositive(arr));
    }
        public static int firstMissingPositive(int[] arr) {
            int i=0;
            while(i<arr.length){
                int crt = arr[i]-1;
                if( arr[i] >0 && arr[i]<=arr.length && arr[crt] != arr[i]){
                    swap(arr,crt,i);
                }else{
                    i++;
                }
            }
            for(int j=0;j<arr.length;j++){
                if(arr[j] != j+1){
                    return j+1;
                }
            }
            return arr.length+1;

        }
        public static void swap (int[]arr,int start,int end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
