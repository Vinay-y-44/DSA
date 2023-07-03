import jdk.dynalink.beans.StaticClass;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,99};
        int target = 99;
        System.out.println(BinarySearch(arr,target));

    }
    //this is if the Array is sorted in ascending order
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }else if (target < arr[mid] ){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }


}
