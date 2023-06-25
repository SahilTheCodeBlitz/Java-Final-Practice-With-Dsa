package JavaPractice;
import java.util.Scanner;

public class s7LoopStatement3 {
    public static void main(String[] args) {
        // do while loop
        // Write a Java program that uses a do-while loop to repeatedly ask the user for a number between 1 and
        // 10 until a valid input is provided. The program should print the input once a valid number is entered.

        Scanner sc=new Scanner(System.in);
        int num;
        do{
            System.out.println("enter the number = ");
            num = sc.nextInt();
        }
        while(num <1 || num>10);

        System.out.println("You entered: " + num);

        }




}
