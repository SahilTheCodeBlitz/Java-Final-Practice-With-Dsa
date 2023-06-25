package JavaPractice;

public class s9FunctionMethods2 {
    //defining the static methods
    static void pri(){
        System.out.println("heyyyyy ..... whats up ");
    }
    //defining the static function
    static boolean evenOdd(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    // defining the instance function that is non - static function
    int roo(){
        return 3;
    }


    public static void main(String[] args) {
        // two types of user defined methods
        // 1 . static methods
        // 2 . instance methods

        // static methods = belongs to the class no need to create object for accessing them
        pri();
        System.out.println(evenOdd(23));

        // instance methods does not belong to class
        // for calling the non static function that is instance method we need to create class object
        s9FunctionMethods2 a = new s9FunctionMethods2();// creating class object
        int n = a.roo();
    }
}
