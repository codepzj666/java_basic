package cn.codepzj;

public class Dog {
    public String name;
    public int age;
    public String color;
    // 只能赋值一次
    final String hobby = "eat shit!";

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 15) {
            this.age = age;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "name: " + name + " age: " + age + " color: " + color;
    }

    public static void eatZone() {
        System.out.println("eating zone none");
    }
}
