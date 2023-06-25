package ArrayWallahPlusShraddha;

import static ArrayWallahPlusShraddha.Problem7.printArray;

public class Problem16 {
    // reverse the contents of array

    static int[] reverseArray(int [] array){

        // yeha pe hume naya array create karna laga
        int tempArray[] = new int[array.length];
        int j=0;
        for (int i=array.length-1;i>=0;i--){
            tempArray[j]=array[i];
            j=j+1;
        }
        return tempArray;
    }
    public static void main(String[] args) {

        int []arrray = {34,22,5,33,55,43,44,34};
        int [] res =reverseArray(arrray);
        System.out.println("original array  = ");
        printArray(arrray);
        System.out.println("reverse array = ");
        printArray(res);

    }
}
