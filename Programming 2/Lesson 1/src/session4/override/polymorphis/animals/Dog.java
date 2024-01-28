package session4.override.polymorphis.animals;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("WOOF");
    }

//overload

    public void sound(String name){
        System.out.println(name + " has this sound");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
