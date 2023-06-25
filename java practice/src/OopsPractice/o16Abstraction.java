package OopsPractice;

public class o16Abstraction {
    // abstraction mean hiding confidential data from the user and only displayinh data which is required

    // in java abstraction can takes place by two ways

    // 1. using abstract keyword
    // 2. using the interfaces
}
abstract class Animal{
    // abstract class = objects cannot be created
    int testVar;

    abstract void sound(); // abstract method  , has to be compulsory defined in child class

    void sleep(){
        System.out.println(" zzzzzz....");
    }

    abstract void color(String color);

}
class Dog extends Animal{

    // as it is child class of the abstract class so we have to define abstract method here
    void sound(){
        System.out.println("  Wofffff  ");
    }
    void sleep(){
        System.out.println(" Dog is sleeping nicely ");
    }

    void color(String colr){
        System.out.println(" color of the dog = "+colr);
    }

}
