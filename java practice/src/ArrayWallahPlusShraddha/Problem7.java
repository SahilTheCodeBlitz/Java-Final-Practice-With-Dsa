package ArrayWallahPlusShraddha;

public class Problem7 {

    // return the array where 1st value is smallest of the given array and second value is largest of the given array

    static void printArray(int []array){
        for (int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }
    static  void sorting(int [] array){

        // sorting the array
        // reference pass karte hai array ka so sort bhi hoga
        for (int i=0;i<array.length;i++){
            for(int j=1;j<array.length;j++){
                if(array[j]<array[j-1]){
                    // swap
                    int temp = array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
    }
    static int[]smallestLargestArr(int [] array){
        // first step sorting
        sorting(array);
        int []res= {array[0], array[array.length - 1]};
        return res;
    }

    public static void main(String[] args) {
        int [] array = {23,22,4,2,-2,342,3};
        int [] array1= {22,22,44,2,4,2,223};

        printArray(array);
        int []res = smallestLargestArr(array);
        System.out.println("smallest element = " + res[0]);
        System.out.println("largest element = "+res[1]);

        printArray(array1);
        int []ress = smallestLargestArr(array1);
        System.out.println("smallest element = "+ress[0]);
        System.out.println("largest element = "+ress[1]);

    }
}
