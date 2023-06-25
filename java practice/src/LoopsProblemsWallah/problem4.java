package LoopsProblemsWallah;
import java.util.Scanner;

public class problem4 {
    public static void main(String args[]){
        // write a program to find sum of the series upto n numbers
        // 1-2+3-4+5-6.....n

        // intution = even subtraction and odd addition
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  number upto which you want series sum = ");
        int n = sc.nextInt();
        int sum=0;

        for (int i=1;i<=n;i++){
            if (i%2==0){
                sum-=i;
            }
            else{
                sum+=i;
            }
        }

        System.out.println("sum of the series is "+sum);


    }
}
