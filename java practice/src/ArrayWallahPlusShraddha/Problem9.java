package ArrayWallahPlusShraddha;

import java.util.Scanner;

public class Problem9 {
    // find the total number of pairs in the array whose sum is equal to given value of x

    // printing array function
    static void printArray(int [] array){
        for (int i=0;i< array.length;i++){
            System.out.println(" "+array[i]);
        }
    }

    // taking input function
    static void inputArray(int [] array){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
    }

    static void checkPairOfSumX(int [] array , int key){
        int res=0;
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j< array.length;j++){
                if(array[i]+array[j]==key){
                    res=res+1;
                }
            }
        }
        System.out.println("pairs available whose sum = "+key+" are = "+res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int n = sc.nextInt();
        int [] array = new int[n];
        inputArray(array);
        System.out.println("entered array = ");
        printArray(array);
        System.out.println("enter the target sum = ");
        int key = sc.nextInt();
        checkPairOfSumX(array,key);
    }
}
