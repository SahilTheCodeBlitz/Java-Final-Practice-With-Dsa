package ArrayWallahPlusShraddha;

import java.util.Scanner;

public class Problem17 {
    // reverse the contents of array without using another array
    // swap use hoga yeha


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

    static int [] swap(int [] array){

        int j =array.length-1;

        for (int i=0;i<array.length/2;i++){
            // swap
            int temp=array[j];
            array[j]=array[i];
            array[i]=temp;

            j=j-1;

        }
        return array;
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

        int [] res  = swap(array);

        System.out.println("array after reversing = ");

        printArray(res);
    }

}
