package paatterns;

public class Pattern1 {

    public static void main(String[] args) {
        patternP4(5);
    }


//right angle triangl
//  *
//  * *
//  * * *
//  * * * *
//  * * * * *
    static void printP1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // right angle triangle with numbers
//            1
//            22
//            333
//            4444
//            55555
    static void printP2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void patternP3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    //print pattern
    /*    * * * * *
          * * * *
          * * *
          * *
          *

     */
    static void patternP4(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
