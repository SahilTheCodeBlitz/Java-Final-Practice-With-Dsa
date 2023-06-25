package OopsPractice;
import java.util.Scanner;

public class o1ClassesAndObjects {

    // making a class
    // that is we are creating a custom datatype

    public static class Student{
        // properties of the class

        int rollNo;
        String name;
        Double percetage;

        // function of the class
        void printFun(){
            System.out.println(" name  = "+this.name);
            System.out.println(" roll number = "+this.rollNo);
            System.out.println(" percentage = "+this.percetage);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // creating the object of the class
        Student s1 = new Student();
        s1.name="Sahil";
        s1.rollNo=87;
        s1.percetage=56.33;

        s1.printFun();

        // look at it please
        // creating the array of the data type student
        Student students []= new Student[3];

        System.out.println("enter the contents of the array ");
        for (int i=0;i<students.length;i++){

            Student student = new Student();

            System.out.println("roll no = ");
            student.rollNo=sc.nextInt();

            System.out.println(" name  = ");
            student.name=sc.next();

            System.out.println("percentage = ");
            student.percetage=sc.nextDouble();

            students[i]=student;  // adding the student object data to students array

        }

        // printing the array

        for (int i=0;i<students.length;i++){

                System.out.println(" name  = "+students[i].name);
                System.out.println(" roll number = "+students[i].rollNo);
                System.out.println(" percentage = "+students[i].percetage);

                System.out.println(    );

        }
    }
}
