package ArrayWallahPlusShraddha;

public class Practice2 {
    // traversing through the array
    // doing this by using all three loops

    void onedarray(){
        int array1[]={1,3,2,4,5};

        // for loop
        /*
        for (int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }

         */

        //for each loop  dis= complete array will be printed if we want half array not possible
        /*
        for (int ara:array1){
            System.out.println(ara);
        }

         */
        //while loop
        int i=0;
        while(i<array1.length){
            System.out.println(array1[i]);
            i=i+1;
        }

    }
    void twoDimArray(){
        System.out.println("two dimesnional array ");

        int [][]twodarray={{1,2,3},
                {52,33},
                {22,33,44,55}};

        // for loop
        /*
        for (int i=0;i< twodarray.length;i++){
            //aray[0].lengt= length of row
            for (int j=0;j<twodarray[i].length;j++){
                System.out.print("  "+twodarray[i][j]);
            }
            System.out.println();
        }

         */

        // for each loop

        /*
        for(int[] uu:twodarray){
            for(int u:uu){
                System.out.print("  "+u);
            }
            System.out.println();
        }

         */

        //using while loop

        int i=0;
        while(i<twodarray.length){
            int j=0;
            while(j<twodarray[i].length){
                System.out.print(" "+twodarray[i][j]);
                j++;
            }
            i++;
            System.out.println();
        }


    }


    public static void main(String[] args) {
        // creating object to use methods as it is instance method not static
        Practice2 obj = new Practice2();
        obj.onedarray();
        obj.twoDimArray();
    }
}
