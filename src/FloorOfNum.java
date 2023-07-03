public class FloorOfNum {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,7,8,9,10};
        int target = 6;
        System.out.println(FloorOfNumber(arr,target));
    }
    static int FloorOfNumber(int arr[] , int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end - start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return end;
    }
}
