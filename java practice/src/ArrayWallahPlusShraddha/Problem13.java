package ArrayWallahPlusShraddha;

import java.util.Scanner;

public class Problem13 {

    // given an array of the integers return the first value that is repeating in this array . if no value is repeated
    // then return -1

    static int repeatingElementIndex(int [] array){
        for (int i=0;i<array.length;i++){

            for (int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    return i;
                }
            }
        }
        return -1;
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

        int res=repeatingElementIndex(array);
        if(res==-1){
            System.out.println("element is not present ");
        }
        else{
            System.out.println("element which is first repeating  is present at index "+res);
        }
    }
}
