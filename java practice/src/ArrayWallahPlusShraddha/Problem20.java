package ArrayWallahPlusShraddha;

import java.util.Scanner;

public class Problem20 {
    // Given Q . where (q = number of queries) Queries , check if the given number is present in array or not

    // important note = values of all elements in the array is less than 10 to the power 5
    static void printArray(int [] array){
        for (int i=0;i< array.length;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }

    // taking input function
    static void inputArray(int [] array){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
    }

    static int[] freqArrayElements(int []array){
        int [] freqArray = new int[100005];

        for (int i=0;i<array.length;i++){
            freqArray[array[i]]=freqArray[array[i]]+1; // jaise element ayega freq array me value 1 se increase

        }

        return freqArray;

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

        System.out.println("enter the number of queries = ");
        int q =sc.nextInt();

        int res[]=freqArrayElements(array);

        while(q>0){

            System.out.println("enter the element which you want to check whether it is present in " +
                    "the array or not = ");
            int input = sc.nextInt();
            if(res[input]>=1){
                System.out.println("yes element is encountered "+res[input]+" times");
            }
            else{
                System.out.println("sorry element not present");
            }
            q--;
        }
        System.out.println("enter the number of queries = ");
    }
}
