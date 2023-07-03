import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
    int a[] = {1,4,5,2,3};
    CyclicSort(a);
    System.out.println(Arrays.toString(a));

    }
    static void swap(int[] arr, int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static void  CyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int crt = arr[i]-1;
            if(arr[crt] != arr[i]){
                swap(arr,i,crt);
            }else{
                i++;
            }
        }
    }
}
