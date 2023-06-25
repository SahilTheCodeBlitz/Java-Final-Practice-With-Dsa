// upar upar se likha hai book me
package ArrayWallahPlusShraddha;

import java.util.Scanner;

public class Problem11 {
    // find the unique number in the given array where all elements are repeated twice with one value being unique
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
    // finding the unique number in the given array

    static void uniqueNumber(int [] array ){

        for (int i=1;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                if(i==j){
                    continue;
                }
                else if (array[i]==array[j]){
                    array[i]=-1;
                    array[j]=-1;
                }
            }
        }
        printArray(array);
        // seeing which is not -1-1
        for (int i=0;i<array.length;i++){
            if(array[i]!=-1){
                System.out.println("element which is unique = "+array[i]);
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array = ");
        int n=sc.nextInt();
        int [] array = new int[n];
        System.out.println("enter the elements in the array = ");
        inputArray(array);
        System.out.println("the array you entered is = ");
        printArray(array);
        uniqueNumber(array); //multiple copies of  two elements identical where only one element is single and unique

    }
}
