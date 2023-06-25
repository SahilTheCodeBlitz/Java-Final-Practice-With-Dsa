package ArrayWallahPlusShraddha;

public class Problem1 {
    // calculate the sum of all elements of given array
    void sum(int [] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println("sum of all array elements = "+sum);
    }

    public static void main(String args[]){
        Problem1 obj = new Problem1();
        int [] array={1,5,3};
        obj.sum(array);
    }
}
