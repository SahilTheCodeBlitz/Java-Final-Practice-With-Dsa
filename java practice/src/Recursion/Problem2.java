package Recursion;

public class Problem2 {

    public static void printNumber(int n){
        if (n==0){
            return;
        }
        printNumber(n-1);
        // return hota hai to niche ka code pehle exectute hoga fir agla return
        // n == 0 return value of n=1 this code will be excuted then return to n=2 and so on
        System.out.println(n);

    }

    public static void main(String[] args) {
        // print the numbers from 1 to 5 using recursion
        printNumber(5);
    }
}
