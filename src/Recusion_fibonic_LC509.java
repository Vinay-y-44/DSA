//https://leetcode.com/problems/fibonacci-number/description/
public class Recusion_fibonic_LC509 {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fib(n));

    }
    public static int fib(int n) {
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
