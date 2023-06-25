package ArrayWallahPlusShraddha;
import java.util.Scanner;

public class Problem8 {
    // return the array which has kth largest element s first element and k th smallest element of the array
    // as the second element

    // printing the array
    static void printArray(int [] array){
        for (int i=0;i< array.length;i++){
            System.out.println(" "+array[i]);
        }
    }
    // sorting the array

    static void sortArray(int []array){
        for (int i=0;i<array.length;i++){
            // har inner loop me ek element sort hota hai
            // largest element is sorted first
            for (int j=1;j<array.length;j++){
                if(array[j-1]>array[j]){
                    //swap
                    int temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=array[j-1];

                }
            }
        }
    }

    static void inputArray(int [] array){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
    }

    static int[] kthLargeSmall(int [] array,int ksmall,int klarge){
        return array;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("enter the size of the array  = ");
        n=sc.nextInt();
        int array[] = new int[n];
        System.out.println("enter the contents of the array = ");
        inputArray(array);
        printArray(array);
    }
}
