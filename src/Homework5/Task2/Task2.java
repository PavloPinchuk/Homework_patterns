package Homework5.Task2;

import Homework5.Task2.Builders.CarBuilder;

public class Task2 {
    public static void main(String[] args) {
        Director director = new Director(new CarBuilder());
        Car jeep = director.buildJeep("red", "winter");
        System.out.println(jeep);
        Car jeepClone = jeep.clone();
        System.out.println(jeepClone);
    }
}
