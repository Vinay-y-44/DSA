import java.util.*;
public class add_using_function {
    public static int add2 (int a , int b){
        int s = a+b;
        return s;
    }
    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);
        int a,b,s;
        a= sc.nextInt();
        b= sc.nextInt();
        s = add2(a,b);
        System.out.println(s);
    }
    
}
