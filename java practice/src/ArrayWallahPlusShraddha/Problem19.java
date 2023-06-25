package ArrayWallahPlusShraddha;

import java.util.Scanner;

public class Problem19 {
    // rotate the given array 'a' by k steps , where k is non negative
    // note = k can be geater than n
    // without using extra space (inplace)

    static void reverse(int []array, int startIndex,int endIndex){
        int j = endIndex;
        for (int i=startIndex;i<j;i++){

            // swap
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;

            j=j-1;
        }

    }
    static void rotateInplace(int [] array,int k){

        reverse(array,0, array.length-k-1);
        // System.out.println("after first rotation");
        // printArray(array);

        reverse(array,array.length-k,array.length-1);
        // System.out.println("after second rotation");
        // printArray(array);


        reverse(array,0,array.length-1);
        // System.out.println("after third rotation");
        // printArray(array);

    }
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


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array = ");
        int n=sc.nextInt();
        int [] array = new int[n];
        System.out.println("enter the elements in the array = ");
        inputArray(array);
        System.out.println("the array you entered is = ");
        printArray(array);
        System.out.println("enter the value of k = ");
        int k = sc.nextInt();

        rotateInplace(array,k);
        System.out.println("after rotating");
        printArray(array);

    }
}
