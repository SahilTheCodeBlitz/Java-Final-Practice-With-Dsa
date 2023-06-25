package ArrayWallahPlusShraddha;

public class Problem6 {

    static boolean isSorted(int []array ){
        // asscending order check karna hai basically
       // boolean check=true;
        for(int i=1;i<array.length;i++){
            if(array[i]<array[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int []array = {23,323,2456,7884};
        int []array2={1,1,1,2,3,4,5,33};
        int []array3={2,3,44,1};
        int []array4={1,1,1,1,22,22,22};

        boolean ans = isSorted(array);
        System.out.println(ans);

        boolean ans1 = isSorted(array2);
        System.out.println(ans1);

        boolean ans2 = isSorted(array3);
        System.out.println(ans2);

        boolean ans3 = isSorted(array4);
        System.out.println(ans3);


    }

}
