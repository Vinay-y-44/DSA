import java.util.Arrays;
import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        Scanner in = new Scanner(System.in);
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=in.nextInt();
            }
        }
// first method in printing array
//        for (int i=0;i<a.length;i++){
//            for(int j=0;j<a[i].length;j++){
//                System.out.print(a[i][j]);
//            }
//            System.out.println();
//        }
        // second method
        for(int[] i:a){
            System.out.println(Arrays.toString(i));
        }
        //third method
//        for(int i=0;i<a.length;i++){
//            System.out.println(Arrays.toString(a[i]));
//        }
    }
}
