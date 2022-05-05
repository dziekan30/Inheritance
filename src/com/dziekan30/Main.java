package com.dziekan30;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("animal", 1, 1,  5, 5);

        Dog dog = new Dog("border collie", 8, 20, 2, 4, 1, 20, "shiny");
        dog.eat();
        dog.walk();
        dog.run();
    }
}