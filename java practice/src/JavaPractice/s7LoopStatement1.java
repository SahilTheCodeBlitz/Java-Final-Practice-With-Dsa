package JavaPractice;
import java.util.Scanner;

public class s7LoopStatement1 {
    public static void main(String[] args) {

        // while loop
        //Write a Java program to find the sum of all even numbers between 1 and a given number
        // using a while loop.

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number up to which you want even sum = ");

        int n =sc.nextInt();
        int sum=0;
        int i=1;//initialization

        while(i<=n){
            if(i%2==0){
                sum+=i;
            }
            i++;
        }

        System.out.println("sum of even numbers = "+sum);


    }
}
