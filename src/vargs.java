import java.util.Arrays;

public class vargs {
    public static void main(String ... args) {
        var(2,3,4,2,34,23,4,23,4,234,234,4);
        multiple(2,4,"vinay","bunny");
    }
    static void var(int ...a){
        System.out.println("the array of integers is :"+Arrays.toString(a));
    }
    static void multiple(int a, int b ,String...d){
        System.out.println("a: "+a+" b: "+b+" String would be "+Arrays.toString(d));
    }

}
