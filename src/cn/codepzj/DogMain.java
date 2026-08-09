package cn.codepzj;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("大黄", 6, "黄");

        dog.setAge(1000);
        Dog.eatZone();
        System.out.println(dog);
    }
}
