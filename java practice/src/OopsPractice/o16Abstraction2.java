package OopsPractice;

public class o16Abstraction2 {

    public static void main(String[] args) {
        Doggy dg =new Doggy();
        dg.walk();

        Cat vt =new Cat();
        vt.walk();
    }

}
interface Animals{
    // notice one thing in abstract class or interface to hide complexity the defination is done in the child classes
    void walk(); // compulsorily all methods are abstract and public
    //int nim;// cannot just declare without iniitalizing as  by default all attributes are public static final
    int num = 45;

}
class Doggy implements Animals{
    public void walk(){ // public because by default all the methods in interface are public and abstract
        System.out.println("Doggy is walking");
    }
}
class Cat implements Animals{

    public void walk(){
        System.out.println("Cat is walking");
    }
}
