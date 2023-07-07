//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class DIffOFSumAndMul_LC1281 {
    public static void main(String[] args) {
        int a = 12345;
        System.out.println(subtractProductAndSum(a));
    }
    public static int subtractProductAndSum(int n) {
        int s=0,m=1;
        int temp=n;
        while(n!=0){
            s=s+n%10;
            n=n/10;
        }
        while(temp!=0){
            m=m*(temp%10);
            temp=temp/10;
        }
        return m-s;
    }
}
