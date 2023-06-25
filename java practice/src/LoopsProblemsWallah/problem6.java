package LoopsProblemsWallah;
import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        // program for calculating values of power of the number
        int m , n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of m whose power you have to find = ");
        m=sc.nextInt();
        System.out.println("enter the value which is power = ");
        n=sc.nextInt();
        int ans = 1;

        for (int i=1 ;i<=n;i++){
            ans*=m;
        }

        System.out.println(m+" ^ "+n+" = "+ans);

    }
}
