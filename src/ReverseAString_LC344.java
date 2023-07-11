import java.util.Arrays;
//https://leetcode.com/problems/reverse-string/description/
public class ReverseAString_LC344 {
    public static void main(String[] args) {
    char[] a = {'h','e','l','l','o'};
    reverseString(a);
        System.out.println(Arrays.toString(a));

    }
    public static void reverseString(char[] st) {
        int s =0,e = st.length-1;
        while(s<=e){
            swap(st,s,e);
            s++;
            e--;
        }

    }
    static void swap(char[] arr,int s,int e){
        char temp = arr[s];
        arr[s] =arr[e];
        arr[e] = temp;

    }
}
