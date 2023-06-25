package LoopsProblemsWallah;
import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of which you want factroial = ");
        n=sc.nextInt();
        int ans=1;
        for (int i=n;i>=1;i--){
            ans*=i;
        }
        System.out.println("factorial of the number "+n+" = "+ans);

    }
}
