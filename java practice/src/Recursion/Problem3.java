package Recursion;
import java.util.Scanner;

public class Problem3 {
    public static void sumNat(int n,int i,int sum){ // specify only those parameter which changes at each level
        if(n==0){
            System.out.println(0);
            return;
        }
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumNat(n,i+1,sum);

    }
    public static void main(String[] args) {
        // print sum of n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number up to which you want the sum = ");
        int n = sc.nextInt();
        sumNat(n,1,0);

    }

}
