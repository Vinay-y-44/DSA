public class Sqrt_LC50 {
    public static void main(String[] args) {
        double x =2.0;
        int n=22;
        System.out.println(myPow(x,n));
    }
    public static double myPow(double x, int n) {
        //method 1
        // double ans =1.0;
        // if(n>0){
        // while(n>0){
        //     ans*=x;n--;
        // }}else{
        //     while(n<0){
        //     ans/=x;n++;
        //     }
        // }
        // return ans;


        //method 2
        // return Math.pow(x,n);

        //method 3
        if (n == 0) return 1.0;
        // even power
        if (n % 2 == 0) return myPow(x * x, n / 2);
        // odd power
        if (n % 2 == 1) return x * myPow(x, n - 1);
        // negative power
        return 1/myPow(x, -n);
    }
}
