public class CeilingOfNumber {

    // ceili means number that is the smallest number grater than or equal to the  target number
    public static void main(String[] args) {
            int []arr = {1,2,3,4,7,8,9,10};
            int target = 6;
            System.out.println(Ceili(arr,target));

    }
//    we can use binary search for this to achieve the recquired task
    static int Ceili(int []arr,int target){
        int start = 0;
        int end =arr.length -1;
        while (start <=end){
            int mid  = start +(end -start)/2;
            if(arr[mid]==target)
                return mid;
            else if (arr[mid]>target) {
                end = mid-1;
            }else{
                start =mid+1;
            }
        }
        return start;
    }
}
