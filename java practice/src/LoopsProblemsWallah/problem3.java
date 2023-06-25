package LoopsProblemsWallah;
import java.io.*;

public class problem3 {
    public static void main(String[] args)throws IOException {
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number = ");
        n=Integer.parseInt(br.readLine());

        int num= n ;
        int var=0;

        System.out.println("your entered number = "+num);

        while(num!=0){
           // var+=num%10;
            // num=num/10;
           // var*=10;  bad logic ans not comming

            var=var*10+(num%10);
            num/=10;
        }

        System.out.println("reversed number = "+var);
    }
}
