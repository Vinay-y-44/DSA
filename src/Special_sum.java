public class Special_sum {
    public static void main(String[] args) {
        
    }
    public static int specialArray(int[] nums) {

        int x=0;
        for(int i:nums){
            if(i>0)  x+=1; }

        if(x==0) return -1;
        while(x>0){
            int count=0;
            for(int i:nums){
                if(i>=x ){
                    count+=1;
                }
            }
            if(x==count) return x;

            x-=1;
        }return -1;
    }
}
