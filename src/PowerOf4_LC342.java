//https://leetcode.com/problems/power-of-four/description/
public class PowerOf4_LC342 {
    public static void main(String[] args) {
int n=4000;
        System.out.println(isPow4(n));
    }
    public static boolean isPow4(int n){
        if(n==0){
            return false;
        } else if (n==1) {
            return true;
        }
        return n%4==0 && isPow4(n/4);
    }
}
