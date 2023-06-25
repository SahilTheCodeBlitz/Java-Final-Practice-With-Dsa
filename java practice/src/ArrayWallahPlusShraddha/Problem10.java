// book me bhi hai
package ArrayWallahPlusShraddha;
import java.util.Scanner;
public class Problem10 {

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

    static void tripletCount(int [] array , int key){
        int res=0;
        for (int i=0;i<array.length;i++){

            for (int j=i+1;j<array.length;j++){

                for (int k=j+1;k<array.length;k++){
                    if(array[i]+array[j]+array[k]==key){
                        res=res+1;
                    }
                }
            }
        }
        System.out.println("triplet count whose sum  = "+key+" = "+res);
    }


    public static void main(String[] args) {
        // count the number of triplets whose sum is equal to x
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array = ");
        int n=sc.nextInt();
        int [] array = new int[n];
        System.out.println("enter the elements in the array = ");
        inputArray(array);
        System.out.println("the array you entered is = ");
        printArray(array);
        System.out.println("enter the target sum = ");
        int key = sc.nextInt();
        tripletCount(array,key);

    }
}
