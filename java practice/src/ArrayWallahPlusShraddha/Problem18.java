package ArrayWallahPlusShraddha;

import java.util.Scanner;

public class  Problem18 {
    // rotate the given array 'a' by k steps , where k is non negative
    // note = k can be geater than n


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

    static int [] rotateArray(int [] array,int k){

        int resArray [] = new int[array.length];
        k=k%array.length;
        int j=0;
        for (int i=array.length-k;i<array.length;i++){
            resArray[j]=array[i];
            j=j+1;
        }
        for (int i=0;i<=array.length-k-1;i++){
            resArray[j]=array[i];
            j++;
        }
        return resArray;
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
        int res [] = rotateArray(array,k);
        System.out.println("rotated array = ");
        printArray(res);
    }
}
