abstract class Animal {
    abstract void makesound();
    void sleep() {
        System.out.println("Sleeping");
    }
}
class Dog extends Animal {
    void makesound() {
        System.out.println("Dog barks");
    }
}
public class Abstraction {
    public static void main(String args[]) {
        Animal dog=new Dog();
        dog.makesound();
        dog.sleep();

    }
    
}
