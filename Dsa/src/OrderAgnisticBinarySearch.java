public class OrderAgnisticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {99,44,5,1};
        int target = 1;
        System.out.println(OABS(arr,target));

    }
    static int OABS(int[] arr,int target){
        int start =0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start +(end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            boolean isAsc = arr[start]<arr[end];
            if(isAsc){
                if(arr[mid]>target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(arr[mid]<target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }

            }
        }
        return -1;
    }
}
