package JavaPractice;

public class s9FunctionMethods3 {

    // two types of instance methods
    // 1. Accessor Method  also called as getters use to access the instance variable
    // 2. Mutator Method   also called as setters use to modify the instance variable

    private String name;
    private int rollNo;

    // accessor

    public int getRollNo(){
        return rollNo;
    }

    public String getName(){
        return name;
    }

    // mutators setters

    public void setRollNo(int rollNo){
        this.rollNo=rollNo; // setting the class variable
    }

    public void setName(String name){
        this.name=name; // setting the class variable
    }

    public static void main(String[] args) {

        s9FunctionMethods3 obj =new s9FunctionMethods3(); // creating object of class to access the functions

        // calling the settors to initialise the class variables

        obj.setName("sahil");
        obj.setRollNo(23);

        // calling gettors to get the name

        System.out.println(" name = "+obj.getName());
        System.out.println(" roll number   =  "+obj.getRollNo());

    }


}
