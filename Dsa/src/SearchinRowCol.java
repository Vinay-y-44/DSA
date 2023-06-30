import java.util.Arrays;

public class SearchinRowCol {
    public static void main(String[] args) {
        int arr[][] = {
                {1 , 2, 3, 4},
                {2 , 3 ,4 , 5},
                {3 , 4 , 5, 6}
        };
        System.out.println(Arrays.toString(search(arr,4)));

    }
    static int[] search(int[][] arr, int target){
        int r =0;
        int c = arr.length-1;

        while(r<arr.length-1 && c>=0){
            if(arr[r][c] == target){
                return new int[]{r,c};
            }
            if (arr[r][c]<target){
                r++;
            }else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
