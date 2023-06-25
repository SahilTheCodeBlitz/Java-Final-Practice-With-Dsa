package OopsPractice;

public class o17SuperKeyWord1 {

    // calling superclass constructor using the super keyword

    public static void main(String[] args) {
        Dogm dog = new Dogm("Buddy", "Labrador");
        // The Animal constructor is invoked via super(name)
        // Then the Dog constructor initializes the breed variable
    }
}
class Animalam {
    private String name;

    public Animalam(String name) {
        this.name = name;
    }
}

class Dogm extends Animalam {
    private String breed;

    public Dogm(String name, String breed) {
        super(name);  // Call the constructor of the superclass
        this.breed = breed;
    }
}



