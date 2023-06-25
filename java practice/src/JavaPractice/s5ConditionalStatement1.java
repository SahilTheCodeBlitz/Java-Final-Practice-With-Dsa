package JavaPractice;
import java.util.Scanner;
public class s5ConditionalStatement1 {


    public static void main(String args[]){
        // if else statement
        // print number is positive negative or zero

        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number  = ");
        int n = obj.nextInt();

        if(n==0){
            System.out.println("you have entered zero ");
        }
        else if (n>0) {

            System.out.println("you have entered positive number");

        }
        else{

            System.out.println("you have entered negative number");
        }


        // nested if else


    }
}
