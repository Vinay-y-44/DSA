import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        //to ceck the numner si armstrog or not
        Scanner in = new Scanner(System.in);
//        System.out.print("enter a number to check weather is a prime or not :");
//        int n= in.nextInt();
//        Boolean ans = isPrime(n);
//        System.out.println(ans);
        System.out.print("enter a number to check weather is a Armstrong or not :");
        int A= in.nextInt();
        Boolean an = isArmstrong(A);
        System.out.println(an);


    }
    static boolean isPrime(int n){
        if(n<=1)
            return false;
        int c=2;
        while(c*c<=n){
            if(n%c==0)
                return false;
            c++;
        }
        if(c*c>n){
            return true;
        }
        return false;
    }
    static boolean isArmstrong(int n){
        int sum=0,or=n;
        while(n!=0){
            int rem =n%10;
            n=n/10;
            sum = sum+ rem*rem*rem;
        }
        return or==sum;
    }
}
