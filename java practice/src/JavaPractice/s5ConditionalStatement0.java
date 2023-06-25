package JavaPractice;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class s5ConditionalStatement0 {

    public static void main(String args[])throws IOException {

        // nested if else statement

        //Problem ;
        //Write a Java program to determine whether the person is student or not and if student then find
        // grade of a student based on their exam scores.
        // The program should prompt the user to enter the score, and based on the score, it should assign
        // a grade
        // according to the following criteria:

        /*If the score is 90 or above, assign grade "A".
                If the score is between 80 and 89 (inclusive), assign grade "B".
                If the score is between 70 and 79 (inclusive), assign grade "C".
                If the score is between 60 and 69 (inclusive), assign grade "D".
                If the score is below 60, assign grade "F".
                Additionally, if the score is above 100 or below 0, display an error message: "Invalid score 4
                entered."*/

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter you current role = ");

        String str = br.readLine();

        if(str.equals("student")||str.equals("Student")||str.equals("STUDENT")){
            System.out.println("you are student !!");

            // nested if else

            System.out.println("enter your percentage  = ");
            int per = Integer.parseInt(br.readLine());

            if(per>=90 && per<=99){
                System.out.println("Grade A");
            }
            else if(per>=80 && per<=89){
                System.out.println("Grade B");
            }
            else if(per>=70 && per<=79){
                System.out.println("Grade C");
            }
            else if(per>=60 && per<=69){
                System.out.println("Grade D");
            }
            else if(per<60){
                System.out.println("Grade F");
            }
            else{
                System.out.println("enter valid number error error!");
            }

        }
        else{
            System.out.println("you cannot access system if you are not student");
        }




    }
}
