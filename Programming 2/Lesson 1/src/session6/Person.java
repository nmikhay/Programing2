package session6;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new IllegalArgumentException("The name needs to be NON empty");
        }
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws ArithmeticException {
        if (age < 0 || age > 200) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("The range of age needs to be between 1 and 200");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void validatePerson(int age, String name) throws ArithmeticException, IllegalArgumentException {
        if (age < 0 || age > 200) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("The range of age needs to be between 1 and 200");
        }
        if(name.isEmpty()){
            throw new IllegalArgumentException("The name needs to be NON empty");
        }
    }

}
