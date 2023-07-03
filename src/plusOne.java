import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] a ={9};
        int [] b =plusOne(a);
        System.out.println(Arrays.toString(b));
    }

    static int[] plusOne(int[] digits) {
        if(digits.length==1 && digits[0]==0){
            int[] digit = new int[digits.length+1];
            digit[0]=0;
            digit[1]=1;
            return digit;
        }
       if(digits[digits.length-1]==9){
           digits[digits.length-1]=0;
           digits[digits.length-2]++;
       }else {
           digits[digits.length-1]++;
       }
       return digits;
    }}
