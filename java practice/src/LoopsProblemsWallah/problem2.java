package LoopsProblemsWallah;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        // count the sum  of digits for the given number n

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number n = ");
        int n= sc.nextInt();
        System.out.println("your entered number is = "+n);

        int num = n;
        int sum=0;

        while(num!=0){
            sum+=num%10;
            num=num/10;
        }

        System.out.println("sum of the digits = "+sum);


    }
}
