package OopsPractice;

public class o17SuperKeyWord {
    // in java super keyword is used to immediately access the varibles methods of the parent i.e super class
    public static void main(String[] args) {
        Dody d =new Dody();
        d.sound();
    }
}
class Animalll{
    int test=34;
    void sound(){
        System.out.println("Animal makes sound  ...");
    }

}
class Dody extends Animalll{
    void sound(){
        super.sound();// immediate calling of superclass method
        System.out.println("dog make sound bhau bhaw");
    }
    int x= super.test;
}


