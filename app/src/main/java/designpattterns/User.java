package designpattterns;

public class User {
    // Attributes
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public void sayHello() {
        System.out.println("Hi, my name is " + name);
    }
}
