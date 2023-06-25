package ArrayWallahPlusShraddha;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice6 {

    static void displayArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    // how to actually copy the elements of the array without rising the case of shallow copying
    // 1. use arr2=arr.clone yeha pe deep copy huii alag new space copied array ko mili alag alag refercne varilable
    // 2. use method of Array class of util package
    //   arr2 = Array.copyOf(kisko copy karna hia,length jab tsk copy ho)
    //   arr2 = Array.rangeOf(kisko copy karna hai , inclusive index,exclusive index)

    public static void main(String[] args) {
        int[] array = {12,44,22,32};
        System.out.println(" contents of arra [] = ");
        displayArray(array);
        int [] arr2= Arrays.copyOf(array,array.length);
        System.out.println(" contents of copied array ");
        displayArray(arr2);

        // changing the contents of array

        arr2[0]=0;
        arr2[1]=1;

        System.out.println("contents of array after changing "); // deep copying happens here
        System.out.println(" array = ");
        displayArray(array);

        System.out.println(" arr2 = ");
        displayArray(arr2);

        int []arr3 = Arrays.copyOfRange(array,0,array.length);

        System.out.println("contents of array 3 are = ");
        displayArray(arr3);


    }
}
