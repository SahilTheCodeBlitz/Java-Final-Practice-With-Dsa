package OopsPractice;

public class o5AccessModifiers {

    // three access modifiers

    // public = access available to all packages
    // private = access available to same class
    // default = access available to same package

    int age; // default access available  means all class from same package
    String name; // default access available

    private double percent; // private so access is restricted to this class only cannot be accessed in
                            // other class

    // all these above attributes cannot be accessed from other package so to access it from other package
    // public keyword is used

    public  double height;

}
