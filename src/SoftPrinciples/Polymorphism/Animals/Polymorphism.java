package SoftPrinciples.Polymorphism.Animals;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal[] animals = { animal, dog, cat };

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}