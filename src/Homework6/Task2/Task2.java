package Homework6.Task2;

import Homework6.Task2.Builders.CarBuilder;

public class Task2 {
    public static void main(String[] args) {
        Director director = Director.getInstance();
        director.setBuilder(new CarBuilder());
        Car jeep = director.buildJeep("red", "winter");
        System.out.println(jeep);
        Car sedan = director.buildSedan("black", "summer");
        System.out.println(sedan);
    }
}
