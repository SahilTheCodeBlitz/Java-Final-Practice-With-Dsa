package ArrayWallahPlusShraddha;

public class Practice4 {
    static void displayArr(int array[]){
        for (int i=0;i<array.length;i++){
            System.out.print("  "+array[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // concept of shallow copying
        // happens because of copying of reference variable

        int arra[] = new int[5];
        arra[0]=3;
        arra[1]=33;
        arra[2]=1;
        arra[3]=44;
        arra[4]=2;

        System.out.println("original array = ");
        displayArr(arra);

        // tryying to copy the array

        int [] arr2 = arra; // shallow copying only references are copied

        // both array have same references therefore changing either of them will result in both changing

        System.out.println("arr2 =");
        displayArr(arr2);

        arr2[0]=0;
        arr2[1]=0;

        System.out.println("after changing contents of arr2");

        System.out.println("arr = ");
        displayArr(arra);

        System.out.println("arr2 = ");
        displayArr(arra);
    }
}
