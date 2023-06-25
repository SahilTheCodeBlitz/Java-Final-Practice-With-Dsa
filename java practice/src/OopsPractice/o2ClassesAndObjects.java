package OopsPractice;

public class o2ClassesAndObjects {

    public static void print(Student student){ // passing student class object as the parameter
        System.out.println("name  = "+student.name);
        System.out.println("rollNumber = "+student.rollNumber);
        System.out.println("percentage = "+student.percentage);
    }

    static class Student{
        String name ;
        int rollNumber;
        double percentage;
    }
    public static void main(String[] args) {
        // creating objects of the student class
        Student s1 = new Student();
        s1.name="saggy";
        s1.rollNumber=87;
        s1.percentage=98.09;

        //calling the function

        print(s1);
    }
}
