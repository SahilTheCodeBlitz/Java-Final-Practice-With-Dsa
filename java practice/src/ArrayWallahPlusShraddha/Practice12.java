package ArrayWallahPlusShraddha;

import java.util.Scanner;

public class Practice12 {
    // find second largest element in the given array

    // will find first largest element then will make it to set min value and then will find again largest
    // so now this will be second largest element

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


    static int secondLargest(int [] array){
        int max = Integer.MIN_VALUE;

        // FINDING THE LARGEST ELEMENT
        for (int i=0;i<array.length;i++){
            if(array[i]>=max){
                max=array[i];
            }
        }
        // we got max value now substitute Integer.Min value on all the places which has max value

        for (int i=0;i<array.length;i++){
            if(array[i]==max){
                array[i]=Integer.MIN_VALUE;
            }
        }

        // finding max element ab second max element milega

        max= Integer.MIN_VALUE;

        for (int i=0;i<array.length;i++){
            if(array[i]>=max){
                max=array[i];
            }
        }

        return max;
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

        int ele = secondLargest(array);
        System.out.println("second largest element of the given array is = "+ele);
    }
}
