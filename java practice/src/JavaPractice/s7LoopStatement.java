package JavaPractice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s7LoopStatement {

    public static void main(String args[])throws IOException {

        // 1 = for loop
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number up to which you want sum = ");
        int num = Integer.parseInt(br.readLine());
        int sum=0;

        for (int i=0;i<=num;i++){
            sum+=i;
        }

        System.out.println("sum = "+sum);

    }
}
