public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,3,23,46,3,9,36,4,363,6,376,};
        int t= 5;
        System.out.println(linSea(arr,t));
    }
    static int linSea(int[] a,int t){
        for (int i = 0; i < a.length; i++) {
            if(a.length==0)
                return -1;
            if(a[i]==t)
                return i;
        }
        return -1;
    }
}
 