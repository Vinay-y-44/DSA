import java.util.*;
public class Arraylist2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        for(int i = 0; i< 2; i++){
            al.add(new ArrayList<>());
        }
        for(int i = 0; i< 2; i++){
            for (int j = 0; j < 2; j++) {
                al.get(i).add(in.nextInt());
            }
        }
        System.out.println(al);
    }
}
