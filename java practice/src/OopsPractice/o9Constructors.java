package OopsPractice;

public class o9Constructors {
    int age;
    String name;
    int rollNo;
    String div;

    // creating the default constructor first

    // default constructor
    public o9Constructors(){

    }

    // constructor accepeting three arguments
    public o9Constructors(int age,String name ,int rollNo){ // constructor which accepts three arguments
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }

    // constructor accepting all  data members as arguments

    public o9Constructors(int age , String name,int rollNo,String div){
        this.age= age;
        this.name=name;
        this.rollNo=rollNo;
        this.div=div;
    }

    public static void main(String[] args) {

        o9Constructors obj = new o9Constructors(23,"Sahil",78,"B");
        obj.name="sam";

        o9Constructors ob1 = new o9Constructors(56,"ram",54);
        ob1.div="D";

        System.out.println(obj.name);
        System.out.println(ob1.rollNo);


    }
}
