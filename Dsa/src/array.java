import java.util.*;
public class array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4,5,6,7,8,9};
        // converts the array into a list manner
        System.out.println("new array as list is:"+Arrays.asList(arr));


        //by using this binary search method we can esily find the index of the key that ned to be found
        //Arrays.binarySearch(Array[],key)     which gives the index of the key recquired
        int key  = 2;
        System.out.println("the key is in the position of :"+Arrays.binarySearch(arr,key));


        // Arrays.sort()
        // which will be used to sort an array

        // Arrays.toString(array) is a method used to convert the array of any elements into string foramt 
        int arr2[]= {64,6,3,6,7,8,9,3,6,547,856,8,5,6,7,56,7,56,756};
        System.out.println("the array before sorted :"+Arrays.toString(arr2));
        Arrays.sort(arr2);
        //int key2  = 3;
        System.out.println("the sorted array is :"+ Arrays.toString(arr2));
        //System.out.println(" search the element of 3 in arr 2"+Arrays.binarySearch(arr2,0,9,key));

        System.out.println("integer array is :"+Arrays.toString(arr2));

        System.out.println("copy array of array 2 is :"+Arrays.toString(Arrays.copyOf(arr2,20)));

        System.out.println(("copy array of arr2 in range of 6,9 : "+Arrays.toString(Arrays.copyOfRange(arr2,6,9))));

        System.out.println(Arrays.toString(arr2));


    }

}
