package OopsPractice;

public class o14Inheritance2 {
    // hierarchical inheritancce  = same as single inheritance only two or more child class should be there

    // multilevel inheritance =  deriving class fromm the another derived class kinda grand child scene

    static class Shape{
        int shape;
        void area(){
            System.out.println("every shape has the area ");
        }
    }
    static class Triangle extends Shape{
        int triangleDim ;
        void area(int base , int height){

            float area = (float) (0.5 * base * height);

            System.out.println(" area of the triangle  = "+area);
        }
    }

    static class EquilateralTriangle extends Triangle{
        // This class will inherit all the properties of the class shape as well as of class Triangle
        void area (float side){ // wrong formula
            float sqr3 = (float)(Math.sqrt(3));
            float ar = sqr3 * (side/ 4);

            System.out.println("area of the equilateral triangle  = "+ar);
        }
    }
}
