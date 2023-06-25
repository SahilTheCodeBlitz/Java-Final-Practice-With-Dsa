package ArrayWallahPlusShraddha;
import java.util.Scanner;

public class Practice3 {
    // taking array input in java

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array = ");
        int n = sc.nextInt();

        int []array=new int[n];
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        // displaying the output
        System.out.println("entered element where = ");
        for (int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }


    }
}
