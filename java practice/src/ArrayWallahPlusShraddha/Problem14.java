package ArrayWallahPlusShraddha;

public class Problem14 {
    // swap using temporary variables

    static void swap(int a , int b){
        System.out.println("before swapping ");
        System.out.println(" a = "+a);
        System.out.println(" b = "+b);
        int temp =a;
        a=b;
        b=temp;
        System.out.println("after swapping ");
        System.out.println(" a = "+a);
        System.out.println(" b = "+b);
    }

    public static void main(String[] args) {

        int a=23;
        int b=33;
        swap(a,b);

    }


}
