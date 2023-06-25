package OopsPractice;

public class o15Encapsulation {
    private int age;
    private String name;

    public int getAge() {
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name,boolean admin){
        // if you are admin then only you can set the info
        if(admin){
            this.name=name;
        }
        else{
            System.out.println("You cannot set the name ");
        }
    }

    public void setAge(int age,boolean admin){

        if(admin){
            this.age=age;
        }
        else{
            System.out.println("you cannot set the age");
        }
    }
}
