package com.raphael.demo.sealedclasses;

public class SealedClassDemo {



    public static sealed abstract class Animal permits Lion, Sheep, Cow {
        public abstract String makeSound();
    }

    public static final class Lion extends Animal {
        @Override
        public String makeSound() {
            return "Roarrr";
        }
    }

    public static final class Sheep extends Animal {
        @Override
        public String makeSound() {
            return "Baaaaa";
        }
    }

    public static final class Cow extends Animal {
        @Override
        public String makeSound() {
            return "Mooooo";
        }
    }


    public static void main(String[] args) {

        Lion lion = new Lion();
        Sheep sheep = new Sheep();
        Cow cow = new Cow();

        System.out.println("A lion makes the " + lion.makeSound() + " sound!");
        System.out.println("A sheep makes the " + sheep.makeSound() + " sound!");
        System.out.println("A cow makes the " + cow.makeSound() + " sound!");
    }



}
