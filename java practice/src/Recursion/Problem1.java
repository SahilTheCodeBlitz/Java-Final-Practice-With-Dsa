package Recursion;

public class Problem1 {

    public static void printNumber(int n){
        // base condition
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);

    }
    public static void main(String args[]){
        // print the numbers from 5 to 1 using recursion
        printNumber(5);
    }
}
