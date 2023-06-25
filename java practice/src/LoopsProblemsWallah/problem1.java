package LoopsProblemsWallah;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

        // count  number of digits for the given number n

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number whose digit you have to calculate = ");
        long n = sc.nextLong();
        int sum=0;

        while(n!=0){
            sum+=1;
            n=n/10;
        }

        System.out.println(sum);
    }
}
