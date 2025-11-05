package Modifiers_and_Interfaces;

import BasicOops_ConceptofObject.Car;

public class CallingClass {

    public static void main(String[] args) {

        Rabbit rb= new Rabbit();
        rb.typeofAnimal= "Chiku";
        rb.eat();

        Animal animal= new Animal();
        animal.eat();

        Dog dog= new Dog();
        dog.typeofAnimal= "Jerman";
        dog.eat();

        Cat cat= new Cat();
        cat.typeofAnimal= "Lucy";
        cat.eat();


    }
}
