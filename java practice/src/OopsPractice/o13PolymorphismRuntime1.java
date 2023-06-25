package OopsPractice;

public class o13PolymorphismRuntime1 {
    public static void main(String[] args) {

        o13PolymorphismRuntime.Animal animal =new o13PolymorphismRuntime.Animal();// class static so can access by
        // main class name
        animal.animalSpeak();

        o13PolymorphismRuntime.Dog dog = new o13PolymorphismRuntime.Dog();
        dog.animalSpeak();

        o13PolymorphismRuntime.Lion lion = new o13PolymorphismRuntime.Lion();
        lion.animalSpeak();
    }
}
