package OopsPractice;

public class o14Inheritance1 {

    public static void main(String[] args) {
        Square square = new Square();  // child class of the parent class

        square.nameOfShape = "square"; // this is the parent class property that we are accessing

        square.area(); // parent class method

        square.area(4); // child class method
    }


}
