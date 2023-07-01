import java.util.Scanner;

import javax.swing.SpringLayout;
import javax.swing.plaf.synth.SynthPanelUI;
public class All_Factors {
    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n= sc.nextInt();
        System.out.print("The factors are :");
        for (int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
