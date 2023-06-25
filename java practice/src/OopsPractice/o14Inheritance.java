package OopsPractice;

public class o14Inheritance {
    // gonna Study inheritance
    // 4 types of inheritance
    // single inheritance
    // hierarchical inheritance
    // multilevel inheritance
    // hybrid inheritance

    // single inheritance = one class inherits another class
    // as these are nested class so for accessing by public upar vala class we have to create it static


        String nameOfShape ;
        int defaultProperty;
        void area(){
            System.out.println("area  of shape can be found");
        }
        void shapeInfo(){
            System.out.println("have dimensions");
        }
    }

    class Square extends o14Inheritance{
        // square will have all properties of that of the parentclass which can be accessed once you create the object

        int sides=4;
         void area(int side){
             System.out.println("area of the square = "+(side*side));
         }

    }


