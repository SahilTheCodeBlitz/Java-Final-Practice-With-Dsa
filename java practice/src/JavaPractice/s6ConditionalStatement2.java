package JavaPractice;
import java.util.Scanner;
public class s6ConditionalStatement2 {

    public static void main(String args[]){
        // switch statement

        // problem = Write a Java program that takes a month number as input (1 for January,
        // 2 for February, and so on) and displays the corresponding month name. If an invalid month number is
        // entered (less than 1 or greater than 12), the program should display "Invalid month number."

        Scanner obj  = new Scanner(System.in);

        System.out.println("enter the number from 1 to 12 to see corresponding month of the year = ");

        int number = obj.nextInt();

        switch(number){

            case 1:
                System.out.println("january");
                break;

            case 2:
                System.out.println("february");
                break;

            case 3:
                System.out.println("march");
                break;

            case 4:
                System.out.println("april");
                break;

            case 5:
                System.out.println("may");
                break;

            case 6:
                System.out.println("june");
                break;

            case 7:
                System.out.println("july");
                break;

            case 8:
                System.out.println("august");
                break;

            case 9:
                System.out.println("september");
                break;

            case 10:
                System.out.println("october");
                break;

            case 11:
                System.out.println("november");
                break;

            case 12:
                System.out.println("december");
                break;

            default:
                System.out.println("enter the right calendar number bro");

        }

    }
}
