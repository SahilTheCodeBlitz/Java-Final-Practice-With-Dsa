package OopsPractice;

public class o9ConstructorsCopyConstructor {
    int age;
    int rollNo;

    final String schoolName = "phcet";// cannot change the value but only can access it

    // parametrized constructor
    o9ConstructorsCopyConstructor(int age ,int rollNo){
        this.age=age;
        this.rollNo=rollNo;
    }

    // copy constructor  ... used to create the copy of the object
    o9ConstructorsCopyConstructor(o9ConstructorsCopyConstructor obj){
        this.age=obj.age;
        this.rollNo=obj.rollNo;
    }


    public static void main(String[] args) {
        // creating the object of the class
        o9ConstructorsCopyConstructor obj = new o9ConstructorsCopyConstructor(78,33); // intitalize

        o9ConstructorsCopyConstructor obj1 =new o9ConstructorsCopyConstructor(obj); // copy constructor

        System.out.println(obj1.age);
        System.out.println(obj1.rollNo);

        System.out.println(obj.schoolName); // cannot change the value but only can access it
  
    }
}
