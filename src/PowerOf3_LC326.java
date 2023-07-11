//https://leetcode.com/problems/power-of-three/description/
public class PowerOf3_LC326 {
    public static void main(String[] args) {
        int n=-27;
        System.out.println(isPowerOf3(n));
    }
    static boolean isPowerOf3(int n){
        if(n==0){
            return false;
        } else if (n==1) {
            return true;
        }
        return n%3==0 && isPowerOf3(n/3);
    }
}
