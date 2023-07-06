//https://leetcode.com/problems/shuffle-string/submissions/987992527/
public class ShuffelString {
    public static void main(String[] args) {
        int i[] = {4,5,6,7,0,2,1,3};
        String s= "codeleet";
        System.out.println(restoreString(s,i));
    }
    public static String restoreString(String s, int[] indices) {
        String si = "";
        if(s.length() == indices.length){
            int i=0;
            while(i<s.length()){
                si+=s.charAt(search(indices,i));
                i++;
            }
            return si;
        }else
            return "";

    }
    static int search (int[] arr,int target){
       for(int i=0;i<arr.length;i++){
           if(arr[i]==target){
               return i;
           }
       }
       return 0;
    }
}
