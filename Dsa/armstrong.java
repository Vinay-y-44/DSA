import java.util.Scanner;
public class armstrong {
    public static void main(String ... args){
        int n,temp,sum=0,rem;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(temp!=0){
            rem = temp%10;
            sum += (int)Math.pow(rem,3);;
            temp/=10;
        }
        if(sum == n){
            System.out.println("armstrong");
        }else{
            System.out.println("not a armstrog");
        }

    }
}
