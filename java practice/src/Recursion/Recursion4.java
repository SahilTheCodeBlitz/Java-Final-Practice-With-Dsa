package Recursion;
import java.util.Scanner;

public class Recursion4 {

    public static int printFact(int n){

        if(n==1 || n==0){
            return 1;
        }

        int factNMin1 = printFact(n-1); // assume ye n-1 fact lake dega
        int fact = factNMin1*n;
        return fact;

    }

    public static void main(String[] args) {
     // print factorial of n numbers
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number of  which you want factorial  = ");
     int n;
     n=sc.nextInt();
     int res = printFact(n);
     System.out.println(res);

    }

}
