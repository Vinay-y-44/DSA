//https://leetcode.com/problems/power-of-two/description/
public class PowerOf2_rec_LC231 {
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }else if(n==1){
            return true;
        }
        return n%2==0 && isPowerOfTwo(n/2);
    }
}
