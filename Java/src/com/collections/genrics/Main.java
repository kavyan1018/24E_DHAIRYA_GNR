package com.collections.genrics;

import java.util.ArrayList;
import java.util.List;

class Fruit {
    public void eat() {
        System.out.println("Eating fruit.");
    }
}
class Mango extends Apple{
	public void eat() {
        System.out.println("Eating Mango.");
    }
	
}
class Banana extends Mango{
	public void eat() {
        System.out.println("Eating Banana");
    }
}
class Apple extends Fruit {
    @Override
    public void eat() {
        System.out.println("Eating apple.");
    }
}

public class Main {
    public static void main(String[] args) {
        List<? super Apple> basket = new ArrayList<>();

        // Adding elements to the basket
        basket.add(new Apple());
        basket.add(new Mango());
        basket.add(new Banana());
        // basket.add(new Fruit()); // Compilation error

        // Accessing elements of the basket
        for (Object fruit : basket) {
            ((Fruit) fruit).eat();
        }
    }
}
