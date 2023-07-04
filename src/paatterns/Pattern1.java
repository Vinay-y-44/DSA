package paatterns;

public class Pattern1 {

    public static void main(String[] args) {
        printP1(5);
    }

    static void printP1(int n){
//right angle triangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
