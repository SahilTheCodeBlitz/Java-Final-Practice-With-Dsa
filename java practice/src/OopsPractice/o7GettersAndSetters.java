package OopsPractice;

public class o7GettersAndSetters {
    // getters are used to get the value of private attributes from another class
    // setters are used to set the value of private attributes from another class
    private int age ;
    private String name;

    // getters
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    // setters = to set the value from the outside class

    public void setAge(int age){
        this.age=age;
    }

    public void setName(String paraname){
        name=paraname;
    }





}
