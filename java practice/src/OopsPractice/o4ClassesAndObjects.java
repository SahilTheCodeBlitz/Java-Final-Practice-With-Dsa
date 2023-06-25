package OopsPractice;

public class o4ClassesAndObjects {
//changing the class object value through function
    static void change(o3Cars obj){
        obj.name = "mercedes";
    }

    public static void main(String[] args) {

        o3Cars car1 = new o3Cars(); // creating the object of the class
        car1.color="red";
        car1.name="honda city";
        car1.price=500000;
        car1.type="normal";

        System.out.println(" before changing the value = ");
        System.out.println(car1.name);
        change(car1); // pass by reference done
        System.out.println(" after changing the value = ");
        System.out.println(car1.name);
    }
}
