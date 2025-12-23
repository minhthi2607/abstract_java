package bai1;

import bai1.animal.Animal;
import bai1.animal.Chicken;
import bai1.animal.Tiger;
import bai1.edible.Edible;
import bai1.fruit.Apple;
import bai1.fruit.Fruit;
import bai1.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
