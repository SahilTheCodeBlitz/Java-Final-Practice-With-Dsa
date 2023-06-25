package OopsPractice;

public class o13Polymorphism {

    // there are two types of polymorphism
    // compile time polymorphism = occurs when method overloading is done
    // run time polymorphism = occurs when method over ridding is done

    // method overloading  = compile time polymorphism
    public static class Calculator{ // had to make it static

        //method overloading same method name but different parameter , or return type , or dataype of parameter
        void sum(int a, int b){
            int sum = a+b;
            System.out.println("sum = "+sum);
        }

        // defination of the function can be different

        void sum(int a,int b,int c){
            System.out.println("sum = "+(a+b+c));
        }
    }

    public static void main(String[] args) {
        // creating object of the class
        Calculator calculator=new Calculator();
        calculator.sum(3,2);
        calculator.sum(22,3,2);
    }
}
