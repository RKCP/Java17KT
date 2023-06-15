package com.raphael.demo.patternswitch;

public class PatternSwitchDemo {

    /**
     * Checks the type of the given object and returns a descriptive message based on the object type.
     *
     * @param obj The object to be checked.
     * @return A string message describing the object type.
     */
    public static String checkObject(Object obj) {
        return switch (obj) {
            case Tesla t -> "This is a Tesla car with a battery size %s".formatted(t.batterySize());
            case Ford f -> "This is a Ford %s".formatted(f.model());
            case Mercedes m -> "This Mercedes %s was made %s years ago".formatted(m.model(), m.age());
            case Starbucks s -> "My go-to drink from Starbucks is a %s %s".formatted(s.size(), s.drinkName());
            case Nespresso n -> "My Nespresso sleeve of %s came with %s pods".formatted(n.podName(), n.numberOfPods());
            case null -> "It is null";
            default -> "You gave me an object not part of my inner switch statement";
        };
    }


    /**
     * Checks if the given object represents a classic car based on its age and manufacturer.
     *
     * @param obj The object to be checked.
     * @return {@code true} if the car is a classic, {@code false} otherwise.
     */
    public static boolean isMyCarAClassic(Object obj) {
        return switch (obj) {
            case Ford f && (f.age() > 20) -> true;
            case Mercedes m && (m.age() > 20) -> true;
            default -> false;
        };
    }


    public static void main(String[] args) {

        Tesla tesla = new Tesla("Model X", 2, 18000);
        Ford ford = new Ford("Mustang", 3, "Diesel");
        Mercedes mercedes = new Mercedes("Benz", 22, "Petroleum");
        Starbucks starbucks = new Starbucks("Latte", "Grande");
        Nespresso nespresso = new Nespresso("Volutto", 10);

        String result = checkObject(tesla);
        System.out.println(result);

        boolean classicCar = isMyCarAClassic(mercedes);
        boolean classicCar2 = isMyCarAClassic(tesla);
        System.out.println(classicCar);
        System.out.println(classicCar2);
    }



    // Group of inner records for demo purposes, rather than creating separate classes
    record Tesla (String model, int age, long batterySize) {}
    record Ford (String model, int age, String petrolType) {}
    record Mercedes (String model, int age, String petrolType) {}
    record Starbucks (String drinkName, String size) {}
    record Nespresso (String podName, int numberOfPods) {}

}
