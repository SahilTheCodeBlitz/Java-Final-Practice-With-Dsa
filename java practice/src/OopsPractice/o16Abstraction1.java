package OopsPractice;

public class o16Abstraction1 {

    public static void main(String[] args) {

        Dog dog = new Dog(); // CLASS BAHAR HAO TO OBJECT BANAKE CALL KAR SAKTE HAI
        dog.testVar=56; // variable of parent abstract class
        System.out.println(dog.testVar);
        dog.sleep();
        dog.sound(); // abstract method
        dog.color("red");

    }

}
