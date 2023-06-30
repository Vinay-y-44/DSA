import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
    int a[] = {1,4,2,3,1};
    insertionSOrt(a);
        System.out.println(Arrays.toString(a));
    }
    static void insertionSOrt(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+ 1; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    Swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }

    }
    static void Swap(int[] arr,int p1,int p2){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
