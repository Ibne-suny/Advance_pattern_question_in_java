package Advance_pattern_question_in_java;

public class Advance_pattern_5 {
    public static void main(String[] args) {
        int n=4;

        for(int i=1;i<=n;i++){
            //space

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
             //2nd half

         for(int i=n;i>=1;i--){
            //space

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
