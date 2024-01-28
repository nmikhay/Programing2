package session2;

public class Person {
    private int age;
    private String name;
    private String countryName = "Canada";
    private char gender;

    Person(int age, String name){
        setAge(age);
        setName(name);
    }

    //getters and setters [controlled way]
    //GETTER
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }

    public String getCountryName(){
        return this.countryName;
    }

    //SETTERS
    private void setAge(int age){
        if(this.age > 0 && this.age < 100){
            this.age = age;
        }
        else{
            this.age = 0;
        }
    }

    private void setName(String name){
        this.name = name;
    }


    //I don't want to provide it !!!
//    public void setCountryName(String countryName){
//        this.countryName = countryName;
//    }
    //maybe some methods in the next lines will use gender

}
