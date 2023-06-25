package OopsPractice;

public class o15Encapsulation1 {

    public static void main(String[] args) {
        o15Encapsulation obj =new o15Encapsulation();
        // as the properties of the variable are private thus we cannot access them by creating object
        // but we can set or access the value by just calling the public function setter and getter

        obj.setAge(23,true);//admin = true
        obj.setName("sahil",true); // admin =true

        System.out.println("name = "+obj.getName());
        System.out.println(" age = "+obj.getAge());

        // creating another object

        o15Encapsulation obj1 = new o15Encapsulation();

        obj1.setName("ram",true);// admin =true;
        obj1.setAge(45,false);// admin =false not a admin hence value will not be set

        System.out.println("name  = "+obj1.getName());
        System.out.println("age = "+obj1.getAge());

    }

}
