package Advance_pattern_question_in_java;
import java.util.Scanner;
public class Advance_pattern_3 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");

        int n=sc.nextInt();


        for(int i=1;i<=n;i++){


            int space=n-i;
            
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
