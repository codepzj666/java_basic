package com.codepzj;

public class Student extends Person {
    public String stuCard;

    public Student(String name, int age, String stuCard) {
        super(name, age);
        this.stuCard = stuCard;
    }

    public String toString() {
        return "name:" + this.name + ",age:" + this.age + ",stuCard:" + this.stuCard;
    }
}
