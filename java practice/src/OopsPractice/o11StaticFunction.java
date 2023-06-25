package OopsPractice;

public class o11StaticFunction {
    int age;
    String name;

   // static int count; // ye variable ab class ka ho gya

    private static int count ;

    o11StaticFunction(String name , int age){
        count++;
        this.name=name;
        this.age=age;
    } // constructor ho gya

    public static int getCount(){
        return count;
    }



}
