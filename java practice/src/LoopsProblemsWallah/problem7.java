package LoopsProblemsWallah;
import java.util.Scanner;

public class problem7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the table which you want = ");
        n=sc.nextInt();

        for (int i=1;i<=10;i++){

            System.out.println(n+" x "+i+" = "+n*i);

        }
    }
}
