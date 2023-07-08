//https://leetcode.com/problems/defanging-an-ip-address/description/
public class Defanging_an_IP_Address {
    public static void main(String[] args) {
        String a = "1.1.1.1";
        System.out.println(defangIPaddr(a));
    }
    static String defangIPaddr(String add) {
        String ans = "";
        for(int i=0;i<add.length();i++){
            if(add.charAt(i)=='.'){
                ans += "[.]";
            }else{
                ans += add.charAt(i);
            }
        }
        return ans;
    }
}
