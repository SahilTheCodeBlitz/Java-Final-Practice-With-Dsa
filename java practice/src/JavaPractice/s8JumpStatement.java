package JavaPractice;

public class s8JumpStatement {
    public static void main(String[] args) {

        // two types of jump statement are
        // break
        // continue

        // break statement

        for (int i=0;i<=10;i++){
            if(i==4){
                System.out.println("break has encountered");
                break;
            }
            System.out.println(i);
        }

        // continue statement

        System.out.println("continue statement");

        for (int i=0;i<=10;i++){
            if(i==4){
                System.out.println("continue statement has been encountered");
                continue;
            }
            System.out.println(i);
        }

    }
}
