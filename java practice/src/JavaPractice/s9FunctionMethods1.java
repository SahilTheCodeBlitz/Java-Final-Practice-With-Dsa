package JavaPractice;
import java.util.Scanner;
public class s9FunctionMethods1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("enter two numbers");
        m=sc.nextInt();
        n=sc.nextInt();

        //calling the method
        int a = add(m,n);

        System.out.println("sum of two numbers = "+a);

        System.out.println("enter the third number = ");

        int o=sc.nextInt();

        // calling the third method
        int b = add(m,n,o);

        System.out.println("sum of three numbers = "+b);

    }

    // defining the  method
    public static int add(int a , int b){
        return a+b;
    }

    public static int add (int a ,int b, int c){
        return a+b+c;
    }
}
