package ArrayWallahPlusShraddha;

public class Problem2 {
    void maxElement(int []array){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(max<=array[i]){
                max=array[i];
            }
        }
        System.out.println("maximum element from the given array  = "+max);
    }
    public static void main(String[] args) {
        // maximum element from the given array
        int []array={23,11,32,42};
        // creating object to access the instance function
        Problem2 obj=new Problem2();
        obj.maxElement(array);
    }
}
