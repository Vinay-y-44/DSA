public class ShuffleString {
    public static void main(String[] args) {
        int[] a ={4,5,6,7,0,2,1,3};
        String c = "codeleet";
        System.out.println(restoreString(c,a));
    }
    public static String restoreString(String s, int[] indices) {
        String si = "";
        if(s.length() == indices.length){
            for(int i=0;i<s.length();i++){
                si+=s.charAt(search(indices,i));
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
