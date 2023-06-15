package com.raphael.demo.sealedclasses;

public class UnsealedClassDemo {

    public static abstract class Animal {

        public abstract String makeSound();
    }


    public static class Lion extends Animal {
        @Override
        public String makeSound() {
            return "Roarrr";
        }
    }

    public static class Sheep extends Animal {
        @Override
        public String makeSound() {
            return "Baaaaa";
        }
    }

    public static class Cow extends Animal {
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


















        Unicorn unicorn = new Unicorn();
        //System.out.println("A unicorn makes the " + unicorn.makeSound() + " sound!");
    }








    // Here lies the issue with this though....

    public static class Unicorn extends Animal {
        @Override
        public String makeSound() {
            return "??????";
        }
    }
}
