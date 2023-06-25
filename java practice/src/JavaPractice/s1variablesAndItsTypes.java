package JavaPractice;

public class s1variablesAndItsTypes {

    static int m=100;//static variable
    void method()
    {
        int n=90;//local variable
    }

    public static void main(String args[]){
        int a =34; // instance variable
        // a is variable

        // three types of the variable are as follows

        // local variable = A variable declared inside
        // the body of the method is called local variable.
        // You can use this variable only within that method and the other methods in the class aren't even aware
        // that the variable exists.

        // instance variable = A variable declared inside the class but outside the body of the method, is called
        // an instance variable. It is not declared as static. it is avaialble to all the methods in the class

        // static variable = A variable that is declared as static is called a static variable. It cannot be local.
        // You can create a single copy of the static variable and share it among all the instances of the class.
        // Memory allocation for static variables happens only once when the class is loaded in the memory.




        // datatypes refer the one note program



    }

}
