package ArrayWallahPlusShraddha;

public class Problem4 {
    // count the number of occurences of particular element
    static void  countOccurences(int[] array,int key){
        int count=0;
        for (int i=0;i<array.length;i++){
            if (array[i]==key){
                count=count+1;
            }
        }
        if(count==0){
            System.out.println("this element is not present in the array");
        }
        else{
            System.out.println("this element is present "+count+" times in the given array ");
        }

    }

    public static void main(String[] args) {
        int [] array = {23,11,33,44,23,22,11,11,11,23};
        countOccurences(array,23);
    }
}
