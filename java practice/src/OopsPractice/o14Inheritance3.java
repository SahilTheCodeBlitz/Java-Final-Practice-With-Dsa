package OopsPractice;

public class o14Inheritance3 {
    public static void main(String[] args) {
        // creating the object of grand child class
        o14Inheritance2.EquilateralTriangle obj = new o14Inheritance2.EquilateralTriangle();

        obj.area(); // method of parent class
        obj.area(23,2); // method of child class
        obj.area(7); // method khudka

    }
}
