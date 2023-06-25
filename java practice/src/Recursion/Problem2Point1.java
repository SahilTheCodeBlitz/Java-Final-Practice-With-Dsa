package Recursion;

public class Problem2Point1 {
    public static void printNumber(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
    public static void main(String[] args) {
        // trying out another sol
        printNumber(1);
    }
}
