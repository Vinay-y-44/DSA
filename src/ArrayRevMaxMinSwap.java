import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRevMaxMinSwap {
    public static void main(String[] args) {
        int[] a = {1,3,2,1,89,0};
        System.out.println("max element :"+Max(a));
        System.out.println("max element in a range :"+MaxRange(a,0,5));
        System.out.println("min element :"+Min(a));
        Swap(a,0,5);
        System.out.println(Arrays.toString(a));
        Rev(a);
        System.out.println(Arrays.toString(a));

    }
    //max element in a array
    static int Min(int[] a){
        int m = a[0]; // or we can use
        // int m  = Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            if(a[i]<m){
                m=a[i];
            }
        }return m;
    }
    static int Max(int[] a){
        int m = a[0]; // or we can use
        // int m  = Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            if(a[i]>m){
               m=a[i];
            }
        }return m;
    }
    static int MaxRange(int[] a, int start,int end){
        int m = a[start]; // or we can use
        // int m  = Integer.MIN_VALUE;
        for(int i=start;i<end;i++){
            if(a[i]>m){
                m=a[i];
            }
        }return m;
    }
    static void Swap(int[] arr , int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    static void Rev(int[] a){
        int s=0;
        int e= a.length-1;
        while(s<=e){
            Swap(a,s,e);
            s++;
            e--;
        }

    }

}
