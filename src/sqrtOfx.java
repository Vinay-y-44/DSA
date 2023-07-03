public class sqrtOfx {
    public static void main(String[] args) {
        System.out.println(sqrt(25));
    }
    static int sqrt(int x){
        int start =0;
        int ans =-1;
        int end = x;
        if(x==0)
            return 0;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(mid <= x/mid) {
                ans= mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
}
