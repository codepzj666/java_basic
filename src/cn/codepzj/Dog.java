package cn.codepzj;

public class Dog {
    public String name;
    public int age;
    public String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "name: " + name + " age: " + age + " color: " + color;
    }
}
