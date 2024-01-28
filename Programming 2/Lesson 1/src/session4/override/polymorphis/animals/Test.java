package session4.override.polymorphis.animals;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Animal());
        System.out.println(new Dog());
        System.out.println(new Cat());
        new Dog().sound();

        //upcasting

        Animal animal = new Dog();

    }
}
