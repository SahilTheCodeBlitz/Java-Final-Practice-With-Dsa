package ArrayWallahPlusShraddha;

public class Practice1 {

    void toDimArray(){
        System.out.println("working with two dimensional array");

        int [][]ara2 = new int[3][2];

        ara2[0][0]=1;
        ara2[0][1]=2;

        ara2[1][0]=2;
        ara2[1][1]=22;

        ara2[2][0]=222;
        ara2[2][1]=221;

        System.out.println(ara2[2][1]);

        // another way of representing 2 d array
        int [][]twodar={{2,3,4},
                {2,3,4},
                {33,2}
        };

        System.out.println(twodar[2][1]);
        System.out.println("length of 2 d array ara2 = "+ara2.length);
        System.out.println("length of two d array twodar = "+twodar.length);
    }

    void demoArray(){ // not a static function so has to create the obj to access it
        int [] ages = new int[3];//array of size 3x4=12 bytes length=3

        ages[0]=15;
        ages[1]=34;
        ages[2]=33;

        String[] names=new String[3];

        names[0]="sahil";
        names[1]="sam";
        names[2]="ram";

        System.out.println(ages[2]);
        System.out.println(names[2]);
        System.out.println(ages); // not possible in aray has to use for loop

        // another way of initialising the array is through using literals

        int ara1 [] = {1,2,3,4};
        System.out.println("ara1[1] = "+ara1[1]);

        System.out.println("length of 1d array names =  "+names.length);
        System.out.println("length of 1 d array ara1 = "+ara1.length);

    }

    public static void main(String args[]){
        Practice1 obj = new Practice1();
        obj.demoArray();
        obj.toDimArray();
    }

}
