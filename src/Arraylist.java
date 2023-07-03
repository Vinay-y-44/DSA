import java.util.ArrayList;
import java.util.Arrays;

class Arraylistdemo {
    public static void main(String[] args) {
        //array list is a dynaic array that can be scal eup or down accordingly
        // arraylist add methods
        int n =5;
        ArrayList<Integer> ar = new ArrayList<Integer>(n);
        ArrayList<Integer> ar2 = new ArrayList<>();
        ArrayList arr = new ArrayList();

        for(int i=0;i<n;i++){
            ar.add(i);
        }
        for (int i =n;i>=0;i--){
            ar2.add(i);
        }
        for(Integer a:ar){
            System.out.print(a+" ");
        }
        ar.addAll(ar2);//combines two arrayLists or recquired collection into one

    System.out.println(ar);// print the list

        ArrayList<String> an= new ArrayList<>();
        an.add("dog");
        an.add("cat");
        an.add("meow");
        System.out.println(an);
      //  an.clear();
        System.out.println("after clear option"+an);

        //clone
        ArrayList<Integer> cloneArr = (ArrayList<Integer>)an.clone();
        System.out.println(cloneArr);
    }
}
