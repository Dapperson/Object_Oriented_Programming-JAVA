package Pertemuan4_Polymorphism_NotificationsOverloadingOverriding;

public class SafariApp {
    public static void main(String[] args) {

        Animal ani = new Animal();

        ani.name = "Animal";
        System.out.println(ani.name);
        ani.makeSound();

        Bird bird = new Bird();

        bird.name = "Bird";
        System.out.println(bird.name);
        bird.makeSound();

        Duck duck = new Duck();

        duck.name = "Duck";
        System.out.println(duck.name);
        duck.makeSound();
    }
}
