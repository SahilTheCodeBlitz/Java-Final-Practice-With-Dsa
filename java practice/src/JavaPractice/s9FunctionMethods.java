package JavaPractice;
import java.util.Scanner;
public class s9FunctionMethods {

    static void evenOdd(int number){
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

    }
    public static void main(String[] args) {

        //user defined methods
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number = ");
        int n = sc.nextInt();
        evenOdd(n);

        // defining the function


    }
}
