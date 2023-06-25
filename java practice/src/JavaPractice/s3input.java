package JavaPractice;
import java.util.Scanner;
public class s3input {
    public static void main(String args[]){

        //Method 1 by using Scanner Class

        //taking input as float and integer

        Scanner sc =new Scanner(System.in);

        System.out.println("enter whether you are male or female = ");
        char c= sc.next().charAt(0);

        System.out.println("enter the integer number = ");
        int n = sc.nextInt();

        System.out.println("enter the float number = ");
        float m = sc.nextFloat();

        System.out.println("you are " + c);

        System.out.println("integer number = "+n);

        System.out.println("float number = "+m);

    }
}
