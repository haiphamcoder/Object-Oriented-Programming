package Lesson7_Polymorphism;

public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting(); // print "Meow!"
        Dog dog1 = new Dog();
        dog1.greeting(); // print "Woof!"
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting(); // print "Woow!"

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting(); // print "Meow!
        Animal animal2 = new Dog();
        animal2.greeting(); // print "Woof!"
        Animal animal3 = new BigDog();
        animal3.greeting(); // print "Woow!"
        // Animal animal4 = new Animal(); // Không thể khởi tạo đối tượng của Abstract Class

        // Downcast
        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        // Cat cat2 = (Cat) animal2; // Error: Cast Exception: class Dog can not be cast to class Cat
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
