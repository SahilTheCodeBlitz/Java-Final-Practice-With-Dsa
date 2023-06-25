package ArrayWallahPlusShraddha;

public class Problem15 {
    // swap without using temporary variables

    // using sum and difference methods for swapping
    static void swap(int a , int b){
        System.out.println(" before swapping value of a and b is  = ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        // swapping
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(" after swapping value of a and b is = ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    public static void main(String[] args) {
        int a=23;
        int b=3;

        swap(a,b);
    }
}
