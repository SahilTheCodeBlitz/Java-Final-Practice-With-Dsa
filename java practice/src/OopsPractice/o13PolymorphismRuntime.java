package OopsPractice;

public class o13PolymorphismRuntime {
    int timepass;
    static class Animal{ //if you want to access this kinda a class in another file then make it member of class
        void animalSpeak(){
            System.out.println("animal is speaking");
        }
    }
    static class Dog extends Animal{
        // dog class have properties of animal class also
        void animalSpeak(){
            System.out.println("Dog is barking");
        }
    }

    static class Lion extends Animal{
        // Lion class have properties of the animal class

        void animalSpeak(){
            System.out.println("Lion is roaring");
        }
    }
}
