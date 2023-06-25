package LoopsProblemsPattern;
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lines upto which you want to see reverse half pyramid pattern  =  ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){

            for (int j=n;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();

        }

    }
}
