package OopsPractice;

public class o10StaticKeyword {
    String name;

    int rollNo;

    int noOfStudent = 0; // not using static so it is member of the object

    static int classNoOfStudent=0 ;

    o10StaticKeyword(String name , int rollNo){
        // jaise hi object banega waise noOfStudent 1 se increament hoga
        noOfStudent ++;//kind aa acts as a local varialble
        classNoOfStudent++; // kinda acts as a global variable
    }

    public static void main(String[] args) {
        o10StaticKeyword obj =new o10StaticKeyword("sahil ",3); // object for 1 st student

        System.out.println("count value without using static = "+obj.noOfStudent);
        System.out.println("count value after using static = "+classNoOfStudent);

        // second student
         o10StaticKeyword obj1 = new o10StaticKeyword("ram",5);

        System.out.println("count value without using static = "+obj.noOfStudent);
        System.out.println("count value after using static = "+classNoOfStudent);

        o10StaticKeyword obj2 = new o10StaticKeyword("sam",53);

        System.out.println("count value without using static = "+obj.noOfStudent);
        System.out.println("count value after using static = "+classNoOfStudent);


    }
}
